    package com.example.exp5;

    import android.content.ClipData;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.TextView;
    import androidx.recyclerview.widget.RecyclerView;
    import java.util.List;

    public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

        private List<com.example.exp5.Item> itemList;

        public ItemAdapter(List<com.example.exp5.Item> itemList) {
            this.itemList = itemList;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView textViewTitle;

            public ViewHolder(View itemView) {
                super(itemView);
                textViewTitle = itemView.findViewById(R.id.textViewTitle);
            }
        }

        @Override
        public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {
            com.example.exp5.Item item = itemList.get(position);
            holder.textViewTitle.setText(item.getTitle());
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }
    }

