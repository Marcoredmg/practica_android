package com.coredevelopers.fmplatzi.ui;


import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.IntegerRes;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

public class ItemOffsetDecoration extends RecyclerView.ItemDecoration{

    private int mItemOffset;

    public ItemOffsetDecoration(Context context, @IntegerRes int integerResId){
        int itemOffsetDp = context.getResources().getInteger(integerResId);
        mItemOffset = convertToDp(itemOffsetDp, context.getResources().getDisplayMetrics());
    }
    public int convertToDp(int offsetDp, DisplayMetrics metrics){
        return offsetDp * (metrics.densityDpi/160);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(mItemOffset, mItemOffset, mItemOffset, mItemOffset);
    }
}
