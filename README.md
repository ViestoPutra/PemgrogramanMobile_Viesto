# CampusInfo - Aplikasi Informasi Kampus Sederhana

**Mini Project Android - Tugas Hari Raya Idul Fitri**

## Identitas Mahasiswa
- **Nama:** [Isi Nama Anda]
- **NIM:** [Isi NIM Anda]
- **Program Studi:** Informatika / Sistem Informasi

## Deskripsi Aplikasi
CampusInfo adalah aplikasi Android yang menyediakan informasi seputar kampus Universitas Pertamina. Aplikasi ini mengimplementasikan konsep dasar Android seperti Fragment, RecyclerView, ViewModel, Navigation Component, dan Lifecycle Awareness.

### Fitur Utama:
- **Bottom Navigation:** Navigasi antara tab Beranda, Jadwal, dan Profil.
- **Beranda (RecyclerView):** Menampilkan daftar pengumuman kampus yang dapat difilter berdasarkan kategori (Akademik, Beasiswa, Umum).
- **Detail Pengumuman:** Navigasi menggunakan Safe Args untuk menampilkan isi pengumuman secara lengkap.
- **Jadwal Kuliah:** Informasi jadwal kuliah harian dalam format tabel.
- **Profil:** Menampilkan data mahasiswa yang tersimpan secara permanen menggunakan SharedPreferences.
- **Dark Mode Support:** Mendukung tampilan mode gelap secara otomatis.
- **Animasi Transisi:** Transisi antar halaman yang halus.

## Struktur Project
- **MainActivity:** Host untuk NavHostFragment dan BottomNavigationView.
- **HomeFragment:** Menampilkan list pengumuman dengan filter ChipGroup.
- **ScheduleFragment:** Menampilkan jadwal kuliah statis.
- **ProfileFragment:** Menampilkan dan mengedit profil mahasiswa.
- **AnnouncementDetailFragment:** Menampilkan detail data pengumuman.
- **HomeViewModel:** Mengelola data pengumuman secara lifecycle-aware.

## Teknologi & Library
- **Bahasa:** Kotlin
- **UI:** XML Layouts, Material Design Components
- **Navigation:** Navigation Component with Safe Args
- **Data:** View Binding, LiveData, ViewModel, SharedPreferences
- **Target SDK:** 35 (Min SDK 24)

## Screenshot Aplikasi
*(Silakan tambahkan screenshot aplikasi Anda di bawah ini)*
1. **Beranda & Filter:** ![Beranda](screenshot_home.png)
2. **Detail Pengumuman:** ![Detail](screenshot_detail.png)
3. **Profil & Jadwal:** ![Profil](screenshot_profile.png)
