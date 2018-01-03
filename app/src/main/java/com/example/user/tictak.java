package com.example.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.user.login.R;

import static com.example.user.login.R.mipmap.ic_launcher;

public class tictak extends AppCompatActivity {
ImageView img;
    int count=0;
    int track[]={2,2,2,2,2,2,2,2,2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictak);
    }
    public void change(View view)
    {

               img=(ImageView) view;
        int tappedimgtag=Integer.parseInt(img.getTag().toString());
        if(track[tappedimgtag]==2)
        {
            track[tappedimgtag]=count;
            if(count==0) {
                img.setImageResource(R.drawable.cross1);
                img.animate().rotation(360).setDuration(1000);
                count=1;
            }
            else
            {
                img.setImageResource(R.drawable.zero1);
                img.animate().setDuration(1000);
                count=0;
            }
        }
    }

public void playagain(View view)
    {
        LinearLayout l=(LinearLayout)findViewById(R.id.linear1);
      //  int noofvariable=l.getChildCount();
        for(int i=0;i<l.getChildCount();i++)
        {
            ((ImageView)l.getChildAt(i)).setImageResource(ic_launcher);
        }
        LinearLayout m=(LinearLayout)findViewById(R.id.linear2);
        //int noofvariable=l.getChildCount();
        for(int i=0;i<m.getChildCount();i++)
        {
            ((ImageView)l.getChildAt(i)).setImageResource(ic_launcher);
        }
        LinearLayout n=(LinearLayout)findViewById(R.id.linear3);
      //  int noofvariable=l.getChildCount();
        for(int i=0;i<n.getChildCount();i++)
        {
            ((ImageView)l.getChildAt(i)).setImageResource(ic_launcher);
        }
    }




}
