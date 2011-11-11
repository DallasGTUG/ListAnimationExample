package com.example;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListAnimation extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mStrings));
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.item_animation);
   	 
        LayoutAnimationController controller =
            new LayoutAnimationController(animation, 0.5f);
    ListView listView = getListView();        
    listView.setLayoutAnimation(controller);
        
    }
    
    private String[] mStrings = {
            "AlphaAnimation",
            "TranslateAnimation",
            "ScaleAnimation",
            "RotateAnimation",
            "LayoutAnimationController",
        };
}