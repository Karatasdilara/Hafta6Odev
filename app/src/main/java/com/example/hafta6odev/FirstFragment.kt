package com.example.hafta6odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hafta6odev.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.button1.setOnClickListener{
            val gecis = FirstFragmentDirections.hometosecond()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root

    }

}