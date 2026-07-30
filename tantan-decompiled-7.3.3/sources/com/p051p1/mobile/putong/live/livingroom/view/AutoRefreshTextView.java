package com.p051p1.mobile.putong.live.livingroom.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
public class AutoRefreshTextView extends VText {

    /* JADX INFO: renamed from: i */
    public boolean f52700i;

    public AutoRefreshTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52700i = false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f52700i) {
            postInvalidateDelayed(40L);
        }
    }

    public void setRefresh(boolean z) {
        this.f52700i = z;
    }
}
