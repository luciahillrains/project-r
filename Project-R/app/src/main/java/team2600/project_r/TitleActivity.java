package team2600.project_r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TitleActivity extends AppCompatActivity {
    Button newGameButton;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        newGameButton = (Button) findViewById(R.id.btn_new_game);
        continueButton = (Button) findViewById(R.id.btn_continue_game);

        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEMP!
                //TODO: hook this up to creation activity
                Toast.makeText(TitleActivity.this, "Not Implemented", Toast.LENGTH_LONG).show();
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEMP!
                //TODO: hook this up to pull game info
                Intent countryIntent = new Intent(TitleActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });
    }
}
