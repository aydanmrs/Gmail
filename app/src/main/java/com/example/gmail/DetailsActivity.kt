package com.example.gmail

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.TextUtils
import android.text.style.RelativeSizeSpan
import android.view.View
import com.example.gmail.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.statusBarColor = Color.TRANSPARENT
        }

        val intent = intent

        val selectedItem = intent.getSerializableExtra("mail") as Mail
        binding.title.text = selectedItem.person
        binding.date.text = selectedItem.date
        binding.person.text = selectedItem.alici
        binding.gmailtitle.text = selectedItem.title
        binding.txt.text = selectedItem.title
        binding.gmailtext.text = selectedItem.mail
        binding.profile.setImageResource(selectedItem.profile)



    }
}