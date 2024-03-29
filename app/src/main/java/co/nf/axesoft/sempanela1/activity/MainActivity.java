package co.nf.axesoft.sempanela1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import co.nf.axesoft.sempanela1.R;
import co.nf.axesoft.sempanela1.model.Times;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarMain);
        toolbar.setTitle("Tira o time aí");
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.timesAction:
                //openTeamList();
                return true;

            case R.id.limpardadosAction:
                //openDataClear();
                return true;

            case R.id.sobreAction :
                //openAbout();
                return true;

            case R.id.fecharAction :
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
