package tictacexample.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var bool = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)
        if (bool){
            img.setImageResource(R.drawable.x_ustoz)
            bool = false

        }
    else {
        img.setImageResource(R.drawable.o)
            bool = true
    }
    }


}




