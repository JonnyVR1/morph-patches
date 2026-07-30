package com.p000p1.mobile.putong.core.p001ui.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p028v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
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
