package com.p000p1.mobile.putong.core.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MomentDetailPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public boolean f5132P0;

    public MomentDetailPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5132P0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5132P0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIsCanScroll(boolean z) {
        this.f5132P0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewPagerScrollDuration(int i) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C0376a c0376a = new C0376a(getContext(), new LinearInterpolator());
            c0376a.m7328a(i);
            declaredField.set(this, c0376a);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    public MomentDetailPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.photoalbum.MomentDetailPager$a */
    public class C0376a extends Scroller {

        /* JADX INFO: renamed from: a */
        public int f5133a;

        public C0376a(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        /* JADX INFO: renamed from: a */
        public void m7328a(int i) {
            this.f5133a = i;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, this.f5133a);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.f5133a);
        }
    }
}
