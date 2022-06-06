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
import androidx.navigation.findNavController
import karpenko.diploma.soccerquiz.databinding.FragmentGoalBinding

class GoalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentGoalBinding>(
            inflater,R.layout.fragment_goal, container,false
        )

        binding.oneMoreTimeButton.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_goalFragment_to_quizFragment)
        }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar?.title = "You`ve goal!"
        (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF000000")))

    }

}