package com.example.myapplication

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentStateAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val colors = intArrayOf(
        R.color.black,
        R.color.colorAccent,
        R.color.colorPrimary,
        R.color.colorPrimaryDark
    )
    override fun createFragment(position: Int): Fragment = PagerFragment().apply {
        arguments = bundleOf(
            "color" to colors[position],
            "position" to position
        )
    }
    override fun getItemCount(): Int = colors.size
}