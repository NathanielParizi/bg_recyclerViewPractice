package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import Model.ListItem;

/**
 * Created by go on 10/22/2017.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> ListItems;

    public myAdapter(Context context, List listItem){

    }
    @Override
    public myAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(myAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(View itemView) {
            super(itemView);

            

        }
    }
}
