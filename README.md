# CampusInfo - Aplikasi Informasi Kampus Sederhana

**Project Android - Tugas Hari Raya Idul Fitri**

## Identitas Mahasiswa
- **Nama:** Viesto Purnama Putra
- **NIM:** 105223016
- **Program Studi:** Ilmu Komputer

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
1. **Beranda & Filter:** ![Beranda]
   <img width="300" height="1596" alt="Screenshot 2026-03-26 221039" src="https://github.com/user-attachments/assets/2316c34c-5edf-43ae-9a54-16bfafa88782" />

3. **Detail Pengumuman:** ![Detail]
   <img width="300" height="1596" alt="Screenshot 2026-03-26 221826" src="https://github.com/user-attachments/assets/7fbaa4ba-6b24-4820-a070-c0fe89535510" />

5. **Profil & Jadwal:** ![Profil]
   <img width="300" height="1596" alt="Screenshot 2026-03-26 221049" src="https://github.com/user-attachments/assets/e55c3438-a4a8-482a-950c-ace48ae149ef" />
   <img width="300" height="1596" alt="Screenshot 2026-03-26 221044" src="https://github.com/user-attachments/assets/b4e5e676-ffa0-44d2-a081-e6aa44754941" />


