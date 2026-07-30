package com.p051p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class PreviousTouchLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public x20 f55023a;

    public PreviousTouchLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.m82486a(this.f55023a)) {
            this.f55023a.call();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPreviousTouchEvent(x20 x20Var) {
        this.f55023a = x20Var;
    }

    public PreviousTouchLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviousTouchLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
