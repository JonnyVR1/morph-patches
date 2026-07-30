package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPager;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoPager extends VPager implements DiscoveryPager.InterfaceC11259a {

    /* JADX INFO: renamed from: P0 */
    public float f41339P0;

    /* JADX INFO: renamed from: Q0 */
    public DiscoveryPager f41340Q0;

    public PhotoPager(Context context) {
        super(context);
        this.f41339P0 = 0.0f;
        this.f41340Q0 = null;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager.InterfaceC11259a
    /* JADX INFO: renamed from: a */
    public boolean mo63073a(MotionEvent motionEvent) {
        if (!NullChecker.m81303a(getAdapter()) || getAdapter().getCount() <= 1 || motionEvent.getAction() != 2) {
            return false;
        }
        float x = motionEvent.getX() - this.f41339P0;
        if (getCurrentItem() != 0 || x <= 0.0f) {
            return getCurrentItem() == getAdapter().getCount() - 1 && x < 0.0f;
        }
        return true;
    }

    @Override // p147v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.m81303a(this.f41340Q0) && motionEvent.getAction() == 0) {
            this.f41340Q0.setEdgeTouch(this);
        }
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0) {
            this.f41339P0 = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent) || mo63073a(motionEvent);
    }

    public void setParentViewPager(DiscoveryPager discoveryPager) {
        this.f41340Q0 = discoveryPager;
    }

    public PhotoPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41339P0 = 0.0f;
        this.f41340Q0 = null;
    }
}
