package com.merttoptas.secondweeksignup
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
class LoginActivity : AppCompatActivity() {
    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    private lateinit var etButon: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etButon = findViewById(R.id.btnSignUp)
        etButon.setOnClickListener {
            val intent = Intent(this, SingUp::class.java)
            startActivity(intent)
        }
        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }
    }
}