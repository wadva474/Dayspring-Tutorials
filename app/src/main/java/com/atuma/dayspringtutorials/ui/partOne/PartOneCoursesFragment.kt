package com.atuma.dayspringtutorials.ui.partOne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.atuma.dayspringtutorials.R

class PartOneCoursesFragment : Fragment(){

    private lateinit var partOneCoursesViewModel: PartOneCoursesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        partOneCoursesViewModel = ViewModelProviders.of(this).get(PartOneCoursesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_part_one_courses, container, false)

        return root
    }
}

