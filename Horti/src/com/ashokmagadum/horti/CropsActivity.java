package com.ashokmagadum.horti;

import java.io.IOException;



import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class CropsActivity extends Activity implements OnClickListener {
	
	ImageButton imgButton1;
	ImageButton imgButton2;
	ImageButton imgButton3;
	ImageButton imgButton4;
	ImageButton imgButton5;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);

        imgButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imgButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imgButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imgButton5 = (ImageButton) findViewById(R.id.imageButton5);
        
        
        imgButton1.setOnClickListener(this);
        imgButton2.setOnClickListener(this);
        imgButton3.setOnClickListener(this);
        imgButton4.setOnClickListener(this);
        imgButton5.setOnClickListener(this);
       
    }
        

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()) {
		case R.id.imageButton1:
			final MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.atomato);
			mp.stop();
	           try
	              {
	              mp.prepare();
	             }
	           catch (IllegalStateException e)
	              {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	              }
	           catch (IOException e)
	              {
	                    // TODO Auto-generated catch block
	                 e.printStackTrace();
	             }
	      mp.start();
	      
	      break;
		case R.id.imageButton2:
			final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.apotato);
			mp1.stop();
	           try
	              {
	              mp1.prepare();
	             }
	           catch (IllegalStateException e)
	              {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	              }
	           catch (IOException e)
	              {
	                    // TODO Auto-generated catch block
	                 e.printStackTrace();
	             }
	      mp1.start();
	      break;
		case R.id.imageButton3:
			final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.aonion);
			mp2.stop();
	           try
	              {
	              mp2.prepare();
	             }
	           catch (IllegalStateException e)
	              {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	              }
	           catch (IOException e)
	              {
	                    // TODO Auto-generated catch block
	                 e.printStackTrace();
	             }
	      mp2.start();
	      break;
		case R.id.imageButton4:
			final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.apea);
			mp3.stop();
	           try
	              {
	              mp3.prepare();
	             }
	           catch (IllegalStateException e)
	              {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	              }
	           catch (IOException e)
	              {
	                    // TODO Auto-generated catch block
	                 e.printStackTrace();
	             }
	      mp3.start();
	      break;
		case R.id.imageButton5:
			final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.achilli);
			mp4.stop();
	           try
	              {
	              mp4.prepare();
	             }
	           catch (IllegalStateException e)
	              {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	              }
	           catch (IOException e)
	              {
	                    // TODO Auto-generated catch block
	                 e.printStackTrace();
	             }
	      mp4.start();
	      break;
		}
		
	}

}     