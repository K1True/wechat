package com.zjgsu.kongyizhen.wechat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends  RecyclerView.Adapter<PersonAdapter.ViewHolder>{
    public List<Person> mPersonList;
    public PersonAdapter (List<Person> personList){
        mPersonList = personList;
    }
    @NonNull
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wechat_item,parent,false);
        return new PersonAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        Person person = mPersonList.get(position);
        holder.personName.setText(person.getName());
        holder.personImage.setImageResource(person.getPersonId());
        holder.time.setText(" "+person.getTime());
        holder.Content.setText(""+person.getSentence());
    }
    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView personImage;
        TextView personName;
        TextView time;
        TextView Content;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            personImage = itemView.findViewById(R.id.personImage);
            personName = itemView.findViewById(R.id.personName);
            time = itemView.findViewById(R.id.time);
            Content = itemView.findViewById(R.id.content1);
        }
    }
}
