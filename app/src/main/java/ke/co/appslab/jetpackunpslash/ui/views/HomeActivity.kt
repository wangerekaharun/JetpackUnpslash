package ke.co.appslab.jetpackunpslash.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.appslab.jetpackunpslash.R

/**
 *  Main Activity which is the Launcher Activity
 */

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}