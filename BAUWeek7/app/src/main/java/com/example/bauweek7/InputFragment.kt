package com.example.bauweek7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bauweek7.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    private lateinit var binding: FragmentInputBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
    }

    private fun setListeners(){
        binding.tvInput.setOnClickListener {
            if(isInputCorrect()){
                binding.tilUserId.error = null
                val userID = binding.etUserId.text.toString()
                navigateToDetailScreen(userID)
            }else{
                binding.tilUserId.error = "Please enter 6 digit user id"
            }
        }
    }

    private fun navigateToDetailScreen(userID: String){
        val action = InputFragmentDirections.actionInputFragmentToUserDetailFragment(userID)
        findNavController().navigate(action)
    }

    private fun isInputCorrect():Boolean  {
        val userID = binding.etUserId.text

        if(userID.isNullOrBlank()){
            return false
        }

        if(userID.toString().length < 6){
            return false
        }

        return true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Viewbinding for fragments. We are returning binding.root instead of setContentView
        binding = FragmentInputBinding.inflate(layoutInflater)
        return binding.root
    }
}