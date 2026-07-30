package com.p046p1.mobile.putong.live.livingroom.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class AutoRefreshTextView extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f51852i;

    public AutoRefreshTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51852i = false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51852i) {
            postInvalidateDelayed(40L);
        }
    }

    public void setRefresh(boolean z) {
        this.f51852i = z;
    }
}
