package guerrero.erick.recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import guerrero.erick.recycler.R
import guerrero.erick.recycler.model.Lugar

class LugarAdapter(private val listaLugares:ArrayList<Lugar>): RecyclerView.Adapter<LugarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaIndividual = LayoutInflater.from(parent.context).inflate(R.layout.vista_lugar,parent,false)
        return ViewHolder(vistaIndividual)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNombre.text = listaLugares[position].nombre
        Picasso.get().load(listaLugares[position].foto).into(holder.ivFoto)
    }

    override fun getItemCount(): Int {
        return listaLugares.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val ivFoto:ImageView
        val tvNombre:TextView

        init {
            ivFoto = itemView.findViewById(R.id.ivFoto)
            tvNombre = itemView.findViewById(R.id.tvNombre)
        }

    }
}