package com.example.agedatabase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InsertFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_insert, container, false);

        //Database and UI code goes here in the next chapter
        final DataManager dm = new DataManager(getActivity());

        Button btnInsert = v.findViewById(R.id.btnInsert);

        final EditText editName = v.findViewById(R.id.editName);

        final EditText editAge = v.findViewById(R.id.editAge);

        btnInsert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dm.insert(editName.getText().toString(),
                        editAge.getText().toString());
            }
        });

        return v;
    }
}
