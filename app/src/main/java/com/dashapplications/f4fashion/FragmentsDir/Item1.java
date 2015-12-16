package com.dashapplications.f4fashion.FragmentsDir;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dashapplications.f4fashion.R;

/**
 * Created by Danish on 12/11/15.
 */
public class Item1 extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.item1, container, false);
        return rootView;
    }
}
