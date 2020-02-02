package com.example.bottomsheetbehavior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.widget.NestedScrollView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet_behavior)
        bt1.setOnClickListener {
         bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        bt2.setOnClickListener {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
        bottomSheetBehavior.peekHeight = 60
        bottomSheetBehavior.isHideable = true
        bottomSheetBehavior.setBottomSheetCallback(object :BottomSheetBehavior.BottomSheetCallback(){
            override fun onSlide(p0: View, p1: Float) {
            }

            override fun onStateChanged(p0: View, p1: Int) {
                when(p1){
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        Toast.makeText(this@MainActivity,"Expanded",Toast.LENGTH_LONG).show()
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        Toast.makeText(this@MainActivity,"Collapsed",Toast.LENGTH_LONG).show()

                    }
                }
            }

        })
        fab1.setOnClickListener {
            Snackbar.make(it,"im snake bar! would u like me!!what?",Snackbar.LENGTH_LONG).show()
        }

    }
}
