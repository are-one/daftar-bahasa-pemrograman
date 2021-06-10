package com.one.daftarbahasapemrograman

object LangData {
    private val names = arrayOf(
        "C",
        "C++",
        "C#",
        "Go",
        "Java",
        "JavaScript",
        "Kotlin",
        "Perl",
        "PHP",
        "Python",
        "R",
        "Ruby")

    private val designed_by = arrayOf(
            "Dennis Ritchie", // c
            "Bjarne Stroustrup", // c++
            "Microsoft", // c#
            "Robert Griesemer, Rob Pike, Ken Thompson", // go
            "James Gosling", // Java
            "Brendan Eich of Netscape initially; others have also contributed to the ECMAScript standard", // JavaScript
            "JetBrains", // Kotlin
            "Larry Wall", //perl
            "Rasmus Lerdorf", // PHP
            "Guido van Rossum", // Python
            "Ross Ihaka and Robert Gentleman", // R
            "Yukihiro Matsumoto" // Ruby
    )

    private val first_release = arrayOf(
            "1972; 49 years ago from now 2021", // C
            "1985; 36 years ago from now 2021", // C++
            "2000; 21 years ago from now 2021", // C#
            "November 10, 2009; 11 years ago from now 2021", // Go
            "May 23, 1995; 26 years ago from now 2021", // Java
            "December 4, 1995; 25 years ago", // JavaScript
            "July 22, 2011; 9 years ago from now 2021", // Kotlin
            "December 18, 1987; 33 years ago from now 2021", // perl
            "1995; 26 years ago from now 2021", // PHP
            "February 1991; 30 years ago from now 2021", // Python
            "August 1993; 27 years ago from now 2021", // R
            "1995; 26 years ago from now 2021" // Ruby
    )

    private val stable_release = arrayOf(
            "C17 / June 2018; 3 years ago from now 2021", // C
            "C++20 (ISO/IEC 14882:2020) / 15 December 2020", // C++
            "9.0 / November 10, 2020", // C#
            "1.16.5 / 3 June 2021", // Go
            "Java SE 16.0.1 / April 20, 2021", // Java
            "ECMAScript 2020 / June 2020; 1 year ago from now 2021", // JavaScript
            "1.5.10 / May 24, 2021", // Kotlin
            "5.34.0 / 20 May 2021", // perl
            "8.0.7 / 3 June 2021", // PHP
            "3.9.5 / 3 May 2021", // Python
            "4.1.0 / 18 May 2021", // R
            "3.0.1 / 5 April 2021" // Ruby
    )

    private val paradigm = arrayOf(
            "Multi-paradigm: imperative (procedural), structured", // c
            "Multi-paradigm: procedural, functional, object-oriented, generic, modular", // c++
            "Multi-paradigm: structured, imperative, object-oriented, event-driven, task-driven, functional, generic, reflective, concurrent", // c#
            "Multi-paradigm: concurrent, functional, imperative, object-oriented", // golang / Go
            "Multi-paradigm: generic, object-oriented (class-based), imperative, reflective", // Java
            "event-driven, functional, imperative", // Javascript
            "Multi-paradigm: object-oriented, functional, imperative, block structured, declarative, generic, reflective, concurrent", // Kotlin
            "Multi-paradigm: functional, imperative, object-oriented (class-based), reflective", //perl
            "Multi-paradigm: imperative, functional, object-oriented, procedural, reflective", // PHP
            "Multi-paradigm: object-oriented,[1] procedural (imperative), functional, structured, reflective", // Python
            "Multi-paradigm: array, object-oriented, imperative, functional, procedural, reflective", // R
            "Multi-paradigm: functional, imperative, object-oriented, reflective" // Ruby
    )

