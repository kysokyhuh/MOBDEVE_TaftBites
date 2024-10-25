package com.mobdeve.s21.grp4.mco_taftbites;
//RESTAURANT DETAILS PAGE

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuItem> menuItemsList;
    private Context context;

    public MenuAdapter(List<MenuItem> menuItemsList, Context context) {
        this.menuItemsList = menuItemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        MenuItem menuItem = menuItemsList.get(position);
        holder.menuItemName.setText(menuItem.getName());
        holder.menuItemImage.setImageResource(menuItem.getImageResId());
    }

    @Override
    public int getItemCount() {
        return menuItemsList.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {

        ImageView menuItemImage;
        TextView menuItemName;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            menuItemImage = itemView.findViewById(R.id.menuItemImage);
            menuItemName = itemView.findViewById(R.id.menuItemName);
        }
    }
}


