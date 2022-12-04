package com.example.bauweek7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.bauweek7.databinding.FragmentUserDetailBinding

class UserDetailFragment : Fragment() {

    private lateinit var binding: FragmentUserDetailBinding

    val args: UserDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Getting the userID from safeArgs
        //Setting the text of tvUserDetail to this userID
        val userID = args.userID
        binding.tvUserDetail.text = "USER LOGGED IN $userID"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Viewbinding for fragments. We are returning binding.root instead of setContentView
        binding = FragmentUserDetailBinding.inflate(layoutInflater)
        return binding.root
    }

}