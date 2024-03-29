package vn.edu.uit.tmlnghia.shopping.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vn.edu.uit.tmlnghia.shopping.R;
import vn.edu.uit.tmlnghia.shopping.adapters.ShoppingCartItemDetailAdapter;
import vn.edu.uit.tmlnghia.shopping.models.ShoppingCartItemDetail;

public class ShoppingCartActivity extends AppCompatActivity {

    List<ShoppingCartItemDetail> shoppingCartItemList;
    TextView oderButton;
    TextView oldPrice;
    TextView discount;
    TextView totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        oldPrice = this.findViewById(R.id.old_price);
        discount = this.findViewById(R.id.discount);
        totalPrice = this.findViewById(R.id.total_price);

//        TODO Thiết lập thanh action bar, thay đổi chức năng nút close
        getSupportActionBar().setTitle(R.string.shopping_cart);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.close_action);

//        Danh sách các mặt hàng trong giỏ hàng
        shoppingCartItemList = new ArrayList<>();
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 1));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 5));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 2));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 1));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 3));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 2));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 3));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 1));
        shoppingCartItemList.add(new ShoppingCartItemDetail("Máy Ảnh Nikon D3500 KIT 18-55 VR (24.2MP) - Hàng Chính Hãng", "Tiki Trading", R.drawable.dien_thoai, 3990000, 2));

        RecyclerView itemListRecyclerView = this.findViewById(R.id.item_list);

        ShoppingCartItemDetailAdapter shoppingCartItemDetailAdapter = new ShoppingCartItemDetailAdapter(this, shoppingCartItemList);

        LinearLayoutManager itemListLayoutManager = new LinearLayoutManager(this);

        itemListRecyclerView.setLayoutManager(itemListLayoutManager);

        itemListRecyclerView.setAdapter(shoppingCartItemDetailAdapter);


//        TODO tạo sự kiện nhấn cho nút TIẾN HÀNH ĐẶT HÀNG
//        Chuyển đến màn hình thông tin đặt hàng
        oderButton = this.findViewById(R.id.oder_button);
        oderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Chuyển đến màn hình đặt hàng", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
