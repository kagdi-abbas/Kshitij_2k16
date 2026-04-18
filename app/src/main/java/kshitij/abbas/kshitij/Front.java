package kshitij.abbas.kshitij;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Front extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        Button eb = (Button)findViewById(R.id.eve);
        eb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Front.this,e.class));
                System.exit(0);
            }
        });

        Button tb = (Button)findViewById(R.id.teach);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Front.this,t.class));
                System.exit(0);
            }
        });

        Button sb = (Button)findViewById(R.id.stud);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Front.this,s.class));
                System.exit(0);
            }
        });
    }
}
