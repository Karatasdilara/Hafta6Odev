package com.example.hafta6odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hafta6odev.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.button.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_welcomeFragment)
        }
        return binding.root
    }

   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.button.setOnClickListener{
            val gecis = HomeFragmentDirections.actionHomeFragmentToWelcomeFragment()
            Navigation.findNavController(it).navigate(gecis)
        }

    }*/




}