package com.atuma.dayspringtutorials.ui.partTwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.atuma.dayspringtutorials.R

class PartTwoCoursesFragment : Fragment(){

    private lateinit var partTwoCoursesViewModel: PartTwoCoursesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        partTwoCoursesViewModel = ViewModelProviders.of(this).get(PartTwoCoursesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_part_two_courses, container, false)

        return root
    }
}

