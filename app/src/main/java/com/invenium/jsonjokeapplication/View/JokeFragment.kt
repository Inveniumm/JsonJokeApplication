package com.invenium.jsonjokeapplication.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.invenium.jsonjokeapplication.R
import com.invenium.jsonjokeapplication.View.databinding.ActivityJokeFragmentBinding
import com.invenium.jsonjokeapplication.databinding.ActivityJokeFragmentBinding

class JokeFragment : AppCompatActivity() {

    private lateinit var binding: ActivityJokeFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityJokeFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jokeBtn.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    fun getJoke() {
        val b = R.id.jokeBtn as Button
        binding.jokeBtn.setOnClickListener {
            b.text.equals("I'm afraid for the calendar. Its days are numbered.")
        }

    }



}