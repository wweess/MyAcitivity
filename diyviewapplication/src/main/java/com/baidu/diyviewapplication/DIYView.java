package com.baidu.diyviewapplication;

import android.content.Context;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/6/30.
 */
public class DIYView extends View {
    public DIYView(Context context) {
        super(context);
    }
    String txt_text=null;
    Drawable txt_img=null;
    public DIYView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.txt);
      txt_text=  typedArray.getString(R.styleable.txt_text);
       txt_img= typedArray.getDrawable(R.styleable.txt_ime);
    }

    public DIYView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        BitmapDrawable bitmapDrawable=(BitmapDrawable)txt_img;
        Bitmap bitmap=bitmapDrawable.getBitmap();
        Paint paint=new Paint();
        paint.setColor(Color.DKGRAY);
        canvas.drawBitmap(bitmap,0,0,paint);
        canvas.drawText(txt_text,bitmap.getWidth(),bitmap.getHeight(),paint);

    }
}
