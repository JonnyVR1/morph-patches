package com.p046p1.mobile.putong.core.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class BottomLineFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f24547a;

    /* JADX INFO: renamed from: b */
    public Paint f24548b;

    /* JADX INFO: renamed from: c */
    public boolean f24549c;

    public BottomLineFrameLayout(@NonNull Context context) {
        super(context);
        this.f24549c = false;
        m40493a();
    }

    /* JADX INFO: renamed from: a */
    public final void m40493a() {
        TextView textView = new TextView(getContext());
        this.f24547a = textView;
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f24547a, layoutParams);
        this.f24547a.setCompoundDrawablePadding(t100.m186890d(8.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f24549c) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f24548b == null) {
                this.f24548b = new Paint();
            }
            this.f24548b.setColor(Color.parseColor("#ff450e"));
            this.f24548b.setAntiAlias(true);
            this.f24548b.setStrokeWidth(t100.m186890d(1.0f));
            float fM186890d = (measuredWidth - t100.m186890d(76.0f)) / 2.0f;
            float fM186890d2 = measuredHeight - t100.m186890d(1.0f);
            canvas2 = canvas;
            canvas2.drawLine(fM186890d, fM186890d2, fM186890d + t100.m186890d(76.0f), fM186890d2, this.f24548b);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void setTabImage(int i) {
        this.f24547a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setText(String str) {
        this.f24547a.setText(str);
    }

    public void setTextColor(int i) {
        this.f24547a.setTextColor(i);
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24549c = false;
        m40493a();
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24549c = false;
        m40493a();
    }
}
