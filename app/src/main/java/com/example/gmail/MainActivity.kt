package com.example.gmail

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ItemSelect {
    lateinit var mails: MutableList<MailItemModel>
    lateinit var adapter: MailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        mails = mutableListOf(
            MailItemModel("Lionel Messi", "24/06/1987"),
            MailItemModel("Cristiano Ronaldo", "05/02/1985"),
            MailItemModel("Pelé", "23/10/1940"),
            MailItemModel("Diego Maradona", "30/10/1960"),
            MailItemModel("Zinedine Zidane", "23/06/1972"),
            MailItemModel("Johan Cruyff", "25/04/1947"),
            MailItemModel("Ronaldinho", "21/03/1980"),
            MailItemModel("David Beckham", "02/05/1975"),
            MailItemModel("George Best", "22/05/1946"),
            MailItemModel("Thierry Henry", "17/08/1977"),
            MailItemModel("Andrés Iniesta", "11/05/1984"),
            MailItemModel("Xavi Hernandez", "25/01/1980"),
            MailItemModel("Gareth Bale", "16/07/1989"),
            MailItemModel("Neymar Jr.", "05/02/1992"),
            MailItemModel("Kylian Mbappé", "20/12/1998"),
            MailItemModel("Ronald Koeman", "21/03/1963"),
            MailItemModel("Franz Beckenbauer", "11/09/1945")
        )

        adapter = MailAdapter(mails, this)

        val listMail = findViewById<RecyclerView>(R.id.list_mail)
        listMail.adapter = adapter
        listMail.layoutManager = LinearLayoutManager(this)
    }

    override fun CheckedMail(position: Int) {
        mails[position].isChecked = !mails[position].isChecked
        adapter.notifyItemChanged(position)
    }
}