    private val detail = arrayOf(
            "C (/siː/, seperti pada huruf c) adalah bahasa pemrograman komputer prosedural tujuan umum yang mendukung pemrograman terstruktur, ruang lingkup variabel leksikal, dan rekursi, dengan sistem tipe statis. Secara desain, C menyediakan konstruksi yang memetakan secara efisien ke instruksi mesin yang khas. Ini telah menemukan penggunaan yang tahan lama dalam aplikasi yang sebelumnya dikodekan dalam bahasa assembly. Aplikasi tersebut mencakup sistem operasi dan berbagai perangkat lunak aplikasi untuk arsitektur komputer yang berkisar dari superkomputer hingga PLC dan sistem tertanam. \n\n(diterjemahkan menggunakan google translate)", // C
            "C++ (/ˌsiːˌplʌsˈplʌs/) adalah bahasa pemrograman tujuan umum yang dibuat oleh Bjarne Stroustrup sebagai perpanjangan dari bahasa pemrograman C, atau \"C with Classes\". Bahasa telah berkembang secara signifikan dari waktu ke waktu, dan C++ modern sekarang memiliki fitur berorientasi objek, generik, dan fungsional selain fasilitas untuk manipulasi memori tingkat rendah. Ini hampir selalu diimplementasikan sebagai bahasa yang dikompilasi, dan banyak vendor menyediakan kompiler C++, termasuk Free Software Foundation, LLVM, Microsoft, Intel, Oracle, dan IBM, sehingga tersedia di banyak platform.\n" +
                    "\n" +
                    "C++ dirancang dengan orientasi terhadap pemrograman sistem dan perangkat lunak yang disematkan, terbatas sumber daya dan sistem besar, dengan kinerja, efisiensi, dan fleksibilitas penggunaan sebagai sorotan desainnya. C++ juga telah ditemukan berguna dalam banyak konteks lain, dengan kekuatan utama adalah infrastruktur perangkat lunak dan aplikasi dengan sumber daya terbatas, termasuk aplikasi desktop, permainan video, server (misalnya e-niaga, pencarian web, atau database), dan aplikasi yang kritis terhadap kinerja ( misalnya sakelar telepon atau pesawat ruang angkasa).\n\n(diterjemahkan menggunakan google translate)", // C++
            "C# (diucapkan see sharp, seperti not musik C♯, tetapi ditulis dengan tanda angka) adalah bahasa pemrograman multi-paradigma serba guna yang mencakup pengetikan statis, pengetikan kuat, cakupan leksikal, imperatif, deklaratif, fungsional, generik, objek -berorientasi (berbasis kelas), dan disiplin pemrograman berorientasi komponen.\n" +
                    "\n" +
                    "C# dikembangkan sekitar tahun 2000 oleh Microsoft sebagai bagian dari inisiatif .NET dan kemudian disetujui sebagai standar internasional oleh Ecma (ECMA-334) pada tahun 2002 dan ISO (ISO/IEC 23270) pada tahun 2003. C# dirancang oleh Anders Hejlsberg, dan tim pengembangan saat ini dipimpin oleh Mads Torgersen, menjadi salah satu bahasa pemrograman yang dirancang untuk Common Language Infrastructure (CLI). Versi terbaru adalah 9.0, yang dirilis pada tahun 2020 di .NET 5.0 dan disertakan dalam Visual Studio 2019 versi 16.8.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // C#
            "Go adalah bahasa pemrograman yang diketik secara statis dan dikompilasi yang dirancang di Google oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go secara sintaksis mirip dengan C, tetapi dengan keamanan memori, pengumpulan sampah, pengetikan struktural, dan konkurensi gaya CSP. Bahasa ini sering disebut sebagai Golang karena nama domainnya, golang.org, tetapi nama aslinya adalah Go.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // Golang / Go
            "Java adalah bahasa pemrograman berorientasi objek tingkat tinggi, berbasis kelas, yang dirancang untuk memiliki dependensi implementasi sesedikit mungkin. Ini adalah bahasa pemrograman tujuan umum yang dimaksudkan untuk memungkinkan pengembang aplikasi menulis sekali, berjalan di mana saja (WORA), artinya kode Java yang dikompilasi dapat berjalan di semua platform yang mendukung Java tanpa perlu kompilasi ulang. Aplikasi Java biasanya dikompilasi ke bytecode yang dapat berjalan di mesin virtual Java (JVM) apa pun terlepas dari arsitektur komputer yang mendasarinya. Sintaks Java mirip dengan C dan C++, tetapi memiliki lebih sedikit fasilitas tingkat rendah daripada keduanya. Java runtime menyediakan kemampuan dinamis (seperti refleksi dan modifikasi kode runtime) yang biasanya tidak tersedia dalam bahasa kompilasi tradisional. Pada 2019, Java adalah salah satu bahasa pemrograman paling populer yang digunakan menurut GitHub, terutama untuk aplikasi web client-server, dengan 9 juta pengembang yang dilaporkan.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // Java
            "JavaScript (/ˈdʒɑːvəˌskrɪpt/), sering disingkat JS, adalah bahasa pemrograman yang sesuai dengan spesifikasi ECMAScript. JavaScript tingkat tinggi, sering dikompilasi tepat waktu, dan multi-paradigma. Ini memiliki sintaks kurung kurawal, pengetikan dinamis, orientasi objek berbasis prototipe, dan fungsi kelas satu.\n" +
                    "\n" +
                    "Bersamaan dengan HTML dan CSS, JavaScript adalah salah satu teknologi inti dari World Wide Web. Lebih dari 97% situs web menggunakannya di sisi klien untuk perilaku halaman web, sering kali menggabungkan perpustakaan pihak ketiga. Semua browser web utama memiliki mesin JavaScript khusus untuk mengeksekusi kode pada perangkat pengguna.\n" +
                    "\n" +
                    "Sebagai bahasa multi-paradigma, JavaScript mendukung gaya pemrograman yang digerakkan oleh peristiwa, fungsional, dan imperatif. Ini memiliki antarmuka pemrograman aplikasi (API) untuk bekerja dengan teks, tanggal, ekspresi reguler, struktur data standar, dan Model Objek Dokumen (DOM).\n" +
                    "\n(diterjemahkan menggunakan google translate)", // JavaScript
            "Kotlin (/ˈkɒtlɪn/) adalah bahasa pemrograman tujuan umum lintas platform, diketik secara statis, dengan inferensi tipe. Kotlin dirancang untuk beroperasi sepenuhnya dengan Java, dan versi JVM dari library standar Kotlin bergantung pada Java Class Library, tetapi inferensi tipe memungkinkan sintaksnya menjadi lebih ringkas. Kotlin terutama menargetkan JVM, tetapi juga mengkompilasi ke JavaScript (misalnya, untuk aplikasi web frontend menggunakan React) atau kode asli (melalui LLVM); misalnya, untuk aplikasi iOS asli yang berbagi logika bisnis dengan aplikasi Android. Biaya pengembangan bahasa ditanggung oleh JetBrains, sementara Kotlin Foundation melindungi merek dagang Kotlin.\n" +
                    "\n" +
                    "Pada 7 Mei 2019, Google mengumumkan bahwa bahasa pemrograman Kotlin sekarang menjadi bahasa pilihan untuk pengembang aplikasi Android. Sejak rilis Android Studio 3.0 pada Oktober 2017, Kotlin telah disertakan sebagai alternatif kompiler Java standar. Kompiler Android Kotlin menghasilkan bytecode Java 8 secara default (yang berjalan di JVM yang lebih baru), tetapi memungkinkan programmer memilih untuk menargetkan Java 8 hingga 16, untuk pengoptimalan, atau memungkinkan lebih banyak fitur, mis. Java 8 terkait dengan Kotlin 1.4, dan memiliki dukungan kelas rekaman eksperimental untuk kompatibilitas Java 16.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // Kotlin
            "Perl adalah keluarga dari dua tingkat tinggi, tujuan umum, ditafsirkan, bahasa pemrograman dinamis. \"Perl\" mengacu pada Perl 5, tetapi dari tahun 2000 hingga 2019 juga merujuk pada \"bahasa saudara\" yang didesain ulang, Perl 6, sebelum nama yang terakhir secara resmi diubah menjadi Raku pada Oktober 2019.\n" +
                "Meskipun Perl tidak secara resmi merupakan akronim, ada berbagai backronym yang digunakan, termasuk \"Ekstraksi Praktis dan Bahasa Pelaporan\". Perl awalnya dikembangkan oleh Larry Wall pada tahun 1987 sebagai bahasa skrip Unix untuk tujuan umum untuk mempermudah pemrosesan laporan. Sejak itu, telah mengalami banyak perubahan dan revisi. Raku, yang dimulai sebagai desain ulang Perl 5 pada tahun 2000, akhirnya berkembang menjadi bahasa yang terpisah. Kedua bahasa terus dikembangkan secara independen oleh tim pengembangan yang berbeda dan secara bebas meminjam ide satu sama lain.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // Perl
            "PHP adalah bahasa scripting tujuan umum yang sangat cocok untuk pengembangan web. Ini awalnya dibuat oleh programmer Denmark-Kanada Rasmus Lerdorf pada tahun 1994. Implementasi referensi PHP sekarang diproduksi oleh The PHP Group. PHP awalnya merupakan singkatan dari Personal Home Page, tetapi sekarang merupakan singkatan dari inisialisasi rekursif PHP: Hypertext Preprocessor.\n" +
                    "\n" +
                    "Kode PHP biasanya diproses di server web oleh juru bahasa PHP yang diimplementasikan sebagai modul, daemon, atau sebagai executable Common Gateway Interface (CGI). Di server web, hasil dari kode PHP yang ditafsirkan dan dieksekusi – yang dapat berupa semua jenis data, seperti HTML yang dihasilkan atau data gambar biner – akan membentuk keseluruhan atau sebagian dari respons HTTP. Berbagai sistem templat web, sistem manajemen konten web, dan kerangka kerja web ada yang dapat digunakan untuk mengatur atau memfasilitasi pembuatan respons itu. Selain itu, PHP dapat digunakan untuk banyak tugas pemrograman di luar konteks web, seperti aplikasi grafis mandiri dan kontrol robot drone. Kode PHP juga dapat langsung dieksekusi dari baris perintah.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // PHP
            "Python adalah bahasa pemrograman tujuan umum tingkat tinggi yang ditafsirkan. Filosofi desain Python menekankan keterbacaan kode dengan penggunaan lekukan yang signifikan. Konstruksi bahasanya serta pendekatan berorientasi objeknya bertujuan untuk membantu pemrogram menulis kode yang jelas dan logis untuk proyek skala kecil dan besar.\n" +
                    "\n" +
                    "Python diketik secara dinamis dan dikumpulkan dari sampah. Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman terstruktur (khususnya, prosedural), berorientasi objek dan fungsional. Python sering digambarkan sebagai bahasa \"termasuk baterai\" karena pustaka standarnya yang komprehensif.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // Python
            "R adalah bahasa pemrograman dan lingkungan perangkat lunak bebas untuk komputasi statistik dan grafik yang didukung oleh R Foundation for Statistical Computing. Bahasa R banyak digunakan di antara ahli statistik dan penambang data untuk mengembangkan perangkat lunak statistik dan analisis data. Jajak pendapat, survei data mining, dan studi database literatur ilmiah menunjukkan peningkatan substansial dalam popularitas; pada April 2021, R menempati urutan ke-13 dalam indeks TIOBE, ukuran popularitas bahasa pemrograman.\n" +
                    "\n" +
                    "Lingkungan perangkat lunak R resmi adalah paket GNU. Hal ini ditulis terutama dalam C, Fortran, dan R itu sendiri (dengan demikian, sebagian self-hosting) dan tersedia secara bebas di bawah GNU General Public License. Eksekusi pra-kompilasi disediakan untuk berbagai sistem operasi. Meskipun R memiliki antarmuka baris perintah, ada beberapa antarmuka pengguna grafis pihak ketiga, seperti RStudio, lingkungan pengembangan terintegrasi, dan Jupyter, antarmuka notebook.\n" +
                    "\n(diterjemahkan menggunakan google translate)", // R
            "Ruby adalah bahasa pemrograman tujuan umum tingkat tinggi yang ditafsirkan. Ini dirancang dan dikembangkan pada pertengahan 1990-an oleh Yukihiro \"Matz\" Matsumoto di Jepang.\n" +
                    "\n" +
                    "Ruby diketik secara dinamis dan menggunakan pengumpulan sampah dan kompilasi tepat waktu. Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman prosedural, berorientasi objek, dan fungsional. Menurut penciptanya, Ruby dipengaruhi oleh Perl, Smalltalk, Eiffel, Ada, BASIC, dan Lisp.\n" +
                    "\n(diterjemahkan menggunakan google translate)" // Ruby
    )

