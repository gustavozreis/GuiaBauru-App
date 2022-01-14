package com.gustavozreis.guiabauru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.gustavozreis.guiabauru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // instancia do objeto binding correspondente ao activity_main layout
    // quando a hierarquia de views estiver anexada ao fragmento
    private lateinit var binding: ActivityMainBinding
    // instancia do controle de navegação do app
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // recupera o navcontroller do navFragment
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || return super.onSupportNavigateUp()
    }

}
