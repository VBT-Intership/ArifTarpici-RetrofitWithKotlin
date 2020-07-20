package kotlincodes.com.retrofitwithkotlin.adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlincodes.com.retrofitwithkotlin.R
import kotlincodes.com.retrofitwithkotlin.model.DataModel
import kotlinx.android.synthetic.main.list_item_home.view.*
import java.net.URL

class DataAdpter(private var dataList: List<DataModel>, private val context: Context) : RecyclerView.Adapter<DataAdpter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home, parent, false))
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel=dataList.get(position)

        holder.description.text="Description: " + dataModel.description
        holder.imageUrl.setImageURI(Uri.parse(dataModel.imageUrl))

        //Picasso.get().load(dataModel.imageUrl).into(holder.imageUrl)
        Picasso.get().load(dataModel.imageUrl).into(holder.imageUrl)

        holder.statusCode.text="Status Code: " + dataModel.statusCode
    }


    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        lateinit var description:TextView
        lateinit var imageUrl:ImageView
        lateinit var statusCode:TextView
        init {
            description = itemLayoutView.findViewById(R.id.description)
            imageUrl = itemLayoutView.findViewById(R.id.imageUrl)
            statusCode = itemLayoutView.findViewById(R.id.statusCode)
        }

    }

}