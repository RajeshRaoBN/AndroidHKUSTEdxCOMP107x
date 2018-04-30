package hk.ust.cse.comp107x.greetfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button greetButton;
    TextView greetings;
    EditText friendsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetButton = (Button) findViewById(R.id.greetbutton);
        greetings = (TextView) findViewById(R.id.friendGreeting);
        friendsName = (EditText) findViewById(R.id.editFriendName);
    }
}
