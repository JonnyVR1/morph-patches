package com.p046p1.mobile.putong.feed.newui.mediapicker;

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

/* JADX INFO: loaded from: classes12.dex */
public class BottomLineFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f40252a;

    /* JADX INFO: renamed from: b */
    public Paint f40253b;

    /* JADX INFO: renamed from: c */
    public boolean f40254c;

    public BottomLineFrameLayout(@NonNull Context context) {
        super(context);
        this.f40254c = false;
        m62185a();
    }

    /* JADX INFO: renamed from: a */
    public final void m62185a() {
        TextView textView = new TextView(getContext());
        this.f40252a = textView;
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f40252a, layoutParams);
        this.f40252a.setCompoundDrawablePadding(t100.m186890d(8.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f40254c) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f40253b == null) {
                this.f40253b = new Paint();
            }
            this.f40253b.setColor(Color.parseColor("#ff450e"));
            this.f40253b.setAntiAlias(true);
            this.f40253b.setStrokeWidth(t100.m186890d(1.0f));
            float fM186890d = (measuredWidth - t100.m186890d(76.0f)) / 2.0f;
            float fM186890d2 = measuredHeight - t100.m186890d(1.0f);
            canvas2 = canvas;
            canvas2.drawLine(fM186890d, fM186890d2, fM186890d + t100.m186890d(76.0f), fM186890d2, this.f40253b);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void setTabImage(int i) {
        this.f40252a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setText(String str) {
        this.f40252a.setText(str);
    }

    public void setTextColor(int i) {
        this.f40252a.setTextColor(i);
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40254c = false;
        m62185a();
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40254c = false;
        m62185a();
    }
}
