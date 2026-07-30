package com.p051p1.mobile.putong.core.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p151v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class MomentDetailPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public boolean f27096P0;

    public MomentDetailPager(Context context) {
        super(context);
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27096P0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f27096P0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIsCanScroll(boolean z) {
        this.f27096P0 = z;
    }

    public void setViewPagerScrollDuration(int i) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C8363a c8363a = new C8363a(getContext(), new LinearInterpolator());
            c8363a.m44127a(i);
            declaredField.set(this, c8363a);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    public MomentDetailPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.photoalbum.MomentDetailPager$a */
    public class C8363a extends Scroller {

        /* JADX INFO: renamed from: a */
        public int f27097a;

        public C8363a(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        /* JADX INFO: renamed from: a */
        public void m44127a(int i) {
            this.f27097a = i;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, this.f27097a);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.f27097a);
        }
    }
}
