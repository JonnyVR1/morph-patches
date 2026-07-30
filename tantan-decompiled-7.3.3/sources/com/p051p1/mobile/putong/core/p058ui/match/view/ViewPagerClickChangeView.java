package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPagerClickChangeView extends View {

    /* JADX INFO: renamed from: a */
    public int f31455a;

    /* JADX INFO: renamed from: b */
    public int f31456b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8632a f31457c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.ViewPagerClickChangeView$a */
    public interface InterfaceC8632a {
        /* JADX INFO: renamed from: B */
        void mo48944B();

        /* JADX INFO: renamed from: w */
        void mo48945w();
    }

    public ViewPagerClickChangeView(Context context) {
        super(context);
        this.f31456b = 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f31455a = View.MeasureSpec.getSize(i);
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.f31457c == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31456b = x;
        } else if (action == 1) {
            int i = this.f31455a;
            if (x > i / 2 && this.f31456b > i / 2) {
                this.f31457c.mo48945w();
            } else if (x < i / 2 && this.f31456b < i / 2) {
                this.f31457c.mo48944B();
            }
        }
        return true;
    }

    public void setChangeClickListener(InterfaceC8632a interfaceC8632a) {
        this.f31457c = interfaceC8632a;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31456b = 0;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31456b = 0;
    }
}
