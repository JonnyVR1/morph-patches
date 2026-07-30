package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ViewPagerClickChangeView extends View {

    /* JADX INFO: renamed from: a */
    public int f498a;

    /* JADX INFO: renamed from: b */
    public int f499b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0052a f500c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.ViewPagerClickChangeView$a */
    public interface InterfaceC0052a {
        /* JADX INFO: renamed from: B */
        void mo825B();

        /* JADX INFO: renamed from: w */
        void mo826w();
    }

    public ViewPagerClickChangeView(Context context) {
        super(context);
        this.f499b = 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f498a = View.MeasureSpec.getSize(i);
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.f500c == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f499b = x;
        } else if (action == 1) {
            int i = this.f498a;
            if (x > i / 2 && this.f499b > i / 2) {
                this.f500c.mo826w();
            } else if (x < i / 2 && this.f499b < i / 2) {
                this.f500c.mo825B();
            }
        }
        return true;
    }

    public void setChangeClickListener(InterfaceC0052a interfaceC0052a) {
        this.f500c = interfaceC0052a;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f499b = 0;
    }

    public ViewPagerClickChangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f499b = 0;
    }
}
