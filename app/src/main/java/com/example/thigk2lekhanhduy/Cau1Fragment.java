package com.example.thigk2lekhanhduy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {


    EditText editChieuRong;
    EditText editChieuDai;
    EditText editChuVi;
    EditText editDienTich;
    Button btnTinhToan;

    public Cau1Fragment() {
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);


        editChieuRong = viewCau1.findViewById(R.id.editSoMet); // Bạn dùng ID cũ, tôi ánh xạ theo luôn
        editChieuDai = viewCau1.findViewById(R.id.editSoKm);
        editChuVi = viewCau1.findViewById(R.id.editTextNumber2);
        editDienTich = viewCau1.findViewById(R.id.editTextNumber3);
        btnTinhToan = viewCau1.findViewById(R.id.btnDoi);


        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strRong = editChieuRong.getText().toString().trim();
                String strDai = editChieuDai.getText().toString().trim();


                if (strRong.isEmpty() || strDai.isEmpty()){
                    Toast.makeText(viewCau1.getContext(), "Vui lòng nhập đủ chiều dài và chiều rộng!", Toast.LENGTH_SHORT).show();
                } else {

                    double chieuRong = Double.parseDouble(strRong);
                    double chieuDai = Double.parseDouble(strDai);


                    double chuVi = (chieuDai + chieuRong) * 2;
                    double dienTich = chieuDai * chieuRong;


                    editChuVi.setText(String.valueOf(chuVi));
                    editDienTich.setText(String.valueOf(dienTich));
                }
            }
        });

        return viewCau1;
    }
}