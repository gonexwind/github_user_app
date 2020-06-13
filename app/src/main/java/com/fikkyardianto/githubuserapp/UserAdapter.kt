package com.fikkyardianto.githubuserapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var users = arrayListOf<User>()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView
    }

    override fun getItem(position: Int): Any {
        return users[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return users.size
    }

    private inner class ViewHolder constructor(private val view: View) {
        fun bind(user: User) {
            with(view) {
                tvName.text = user.name
                tvUsername.text = user.username
                tvLocation.text = user.location
                civAvatar.setImageResource(user.avatar)
            }
        }
    }

}