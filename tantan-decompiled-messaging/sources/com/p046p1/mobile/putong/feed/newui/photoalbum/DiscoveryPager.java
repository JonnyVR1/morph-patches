package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPager;

/* JADX INFO: loaded from: classes12.dex */
public class DiscoveryPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public InterfaceC11259a f40822P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager$a */
    public interface InterfaceC11259a {
        /* JADX INFO: renamed from: a */
        boolean mo63073a(MotionEvent motionEvent);
    }

    public DiscoveryPager(Context context) {
        super(context);
        this.f40822P0 = null;
    }

    @Override // p147v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40822P0 = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40822P0 = null;
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m81303a(this.f40822P0) && this.f40822P0.mo63073a(motionEvent)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC11259a interfaceC11259a) {
        this.f40822P0 = interfaceC11259a;
    }

    public DiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40822P0 = null;
    }
}
