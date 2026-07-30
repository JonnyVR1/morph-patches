package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoPager extends VPager implements DiscoveryPager.InterfaceC11422a {

    /* JADX INFO: renamed from: P0 */
    public float f42187P0;

    /* JADX INFO: renamed from: Q0 */
    public DiscoveryPager f42188Q0;

    public PhotoPager(Context context) {
        super(context);
        this.f42187P0 = 0.0f;
        this.f42188Q0 = null;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager.InterfaceC11422a
    /* JADX INFO: renamed from: a */
    public boolean mo64256a(MotionEvent motionEvent) {
        if (!NullChecker.m82486a(getAdapter()) || getAdapter().getCount() <= 1 || motionEvent.getAction() != 2) {
            return false;
        }
        float x = motionEvent.getX() - this.f42187P0;
        if (getCurrentItem() != 0 || x <= 0.0f) {
            return getCurrentItem() == getAdapter().getCount() - 1 && x < 0.0f;
        }
        return true;
    }

    @Override // p151v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.m82486a(this.f42188Q0) && motionEvent.getAction() == 0) {
            this.f42188Q0.setEdgeTouch(this);
        }
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0) {
            this.f42187P0 = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent) || mo64256a(motionEvent);
    }

    public void setParentViewPager(DiscoveryPager discoveryPager) {
        this.f42188Q0 = discoveryPager;
    }

    public PhotoPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42187P0 = 0.0f;
        this.f42188Q0 = null;
    }
}
