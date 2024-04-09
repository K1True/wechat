package com.zjgsu.kongyizhen.wechat;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link leftFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class leftFragment extends Fragment {
    private List<Person> personList = new ArrayList<>();
    private Context context;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public leftFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment leftFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static leftFragment newInstance(String param1, String param2) {
        leftFragment fragment = new leftFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left,container,false);
        context = view.getContext();
        init();
        LinearLayoutManager manager = new LinearLayoutManager(context);
        RecyclerView recyclerView = view.findViewById(R.id.fragmentR);
        recyclerView.setLayoutManager(manager);
        PersonAdapter adapter = new PersonAdapter(personList);
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

    private void init() {
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
            //随便注释一下。呃呃
        }
    }
}