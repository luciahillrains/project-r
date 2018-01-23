package team2600.project_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

import org.w3c.dom.Text;

import team2600.project_r.objects.Country;
import team2600.project_r.objects.Town;

public class CountryActivity extends AppCompatActivity {
    TextView nameLabel;
    TextView knightsLabel;
    TextView clericsLabel;
    TextView healthLabel;
    TextView townsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        //test country!
        Country temp = Country.buildTempCountry();

        nameLabel = (TextView) findViewById(R.id.country_name);
        knightsLabel = (TextView) findViewById(R.id.knights_number);
        clericsLabel = (TextView) findViewById(R.id.clerics_number);
        healthLabel = (TextView) findViewById(R.id.health_number);
        townsList = (TextView) findViewById(R.id.towns_list);

        nameLabel.setText(temp.getCountryName());
        //using setText?  It needs a string, otherwise it interprets it as a resource id.
        knightsLabel.setText(temp.getKnights()+"");
        clericsLabel.setText(temp.getClerics()+"");
        healthLabel.setText(temp.getHealth()+"");
        townsList.setText("");
        for(Town town : temp.getTowns()) {
            townsList.append(town.getName() + "(" + town.getHealth() + ")"+"\n");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_country, menu);
        return true;
    }
}
