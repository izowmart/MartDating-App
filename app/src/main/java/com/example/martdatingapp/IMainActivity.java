package com.example.martdatingapp;

import com.example.martdatingapp.models.Message;
import com.example.martdatingapp.models.User;

public interface IMainActivity {

    void inflateViewProfileFragment(User user);

    void onMessageSelected(Message message);

    void onBackPressed();
}
