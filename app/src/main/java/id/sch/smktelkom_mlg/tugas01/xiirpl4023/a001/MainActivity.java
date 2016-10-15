package id.sch.smktelkom_mlg.tugas01.xiirpl4023.a001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3;
    Spinner spUmur;
    RadioButton rb1,rb2;
    EditText etNama;
    Button bOk;
    RadioGroup rgStatus;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.edittextnama);
        spUmur =(Spinner) findViewById(R.id.spinnerUmur);
        rgStatus = (RadioGroup) findViewById(R.id.RadioGroupStatus);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        bOk =(Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textviewhasil);


       findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
               doClick();

           }
       });


    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String umur = spUmur.getSelectedItem().toString();
        String jeniskel = null;
        if(rgStatus.getCheckedRadioButtonId() !=-1)
        {
            RadioButton jk = (RadioButton) findViewById(rgStatus.getCheckedRadioButtonId());
            jeniskel = jk.getText().toString();
        }
        String jurusan = "Jurusan:\n";
        int staetlen = jurusan.length();
        if(cb1.isChecked()) jurusan+=cb1.getText()+"\n";
        if(cb2.isChecked()) jurusan+=cb2.getText()+"\n";
        if(cb3.isChecked()) jurusan+=cb3.getText()+"\n";
        if (jurusan.length()==staetlen) jurusan+="Tidak ada pilihan";
        tvHasil.setText("nama : " +nama+"\nUmur: "+umur+ "\nJenis Kelamin:" +jeniskel+"\nJurusan : " +jurusan);
    }


}