    private val reference = arrayOf(
        "https://en.wikipedia.org/wiki/C_(programming_language)", // C
        "https://en.wikipedia.org/wiki/C%2B%2B", // C++
        "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)", // C#
        "https://en.wikipedia.org/wiki/Go_(programming_language)", // go
        "https://en.wikipedia.org/wiki/Java_(programming_language)", // Java
        "https://en.wikipedia.org/wiki/JavaScript", // JavaScript
        "https://en.wikipedia.org/wiki/Kotlin_(programming_language)", // Kotlin
        "https://en.wikipedia.org/wiki/Perl", //perl
        "https://en.wikipedia.org/wiki/PHP", // PHP
        "https://en.wikipedia.org/wiki/Python_(programming_language)", // python
        "https://en.wikipedia.org/wiki/R_(programming_language)", // R
        "https://en.wikipedia.org/wiki/Ruby_(programming_language)" // Ruby
    )

    private val langImages = intArrayOf(
        R.drawable.lang_c,
        R.drawable.lang_cpp,
        R.drawable.lang_c_sharp,
        R.drawable.lang_go,
        R.drawable.lang_java,
        R.drawable.lang_javascript,
        R.drawable.lang_kotlin,
        R.drawable.lang_perl,
        R.drawable.lang_php,
        R.drawable.lang_python,
        R.drawable.lang_r,
        R.drawable.lang_ruby)

    val listData: ArrayList<Lang>
        get() {
            // Membuat list kosong
            val list = arrayListOf<Lang>()

            for (position in names.indices) {
                val lang = Lang()
                lang.name = names[position]
                lang.designed_by = designed_by[position]
                lang.first_release = first_release[position]
                lang.stable_release = stable_release[position]
                lang.paradigm = paradigm[position]
                lang.detail = detail[position]
                lang.reference = reference[position]
                lang.photo = langImages[position]
                list.add(lang)
            }

            return list
        }
}