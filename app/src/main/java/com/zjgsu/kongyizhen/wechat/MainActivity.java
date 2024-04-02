package com.zjgsu.kongyizhen.wechat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.personlist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        PersonAdapter adapter = new PersonAdapter(personList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 1; i++) {
            Person user1 = new Person("Group1", R.drawable.img_1,"16:00","hello");
            personList.add(user1);
            Person user2 = new Person("User1", R.drawable.img_2, "15:58","wakabaka,nihao");
            personList.add(user2);
            Person user3 = new Person("Ana", R.drawable.img_3, "13:29","manba out,hohohohoho");
            personList.add(user3);
            Person user4 = new Person("Wat", R.drawable.img_4, "12:00","what can i say,ohohohoh");
            personList.add(user4);
            Person user5 = new Person("Group2", R.drawable.img_5, "11:50","i miss you!yes i love you ");
            personList.add(user5);
            Person user6 = new Person("Peter", R.drawable.img_6, "11:47","what the hell!!!!!");
            personList.add(user6);
            Person user7 = new Person("Lisa", R.drawable.img_7, "10:22","aha,ok,that's not problem");
            personList.add(user7);
            Person user8 = new Person("Group3", R.drawable.img_8, "9.00","wellman");
            personList.add(user8);
            Person user9 = new Person("Group4", R.drawable.img_9, "10.00","ohhhh");
            personList.add(user9);
            Person user10 = new Person("Group5", R.drawable.img_10, "11.00","whuhuhwuhwu");
            personList.add(user10);
        }
    }
}