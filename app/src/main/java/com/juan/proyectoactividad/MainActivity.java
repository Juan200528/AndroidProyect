package com.juan.proyectoactividad;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        String[] nombres = {"Juan David Rengifo Aviramaq",  "Angel Duban Vargas Sambony", "Paula Andrea Chapeño Mosqueraaa", "Juan David Meneses","Eduar Fabian Jimenez Santander", "Kevin Andres Penagos", "Melissa Fernanda Muñoz"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombres);
        listView.setAdapter(adapter);
    }
}
