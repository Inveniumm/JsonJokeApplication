package com.invenium.jsonjokeapplication.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.invenium.jsonjokeapplication.R
import com.invenium.jsonjokeapplication.databinding.FragmentJokeBinding
import kotlinx.android.synthetic.main.fragment_joke.*
import java.io.File

class JokeFragment : Fragment() {

    private lateinit var binding: FragmentJokeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJokeBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners(view)
    }

    private fun setListeners(v: View?){
        val jsonString: String = File("./src/main/resources/joke.json").readText(Charsets.UTF_8)

        jokeBtn.setOnClickListener {
                tvJoke.text = (jsonString)
            }
    }
}