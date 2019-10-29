package com.example.proj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");

    //TextView textInputEmail;
    TextView userName;
    TextView password;

    Button login_btn;
    TextView text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView imv=(ImageView)findViewById(R.id.log_id);
//
//        imv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(getApplicationContext(),YoutubePage.class);
//                startActivity(i);
//            }
//        });

            userName = (TextView)findViewById(R.id.editText4);
           password = (TextView)findViewById(R.id.editText5);

            login_btn =(Button)findViewById(R.id.login_Button);

         text6 = (TextView)findViewById(R.id.textView6);

        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        // intent of button
//        login_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                homepage();
//            }
//        });
        //intent of text
        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                homepage();

            }
        });

        }

        public void homepage(){

            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(i);
        }
        private boolean validateUsername() {
            String usernameInput = userName.getText().toString().trim();

            if (usernameInput.isEmpty()) {
                userName.setError("Field cannot be empty");
                return false;
            } else if (!usernameInput.equals("Muneeb@gmail.com")) {
                userName.setError("Incorrect Username");
                return false;
            } else {
                userName.setError(null);
                return true;
            }
        }

        private boolean validatePassword() {
            String passwordInput = password.getText().toString().trim();

            if (passwordInput.isEmpty()) {
                password.setError("Field cannot be empty");
                return false;
            } else if (!passwordInput.equals("muneeb123.")) {
                password.setError("Incorrect Password");
                return false;
            } else {
                password.setError(null);
                return true;
            }
        }

        public void validateInput(View v) {
            if (!validateUsername() | !validatePassword()) {
                return;
            }


            String input = "Email: " + userName.getText().toString();
            input += "\n";
            input += "Password: " + password.getText().toString();

            Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

            login_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homepage();
                }
            });
        }


}
///////////////////////////
//public class LoginActivity extends AppCompatActivity {
//
//    private static final Pattern PASSWORD_PATTERN =
//            Pattern.compile("^" +
//                    //"(?=.*[0-9])" +         //at least 1 digit
//                    //"(?=.*[a-z])" +         //at least 1 lower case letter
//                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
//                    "(?=.*[a-zA-Z])" +      //any letter
//                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
//                    "(?=\\S+$)" +           //no white spaces
//                    ".{4,}" +               //at least 4 characters
//                    "$");
//
//    //TextView textInputEmail;
//    TextView textInputUsername;
//    TextView textInputPassword;
//    Button signuplink;
//    Button button_login;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        //textInputEmail = findViewById(R.id.text_input_email);
//        textInputUsername = (TextView)findViewById(R.id.text_input_username);
//        textInputPassword = (TextView)findViewById(R.id.text_input_password);
//        button_login=(Button)findViewById(R.id.button_login);
//        signuplink =(Button)findViewById(R.id.button_signup);
//        signuplink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goTosignup();
//            }
//        });
//
//    }
//
//
//    public void goTosignup()
//    {
//        Intent i=new Intent(getApplicationContext(),SignupActivity.class);
//        startActivity(i);
//    }
//    private boolean validateUsername() {
//        String usernameInput = textInputUsername.getText().toString().trim();
//
//        if (usernameInput.isEmpty()) {
//            textInputUsername.setError("Field can't be empty");
//            return false;
//        } else if (!usernameInput.equals("Hamna")) {
//            textInputUsername.setError("Incorrect Username");
//            return false;
//        } else {
//            textInputUsername.setError(null);
//            return true;
//        }
//    }
//
//    private boolean validatePassword() {
//        String passwordInput = textInputPassword.getText().toString().trim();
//
//        if (passwordInput.isEmpty()) {
//            textInputPassword.setError("Field can't be empty");
//            return false;
//        } else if (!passwordInput.equals("A123?")) {
//            textInputPassword.setError("Incorrect Password");
//            return false;
//        } else {
//            textInputPassword.setError(null);
//            return true;
//        }
//    }
//
//    public void confirmInput(View v) {
//        if (!validateUsername() | !validatePassword()) {
//            return;
//        }
//
////        String input = "Email: " + textInputEmail.getText().toString();
////        input += "\n";
//        String input = "Username: " + textInputUsername.getText().toString();
//        input += "\n";
//        input += "Password: " + textInputPassword.getText().toString();
//
//        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
//    }
//
//
//}
//
