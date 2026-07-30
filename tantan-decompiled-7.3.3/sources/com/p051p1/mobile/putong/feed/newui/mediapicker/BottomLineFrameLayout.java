package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class BottomLineFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f41100a;

    /* JADX INFO: renamed from: b */
    public Paint f41101b;

    /* JADX INFO: renamed from: c */
    public boolean f41102c;

    public BottomLineFrameLayout(@NonNull Context context) {
        super(context);
        this.f41102c = false;
        m63368a();
    }

    /* JADX INFO: renamed from: a */
    public final void m63368a() {
        TextView textView = new TextView(getContext());
        this.f41100a = textView;
        textView.setTextSize(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f41100a, layoutParams);
        this.f41100a.setCompoundDrawablePadding(qa00.m175859d(8.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f41102c) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f41101b == null) {
                this.f41101b = new Paint();
            }
            this.f41101b.setColor(Color.parseColor("#ff450e"));
            this.f41101b.setAntiAlias(true);
            this.f41101b.setStrokeWidth(qa00.m175859d(1.0f));
            float fM175859d = (measuredWidth - qa00.m175859d(76.0f)) / 2.0f;
            float fM175859d2 = measuredHeight - qa00.m175859d(1.0f);
            canvas2 = canvas;
            canvas2.drawLine(fM175859d, fM175859d2, fM175859d + qa00.m175859d(76.0f), fM175859d2, this.f41101b);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public void setTabImage(int i) {
        this.f41100a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setText(String str) {
        this.f41100a.setText(str);
    }

    public void setTextColor(int i) {
        this.f41100a.setTextColor(i);
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41102c = false;
        m63368a();
    }

    public BottomLineFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41102c = false;
        m63368a();
    }
}
