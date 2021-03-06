package kr.hs.emirim.uuuuri.haegbook.Manager;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import kr.hs.emirim.uuuuri.haegbook.Adapter.ReceiptRecyclerAdapter;
import kr.hs.emirim.uuuuri.haegbook.Model.Receipt;

/**
 * Created by 유리 on 2017-09-14.
 */

public class ReceiptRecyclerSetter {
    ArrayList<Receipt> items;
    ReceiptRecyclerAdapter adapter;

    Context context;
    Activity nowActivity;

    public ReceiptRecyclerSetter(Context context, Activity nowActivity) {
        this.context = context;
        this.nowActivity = nowActivity;
    }

    public boolean setRecyclerCardView(RecyclerView recyclerView, ArrayList<Receipt> receiptArrayList){

//        items = new ArrayList<Receipt>();
        items = receiptArrayList;

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new ReceiptRecyclerAdapter(context, nowActivity, items);
        recyclerView.setAdapter(adapter);
        return true;

    }

}
