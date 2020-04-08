package com.example.letschatapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAcessorAdapter extends FragmentPagerAdapter {
    public TabAcessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               ChatFragment chatFragment=new ChatFragment();
               return chatFragment;
           case 1:
               GroupFragment groupFragment=new GroupFragment();
               return groupFragment;
           case 2:
               ContactsFragment contactsFragment=new ContactsFragment();
               return contactsFragment;
           case 3:
               RequestFragment requestFragment=new RequestFragment();
               return requestFragment;
           default:
               return null;

       }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Chat";
            case 1:
                return "Group";
            case 2:
                return "Contacts";
            case 3:
                return "Request";
            default:
                return null;

        }
    }
}
