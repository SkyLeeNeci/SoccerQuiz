package karpenko.diploma.soccerquiz

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import karpenko.diploma.soccerquiz.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#146775")))
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        val binding : FragmentWelcomeScreenBinding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_welcome_screen, container,false)

        binding.startButton.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(R.id.action_welcomeScreenFragment_to_quizFragment)
        }


        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"
        (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF000000")))

    }

}