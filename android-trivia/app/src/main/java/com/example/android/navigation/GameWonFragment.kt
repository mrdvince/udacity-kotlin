package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchButton.setOnClickListener { view: View ->
            //            view.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
            view.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)

        }
        var args = GameWonFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context, "Num Correct ${args.numCorrect}, Num Questions:${args.numQuestions}", Toast.LENGTH_LONG).show()
        return binding.root
    }
}
