package com.example.newshunt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
      TabLayout tabLayout;
      TabItem mhome,mscience,mhealth,mtechnology,mentertainment,msports;
      PagerAdapter pagerAdapter;
      Toolbar mtoolbar;
      String api="50f0ce6c6010444381454607d41a7446";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mtoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        mhealth=findViewById(R.id.health);
        msports=findViewById(R.id.sports);
        mentertainment=findViewById(R.id.entertainment);
        mtechnology=findViewById(R.id.technology);
        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);

     pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
     viewPager.setAdapter(pagerAdapter);
     tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
         @Override
         public void onTabSelected(TabLayout.Tab tab) {
 viewPager.setCurrentItem(tab.getPosition());
 if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
     pagerAdapter.notifyDataSetChanged();
 }
         }

         @Override
         public void onTabUnselected(TabLayout.Tab tab) {

         }

         @Override
         public void onTabReselected(TabLayout.Tab tab) {

         }
     });
     viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));





    }
}