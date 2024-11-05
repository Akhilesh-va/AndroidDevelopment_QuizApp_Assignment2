package com.example.assignment2_quizapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment2_quizapp.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    lateinit var binding : ActivityHomePageBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.tvQ1.setOnClickListener{
            val options = arrayOf("11","9","13","0")
            val builder1= AlertDialog.Builder(this)
            builder1.setTitle("Value of 8+5")
            builder1.setSingleChoiceItems(options,0,{dialog,which->
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",{dialog,which->

            })
            builder1.setNegativeButton("Decline",{dialog,which->

            })
            builder1.setNeutralButton("Don't Know",{dialog,which->})
            builder1.show()
        }
        binding.tvQ2.setOnClickListener{
            val options = arrayOf("1","0","0.0","0")
            val builder1= AlertDialog.Builder(this) // builder 1 nam se same vairable h0 skte hai
            // kyuki yah hamne alag method me bnaya hai
            builder1.setTitle("Value of 0+0")
            builder1.setSingleChoiceItems(options,0,{dialog,which->
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",{dialog,which->

            })
            builder1.setNegativeButton("Decline",{dialog,which->

            })
            builder1.setNeutralButton("Don't Know",{dialog,which->})
            builder1.show()
        }
        binding.tvQ3.setOnClickListener{
            val options = arrayOf("1","0","2","85")
            val builder1= AlertDialog.Builder(this) // builder 1 nam se same vairable h0 skte hai
            // kyuki yah hamne alag method me bnaya hai
            builder1.setTitle("Value of x in x+3=5")
            builder1.setSingleChoiceItems(options,0,{dialog,which->
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",{dialog,which->

            })
            builder1.setNegativeButton("Decline",{dialog,which->

            })
            builder1.setNeutralButton("Don't Know",{dialog,which->})
            builder1.show()
        }
        binding.tvQ4.setOnClickListener{
            val options = arrayOf("One","I","2","Eleven")
            val builder1= AlertDialog.Builder(this) // builder 1 nam se same vairable h0 skte hai
            // kyuki yah hamne alag method me bnaya hai
            builder1.setTitle("How 1 can be written?")
            builder1.setMultiChoiceItems(options,null,{dialog,which , isChecked->
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",{dialog,which->

            })
            builder1.setNegativeButton("Decline",{dialog,which->

            })
            builder1.setNeutralButton("Don't Know",{dialog,which->})
            builder1.show()
        }
        binding.tvQ5.setOnClickListener{
            val options = arrayOf("*","***","****","*****")
            val builder1= AlertDialog.Builder(this) // builder 1 nam se same vairable h0 skte hai
            // kyuki yah hamne alag method me bnaya hai
            builder1.setTitle("Rate Us ")
            builder1.setSingleChoiceItems(options,0,{dialog,which->
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",{dialog,which->

            })
            builder1.setNegativeButton("Decline",{dialog,which->

            })
            builder1.setNeutralButton("Don't Know",{dialog,which->})
            builder1.show()
        }
        binding.btnQuit.setOnClickListener{
            val builder1= AlertDialog.Builder(this)
            builder1.setTitle("Are you sure")
            builder1.setMessage("Do you want to quit?")
            builder1.setIcon(android.R.drawable.ic_dialog_alert)
            builder1.setPositiveButton("Yes",{dialog,which->
                finish()
            })
            builder1.setNegativeButton("No",{dialog,which->})
            builder1.show()


        }

    }
}