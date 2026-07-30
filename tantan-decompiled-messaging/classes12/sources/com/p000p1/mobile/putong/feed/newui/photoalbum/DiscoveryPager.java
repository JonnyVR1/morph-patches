package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class DiscoveryPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public InterfaceC2103a f2283P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager$a */
    public interface InterfaceC2103a {
        /* JADX INFO: renamed from: a */
        boolean mo4089a(MotionEvent motionEvent);
    }

    public DiscoveryPager(Context context) {
        super(context);
        this.f2283P0 = null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2283P0 = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onDetachedFromWindow() {
        super/*androidx.viewpager.widget.ViewPager*/.onDetachedFromWindow();
        this.f2283P0 = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.a(this.f2283P0) && this.f2283P0.mo4089a(motionEvent)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC2103a interfaceC2103a) {
        this.f2283P0 = interfaceC2103a;
    }

    public DiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2283P0 = null;
    }
}
