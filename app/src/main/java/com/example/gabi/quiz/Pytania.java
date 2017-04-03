package com.example.gabi.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Pytania extends AppCompatActivity {

    public static int pkt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytania);

        Button Bwynik = (Button) findViewById(R.id.buttonWynik);
        Bwynik.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View v)
            {
                pkt = 0;

                RadioGroup grupa1 = (RadioGroup)findViewById(R.id.grupaChuck);
                RadioButton odpChuck = (RadioButton)grupa1.findViewById(R.id.odpChuck);
                RadioButton odpSpider = (RadioButton)grupa1.findViewById(R.id.odpSpider);

                int zaznaczone1 = grupa1.getCheckedRadioButtonId();
                if( zaznaczone1 != -1 )
                {
                    RadioButton przycisk1 = (RadioButton)findViewById(zaznaczone1);

                    if( przycisk1.equals(odpChuck))
                    {
                        pkt++;
                    }
                }
                ///----------------------
                RadioGroup grupa2 = (RadioGroup)findViewById(R.id.grupaCoBedzie);
                RadioButton odpZimno = (RadioButton)grupa2.findViewById(R.id.odpZimno);
                RadioButton odpCieplo = (RadioButton)grupa2.findViewById(R.id.odpCieplo);

                int zaznaczone2 = grupa2.getCheckedRadioButtonId();
                if( zaznaczone2 != -1 )
                {
                    RadioButton przycisk2 = (RadioButton)findViewById(zaznaczone2);

                    if( przycisk2.equals(odpZimno))
                    {
                        pkt++;
                    }
                }
                ///----------------------
                RadioGroup grupa3 = (RadioGroup)findViewById(R.id.grupaMysz);
                RadioButton odpMysz = (RadioButton)grupa3.findViewById(R.id.odpMysz);
                RadioButton odpKostka = (RadioButton)grupa3.findViewById(R.id.odpKostka);

                int zaznaczone3 = grupa3.getCheckedRadioButtonId();
                if( zaznaczone3 != -1 )
                {
                    RadioButton przycisk3 = (RadioButton)findViewById(zaznaczone3);

                    if( przycisk3.equals(odpMysz))
                    {
                        pkt++;
                    }
                }
                ///----------------------
                RadioGroup grupa4 = (RadioGroup)findViewById(R.id.grupaWonsz);
                RadioButton odpWonsz = (RadioButton)grupa4.findViewById(R.id.odpWaz);
                RadioButton odpBanan = (RadioButton)grupa4.findViewById(R.id.odpBanan);

                int zaznaczone4 = grupa4.getCheckedRadioButtonId();
                if( zaznaczone4 != -1 )
                {
                    RadioButton przycisk4 = (RadioButton)findViewById(zaznaczone4);

                    if( przycisk4.equals(odpWonsz))
                    {
                        pkt++;
                    }
                }
                ///-----------------------
                RadioGroup grupa5 = (RadioGroup)findViewById(R.id.grupaJez);
                RadioButton odpJez = (RadioButton)grupa5.findViewById(R.id.odpJez);
                RadioButton odpWykalaczki = (RadioButton)grupa5.findViewById(R.id.odpWykalaczki);

                int zaznaczone5 = grupa5.getCheckedRadioButtonId();
                if( zaznaczone5 != -1 )
                {
                    RadioButton przycisk5 = (RadioButton)findViewById(zaznaczone5);

                    if( przycisk5.equals(odpJez))
                    {
                        pkt++;
                    }
                }

                Context context = getApplicationContext();
                String tekst = Integer.toString(pkt);
                tekst = tekst + " punktów";
                CharSequence text = tekst;
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }


        });
    }

}
