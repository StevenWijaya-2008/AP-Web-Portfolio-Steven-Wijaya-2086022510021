# My Portfolio - Java Spring Boot

Project ini adalah website portofolio pribadi yang saya bangun untuk mengelola data keahlian dan karya secara dinamis. Backend aplikasi ini menggunakan Java Spring Boot, sehingga semua data Skill dan Project sudah terintegrasi dengan database (CRUD), bukan lagi statis di HTML.

## Fitur Utama
- **Dashboard Project**: Menampilkan daftar karya terbaru, fokus pada informasi teks dan teknologi.
- **Manajemen Skill**: Fitur untuk menambah, mengubah, dan menghapus data skill beserta persentase progresnya.
- **Database Terintegrasi**: Menggunakan MySQL untuk penyimpanan data yang permanen.

## Teknologi
- **Java 21** & **Spring Boot 3**
- **Spring Data JPA** (untuk akses database)
- **Thymeleaf** (untuk render tampilan dinamis)
- **MySQL** (sebagai database engine)
- **Bootstrap 5** (untuk UI/UX yang responsif)
- **Gradle** (sebagai build tool)

## Cara Install di Lokal

1. **Clone Repo**
   git clone https://github.com/StevenWijaya-2008/AP-Web-Portfolio-Steven-Wijaya-2086022510021

2. **Setup Database**
   Buat database di MySQL dengan nama `portfolio`. Sesuaikan konfigurasi di `src/main/resources/application.properties`:
   spring.datasource.url=jdbc:mysql://localhost:3306/portfolio
   spring.datasource.username=isi_user_mysql_kamu
   spring.datasource.password=isi_pass_mysql_kamu

3. **Jalankan Aplikasi**
   Buka terminal di folder project lalu ketik:
   ./gradlew bootRun

4. **Akses Web**
   Buka browser dan arahkan ke: http://localhost:8080

## Alur Kerja (CRUD)
Aplikasi ini menggunakan metode **POST** untuk pengiriman data formulir agar lebih aman. Setiap data yang diinput akan diproses oleh Controller, disimpan ke MySQL melalui Repository, lalu ditampilkan kembali ke halaman utama menggunakan perulangan Thymeleaf (`th:each`).