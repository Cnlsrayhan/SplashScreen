package rayhan.dev.splashscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Login extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int color = Color.argb(255, random.nextInt(256),random.nextInt(256),random.nextInt(256));

                button.setBackgroundColor(color);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_content, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.Login){
            Toast.makeText(this,"Login Page", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.Register){
            Toast.makeText(this,"Register", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.Setting){
            Toast.makeText(this,"Setting", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
