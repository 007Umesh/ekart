package com.appp.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView fruits, vegetables, eggs, milk;
    private ImageView grains, pulses, millets, flowers;
    private ImageView spices, flour, dailyproducts, others;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        fruits = (ImageView) findViewById(R.id.fruits);
        vegetables = (ImageView) findViewById(R.id.vegetables);
        eggs = (ImageView) findViewById(R.id.eggs);
        milk = (ImageView) findViewById(R.id.milk);

        grains = (ImageView) findViewById(R.id.grains);
        pulses = (ImageView) findViewById(R.id.pulses);
        millets = (ImageView) findViewById(R.id.millets);
        flowers = (ImageView) findViewById(R.id.flowers);

        spices = (ImageView) findViewById(R.id.spices);
        flour = (ImageView) findViewById(R.id.flour);
        dailyproducts = (ImageView) findViewById(R.id.dailyproducts);
        others = (ImageView) findViewById(R.id.others);


        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "fruits");
                startActivity(intent);
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "vegetables");
                startActivity(intent);
            }
        });


        eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "eggs");
                startActivity(intent);
            }
        });


        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "milk");
                startActivity(intent);
            }
        });


        grains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "grains");
                startActivity(intent);
            }
        });


        pulses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "pulses");
                startActivity(intent);
            }
        });



        millets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "millets");
                startActivity(intent);
            }
        });


        flowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "flowers");
                startActivity(intent);
            }
        });



        spices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "spices");
                startActivity(intent);
            }
        });


        flour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "flour");
                startActivity(intent);
            }
        });


        dailyproducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "dailyproducts");
                startActivity(intent);
            }
        });


        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.appp.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "others");
                startActivity(intent);
            }
        });
    }
}
