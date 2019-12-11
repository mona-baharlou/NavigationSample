package com.baharlou.navigationsample.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.baharlou.navigationsample.R
import com.baharlou.navigationsample.databinding.FragmentProfileBinding
/**
 * CREATED BY MONA BAHARLOU*/

class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
        handleClicks()
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun handleClicks() {
        binding.onClickListener = View.OnClickListener {
            when (it.id) {
                binding.settingBt.id -> view!!.findNavController().navigate(R.id.action_profileFragment_to_settingFragment)
            }
        }
    }


}
