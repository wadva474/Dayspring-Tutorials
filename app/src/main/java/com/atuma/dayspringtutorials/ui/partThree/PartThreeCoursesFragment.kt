package com.atuma.dayspringtutorials.ui.partThree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.atuma.dayspringtutorials.R

class PartThreeCoursesFragment : Fragment(){
    private lateinit var partThreeCoursesViewModel: PartThreeCoursesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        partThreeCoursesViewModel = ViewModelProviders.of(this).get(PartThreeCoursesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_part_three_courses, container, false)

        return root
    }
}