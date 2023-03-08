package com.fizahra.fiiflorist.model

import android.os.Parcelable
import com.fizahra.fiiflorist.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Flower(
    val name: String,
    val shortdesc: String,
    val photo : Int,
    val longdesc : String,
    val ilmiah : String,
) : Parcelable{
    companion object{
        fun loadData(): List<Flower>{
            return listOf(
                Flower( name = "Baby's Breath",
                        shortdesc = "Bunga klasik yang melambangkan cinta sejati, kemurnian dan perasaan tulus",
                        photo = R.drawable.baby_breath,
                        longdesc = """
                            Baby breath memiliki kelopak berukuran mungil dan banyak tumbuh di kawasan Asia, Mediterania Timur, dan juga Eropa. Bunga ini memiliki rentang mekar yang lumayan lama, yaitu pada awal musim semi hingga di penghujung musim gugur. Sementara waktu tumbuh bunga ini memerlukan rentang antara 8 hingga 12 minggu. 
                            Baby breath atau napas bayi ini dapat didefinisikan sebagai sebuah ketulusan dan cinta abadi. Karena itu, banyak yang memakainya sebagai bouquet untuk acara pernikahan.
                        """.trimIndent(),
                    ilmiah = "Gypsophila"
                ),
                Flower( name = "Chrysanthemum",
                    shortdesc = "Bunga cantik yang menambah keharuman dalam teh",
                    photo = R.drawable.chrysanthemum,
                    longdesc = """
                            Chrysanthemum atau bunga seruni adalah salah satu bunga yang banyak di favoritkan oleh banyak orang. Bunganya tak hanya indah, namun juga unggul dari aneka warna-warni yang membuatnya terlihat lebih semarak dimanapun bunga-bunga ini diletakkan. 
                            Kemudian, nilai plusnya lagi karena bunga krisan mempunyai aroma khas yang lembut sehingga biasa ditambahkan di dalam teh untuk membuat teh tersebut terasa lebih nikmat dan wangi. 
                            Bunga ini memiliki makna yang berbeda disetiap negara, seperti di China yang menganggap bunga ini sebagai lambang bangsawan dan Jepang yang menganggap bunga ini sebagai lambang panjang umur
                             """.trimIndent(),
                    ilmiah = "chrysanthemum"
                ),
                Flower( name = "Daisy",
                    shortdesc = "Bunga yang melambangkan perasaan cinta dalam diam",
                    photo = R.drawable.daisy,
                    longdesc = """
                            Bunga Daisy atau aster adalah bunga yang berasal dari China dan dapat ditemukan hampir diseluruh dunia, kecuali di Antartika. Bunga ini bisa digunakan untuk menurunkan flu dan masuk angin. 
                            Bunga aster ini memiliki tampilan yang sederhana sehingga sering kaitkan dengan kesederhanaan. Selain itu, warna dari bunga daisy ini terlihat cukup cerah namun tidak terlalu mencolok sehingga sering disamakan dengan kemurnian dan kehangatan. 
                            Banyak orang yang mengaitkan bunga yang satu ini dengan pengungkapan perasaan karena tampilan bunganya yang seakan-akan menggambarkan sebuah ketulusan.
                        """.trimIndent(),
                    ilmiah = "Bellis Perennis"
                ),
                Flower( name = "Dandelion",
                    shortdesc = "Bunga liar yang sangat kuat dan sabar dalam menjalani kerasnya angin kehidupan",
                    photo = R.drawable.dandelion,
                    longdesc = """
                             Dandelion berasal dari daratan Eropa dan Asia, namun sekarang sudah banyak menyebar karena bunga ini bisa tumbuh dengan subur di mana-mana. Bijinya yang terbang tertiup angin bisa mencapai 5 mil dan mendarat di tanah. Jadi tidak heran jika kamu banyak menemukan bunga ini di pinggir jalan, di halaman rumah, atau bahkan di ladang karena memang bunga yang satu ini bisa tumbuh dengan kuat meskipun hanya ditetesi air hujan. Bunga Dandelion mengajarkan kepada semua orang bahwa dalam hidup harus berani, optimis, dan beradaptasi dengan lingkungan sebaik mungkin. Seperti yang kamu tahu hidup itu keras, jadi jika kamu hanya bermalas-malasan maka tidak akan mendapat apapun dalam hidup ini, jangan pernah merasa tidak pantas karena semua orang pantas memiliki hal yang diinginkan asal tidak merugikan orang lain.
                        """.trimIndent(),
                    ilmiah = "Taraxacum"
                ),
                Flower( name = "Hydrangea",
                    shortdesc = "Bunga yang mengekspresikan hadiah atas rasa bersalah atau permintaan maaf",
                    photo = R.drawable.hydrangea,
                    longdesc = """
                             Hydrangea memiliki bunga yang berukuran besar, membulat layaknya sanggul dengan warna-warna lembut yang memikat. Warna bunganya beragam seperti merah muda, ungu, biru hingga putih. Uniknya lagi, bunganya bisa berubah warna tergantung dari tingkat keasaman (pH) tanah tempatnya tumbuh. 
                             Banyak yang meyakini hydrangea pertama kali ditemukan di Jepang, kemudian tersebar di Asia selama ratusan tahun sebelum akhirnya masuk ke Eropa dan Amerika. Menurut legenda Jepang, bunga hydrangea bermakna permintaan maaf dari kaisar Jepang yang telah mengabaikan wanita yang dicintainya karena urusan negara dan menunjukkan betapa ia sangat peduli dengannya.
                        """.trimIndent(),
                    ilmiah = "Hydrangea"
                ),
                Flower( name = "Iris",
                    shortdesc = "Bunga cantik perlambangan harapan positif untuk masa depan",
                    photo = R.drawable.iris,
                    longdesc = """
                            Iris pertama kali ditemukan di Eropa, Afrika Utara, Amerika Utara dan Asia. Kelopak bunganya yang hanya terdiri dari beberapa helai saja tetap memberikan keindahan dari jenis bunga ini. 
                            Khusus untuk warna biru bunga tersebut melambangkan kepercayaan dan harapan. Selain itu bunga jenis ini juga mencerminkan sebuah kepercayaan. Kepercayaan dan harapan saling keterkaitan satu sama lainnya. Setiap harapan tentunya harus disertai dengan kepercayaan untuk bisa mewujudkannya.
                        """.trimIndent(),
                    ilmiah = "Iris"
                ),
                Flower( name = "Jasmine",
                    shortdesc = "Bunga kecil yang menggambarkan keanggunan dan ketulusan",
                    photo = R.drawable.jasmine,
                    longdesc = """
                            Bunga jasmine atau melati merupakan salah satu dari jenis bunga yang tumbuh di semak-semak. Meski ada beberapa dari jenis melati yang terlihat tumbuh merambat, tapi pertumbuhannya tersebut cenderung terlihat tidak beraturan. 
                            Bunga melati ini mempunyai ukuran yang kecil dan berwarna putih, jadi memang tidak mempunyai warna-warni seperti halnya jenis bunga yang lainnya. Bunga melati ini mempunyai keharuman serta juga wangi semerbak. Aroma dari bunga ini sering dikaitkan sebagai sebuah lambang cinta serta kasih sayang.
                        """.trimIndent(),
                    ilmiah = "Jasminum"
                ),
                Flower( name = "Lavender",
                    shortdesc = "Bunga cantik yang mampu mengusir nyamuk untukmu",
                    photo = R.drawable.lavender,
                    longdesc = """
                            Lavender adalah bunga yang berasal dari Perancis dan banyak digunakan di berbagai produk, seperti di pengharum ruangan, pengusir serangga, hingga pelicin pakaian. 
                            Bunga lavender memiliki arti yang sangat dalam, yaitu melambangkan pengabdian, kesucian dan juga cinta.
                        """.trimIndent(),
                    ilmiah = "Lavandula"
                ),
                Flower( name = "Lily",
                    shortdesc = "Ratu taman yang memiliki wangi semerbak dan melambangkan kemurnian",
                    photo = R.drawable.lily,
                    longdesc = """
                            Bunga lily berasal dari Asia Barat dan Mediterania dan memiliki bermacam-macam warna yang menarik, jadi jangan heran jika orang akan betah memandangnya bahkan dalam waktu yang lama. 
                            Selain dari bentuknya yang indah, bunga lily rata-rata juga menebarkan aroma wangi yang semerbak sehingga dijuluki ratu taman. Secara umum, bunga lily memiliki makna kesucian, kemurnian dan kesopanan. Bunga lily yang juga biasa disebut bunga bakung juga dianggap sebagai lambang keindahan.
                        """.trimIndent(),
                    ilmiah = "Lilum"
                ),
                Flower( name = "Marigold",
                    shortdesc = "Bunga yang bermanfaat untuk kesehatan dan menyimbolkan kehangatan matahari",
                    photo = R.drawable.marigold,
                    longdesc = """
                            Marigold atau bunga gemitir mempunyai ciri dengan warna kuning ataupun orange dengan suguhan bunganya yang terlihat gemuk. Bunga ini sedikit terlihat bentuk membulat, mempunyai beberapa kelopak yang biasa terlihat saling bertumpukan. 
                            Bunga ini memiliki arti keindahan, kekayaan, kemasyhuran, dan kehangatan yang dilambangkan melalui warna kuningnya cerahnya. Bunga ini juga bisa dimaknai sebagai jam kecil yang mengartikan waktu yang terbatas.
                        """.trimIndent(),
                    ilmiah = "Tagetes"
                ),
                Flower( name = "Petunia",
                    shortdesc = "Bunga perlambang kebencian dan juga kesuksesan!",
                    photo = R.drawable.petunia,
                    longdesc = """
                            Bunga petunia berasal dari Amerika Selatan dan tumbuh dengan cepat di tanah yang subur.
                            Bunga Petunia dapat memiliki banyak arti filosofis. Yang pertama dapat diartikan sebagai suatu kebencian dan kemarahan bila diberikan dari orang sedang mempunyai masalah perselisihan dengan kamu.
                            Yang kedua, bila ada orang yang tidak memiliki kebencian dengan kamu memberikan bunga ini itu bisa dimaknai bahwa kamu dicintai oleh orang tersebut dan berharap agar kamu bisa sukses serta berhasil di masa mendatang.
                        """.trimIndent(),
                    ilmiah = "Petunia"
                ),
                Flower( name = "Rose",
                    shortdesc = "Duta cinta dan kasih sayang dalam dunia perbungaan",
                    photo = R.drawable.rose,
                    longdesc = """
                            Rose atau mawar adalah bunga yang berasal dari dataran Cina, Timur Tengah dan Eropa Timur. Dalam perkembangannya, menyebar luas di daerah-daerah beriklim dingin (sub-tropis) dan panas (tropis). 
                            Bunga mawar dikenal sebagai simbol sebagai cinta dan kasih sayang. Namun, arti bunga mawar ini bisa berbeda, tergantung pada warna dan budaya. Salah satunya, mawar kuning dikaitkan dengan persahabatan, kegembiraan, kehangatan, perhatian, penghargaan, dan kenangan sehingga cocok diberikan kepada sahabat atau teman.
                        """.trimIndent(),
                    ilmiah = "Rosa"
                ),
                Flower( name = "Spider Lily",
                    shortdesc = "Bunga cantik ini melambangkan kematian dan juga reinkarnasi",
                    photo = R.drawable.spider_lily,
                    longdesc = """
                            Spider lily tumbuh di Cina, Korea, dan Nepal. Bunga ini mekar sekitar akhir musim panas hingga musim gugur, sering kali bisa tumbuh baik dalam keadaan hujan deras. 
                            Nama umumnya adalah hurricane lily mengacu pada karakter tahan akan cuaca, bunga bakung kebangkitan pun menjadi sebutan lainnya. Jenis ini sedikit dari banyak bunga yang menunjukkan keindahannya pada musim dingin. Di seluruh kawasan Asia, pemahaman mengenai bunga satu ini adalah untuk simbol selamat tinggal atau perpisahan. 
                            Menurut legenda kuno, bunga lili laba-laba merah akan tumbuh di mana pun orang berpisah untuk terakhir kalinya. Dalam tulisan agama Buddha, makna bunga lili laba-laba merah adalah pembimbing orang untuk melalui reinkarnasi atau hidup kembali.
                        """.trimIndent(),
                    ilmiah = "Lycoris Radiata"
                ),
                Flower( name = "Sunflower",
                    shortdesc = "Bunga besar yang menyimbolkan keceriaan dan kehangatan",
                    photo = R.drawable.sunflower,
                    longdesc = """
                        Sunflower atau bunga matahari dapat tumbuh dimana saja, baik dataran tinggi maupun rendah. Syarat utamanya adalah terkena sinar matahari yang cukup. Bunga semusim ini dapat tumbuh tegak dengan ketinggian 1 hingga 3 meter. Sedangkan daunnya merupakan daun tunggal yang berbentuk menyerupai hati. Umur bunga ini sangat pendek yakni kurang dari 1 tahun. 
                        Dinamakan bunga matahari karena bunga ini bergerak mengikuti arah matahari, juga bentuk bunganya yang sudah mekar menyerupai sang mentari yang sedang bersinar. Coba Anda perhatikan, pada pagi hari bunga matahari akan menghadap ke arah timur tempat matahari terbit. Kemudian bunga terus mengikuti pergerakan matahari hingga ke arah barat yang merupakan arah matahari terbenam. Sifat inilah yang sering diartikan sebagai kesetiaan. Bunga matahari juga merupakan simbol atau mamiliki arti kepatuhan yang tidak pernah menunjukkan pembangkangan atau protes.
                        """.trimIndent(),
                    ilmiah = "Helianthus"
                ),
                Flower( name = "Tulip",
                    shortdesc = "Bunga Belanda yang menggambarkan kesempurnaan cinta abadi",
                    photo = R.drawable.tulip,
                    longdesc = """
                        Bunga tulip adalah bunga nasional negara Turki dan Belanda. Biasanya, bunga tulip akan mekar pada awal bulan Maret hingga April. 
                        Ciri paling mencolok dari bunga tulip adalah daunnya yang menutup ke atas dan berdekatan dengan mahkota bunga, memiliki jenis berwarna-warni, dan memiliki 6 helai mahkota bunga. Bunga ini memiliki arti simbol Sempurna, cinta abadi antara pasangan atau anggota keluarga. Kasih sayang yang tak terhingga, cinta yang ditolak atau dikembalikan. Penghargaan dan keagungan.
                        """.trimIndent(),
                    ilmiah = "Tulipa"
                ),
            )
        }
    }
}