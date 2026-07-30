package com.p046p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;

/* JADX INFO: loaded from: classes11.dex */
public class PreviousTouchLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public d30 f54175a;

    public PreviousTouchLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.m81303a(this.f54175a)) {
            this.f54175a.call();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPreviousTouchEvent(d30 d30Var) {
        this.f54175a = d30Var;
    }

    public PreviousTouchLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviousTouchLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
