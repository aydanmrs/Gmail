package com.example.gmail

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.databinding.RecyclerRowBinding

class MailAdapter(val mailList:ArrayList<Mail>): RecyclerView.Adapter<MailAdapter.MailHolder>(){
    class MailHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailHolder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MailHolder(binding)
    }

    override fun getItemCount(): Int {
        return mailList.size
    }

    override fun onBindViewHolder(holder: MailHolder, position: Int) {
        holder.binding.title.text=mailList.get(position).person
        holder.binding.date.text=mailList.get(position).date
        holder.binding.txt.text=mailList.get(position).title
        holder.binding.gmailtext.text=mailList.get(position).mail
        holder.binding.profile.setImageResource(mailList.get(position).profile)


        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("mail",mailList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}

