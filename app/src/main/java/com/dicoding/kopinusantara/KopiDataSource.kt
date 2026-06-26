package com.dicoding.kopinusantara

object KopiDataSource {

    fun getListKopi(): List<Kopi> = listOf(
        Kopi(
            id = 1,
            nama = "Kopi Gayo",
            asalDaerah = "Aceh",
            deskripsiSingkat = "Arabika dataran tinggi dengan rasa herbal dan keasaman rendah.",
            deskripsiLengkap = "Kopi Gayo ditanam di dataran tinggi Gayo, Aceh, pada ketinggian di atas 1.000 mdpl. " +
                "Kopi ini dikenal memiliki body yang tebal, aroma rempah yang khas, serta tingkat keasaman " +
                "yang relatif rendah dibanding arabika dari daerah lain. Banyak petani di kawasan ini menerapkan " +
                "metode pengolahan giling basah (wet hulling) yang memberikan karakter rasa earthy yang unik.",
            imageRes = R.drawable.kopi_gayo
        ),
        Kopi(
            id = 2,
            nama = "Kopi Sidikalang",
            asalDaerah = "Sumatera Utara",
            deskripsiSingkat = "Perpaduan robusta dan arabika dengan body kuat dan rasa pahit khas.",
            deskripsiLengkap = "Kopi Sidikalang berasal dari Kabupaten Dairi, Sumatera Utara, dan sudah lama menjadi " +
                "salah satu kopi favorit di kalangan masyarakat Sumatera. Karakter rasanya cenderung kuat dan pekat " +
                "dengan sedikit sentuhan pahit, cocok untuk yang menyukai kopi dengan body berat dan after taste yang tegas.",
            imageRes = R.drawable.kopi_sidikalang
        ),
        Kopi(
            id = 3,
            nama = "Kopi Mandailing",
            asalDaerah = "Sumatera Utara",
            deskripsiSingkat = "Arabika dengan body tebal dan rasa earthy yang dalam.",
            deskripsiLengkap = "Kopi Mandailing tumbuh di kawasan Tapanuli Selatan, Sumatera Utara. Kopi ini sudah " +
                "dikenal di pasar internasional sejak lama karena karakter rasanya yang dalam, body tebal, serta " +
                "tingkat keasaman yang rendah. Aromanya cenderung earthy dengan sedikit jejak rasa cokelat.",
            imageRes = R.drawable.kopi_mandailing
        ),
        Kopi(
            id = 4,
            nama = "Kopi Lampung",
            asalDaerah = "Lampung",
            deskripsiSingkat = "Robusta pekat dengan rasa cokelat pahit yang kuat.",
            deskripsiLengkap = "Lampung merupakan salah satu daerah penghasil kopi robusta terbesar di Indonesia. " +
                "Kopi Lampung memiliki body yang pekat, rasa pahit yang kuat dengan sentuhan cokelat, serta aroma " +
                "yang tajam. Kopi ini banyak digunakan sebagai bahan campuran kopi bubuk maupun kopi instan.",
            imageRes = R.drawable.kopi_lampung
        ),
        Kopi(
            id = 5,
            nama = "Kopi Java Preanger",
            asalDaerah = "Jawa Barat",
            deskripsiSingkat = "Arabika legendaris dari Priangan dengan rasa fruity dan floral ringan.",
            deskripsiLengkap = "Kopi Java Preanger ditanam di kawasan Priangan, Jawa Barat, dan menjadi salah satu " +
                "kopi yang dikenal sejak masa kolonial. Kopi ini memiliki keasaman sedang dengan karakter rasa fruity " +
                "dan sedikit floral, menjadikannya pilihan menarik bagi penikmat kopi single origin.",
            imageRes = R.drawable.kopi_preanger
        ),
        Kopi(
            id = 6,
            nama = "Kopi Toraja",
            asalDaerah = "Sulawesi Selatan",
            deskripsiSingkat = "Arabika dataran tinggi dengan body penuh dan rasa earthy-spicy.",
            deskripsiLengkap = "Kopi Toraja tumbuh di dataran tinggi Sulawesi Selatan dan telah dikenal luas di " +
                "pasar dunia. Karakter rasanya penuh (full body) dengan sentuhan earthy dan sedikit rempah, " +
                "serta tingkat keasaman yang rendah sehingga terasa lembut saat diminum.",
            imageRes = R.drawable.kopi_toraja
        ),
        Kopi(
            id = 7,
            nama = "Kopi Kintamani",
            asalDaerah = "Bali",
            deskripsiSingkat = "Arabika yang ditanam tumpang sari dengan jeruk, rasa citrusy ringan.",
            deskripsiLengkap = "Kopi Kintamani berasal dari dataran tinggi Kintamani, Bali, tempat petani biasa " +
                "menanam kopi secara tumpang sari dengan pohon jeruk. Hal ini memberi pengaruh pada rasa kopi yang " +
                "cenderung citrusy dan ringan, dengan keasaman yang segar dan aroma buah yang halus.",
            imageRes = R.drawable.kopi_kintamani
        ),
        Kopi(
            id = 8,
            nama = "Kopi Bajawa",
            asalDaerah = "Flores, NTT",
            deskripsiSingkat = "Arabika dengan rasa karamel manis dan sedikit rempah.",
            deskripsiLengkap = "Kopi Bajawa ditanam di dataran tinggi Bajawa, Flores, Nusa Tenggara Timur. Kopi ini " +
                "dikenal memiliki rasa manis menyerupai karamel dengan sentuhan rempah yang lembut, serta body yang " +
                "medium hingga penuh, menjadikannya salah satu kopi favorit dari kawasan Indonesia timur.",
            imageRes = R.drawable.kopi_bajawa
        ),
        Kopi(
            id = 9,
            nama = "Kopi Wamena",
            asalDaerah = "Papua",
            deskripsiSingkat = "Arabika organik dataran tinggi Baliem dengan rasa bersih dan earthy.",
            deskripsiLengkap = "Kopi Wamena tumbuh di Lembah Baliem, Papua, pada ketinggian yang ideal untuk arabika. " +
                "Kopi ini umumnya ditanam secara organik tanpa pestisida karena keterbatasan akses bahan kimia di " +
                "kawasan tersebut, menghasilkan rasa yang bersih (clean) dengan karakter earthy yang khas.",
            imageRes = R.drawable.kopi_wamena
        ),
        Kopi(
            id = 10,
            nama = "Kopi Pagaralam",
            asalDaerah = "Sumatera Selatan",
            deskripsiSingkat = "Robusta dataran tinggi dengan body kuat dan rasa nutty.",
            deskripsiLengkap = "Kopi Pagaralam berasal dari lereng Gunung Dempo, Sumatera Selatan. Kopi ini termasuk " +
                "robusta dataran tinggi yang memiliki body kuat, rasa pahit yang seimbang, serta sentuhan rasa " +
                "kacang (nutty) yang muncul saat diseduh.",
            imageRes = R.drawable.kopi_pagaralam
        ),
        Kopi(
            id = 11,
            nama = "Kopi Banyuwangi Ijen",
            asalDaerah = "Jawa Timur",
            deskripsiSingkat = "Arabika dataran tinggi Ijen dengan rasa fruity dan after taste manis.",
            deskripsiLengkap = "Kopi Banyuwangi tumbuh di kawasan dataran tinggi Gunung Ijen, Jawa Timur. Kopi ini " +
                "memiliki karakter rasa fruity dengan after taste yang cenderung manis, serta keasaman sedang yang " +
                "membuatnya nyaman diminum oleh berbagai kalangan penikmat kopi.",
            imageRes = R.drawable.kopi_banyuwangi
        ),
        Kopi(
            id = 12,
            nama = "Kopi Liberika Meranti",
            asalDaerah = "Riau",
            deskripsiSingkat = "Varietas liberika khas lahan gambut dengan aroma nangka yang unik.",
            deskripsiLengkap = "Kopi Liberika Meranti berasal dari Kepulauan Meranti, Riau, dan tumbuh di lahan " +
                "gambut yang jarang ditemui pada perkebunan kopi lain di Indonesia. Varietas liberika ini memiliki " +
                "ukuran biji yang lebih besar dan aroma khas menyerupai buah nangka, menjadikannya salah satu kopi " +
                "paling unik di Nusantara.",
            imageRes = R.drawable.kopi_meranti
        )
    )

    fun getKopiById(id: Int): Kopi? = getListKopi().find { it.id == id }
}
