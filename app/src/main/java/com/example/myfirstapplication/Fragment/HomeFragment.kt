package com.example.myfirstapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.myfirstapplication.R
import com.example.myfirstapplication.adaptar.PopularAdapter
import com.example.myfirstapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding //here we use binding for fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    } //this is fragment lifecycle

    override fun onCreateView( // this is onCreateView method
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { // this is onViewCreated method for fragment to use binding property
        super.onViewCreated(view, savedInstanceState)

            val imageList = ArrayList<SlideModel>() // This line creates an ArrayList named imageList to hold objects
            imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
            imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
            imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))

            val imageSlider = binding.imageSlider //This line retrieves the image slider view from a binding object. This suggests the use of View Binding, a feature that allows you to more easily interact with views in your layout files.
            imageSlider.setImageList(imageList)//This line sets the list of images for the slider.
            imageSlider.setImageList(imageList, ScaleTypes.FIT)//his line appears redundant as it sets the image list again, with the same scaling type as previously specified.

            imageSlider.setItemClickListener(object :ItemClickListener{ //This section sets an item click listener for the image slider. It defines actions to be performed when an item is selected or double-clicked.
                override fun doubleClick(position: Int) {
                    TODO("Not yet implemented")
                }

                override fun onItemSelected(position: Int) {
                    val itemPosition=imageList[position]
                    val itemMessage="Selected Image $position"
                    Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
                }
            })
        // popular items with adaptor
        val foodName = listOf("Fruit salad", "Green Noddle", "Herbal Pancake","Spacy Fresh Crabs")
        val pricePopular = listOf("$5","$2","$6","$5")
        val  popularImages = listOf(R.drawable.fruit_salad,R.drawable.green_noddle,R.drawable.harbal,R.drawable.spacy_fresh_crab)
        val  adaptor = PopularAdapter(foodName,pricePopular,popularImages)
        binding.PopularRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.PopularRecyclerView.adapter=adaptor


        }
    companion object {
    }
}