package txt.com.video13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMyname;

    private RadioButton rbtnNam;
    private RadioButton rbtnNu;

    private CheckBox chbx1yeu;
    private CheckBox chbx2thich;
    private CheckBox chbx3hay;
    private CheckBox chbx4song;
    private CheckBox chbx5luon;

    private ImageButton ibtnOki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Kiểm tra trạng thái thông qua các id
        init();

        //Nghe nút Image Button
        ibtnOki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sologan = "";
                sologan = String.valueOf(tvMyname.getText()) + " - ";

                if(rbtnNam.isChecked()){
                    sologan = sologan + String.valueOf(rbtnNam.getText()) ;
                }
                if(rbtnNu.isChecked()){
                    sologan = sologan + String.valueOf(rbtnNu.getText()) ;
                }
                if(chbx1yeu.isChecked()){
                    sologan = "\n" + sologan + chbx1yeu.getText() ;
                }
                if(chbx2thich.isChecked()){
                    sologan = "\n" + sologan + chbx2thich.getText() ;
                }
                if(chbx3hay.isChecked()){
                    sologan = "\n" + sologan + chbx3hay.getText() ;
                }
                if(chbx4song.isChecked()){
                    sologan = "\n" + sologan + chbx4song.getText() ;
                }
                if(chbx5luon.isChecked()){
                    sologan = "\n" + sologan + chbx5luon.getText() ;
                }

                Toast.makeText(MainActivity.this, sologan, Toast.LENGTH_SHORT).show();

            }
        });


    }

    public void init(){
        tvMyname = (TextView) findViewById(R.id.tv_myname);

        rbtnNam = (RadioButton) findViewById(R.id.rbtn_nam);
        rbtnNu = (RadioButton) findViewById(R.id.rbtn_nu);

        chbx1yeu = (CheckBox) findViewById(R.id.chbx1_yeu);
        chbx2thich = (CheckBox) findViewById(R.id.chbx2_thich);
        chbx3hay = (CheckBox) findViewById(R.id.chbx3_hay);
        chbx4song = (CheckBox) findViewById(R.id.chbx4_song);
        chbx5luon = (CheckBox) findViewById(R.id.chbx5_luon);

        ibtnOki = (ImageButton) findViewById(R.id.ibtn_oki);
    }
}
