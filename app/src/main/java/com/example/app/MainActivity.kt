package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity(), NavigationFragments{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        when (fragment) {
            is MainFragment -> {
                fragment.setNavigation(this)
            }
            is OrderFragment -> {
                fragment.setNavigation(this)
            }
            is UserFragment -> {
                fragment.setNavigation(this)
            }
        }
    }



    override fun goToOrderFragment(){
        supportFragmentManager.beginTransaction()
            .addToBackStack(OrderFragment.TAG)
            .setCustomAnimations(android.R.anim.slide_in_left, 0, 0, android.R.anim.slide_out_right)
            .add(R.id.container, OrderFragment.newInstance())
            .commit()

    }

    override fun gotoUserFragment() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(UserFragment.TAG)
            .add(R.id.container, UserFragment.newInstance())
            .commit()
    }


    override fun gotoCheckFragment() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(CheckFragment.TAG)
            .setCustomAnimations(android.R.anim.fade_in, 0,0, android.R.anim.fade_out)
            .add(R.id.container, CheckFragment.newInstance())
            .commit()

    }

    override fun goTotEditFragment() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(EditFragment.TAG)
            .add(R.id.container,EditFragment.newInstance())
            .commit()
    }

    override fun goToUserFragment() {
        TODO("Not yet implemented")
    }

    override fun goToFragmentEditFragment() {
        TODO("Not yet implemented")
    }

}