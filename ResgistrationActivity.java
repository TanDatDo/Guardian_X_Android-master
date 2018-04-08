package io.guardianx.guardianx_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

public class ResgistrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistration);
        ButterKnife.bind(this);

        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        getSupportActionBar().hide();

        //implement the fragments
        RegistrationFragment registrationFragment = new RegistrationFragment();
        getSupportFragmentManager().beginTransaction().
                replace(R.id.activity_registration, registrationFragment).
                commitNow();
    }

}
