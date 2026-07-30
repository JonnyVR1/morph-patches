package com.p046p1.mobile.putong.core.p053ui.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p147v.VList;

/* JADX INFO: loaded from: classes3.dex */
public class MapListView extends VList {
    public MapListView(Context context) {
        super(context);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() <= 0 || getFirstVisiblePosition() != 0 || motionEvent.getY() > getChildAt(0).getBottom()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public MapListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MapListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
