package com.example.gmail

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gmail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mailList = arrayListOf<Mail>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.statusBarColor = Color.TRANSPARENT
        }

        val LinkedIn = Mail("LinkedIn", "You appeared in 1 search", "You were found by people from these companies. This email was intended for Aydan Muradova (--) You are receiving LinkedIn notification emails. 2024 LinkedIn Corporation, 1000 West Maude Avenue, Sunnyvale, CA 94085. LinkedIn and the LinkedIn logo are registered trademarks of LinkedIn", "31 may", R.drawable.l, "Ben")
        val BMU = Mail("BMU Muessiseler ile elaqeler ve karyera departamenti", "Yaponiyanın İqtisadiyyat, Ticarət və Sənaye Nazirliyinin təşkilatçılığı ilə həyata keçirilən Qlobal İT/AI Mühəndislik Təcrübə Proqramı", "Yaponiyanın İqtisadiyyat, Ticarət və Sənaye Nazirliyinin təşkilatçılığı ilə həyata keçirilən Qlobal İT/AI Mühəndislik Təcrübə Proqramı İT mühəndisi/Süni intellekt sahəsində təcrübə keçmək üçün Azərbaycanlı tələbələr (magistratura və doktorantura pillələri) və son 3 il ərzində məzun olmuş şəxslər üçün açıqdır. Proqrama müraciət etmək üçün bu sahədə biliklərin olması vacibdir. Bu təcrübə proqramı yapon şirkətləri üçün İT/AI sahəsində insan resursları bazalarının müxtəlifliyi və çoxşaxəliliyini artırmaq məqsədi daşıyır. Seçilmiş şəxslər təcrübə proqramı üçün Yaponiyaya səfər edərək və təxmini 1 ay müddətində Yaponiyanın İT şirkətində təcrübə keçmək şansı əldə edəcəklər. Bütün xərclər Yaponiya hökuməti tərəfindən qarşılanır. Bu proqram Yaponiya Səfirliyi tərəfindən təşkil olunmur və bütün sualları aşağıdakı linklərdə qeyd olunmuş Fourth Valley konsultasiya şirkəti ilə aydınlaşdırmağınızı xahiş edirik.  Qeyd etmək istərdik ki, layihəyə müraciət üçün son tarix 30 iyundur.", "29 may", R.drawable.pp, "BMU")
        val BMU2 = Mail("BMU Muessiseler ile elaqeler ve karyera departamenti", "bp session at 29th International Caspian oil and gas exhibition", "Ready to jumpstart your career and land that dream job with bp Azerbaijan? Join us for Fast Track Your Future: bp Early Careers Programs session hosted by bp. Future Talent team at Baku Energy Week. This interactive session will equip you with the knowledge and tools you need to succeed: Discover early careers programs at bp that drive you towards your dream career path. Master personal branding techniques to stand out from the crowd and showcase your unique value. Learn insider tips on getting hired and making a strong impression with recruiters.This i s your chance to gain a competitive edge and unlock your full potential!", "27 may", R.drawable.pp, "BMU")
        val LinkedIn2 = Mail("LinkedIn", "2 people visited your profile", "You were found by people from these companies. This email was intended for Aydan Muradova (--) You are receiving LinkedIn notification emails. 2024 LinkedIn Corporation, 1000 West Maude Avenue, Sunnyvale, CA 94085. LinkedIn and the LinkedIn logo are registered trademarks of LinkedIn", "21 may", R.drawable.l, "Ben")
        val qrafika = Mail("Natiq Rzayev (Classroom)", "New material", "Slayd 6.Mövzu: Detalların çertiyojunun tərtibi. Eskiz və işçi çertyoj. Detalların eskizinin və işçi çertyojunun tərtibi. Verilmiş iki görünüşə görə üçüncü görünüşün çəkilməsi.", "20 may", R.drawable.n, "Ben")
        val fizika = Mail("Feride Nurmemmedova (Classroom)", "Graded: FF-mövzuları", "Grade: 98/100. Fəridə Nurməmmədova graded your work at 3:47 AM, May 20 (AZT).", "20 may", R.drawable.f, "Ben")
        val figma = Mail("Figma", "Welcome to Figma! Let's get you set up.", "We're so glad you're here. If you are a student or an educator, you may qualify for the Figma Education plan! To get access, verify your education status here—it takes less than a minute to complete! With the Education plan, you get all Figma Professional plan features for free, including unlimited teams, projects, files, collaborators, and version history. You can also create design systems with shared libraries. All educators and students over 13 years of age are eligible for the Figma for Education plan. Students under 13 in the US and Japan may be granted access through an agreement with the student’s educational institution—learn more. Please reply to this email if you have any questions. Thank you, The Figma for Education Team", "13 may", R.drawable.f, "Ben")
        val github = Mail("GitHub", "Your GitHub launch code", "Continue signing up for GitHub by entering the code below: 66943775. Once completed, you can start using all of GitHub's features to explore, build, and share projects. Not able to enter the code? Paste the following link into your browser.", "10 may", R.drawable.pp, "Ben")
        val Zoom = Mail("Zoom", "Zoom doğrulama kodunuz", "E-postanızı doğrulayın Merhaba. Kaydolmak için 10 dakika içinde bu kodu girin: 612390. Bu kodu siz istemediyseniz bu e-postayı güvenle göz ardı edebilirsiniz. Başka bir kullanıcı yanlışlıkla sizin e-posta adresinizi yazmış olabilir.", "9 may", R.drawable.z, "Ben")
        val verilenler = Mail("Subhan Gulusov (Classroom)", "New material", "Merge sort- Birləşdirməli nizamlama", "7 may", R.drawable.s, "Ben")

        mailList.add(LinkedIn)
        mailList.add(BMU)
        mailList.add(BMU2)
        mailList.add(LinkedIn2)
        mailList.add(qrafika)
        mailList.add(fizika)
        mailList.add(figma)
        mailList.add(github)
        mailList.add(Zoom)
        mailList.add(verilenler)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        val mailAdapter = MailAdapter(mailList)
        binding.recyclerview.adapter = mailAdapter

    }
}