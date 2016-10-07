package com.ahmadrosid.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by ocittwo on 10/7/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class MessageView extends RelativeLayout{

    private TextView title_text_top;
    private TextView desc_text_top;
    private TextView title_text_bottom;
    private TextView desc_text_bottom;

    private TriangleView triangleLeft;
    private TriangleView triangleRight;

    private LinearLayout wrap_top;
    private LinearLayout wrap_bottom;

    public MessageView(Context context) {
        this(context, null);
    }

    public MessageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.message_view, this, true);

        title_text_top = (TextView) findViewById(R.id.title_text_top);
        title_text_bottom = (TextView) findViewById(R.id.title_text_bottom);
        desc_text_top = (TextView) findViewById(R.id.desc_text_top);
        desc_text_bottom = (TextView) findViewById(R.id.decs_text_bottom);

        triangleLeft = (TriangleView) findViewById(R.id.left);
        triangleRight = (TriangleView) findViewById(R.id.right);

        wrap_top = (LinearLayout) findViewById(R.id.wrap_top);
        wrap_bottom = (LinearLayout) findViewById(R.id.wrap_bottom);
    }


    public void setTitleMessages(String tittle){
        title_text_top.setText(tittle);
        title_text_bottom.setText(tittle);
    }

    public void setDecsMessages(String desc){
        desc_text_top.setText(desc);
        desc_text_bottom.setText(desc);
    }

    public void setLeft(){
        triangleRight.setVisibility(GONE);
        triangleLeft.setVisibility(VISIBLE);
    }

    public void setRight(){
        triangleRight.setVisibility(VISIBLE);
        triangleLeft.setVisibility(GONE);
        RelativeLayout.LayoutParams paramsTop = (RelativeLayout.LayoutParams) wrap_top.getLayoutParams();
        paramsTop.addRule(ALIGN_PARENT_RIGHT);
        RelativeLayout.LayoutParams paramsBottom = (RelativeLayout.LayoutParams) wrap_bottom.getLayoutParams();
        paramsBottom.addRule(ALIGN_PARENT_RIGHT);
    }

    public void hideTriangle(){
        triangleRight.setVisibility(GONE);
        triangleLeft.setVisibility(GONE);
    }
}
