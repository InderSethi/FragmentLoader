package com.fragment.loader;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class FragmentLoader extends Fragment {

    public void Loader(int layout, Fragment fragmentClass, FragmentManager fragmentManager){
        int numOfFragments = fragmentManager.getFragments().size();

        //Delete Frags
        if(numOfFragments>0) {
            //DELETE FRAGMENTS IF THERE ARE MORE DELETE THEM AS WELL
            for (int i = 0 ; i < numOfFragments ; i++){
                Fragment frg = fragmentManager.getFragments().get(i);
                fragmentManager.beginTransaction().remove(frg).commit();
            }
        }

        
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(layout, fragmentClass);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

}
