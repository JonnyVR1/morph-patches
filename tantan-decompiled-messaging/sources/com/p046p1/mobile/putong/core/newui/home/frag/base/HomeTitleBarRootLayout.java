package com.p046p1.mobile.putong.core.newui.home.frag.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class HomeTitleBarRootLayout extends LinearLayout {
    public HomeTitleBarRootLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == 0.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public HomeTitleBarRootLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeTitleBarRootLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
