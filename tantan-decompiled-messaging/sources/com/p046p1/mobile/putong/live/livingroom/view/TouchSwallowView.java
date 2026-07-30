package com.p046p1.mobile.putong.live.livingroom.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.r4m;

/* JADX INFO: loaded from: classes5.dex */
public class TouchSwallowView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ViewGroup f52094a;

    public TouchSwallowView(@NonNull Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m76654a(View view) {
        if (view == 0 || view.getVisibility() != 0) {
            return true;
        }
        return (view instanceof r4m) && ((r4m) view).m177818a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0 || getChildAt(0) == null || m76654a(getChildAt(0))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f52094a != null) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 2) {
                this.f52094a.requestDisallowInterceptTouchEvent(true);
            } else {
                this.f52094a.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setSwallowTarget(ViewGroup viewGroup) {
        this.f52094a = viewGroup;
    }

    public TouchSwallowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchSwallowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public TouchSwallowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
