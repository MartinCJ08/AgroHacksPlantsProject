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
        rg_1 =(RadioGroup)findViewById(R.id.rg_cultivos);
        rg_1.setHovered(true);
        onClickListenerButton();

    }
    public void onClickListenerButton(){
        //rg_1 =(RadioGroup)findViewById(R.id.rg_cultivos);
        boton1= (Button)findViewById(R.id.pendiente);


        boton1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        int selected_id =rg_1.getCheckedRadioButtonId();

                        r_n=(RadioButton)findViewById(selected_id);
                        switch(selected_id){
                            case R.id.r_1:
                                val=1;
                                fer1=175;
                                nom_fer1="Fósforo";
                                fer2=150;
                                nom_fer2="Potasio";
                                fer3=20;
                                nom_fer3="Nitrógeno(cuando vegetativo plantulas)";
                                break;
                            case R.id.r_2:
                                val=3;
                                fer1=0;
                                nom_fer1="";
                                fer2=0;
                                nom_fer2="";
                                fer3=25;
                                nom_fer3="Nitrógeno";
                                System.out.println("Radion button 2");

                                break;
                            case R.id.r_3:
                                val=3;
                                fer1=72;
                                nom_fer1="Fósforo";
                                fer2=45;
                                nom_fer2="Potasio";
                                fer3=30;
                                nom_fer3="Zinc y Magnesio";
                                break;
                            case R.id.r_4:

                                val=4;
                                fer1=56;
                                nom_fer1="Fósforo";
                                fer2=47;
                                nom_fer2="Potasio";
                                fer3=43;
                                nom_fer3="Nitrógeno";
                                break;
                            case R.id.r_5:
                                val=5;
                                fer1=68;
                                nom_fer1="Fósforo";
                                fer2=34;
                                nom_fer2="Potasio";
                                fer3=98;
                                nom_fer3="Nitrógeno";

                                break;
                        }

                        texto= (TextView) findViewById(R.id.prod);
                        texto2= (TextView) findViewById(R.id.hect);
                        texto3= (TextView) findViewById(R.id.f1);
                        texto4= (TextView) findViewById(R.id.f2);
                        texto5= (TextView) findViewById(R.id.f3);
                        int ha =Integer.parseInt(texto2.getText().toString()) ;
                        texto.setText("Productividad tentativa de "+val*ha+" toneladas por cosecha");
                        texto3.setText(nom_fer1+":"+fer1*ha+" kg/ha");
                        texto4.setText(nom_fer2+":"+fer2*ha+" kg/ha");
                        texto5.setText(nom_fer3+":"+fer3*ha+" kg/ha");
                        //System.out.println("r__n "+ r_n);
                        //System.out.println("Select "+ selected_id);
                        Toast.makeText(frame_2.this,
                                r_n.getText().toString(),Toast.LENGTH_SHORT).show();



                    }
                }

        );
    }
}
