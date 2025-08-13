fun main() {
   /* val nilai = 85
    
    val grade = when {
        nilai >= 90 -> 'A'
        nilai >= 80 -> 'B'
        nilai >= 70 -> 'C'
        nilai >= 60 -> 'D'
        else -> 'E'
    }
    println("nilai: $nilai")
    println("grade: $grade")
}
//latihan 2

val buku = 12000
val pensil = 8500
val mobil = 20000

val total = buku + pensil + mobil
println("total dari pembelian buku: $buku, pensil: $pensil, dan mobil: $mobil = $total")


}
//latihan 3

    val angka = listOf(2, 7, 10, 13, 18, 21)
    val angkagenap = angka.filter { it%2==0 }
    println("angka genap: $angkagenap")
}
//latihan 4

    val nama = listOf("ana", "bambang", "christina", "dewi")
    val namaterpanjang = nama.maxByOrNull { it.length }

    println("Nama terpanjang: $namaterpanjang")
 }
//latihan 5

    val stok = listOf(10, 5, 20, 7, 12)
    val total = stok.sum()
    
    println("total stok barang:$total")
    }
 //latihan 6
       val datakepuasan = mapOf(
        "Anita" to listOf(5, 3, 4, 1, 4),
        "Dwi" to listOf(2, 4, 4, 5, 4)
    )

    println("Rata-rata dan status kepuasan:")

    datakepuasan.forEach { (nama: String, skor: List<Int>) ->
        val rata = skor.average()
        val status = when {
            rata >= 4 -> "Sangat Puas"
            rata >= 3 -> "Puas"
            rata >= 2 -> "Cukup"
            else -> "Kurang"
        }

        println("%s: Rata-rata = %.2f, Status = %s".format(nama, rata, status))
    }
}
//latihan 7
data class Peminjaman(
    val nama: String,
    val buku: List<String>,
    val sudahDikembalikan: Boolean
)

    val dataPeminjaman = listOf(
        Peminjaman("Anita", listOf("Kotlin Dasar", "Algoritma Pemrograman"), false),
        Peminjaman("Budi", listOf("Struktur Data", "Kotlin Dasar", "Basis Data"), true),
        Peminjaman("Citra", listOf("Matematika Diskrit"), false),
        Peminjaman("Dwi", listOf("Pemrograman Web", "Desain UI/UX", "Kotlin Dasar"), false),
        Peminjaman("Eka", listOf("Jaringan Komputer", "Sistem Operasi", "Pemrograman Mobile"), true)
    )

    println("Siswa yang belum mengembalikan buku:")
    dataPeminjaman.filter { !it.sudahDikembalikan }
        .forEach { println(it.nama) }

    val bukuUnik = dataPeminjaman.flatMap { it.buku }.toSet()
    println("\nJudul buku unik yang pernah dipinjam:")
    bukuUnik.forEach { println(it) }

    val lebihDariDua = dataPeminjaman.count { it.buku.size > 2 }
    println("\nJumlah siswa yang meminjam lebih dari 2 buku: $lebihDariDua")

    println("\nSiswa yang meminjam 'Kotlin Dasar':")
    dataPeminjaman.filter { peminjaman ->
        peminjaman.buku.any { it.equals("Kotlin Dasar", ignoreCase = true) }
    }.forEach { println(it.nama) }

    val totalBuku = dataPeminjaman.sumOf { it.buku.size }
    println("\nTotal seluruh buku yang dipinjam: $totalBuku")
}
//latihan 8
    val dataKehadiran = mapOf(
        "Anita" to listOf(true, true, true, false, true, true, true, false),
        "Budi" to listOf(true, false, false, true, false, true, false, false),
        "Citra" to listOf(true, true, true, true, true, true, true, true),
        "Dwi" to listOf(true, true, false, true, false, true, false, true),
        "Eka" to listOf(true, false, true, false, true, false, true, false),
        "Fajar" to listOf(true, true, true, true, false, false, true, true),
        "Gita" to listOf(false, false, false, false, true, false, false, false),
        "Hadi" to listOf(true, true, false, true, true, true, true, false),
        "Indra" to listOf(true, false, true, false, false, true, true, true),
        "Joko" to listOf(false, true, true, true, true, true, false, true)
    )

    val totalPertemuan = 8

    println("Jumlah kehadiran tiap siswa:")
    var namaTertinggi = ""
    var hadirTertinggi = -1
    var namaTerendah = ""
    var hadirTerendah = totalPertemuan + 1
    var totalHadirKelas = 0

    dataKehadiran.forEach { (nama, absensi) ->
        val jumlahHadir = absensi.count { it }
        totalHadirKelas += jumlahHadir
        println("$nama: $jumlahHadir kali hadir")

        if (jumlahHadir > hadirTertinggi) {
            hadirTertinggi = jumlahHadir
            namaTertinggi = nama
        }

        if (jumlahHadir < hadirTerendah) {
            hadirTerendah = jumlahHadir
            namaTerendah = nama
        }
    }

    println("\nSiswa yang hadir kurang dari 6 kali:")
    dataKehadiran.filter { it.value.count { hadir -> hadir } < 6 }
        .forEach { println(it.key) }

    println("\nKehadiran tertinggi: $namaTertinggi ($hadirTertinggi kali)")
    println("Kehadiran terendah: $namaTerendah ($hadirTerendah kali)")

    val rataPersenKelas = totalHadirKelas.toDouble() / (dataKehadiran.size * totalPertemuan) * 100
    println("\nPersentase rata-rata kehadiran kelas: ${"%.2f".format(rataPersenKelas)}%")

    println("\nStatus kelayakan ujian:")
    dataKehadiran.forEach { (nama, absensi) ->
        val jumlahHadir = absensi.count { it }
        val persenHadir = jumlahHadir.toDouble() / totalPertemuan * 100
        if (persenHadir < 75) {
            println("$nama: Tidak layak ikut ujian (${ "%.2f".format(persenHadir)}%)")
        }
    }
}
//latihan 9
data class Pemesanan(
    val nama: String,
    val hari: String,
    val jam: String,
    val lab: String,
    val disetujui: Boolean
)

    val dataPemesanan = listOf(
        Pemesanan("Anita", "Senin", "08.00–10.00", "Lab AI", true),
        Pemesanan("Budi", "Selasa", "10.00–12.00", "Lab Jaringan", false),
        Pemesanan("Citra", "Jumat", "13.00–15.00", "Lab AI", true),
        Pemesanan("Dwi", "Kamis", "08.00–10.00", "Lab AI", false),
        Pemesanan("Eka", "Jumat", "08.00–10.00", "Lab Multimedia", true),
        Pemesanan("Budi", "Rabu", "09.00–11.00", "Lab AI", true),
        Pemesanan("Fajar", "Senin", "13.00–15.00", "Lab Jaringan", true)
    )

    println("Pemesanan yang belum disetujui:")
    dataPemesanan.filter { !it.disetujui }
        .forEach { println("${it.nama} - ${it.hari} - ${it.lab}") }

    println("\nTotal pemesanan per laboratorium:")
    dataPemesanan.groupingBy { it.lab }
        .eachCount()
        .forEach { (lab, total) -> println("$lab: $total pemesanan") }

    println("\nSiswa yang memesan pada hari Jumat:")
    dataPemesanan.filter { it.hari.equals("Jumat", ignoreCase = true) }
        .forEach { println(it.nama) }

    fun labAIDigunakan(hari: String, jam: String): Boolean {
        return dataPemesanan.any {
            it.lab.equals("Lab AI", ignoreCase = true) &&
            it.hari.equals(hari, ignoreCase = true) &&
            it.jam.equals(jam, ignoreCase = true)
        }
    }

    println("\nCek Lab AI di Kamis 08.00–10.00:")
    if (labAIDigunakan("Kamis", "08.00–10.00")) {
        println("Lab AI sedang digunakan pada waktu tersebut.")
    } else {
        println("Lab AI tersedia pada waktu tersebut.")
    }

    println("\nSiswa yang memesan lebih dari 1 kali:")
    dataPemesanan.groupingBy { it.nama }
        .eachCount()
        .filter { it.value > 1 }
        .forEach { println("${it.key} (${it.value} kali)") }
}*/
//latihan 10
    val dataBahasa = mapOf(
        "Anita" to listOf("Kotlin", "Python", "Java"),
        "Budi" to listOf("Java", "C++", "Python"),
        "Citra" to listOf("Python", "Kotlin", "C#"),
        "Dwi" to listOf("C", "Java", "Kotlin"),
        "Eka" to listOf("C++", "Python", "C"),
        "Fajar" to listOf("Java", "C", "Kotlin")
    )

    val bahasaUnik = dataBahasa.values.flatten().toSet()
    println("Semua bahasa yang pernah dipilih:")
    bahasaUnik.forEach { println(it) }

    val jumlahPemilih = dataBahasa.values
        .flatten()
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }

    println("\nJumlah pemilih tiap bahasa (urut terbanyak):")
    jumlahPemilih.forEach { (bahasa, jumlah) ->
        println("$bahasa: $jumlah siswa")
    }

    println("\nSiswa yang memilih 'Kotlin' sebagai pilihan pertama:")
    dataBahasa.filter { it.value.first().equals("Kotlin", ignoreCase = true) }
        .forEach { println(it.key) }

    val jumlahPython = dataBahasa.count { it.value.any { bahasa -> bahasa.equals("Python", ignoreCase = true) } }
    println("\nJumlah siswa yang memilih 'Python': $jumlahPython")

    val semuaBahasa = listOf("Kotlin", "Java", "C++", "Python", "C", "C#")
    val tidakDipilih = semuaBahasa.filter { it !in bahasaUnik }
    println("\nBahasa yang tidak dipilih sama sekali:")
    if (tidakDipilih.isEmpty()) {
        println("Semua bahasa pernah dipilih.")
    } else {
        tidakDipilih.forEach { println(it) }
    }
}

