package plants.chimichangas.agrohacks.com.agrohacksplantsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class frame_2 extends AppCompatActivity {
    private static RadioGroup rg_1;
    private static RadioButton r_n;
    private static Button boton1;
    private static TextView texto;
    private static TextView texto2;
    private static TextView texto3;
    private static TextView texto4;
    private static TextView texto5;
    private static int val;
    private static int fer1=0;
    private static int fer2=0;
    private static int fer3=0;
    private static String nom_fer1;
    private static String nom_fer2;
    private static String nom_fer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_2);
        onClickListenerButton();

    }
    public void onClickListenerButton(){
        rg_1 =(RadioGroup)findViewById(R.id.rg_cultivos);
        boton1= (Button)findViewById(R.id.pendiente);


        boton1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        int selected_id =rg_1.getCheckedRadioButtonId();
                        r_n=(RadioButton)findViewById(selected_id);
                        switch(selected_id){
                            case 2131427415:
                                val=1;
                                fer1=175;
                                nom_fer1="fosforo";
                                fer2=150;
                                nom_fer2="potasio";
                                fer3=20;
                                nom_fer3="nitrogeno(cuando vegetativo plantulas)";
                                break;
                            case 2131427416:
                                val=2;

                                break;
                            case 2131427417:
                                val=3;
                                break;
                            case 2131427418:
                                val=4;
                                break;
                            case 2131427419:
                                val=5;
                                break;
                        };

                        texto= (TextView) findViewById(R.id.prod);
                        texto2= (TextView) findViewById(R.id.hect);
                        texto3= (TextView) findViewById(R.id.f1);
                        texto4= (TextView) findViewById(R.id.f2);
                        texto5= (TextView) findViewById(R.id.f3);
                        int ha =Integer.parseInt(texto2.getText().toString()) ;
                        texto.setText("productividad esperada"+val*ha+" ton/ha");
                        texto3.setText(nom_fer1+":"+fer1*ha+" kg/ha");
                        texto4.setText(nom_fer2+":"+fer2*ha+" kg/ha");
                        texto5.setText(nom_fer3+":"+fer3*ha+" kg/ha");
                        Toast.makeText(frame_2.this,
                                r_n.getText().toString(),Toast.LENGTH_SHORT).show();;



                    }
                }

        );
    }
}
