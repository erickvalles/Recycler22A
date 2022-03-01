package guerrero.erick.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import guerrero.erick.recycler.adapter.LugarAdapter
import guerrero.erick.recycler.model.Lugar

class MainActivity : AppCompatActivity() {

    lateinit var recyclerLugares:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerLugares = findViewById(R.id.recyclerLugares)


        val listaLugares = ArrayList<Lugar>()
        listaLugares.add(Lugar("Algeria","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2AEXEJOQfeFLpjeUHrjTF0STJ7tnCxMk72w&usqp=CAU"))
        listaLugares.add(Lugar("Burma","https://ychef.files.bbci.co.uk/976x549/p049vjnx.jpg"))
        listaLugares.add(Lugar("Polonia","https://static.hosteltur.com/app/public/uploads/img/articles/2021/06/11/L_114731_poloniaweb.jpg"))


        recyclerLugares.adapter = LugarAdapter(listaLugares)
        recyclerLugares.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}