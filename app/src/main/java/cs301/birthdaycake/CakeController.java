package cs301.birthdaycake;

import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener, android.widget.SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
    private CakeView myCakeView;
    private CakeModel myCakeModel;

    public boolean onTouch(View v, MotionEvent event){
        if(myCakeModel.hasBaloon == false) {
            myCakeModel.hasBaloon = true;
        }
        myCakeView.baloonX=event.getX();
        myCakeView.baloonY=event.getY();
        myCakeView.invalidate();
        return true;
    }
    public CakeController(CakeView cake)
    {
        myCakeView = cake;
        myCakeModel = cake.getCakeModel();
    }

    public void onClick(View v)
    {
        Log.d("button", "blow out");
        myCakeModel.litCandle = false;
        myCakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        myCakeModel.hasCandle = !myCakeModel.hasCandle;
        myCakeView.invalidate();
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        myCakeModel.numCandles = progress;
        myCakeView.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekBar){}

    public void onStopTrackingTouch(SeekBar seekBar){}


}

