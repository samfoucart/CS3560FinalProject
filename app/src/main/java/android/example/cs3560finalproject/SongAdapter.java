package android.example.cs3560finalproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SongAdapter extends RecyclerView.Adapter {
    private ArrayAdapter<String> mDataSet;

    public static class SongViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;

        public SongViewHolder(final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.connect_button);
            textView = itemView.findViewById(R.id.song_title);
        }
    }

    public SongAdapter(ArrayAdapter<String> dataSet) {
        mDataSet = dataSet;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView v = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_item, viewGroup, false);

        return
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
