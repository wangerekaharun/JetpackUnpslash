package ke.co.appslab.jetpackunpslash.ui.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import ke.co.appslab.jetpackunpslash.R
import kotlinx.android.synthetic.main.activity_home.*

/**
 *  Main Activity which is the Launcher Activity
 */

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupNavController()
    }

    private fun setupNavController() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
        bottomNavigation.setupWithNavController(navController = navController)

    }
}