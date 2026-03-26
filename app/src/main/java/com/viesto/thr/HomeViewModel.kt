package com.viesto.thr

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class HomeViewModel : ViewModel() {

    private val _announcements = MutableLiveData<List<Announcement>>()
    private val _filterCategory = MutableLiveData<String>("Semua")
    
    val announcements: LiveData<List<Announcement>> = _filterCategory.switchMap { category ->
        val filtered = if (category == "Semua") {
            _announcements.value
        } else {
            _announcements.value?.filter { it.category == category }
        }
        MutableLiveData(filtered ?: emptyList())
    }

    init {
        loadAnnouncements()
    }

    fun setFilter(category: String) {
        _filterCategory.value = category
    }

    private fun loadAnnouncements() {
        val list = listOf(
            Announcement(1, "Wisuda Gelombang 1 2026", "Pelaksanaan wisuda akan dilaksanakan pada tanggal 1 Mei 2026.", "10 April 2026", "Akademik"),
            Announcement(2, "Pendaftaran Beasiswa Unggulan", "Segera daftar beasiswa unggulan semester genap. Batas akhir 30 April.", "12 April 2026", "Beasiswa"),
            Announcement(3, "Libur Idul Fitri 1447H", "Kampus akan Online mulai tanggal 16 Maret hingga 27 Maret 2026.", "10 Maret 2026", "Umum"),
            Announcement(4, "Seminar Teknologi AI", "Hadirilah seminar AI di Gedung Griya Legita Lt.3 jam 09.00 WIB.", "15 April 2026", "Umum"),
            Announcement(5, "Update Jadwal UTS", "Jadwal UTS telah diperbarui, silakan cek di menu Jadwal.", "18 April 2026", "Akademik")
        )
        _announcements.value = list
    }
    
    fun getAnnouncementById(id: Int): Announcement? {
        return _announcements.value?.find { it.id == id }
    }
}
