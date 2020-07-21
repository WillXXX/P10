package com.example.p10

import android.app.DownloadManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.screen.*
import kotlinx.android.synthetic.main.screen.view.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//click para chamar segunda tela
        imageView.setOnClickListener {

        }

        rv_main.layoutManager = LinearLayoutManager(this)
//        rv_main.adapter =

        BuscarJson()
    }

    fun BuscarJson(){
        val url = "https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1)."
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                println("Falha ao efetuar requisição")
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)

                val gson = GsonBuilder().create()
                val paginaWeb = gson.fromJson(body, PaginaWeb::class.java)

                runOnUiThread {
                    rv_main.adapter = MainAdapter(paginaWeb)
                }
            }

        })
    }

//Função que abre segunda atividade
    private fun openNextActivity(){
        val intent = Intent(this, P_request::class.java)
    }

}







