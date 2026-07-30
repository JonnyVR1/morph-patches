package com.p000p1.mobile.putong.core.newui.mediapicker;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BottomLineFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f3325a;

    /* JADX INFO: renamed from: b */
    public Paint f3326b;

    /* JADX INFO: renamed from: c */
    public boolean f3327c;

    public BottomLineFrameLayout(@NonNull Context context) {
        super(context);
        this.f3327c = false;
        m4579a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4579a() {
        TextView textView = new TextView(getContext());
        this.f3325a = textView;
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f3325a, layoutParams);
        this.f3325a.setCompoundDrawablePadding(t100.d(8.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f3327c) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f3326b == null) {
                this.f3326b = new Paint();
            }
            this.f3326b.setColor(Color.parseColor("#ff450e"));
            this.f3326b.setAntiAlias(true);
            this.f3326b.setStrokeWidth(t100.d(1.0f));
            float fD = (measuredWidth - t100.d(76.0f)) / 2.0f;
            float fD2 = measuredHeight - t100.d(1.0f);
            canvas2 = canvas;
            canvas2.drawLine(fD, fD2, fD + t100.d(76.0f), fD2, this.f3326b);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void setTabImage(int i) {
        this.f3325a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setText(String str) {
        this.f3325a.setText(str);
    }

    public void setTextColor(int i) {
        this.f3325a.setTextColor(i);
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3327c = false;
        m4579a();
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3327c = false;
        m4579a();
    }
}
