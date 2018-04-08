package io.guardianx.guardianx_android;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @Bind(R.id.password_edit_text)
    EditText passwordEditText;
    @Bind(R.id.username_edit_text)
    EditText usernameEditText;
    @Bind(R.id.continue_button)
    Button continueButton;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, rootView);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordEditText.getText().toString();
                String username = usernameEditText.getText().toString();
                if (password.length() < 8) {
                    Toast.makeText(getContext(), R.string.toast_password, Toast.LENGTH_SHORT).show();
                } else if (username.isEmpty()) {
                    Toast.makeText(getContext(), R.string.toast_username, Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getContext(), MapViewActivity.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;


    }
}
