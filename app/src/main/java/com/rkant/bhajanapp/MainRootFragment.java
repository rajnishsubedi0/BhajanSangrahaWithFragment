package com.rkant.bhajanapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.rkant.bhajanapp.FirstActivities.Main_BhajanMenuListRecyclerView;
import com.rkant.bhajanapp.secondActivities.SecondView_DataHolderUsingArraylist;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainRootFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainRootFragment extends Fragment {

    RecyclerView recyclerView;
    String[] bhajan_name_nepali,bhajan_name_english;
    Main_BhajanMenuListRecyclerView recyclerCustomAdapter;
    String[] nepaliNumbers={"१","२","३","४","५","६","७","८","९","१०","११","१२","१३","१४","१५","१६","१७","१८","१९","२०","२१","२२","२३","२४","२५","२६","२७","२८","२९","३०","३१","३२","३३","३४","३५","३६","३७","३८","३९","४०","४१","४२","४३","४४","४५","४६","४७","४८","४९","५०","५१","५२","५३","५४","५५","५६","५७","५८","५९","६०","६१","६२","६३","६४","६५","६६","६७","६८","६९","७०","७१","७२","७३","७४","७५","७६","७७","७८","७९","८०","८१","८२","८३","८४","८५","८६","८७","८८","८९","९०"};
    ArrayList<SecondView_DataHolderUsingArraylist> arrayList;
    AdapterView.OnItemSelectedListener listener;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainRootFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainRootFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainRootFragment newInstance(String param1, String param2) {
        MainRootFragment fragment = new MainRootFragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_root, container, false);
        recyclerView=view.findViewById(R.id.recyclerViewRootFragment);
        arrayList=new ArrayList<>();
        addingData();
        settingAdapter();



        return  view;
    }
    private void addingData() {
        bhajan_name_english=getResources().getStringArray(R.array.list_opening_bhajan_lists_english);
        bhajan_name_nepali =getResources().getStringArray(R.array.list_opening_bhajan_lists);
        for(int i = 0; i< bhajan_name_nepali.length; i++){
            arrayList.add(new SecondView_DataHolderUsingArraylist(bhajan_name_nepali[i],bhajan_name_english[i],i));
        }

    }
    private void settingAdapter() {
        recyclerCustomAdapter=new Main_BhajanMenuListRecyclerView(arrayList,listener,getContext(),nepaliNumbers,MainRootFragment.this);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerCustomAdapter);


    }
    public void fragmentCaller(int position){
        Toast.makeText(getContext(), ""+position, Toast.LENGTH_SHORT).show();
        ((MainActivity2)getActivity()).switchToSecondFragment(position);



    }
}