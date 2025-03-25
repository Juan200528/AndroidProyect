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
        String[] nombres = {"Juan Rengifo", "Angel Duban Vargas Sambony", "Paula Chapeño", "Juan Meneses", "Eduar Jimenez", "Kevin Penagos", "Melissa Muñoz"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombres);
        listView.setAdapter(adapter);
    }
}
