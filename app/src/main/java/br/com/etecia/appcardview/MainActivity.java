package br.com.etecia.appcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_dp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mFavoritos:
                startActivity(new Intent(MainActivity.this, Favoritos_Layout.class));
                break;
            case R.id.mCompartilhar:
                startActivity(new Intent(MainActivity.this, Compartilhar_Layout.class));
                break;
            case R.id.mConfig:
                startActivity(new Intent(MainActivity.this, ConfiguracoesLayout.class));
                break;
            case R.id.mSobre:
                startActivity(new Intent(MainActivity.this, SobreLayout.class));
                break;
            case R.id.mTempo:
                startActivity(new Intent(MainActivity.this, TempoLayout.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
