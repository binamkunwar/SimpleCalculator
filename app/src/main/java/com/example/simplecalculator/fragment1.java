package com.example.simplecalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class fragment1 extends Fragment {
    EditText first,second;
    Button add,sub,multiply,divide;
    TextView result;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment1, container, false);
        first = view.findViewById(R.id.first);
        second = view.findViewById(R.id.second);
        add = view.findViewById(R.id.add);
        sub = view.findViewById(R.id.sub);
        multiply = view.findViewById(R.id.multiply);
        divide  = view.findViewById(R.id.divide);
        result = view.findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());

                res=f+s;
                result.setText("Result:"+res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());

                res=f-s;
                result.setText("Result:"+res);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());

                res=f*s;
                result.setText("Result:"+res);
            }
        });


        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int f,s,res;
                f=Integer.parseInt(first.getText().toString());
                s=Integer.parseInt(second.getText().toString());

                res=f/s;
                result.setText("Result:"+res);
            }
        });
        return view;
    }
}
