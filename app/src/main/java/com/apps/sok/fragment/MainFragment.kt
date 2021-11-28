package com.apps.sok.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import com.apps.sok.*
import com.apps.sok.activity.PriceListTarif
import com.apps.sok.activity.PriobretenieUslugActivity

class MainFragment : Fragment() {

    lateinit var kupit_usligu: AppCompatButton
    lateinit var karta_paprka: AppCompatButton
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        kupit_usligu = view.findViewById(R.id.appCompatButton2)
        karta_paprka = view.findViewById(R.id.appCompatButton3)

        kupit_usligu.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (getActivity(), PriobretenieUslugActivity::class.java)
            getActivity()?.startActivity(intent)
            getActivity()?.overridePendingTransition(R.anim.slidein, R.anim.slideout)
            activity?.finish()
        })

        karta_paprka.setOnClickListener(View.OnClickListener { view: View? ->
            val intent = Intent (getActivity(), PriceListTarif::class.java)
            getActivity()?.startActivity(intent)
            getActivity()?.overridePendingTransition(R.anim.slidein, R.anim.slideout)
            activity?.finish()
        })

        return view
    }
}