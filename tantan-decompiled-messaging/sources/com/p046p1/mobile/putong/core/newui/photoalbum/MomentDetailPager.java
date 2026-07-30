package com.p046p1.mobile.putong.core.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p147v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class MomentDetailPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public boolean f26354P0;

    public MomentDetailPager(Context context) {
        super(context);
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26354P0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f26354P0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIsCanScroll(boolean z) {
        this.f26354P0 = z;
    }

    public void setViewPagerScrollDuration(int i) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C8212a c8212a = new C8212a(getContext(), new LinearInterpolator());
            c8212a.m43116a(i);
            declaredField.set(this, c8212a);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    public MomentDetailPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.photoalbum.MomentDetailPager$a */
    public class C8212a extends Scroller {

        /* JADX INFO: renamed from: a */
        public int f26355a;

        public C8212a(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        /* JADX INFO: renamed from: a */
        public void m43116a(int i) {
            this.f26355a = i;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, this.f26355a);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.f26355a);
        }
    }
}
