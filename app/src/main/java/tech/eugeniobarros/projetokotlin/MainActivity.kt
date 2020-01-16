package tech.eugeniobarros.projetokotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toggleText(view: View) {
        val actionTextView = findViewById<TextView>(R.id.action_text)
        val alteredActionText = getString(R.string.altered_action_text)
        val actionText = getString(R.string.action_txt)
        if (actionTextView.text == alteredActionText)
            actionTextView.text = actionText
        else
            actionTextView.text = alteredActionText
    }
}
