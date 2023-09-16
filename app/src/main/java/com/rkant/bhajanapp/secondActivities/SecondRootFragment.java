package com.rkant.bhajanapp.secondActivities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.rkant.bhajanapp.FirstActivities.Main_DataHolderUsingArraylist;
import com.rkant.bhajanapp.R;
import com.rkant.bhajanapp.secondActivities.SecondMainActivity_ActualBhajanShowingActivity;
import com.rkant.bhajanapp.secondActivities.SecondView_RecyclerView;

import java.util.ArrayList;

public class SecondRootFragment extends Fragment {
    ArrayList<Main_DataHolderUsingArraylist> arrayList;
    RecyclerView recyclerView;
    String[] strings;

    public String position;
    public SecondRootFragment() {
        // Required empty public constructor
    }
    public SecondRootFragment(String position) {
        this.position=position;
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second_root, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewSecondRootView);
        arrayList = new ArrayList<Main_DataHolderUsingArraylist>();
        setData();

        return view;
    }
    private void setData(){
        if (position!=null){

            if (position.equalsIgnoreCase("0")){
                strings=getResources().getStringArray(R.array.zero_ganapati);
                startLoop();
            }

            else if (position.equalsIgnoreCase("1")){
                strings=getResources().getStringArray(R.array.one_govinda);
                startLoop();
            }
            else if (position.equalsIgnoreCase("2")){
                strings=getResources().getStringArray(R.array.two_nachhe_krishna_jee);
                startLoop();
            }
            else if (position.equalsIgnoreCase("3")){
                strings=getResources().getStringArray(R.array.three_krishna_gaye_banaima);
                startLoop();
            }
            else if (position.equalsIgnoreCase("4")){
                strings=getResources().getStringArray(R.array.four_pau_sadhaivari_mangala_gauna);
                startLoop();
            }
            else if (position.equalsIgnoreCase("5")){
                strings=getResources().getStringArray(R.array.five_aauna_sakhi_fulbarima);
                startLoop();
            }
            else if (position.equalsIgnoreCase("6")){
                strings=getResources().getStringArray(R.array.six_mathura_khoje);
                startLoop();
            }
            else if (position.equalsIgnoreCase("7")){
                strings=getResources().getStringArray(R.array.seven_khoju_ma_timilai_kaha);
                startLoop();
            }
            else if (position.equalsIgnoreCase("8")){
                strings=getResources().getStringArray(R.array.eight_sunana_sakhi_pyari);
                startLoop();
            }
            else if (position.equalsIgnoreCase("9")){
                strings=getResources().getStringArray(R.array.nine_shyama_le_badana_ghumriyeko_bal);
                startLoop();
            }
            else if (position.equalsIgnoreCase("10")){
                strings=getResources().getStringArray(R.array.ten_brindabana_sahara_banera_hoki);
                startLoop();
            }
            else if (position.equalsIgnoreCase("11")){
                strings=getResources().getStringArray(R.array.eleven_tardaxau_sara_jamana);
                startLoop();
            }
            else if (position.equalsIgnoreCase("12")){
                strings=getResources().getStringArray(R.array.twelve_krishna_murari);
                startLoop();
            }
            else if (position.equalsIgnoreCase("13")){
                strings=getResources().getStringArray(R.array.thirteen_aauna_krishna_darshana_deuna);
                startLoop();
            }
            else if (position.equalsIgnoreCase("14")){
                strings=getResources().getStringArray(R.array.fourteen_muktinath_gandaki_damodar_kunda);
                startLoop();
            }
            else if (position.equalsIgnoreCase("15")){
                strings=getResources().getStringArray(R.array.fifteen_kailash_main_basne);
                startLoop();
            }
            else if (position.equalsIgnoreCase("16")){
                strings=getResources().getStringArray(R.array.sixteen_kati_ramro_shree_brindabana);
                startLoop();
            }
            else if (position.equalsIgnoreCase("17")){
                strings=getResources().getStringArray(R.array.seventeen_om_namo_bhagwate);
                startLoop();
            }
            else if (position.equalsIgnoreCase("18")){
                strings=getResources().getStringArray(R.array.eighteen_krishna_piyara);
                startLoop();
            }
            else if (position.equalsIgnoreCase("19")){
                strings=getResources().getStringArray(R.array.nineteen_kohi_pagal_dhana_le);
                startLoop();
            }
            else if (position.equalsIgnoreCase("20")){
                strings=getResources().getStringArray(R.array.twenty_aaye_ma_mata_timro_charan_ma);
                startLoop();
            }
            else if (position.equalsIgnoreCase("21")){
                strings=getResources().getStringArray(R.array.twentyone_yo_bato_kaha_jane_hola);
                startLoop();
            }
            else if (position.equalsIgnoreCase("22")){
                strings=getResources().getStringArray(R.array.twentytwo_ekadasi_tilako_dan);
                startLoop();
            }
            else if (position.equalsIgnoreCase("23")){
                strings=getResources().getStringArray(R.array.twentythree_krishna_gaye_yamuna_tarera);
                startLoop();
            }
            else if (position.equalsIgnoreCase("24")){
                strings=getResources().getStringArray(R.array.twentyfour_aage_aage_basuri_wala);
                startLoop();
            }
            else if (position.equalsIgnoreCase("25")){
                strings=getResources().getStringArray(R.array.twentyfive_jai_jai_ho_bhole_baba);
                startLoop();
            }
            else if (position.equalsIgnoreCase("26")){
                strings=getResources().getStringArray(R.array.twentysix_ram_lai_aaghi_ma_laula);
                startLoop();
            }
            else if (position.equalsIgnoreCase("27")){
                strings=getResources().getStringArray(R.array.twentyseven_guru_bina_gyan_kaile_mildaina);
                startLoop();
            }
            else if (position.equalsIgnoreCase("28")){
                strings=getResources().getStringArray(R.array.twentyeight_jaya_ramanuja);
                startLoop();
            }
            else if (position.equalsIgnoreCase("29")){
                strings=getResources().getStringArray(R.array.twentynine_guru_bina_gyan_kaile_mildaina);
                startLoop();
            }
            else if (position.equalsIgnoreCase("30")){
                strings=getResources().getStringArray(R.array.thirty_hey_krishna_malai_mitho_bansi);
                startLoop();
            }
            else if (position.equalsIgnoreCase("31")){
                strings=getResources().getStringArray(R.array.thirtyone_bhole_baba_mero_dukha_kasta_metaideu);
                startLoop();
            }
            else if (position.equalsIgnoreCase("32")){
                strings=getResources().getStringArray(R.array.thirtytwo_brindaban_ko_dandai_danda);
                startLoop();
            }
            else if (position.equalsIgnoreCase("33")){
                strings=getResources().getStringArray(R.array.thirtythree_krishna_gaye_banaima);
                startLoop();
            }
            else if (position.equalsIgnoreCase("34")){
                strings=getResources().getStringArray(R.array.thirtyfour_janakpur_ma_ram_aaye);
                startLoop();
            }
            else if (position.equalsIgnoreCase("35")){
                strings=getResources().getStringArray(R.array.thirtyfive_chhekyo_malai_maya_jaalaile);
                startLoop();
            }
            else if (position.equalsIgnoreCase("36")){
                strings=getResources().getStringArray(R.array.thirtysix_radha_timi_nachidey_firiri);
                startLoop();
            }
            else if (position.equalsIgnoreCase("37")){
                strings=getResources().getStringArray(R.array.thirtyseven_brinda_ban_ko_pakha_ma);
                startLoop();
            }
            else if (position.equalsIgnoreCase("38")){
                strings=getResources().getStringArray(R.array.thirtyeight_hridaya_ma_krishna_ko_photo_xa);
                startLoop();
            }
            else if (position.equalsIgnoreCase("39")){
                strings=getResources().getStringArray(R.array.thirtynine_bashuri_ko_dhuna_sunera);
                startLoop();
            }
            else if (position.equalsIgnoreCase("40")){
                strings=getResources().getStringArray(R.array.fourty_sira_mathi_sankara_ko_chandra_jhalala);
                startLoop();
            }
            else if (position.equalsIgnoreCase("41")){
                strings=getResources().getStringArray(R.array.fourtyone_purana_lagyo_hari_timro_mandirai_ma);
                startLoop();
            }
            else if (position.equalsIgnoreCase("42")){
                strings=getResources().getStringArray(R.array.fourtytwo_he_hari_darshana_timro_kaha_hola);
                startLoop();
            }
            else if (position.equalsIgnoreCase("43")){
                strings=getResources().getStringArray(R.array.fourtythree_narayana_ho_ishwar_ko_pyaro_naam);
                startLoop();
            }
            else if (position.equalsIgnoreCase("44")){
                strings=getResources().getStringArray(R.array.fourtyfour_dhun_bajyo_dhun_bajyo_pakkai_krishna_hun);
                startLoop();
            }
            else if (position.equalsIgnoreCase("45")){
                strings=getResources().getStringArray(R.array.fourtyfive_hey_krishna_sir_ma_mukut_talala);
                startLoop();
            }
            else if (position.equalsIgnoreCase("46")){
                strings=getResources().getStringArray(R.array.fourtysix_krishna_bhajan_ma_lagyo_mero_man);
                startLoop();
            }
            else if (position.equalsIgnoreCase("47")){
                strings=getResources().getStringArray(R.array.fourtyseven_rato_fariya_radha_le_lagauda);
                startLoop();
            }
            else if (position.equalsIgnoreCase("48")){
                strings=getResources().getStringArray(R.array.fourtyeight_nauni_makhan_choreko_kina);
                startLoop();
            }
            else if (position.equalsIgnoreCase("49")){
                strings=getResources().getStringArray(R.array.fourtynine_hamro_ghar_ma_aau_hai_kanhaiya);
                startLoop();
            }
            else if (position.equalsIgnoreCase("50")){
                strings=getResources().getStringArray(R.array.fifty_banshi_mitho_krishna_le_bajako);
                startLoop();
            }
            else if (position.equalsIgnoreCase("51")){
                strings=getResources().getStringArray(R.array.fiftyone_krishna_ko_mahima_gai_rahanu_hola);
                startLoop();
            }
            else if (position.equalsIgnoreCase("52")){
                strings=getResources().getStringArray(R.array.fiftytwo_k_hola_prabhu_yo_chola);
                startLoop();
            }





        }
        // Checking all things finished

    }//-
//            ---------------------------------------------------------------



    //****************************************************8
//Starting loop and adding string data to array List
    private void startLoop() {
        for(int i=0;i<strings.length;i++){
            arrayList.add(new Main_DataHolderUsingArraylist(strings[i]));
        }
        //Calling "setting adapter" method
        setAdapter();
    }//***************************************************************




    //************************************************************************
//Setting the adapter
    private void setAdapter() {
        SecondView_RecyclerView bhajanData_recyclerView=new SecondView_RecyclerView(arrayList, getContext());
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bhajanData_recyclerView);
    }


}