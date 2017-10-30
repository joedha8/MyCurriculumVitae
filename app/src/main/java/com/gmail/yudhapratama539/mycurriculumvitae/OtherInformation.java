package com.gmail.yudhapratama539.mycurriculumvitae;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by kikiosha on 10/29/17.
 */

public class OtherInformation extends Fragment {
    View v;
    LinearLayout linearLayoutExperience, linearLayoutHobby, linearLayoutContact;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.other_information_fragment, container, false);

        linearLayoutExperience=(LinearLayout)v.findViewById(R.id.linearExperience);
        linearLayoutHobby=(LinearLayout)v.findViewById(R.id.linearHobby);
        linearLayoutContact=(LinearLayout)v.findViewById(R.id.linearContaact);

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Other Information");

        linearLayoutExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), ExperienceActivity.class);
                startActivity(intent);
            }
        });

        linearLayoutHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), HobbyActivity.class);
                startActivity(intent);
            }
        });

        linearLayoutContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}
