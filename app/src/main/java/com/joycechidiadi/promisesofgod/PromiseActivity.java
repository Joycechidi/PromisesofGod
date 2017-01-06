package com.joycechidiadi.promisesofgod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageSwitcher;


public class PromiseActivity extends AppCompatActivity {

    //add image to drawable and fetch here
    int imageNo ={R.drawable.abundance,R.drawable.abundant_food,R.drawable.awesome,
            R.drawable.banff,R.drawable.bridge,R.drawable.career_success,R.drawable.children_blessing,
            R.drawable.children_gift,R.drawable.colorballs,R.drawable.deliver,R.drawable.disney
            R.drawable.do_not_worry,R.drawable.eiffel,R.drawable.escape,R.drawable.faith,
            R.drawable.fallen,R.drawable.fear_disappears,R.drawable.fear_not,R.drawable.generous,
            R.drawable.flourish,R.drawable.flowers,R.drawable.forgiveness,R.drawable.gift_of_children,
            R.drawable.greatest_gift,R.drawable.hard_task,R.drawable.heals_you,R.drawable.healing,
            R.drawable.hope_in_sorrow,R.drawable.joshua,R.drawable.justask,R.drawable.kings,
            R.drawable.kings_heart,R.drawable.mountain_tops,R.drawable.no_impossible,R.drawable.no_terror,
            R.drawable.off_road,R.drawable.outstanding,R.drawable.paris,R.drawable.pathway,
            R.drawable.peaceful,R.drawable.perfect_security,R.drawable.plans,R.drawable.promises,
            R.drawable.protect,R.drawable.protection,R.drawable.rivers_in_dryness,
            R.drawable.roaring_lion,R.drawable.rock_solid,R.drawable.rubies,R.drawable.secured,
            R.drawable.seems_bigger,R.drawable.seems_faraway,R.drawable.sin_forgiven,R.drawable.sorrow,
            R.drawable.structure,R.drawable.success,R.drawable.teach_children,R.drawable.temptation,
            R.drawable.thoughts,R.drawable.through_fire,R.drawable.tithes,R.drawable.tower,
            R.drawable.travel,R.drawable.walks_with_u,R.drawable.worry_not};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promise);

        //Simply add button and imageSwitcher to change id
        Button nextImage = (Button)findViewById(R.id.btnNextPromise);
        final ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.imageChanger);

        
    }
}
