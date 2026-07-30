package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPagerClickChangeView extends View {

    /* JADX INFO: renamed from: a */
    public int f30607a;

    /* JADX INFO: renamed from: b */
    public int f30608b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8469a f30609c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.ViewPagerClickChangeView$a */
    public interface InterfaceC8469a {
        /* JADX INFO: renamed from: B */
        void mo47761B();

        /* JADX INFO: renamed from: w */
        void mo47762w();
    }

    public ViewPagerClickChangeView(Context context) {
        super(context);
        this.f30608b = 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30607a = View.MeasureSpec.getSize(i);
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.f30609c == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f30608b = x;
        } else if (action == 1) {
            int i = this.f30607a;
            if (x > i / 2 && this.f30608b > i / 2) {
                this.f30609c.mo47762w();
            } else if (x < i / 2 && this.f30608b < i / 2) {
                this.f30609c.mo47761B();
            }
        }
        return true;
    }

    public void setChangeClickListener(InterfaceC8469a interfaceC8469a) {
        this.f30609c = interfaceC8469a;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30608b = 0;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30608b = 0;
    }
}
