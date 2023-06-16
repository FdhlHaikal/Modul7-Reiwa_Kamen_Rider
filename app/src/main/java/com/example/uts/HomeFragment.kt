package com.example.uts

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    private lateinit var adapter: KamenRiderAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var kamenriderList : List<KamenRiderClass>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataIntialize()
        val layoutManager = LinearLayoutManager(context)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        recyclerView.setHasFixedSize(true)
        adapter = KamenRiderAdapter(requireContext(), kamenriderList){ kr ->
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, kr)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    private fun dataIntialize(){
        kamenriderList = listOf<KamenRiderClass>(
            KamenRiderClass(
                R.drawable.kr1,
                krname = "Kamen Rider Zero One",
                krdate = "Tanggal Tayang: \n1 September 2019 - 30 Agustus 2020",
                krauthor = "Total Episode: \n46 Episode",
                krrate = "Rating: (7,8)",
                ratingbar = 7.8,
                krdesc = "Sinopsis: \nJepang telah memasuki era baru inovasi teknologi ketika Hiden Intelegence, perusaan terkemuka dalam penelitian kecerdasan buatan, yang mengembangkan android mirip manusia yang disebut HumaGears, yang dengan cepat menjadi bahan pokok di sektor publik dan swasta. Namun, organisasi cyber-terorist yang dikenal sebagai \"MetsubouJinrai.net\" mulai meretas HumaGears dan mengubah mereka menjadi monster yang disebut \"Magias\" yang bertujuan untuk menghancurkan umat manusia. Pemerintah merespons dengan mendirikan \"Artificial Intelligence Military Service\" atau AIMS, untuk menghancurkan mereka.\n" +
                        "\nPemeran utama cerita ini adalah Aruto Hiden, seorang pemuda dengan cita-cita menjadi komedian yang kemudian dirinya diangkat sebagai CEO baru Hiden Intelegence setelah kematian kakeknya. Meskipun awalnya tidak tertarik, Aruto berubah pikiran setelah menyaksikan serangan teroris MetsoubouJinrai.net secara langsung; lalu akhirnya menerima dan menjadi CEO sekaligus Kamen Rider Zero-One untuk mewujudkan keinginan mendiang ayahnya untuk hidup berdampingan secara damai antara manusia dan HumaGears. Dan juga beraliansi yang tidak mudah dengan para Operator AIMS, Isamu Fuwa dan Yua Yaiba yang masing-masing dapat berubah menjadi Kamen Rider Vulcan dan Kamen Rider Valkyrie, sedangkan MetsoubouJinrai.net; dipimpin oleh HumaGears Horobi dan Jin, yang juga dapat berubah menjadi Kamen rider Horobi dan Kamen Rider Jin. diri. "
            ),
            KamenRiderClass(
                R.drawable.kr2,
                krname = "Kamen Rider Saber",
                krdate = "Tanggal Tayang: \n6 September 2020 - 20 Agustus 2021",
                krauthor = "Total Episode: \n49 Episode",
                krrate = "Rating: (6,6)",
                ratingbar = 6.6,
                krdesc = "Sinopsis: \nDunia manusia bertabrakan dengan dunia dongeng dan petualangan fantasi yang disebut Wonder World karena konflik atas Greater Book – artefak legendaris dengan kekuatan tak tertandingi yang halamannya tersebar dalam bentuk Wonder Ride Books. Pendekar pedang dari ordo yang disebut Sword of Logos berusaha untuk menjauhkan halaman Greater Book dari Megids, trio monster yang mencari buku sambil menciptakan lebih banyak dari jenis mereka. Namun, Dark Swordsman Hayato Fukamiya, alias Kamen Rider Calibur, mengkhianati rekan-rekannya setelah mengetahui kebenaran yang mengerikan dan diyakini telah dibunuh oleh Flame Swordsman, Daichi Kamijo, dengan seorang gadis bernama Luna menjadi penyebab pertarungan mereka. Daichi memberikan Wonder Ride Book miliknya kepada seorang anak laki-laki bernama Touma Kamiyama sebelum meninggalkan pedangnya.  \n" +
                        "\nMenjadi seorang novelis dan pemilik toko buku lima belas tahun kemudian, upaya Touma untuk menghentikan serangan Megid menyebabkan dia mewarisi gelar Kamijo sebagai Kamen Rider Saber dan dia memutuskan untuk mengakhiri konflik setelah direkrut oleh Water Swordsman, Rintaro Shindo, dari Sword of Logos' Northern Base."
            ),
            KamenRiderClass(
                R.drawable.kr3,
                krname = "Kamen Rider Revice",
                krdate = "Tanggal Tayang: \n5 September 2021 - 28 Agustus 2022",
                krauthor = "Total Episode: \n50 Episode",
                krrate = "Rating: (7,1)",
                ratingbar = 7.1,
                krdesc = "Sinopsis: \nKeluarga Igarashi, adalah keluarga biasa, yang menjalankan pemandian umum yang disebut \"Shiawase Yu\". Putra tertua Ikki (Pemeran: Kentaro Maeda) adalah pria panas, dengan rasa keadilan yang kuat dan suka direpotkan. Sesekali dari sebelumnya, dia merasa bahwa dia bisa mendengar \"Bisikan Iblis\" yang aneh dari dalam dirinya, tapi dia melaluinya tanpa terlalu terobsesi. Yang terpenting bagi Ikki adalah keluarga, dan Shiawase Yu yang mengumpulkan keluarga dan orang-orang kota. Namun, masalah saat ini adalah bahwa Shiawase Yu terpaksa digusur karena permintaan untuk pembangunan kembali kota. Suatu hari, Ikki dan teman-temannya tiba-tiba menghadapi serangan oleh pasukan monster yang dipimpin oleh Deadmans. Ikki menyadari keberadaan iblis di tubuhnya dari lubuk hati yang ingin melindungi apa yang penting, dan mendengarkan bisikan untuk pertama kalinya. Kemudian, dengan semangat \"mengendalikan racun dengan racun\" dia menandatangani kontrak dengan iblis Vice (Pengisi suara: Subaru Kimura), dan berubah menjadi Kamen Rider. "
            ),
            KamenRiderClass(
                R.drawable.kr4,
                krname = "Kamen Rider Geats",
                krdate = "Tanggal Tayang: \n4 September 2022 - Sekarang",
                krauthor = "Total Episode: \nOn Going",
                krrate = "Rating: (8,6)",
                ratingbar = 8.6,
                krdesc = "Sinopsis: \nSerial ini berlatar di Desire Grand Prix, yaitu sebuah kompetisi di mana para Kamen Rider melawan monster bertema tanaman bernama Jyamato dan pemenang kompetisi akan dikabulkan keinginannya. Keempat Kamen Rider yang menjadi fokus cerita adalah Ace Ukiyo (Kamen Rider Geats), Keiwa Sakurai (Kamen Rider Tycoon), Neon Kurama (Kamen Rider Na-Go), dan Michinaga Azuma (Kamen Rider Buffa). Ace sudah memenangkan kompetisi ini berkali-kali dan menggunakan pengabulan keinginan untuk mencari cara bertemu dengan ibunya. Keiwa dan Neon baru mengikuti dan mempelajari tentang Desire Grand Prix; masing-masing menginginkan perdamaian dunia dan cinta sejati. Michinaga adalah rival Ace yang mengikuti Desire Grand Prix untuk membalas dendam karena temannya tewas saat mengikuti kompetisi tersebut. Seiring berjalannya serial, beberapa iterasi Desire Grand Prix berlangsung dan para karakter utama mengungkap berbagai rahasia di balik Desire Grand Prix serta masa lalu satu sama lain. "
            ),
        )
    }
}
