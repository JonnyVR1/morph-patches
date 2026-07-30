package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoPager extends VPager implements DiscoveryPager.InterfaceC2103a {

    /* JADX INFO: renamed from: P0 */
    public float f2800P0;

    /* JADX INFO: renamed from: Q0 */
    public DiscoveryPager f2801Q0;

    public PhotoPager(Context context) {
        super(context);
        this.f2800P0 = 0.0f;
        this.f2801Q0 = null;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager.InterfaceC2103a
    /* JADX INFO: renamed from: a */
    public boolean mo4089a(MotionEvent motionEvent) {
        if (!NullChecker.a(getAdapter()) || getAdapter().getCount() <= 1 || motionEvent.getAction() != 2) {
            return false;
        }
        float x = motionEvent.getX() - this.f2800P0;
        if (getCurrentItem() != 0 || x <= 0.0f) {
            return getCurrentItem() == getAdapter().getCount() - 1 && x < 0.0f;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.a(this.f2801Q0) && motionEvent.getAction() == 0) {
            this.f2801Q0.setEdgeTouch(this);
        }
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0) {
            this.f2800P0 = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent) || mo4089a(motionEvent);
    }

    public void setParentViewPager(DiscoveryPager discoveryPager) {
        this.f2801Q0 = discoveryPager;
    }

    public PhotoPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2800P0 = 0.0f;
        this.f2801Q0 = null;
    }
}
