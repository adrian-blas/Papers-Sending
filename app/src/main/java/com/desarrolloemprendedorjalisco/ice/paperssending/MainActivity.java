package com.desarrolloemprendedorjalisco.ice.paperssending;

import android.app.TabActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends FragmentActivity  {

    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intento1 = getIntent();

        tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Ruta"),
                TabRutaActivity.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Recorrido"),
                TabRecorridoActivity.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Estadisticos"),
                TabEstadisticasActivity.class, null);
    }
}

