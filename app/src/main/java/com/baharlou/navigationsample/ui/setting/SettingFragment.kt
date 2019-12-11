package com.baharlou.navigationsample.ui.setting

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.baharlou.navigationsample.R
import com.baharlou.navigationsample.databinding.FragmentSettingBinding

/**
 * CREATED BY MONA BAHARLOU*/
class SettingFragment : Fragment() {

    lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_setting, container, false)

        handleClicks()

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private fun handleClicks() {
        binding.onClickListener = View.OnClickListener {
            when (it.id) {
                binding.backBt.id -> goBack()
            }

        }
    }

    private fun goBack() {
        view!!.findNavController().navigate(R.id.action_settingFragment_to_profileFragment)
    }





}
