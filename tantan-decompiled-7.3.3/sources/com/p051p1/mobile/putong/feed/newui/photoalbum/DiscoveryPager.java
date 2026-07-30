package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class DiscoveryPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public InterfaceC11422a f41670P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager$a */
    public interface InterfaceC11422a {
        /* JADX INFO: renamed from: a */
        boolean mo64256a(MotionEvent motionEvent);
    }

    public DiscoveryPager(Context context) {
        super(context);
        this.f41670P0 = null;
    }

    @Override // p151v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f41670P0 = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41670P0 = null;
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m82486a(this.f41670P0) && this.f41670P0.mo64256a(motionEvent)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC11422a interfaceC11422a) {
        this.f41670P0 = interfaceC11422a;
    }

    public DiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41670P0 = null;
    }
}
