package com.example.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_check.*

class CheckFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_check, container, false)
    }
    val address = "geo:0,0?q=".plus("Pte, 94-a 47\n" +
            "San Francisco Xocotitla\n" +
            "Azcapotzalco\n" +
            "02960 Ciudad de México, CDMX\n" +
            "Mexico")

    val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(address))


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_location.setOnClickListener {
            requireActivity().startActivity(mapIntent)
        }
    }




    companion object {

        const val TAG = "CheckFragment"

        fun newInstance() = CheckFragment()

    }
}