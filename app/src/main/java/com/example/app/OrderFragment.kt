package com.example.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_order.*

class OrderFragment: Fragment() {

    private lateinit var navigationFragments: NavigationFragments

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_info1.setOnClickListener {
            navigationFragments.gotoUserFragment()
        }
        check.setOnClickListener {
            navigationFragments.gotoCheckFragment()
        }

    }




    fun setNavigation (navigationFragments: NavigationFragments) {
        this.navigationFragments = navigationFragments
    }


    companion object {

        const val TAG = "OrderFragment"

        fun newInstance() = OrderFragment()

    }
}