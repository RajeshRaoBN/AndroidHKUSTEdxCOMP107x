package hk.ust.cse.comp107x.greetfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

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

    public void changeGreetings(View view) {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        String greetingSuffix;

        if(hour > 6 && hour < 12)
            greetingSuffix = "Morning";
        else if(hour > 12 && hour < 17)
            greetingSuffix = "Afternoon";
        else if(hour > 17 && hour < 21)
            greetingSuffix = "Evening";
        else
            greetingSuffix = "Night";

        greetings.setText("Good " + greetingSuffix + " " +friendsName.getText().toString() + "!");
    }
}
