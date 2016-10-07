package com.ahmadrosid.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Paint.Style.STROKE;
/**
 * Created by ocittwo on 10/7/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class TriangleView extends View {

    private static final float DEFAULT_SHADOW_RADIUS = 5f;

    public int colorMain;
    private int colorBorder;

    private Path path;
    private Paint painCanvas;
    private Paint painBorder;

    public void setColorCode(int colorCode) {
        this.colorMain = colorCode;
    }

    public TriangleView(Context context) {
        super(context);
    }

    public TriangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TriangleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation") protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        colorMain = ContextCompat.getColor(getContext(), R.color.grey_50);
        colorBorder = ContextCompat.getColor(getContext(), R.color.grey_400);

        int w = getWidth() / 2;
        int h = getHeight() / 2;

        path = new Path();
        path.moveTo(0, 0);
        path.lineTo(w, 2 * h);
        path.lineTo(2 * w, 0);
        path.lineTo(0, 0);
        path.close();

        painCanvas = new Paint();
        painCanvas.setAntiAlias(true);
        painCanvas.setColor(colorMain);

        painBorder = new Paint();
        painBorder.setAntiAlias(true);
        painBorder.setColor(colorBorder);
        painBorder.setStrokeWidth(2.5f);
        painBorder.setStyle(STROKE);

        canvas.drawPath(path, painCanvas);
        canvas.drawPath(path, painBorder);
    }
}