package com.fikkyardianto.githubuserapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val KEY_USER = "key_user"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataUser = intent.getParcelableExtra(KEY_USER) as User

        supportActionBar?.title = dataUser.username
        civAvatar.setImageResource(dataUser.avatar)
        tvName.text = dataUser.name
        tvUsername.text = dataUser.username
        tvRepositories.text = "${dataUser.repository} repositories"
        tvCompany.text = dataUser.company
        tvLocation.text = dataUser.location
        tvFollowers.text = "${dataUser.followers} followers"
        tvFollowing.text = "${dataUser.following} following"
    }
}