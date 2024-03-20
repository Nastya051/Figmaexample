package com.example.figmalayoutexample



import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.figmalayoutexample.databinding.ActivityMainBinding
import com.example.figmalayoutexample.fragments.HomeFragment
import com.example.figmalayoutexample.fragments.OrderFragment


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host, HomeFragment()).commit()



        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {supportFragmentManager.beginTransaction().replace(R.id.nav_host, HomeFragment()).commit()}
                R.id.scan -> {supportFragmentManager.beginTransaction().replace(R.id.nav_host, HomeFragment()).commit()}
                R.id.order -> {supportFragmentManager.beginTransaction().replace(R.id.nav_host, OrderFragment()).commit()}
                R.id.account -> {supportFragmentManager.beginTransaction().replace(R.id.nav_host, HomeFragment()).commit()}
                R.id.rewards -> {supportFragmentManager.beginTransaction().replace(R.id.nav_host, HomeFragment()).commit()}
            }
            true
        }

    }
}