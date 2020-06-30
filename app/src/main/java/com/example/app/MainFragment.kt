package com.example.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment() {

    private lateinit var navigation: NavigationFragments


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        button_orden.setOnClickListener {
            navigation.goToOrderFragment()
        }
    }


    fun setNavigation(navigation: NavigationFragments) {
        this.navigation = navigation
    }

    companion object {

        const val TAG = "MainFragment"

        fun newInstance() = MainFragment()

    }
}



