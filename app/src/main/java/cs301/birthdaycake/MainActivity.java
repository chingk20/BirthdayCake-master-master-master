package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView guiCakeView = (CakeView) findViewById(R.id.cakeview);
        CakeController guiCakeController = new CakeController(guiCakeView);
        Button blowOutButton = (Button) findViewById(R.id.button);
        blowOutButton.setOnClickListener(guiCakeController);

        Switch candleSwitch = (Switch) findViewById(R.id.simpleSwitch2);
        candleSwitch.setOnCheckedChangeListener(guiCakeController);

        SeekBar candleSeekBar = (SeekBar) findViewById(R.id.simpleSeekBar);
        candleSeekBar.setOnSeekBarChangeListener(guiCakeController);
    }
    
    public void goodbye(View button)
    {
        Log.i("button","Goodbye");
    }
}
