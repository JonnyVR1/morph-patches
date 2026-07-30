package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BottomLineFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1713a;

    /* JADX INFO: renamed from: b */
    public Paint f1714b;

    /* JADX INFO: renamed from: c */
    public boolean f1715c;

    public BottomLineFrameLayout(@NonNull Context context) {
        super(context);
        this.f1715c = false;
        m3167a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3167a() {
        TextView textView = new TextView(getContext());
        this.f1713a = textView;
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f1713a, layoutParams);
        this.f1713a.setCompoundDrawablePadding(t100.d(8.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f1715c) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f1714b == null) {
                this.f1714b = new Paint();
            }
            this.f1714b.setColor(Color.parseColor("#ff450e"));
            this.f1714b.setAntiAlias(true);
            this.f1714b.setStrokeWidth(t100.d(1.0f));
            float fD = (measuredWidth - t100.d(76.0f)) / 2.0f;
            float fD2 = measuredHeight - t100.d(1.0f);
            canvas2 = canvas;
            canvas2.drawLine(fD, fD2, fD + t100.d(76.0f), fD2, this.f1714b);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void setTabImage(int i) {
        this.f1713a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setText(String str) {
        this.f1713a.setText(str);
    }

    public void setTextColor(int i) {
        this.f1713a.setTextColor(i);
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1715c = false;
        m3167a();
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1715c = false;
        m3167a();
    }
}
