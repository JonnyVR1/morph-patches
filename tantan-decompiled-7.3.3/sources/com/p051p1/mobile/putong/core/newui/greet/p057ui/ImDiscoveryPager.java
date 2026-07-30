package com.p051p1.mobile.putong.core.newui.greet.p057ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class ImDiscoveryPager extends VPager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.greet.ui.ImDiscoveryPager$a */
    public interface InterfaceC7999a {
    }

    public ImDiscoveryPager(Context context) {
        super(context);
    }

    @Override // p151v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m82486a(null)) {
            throw null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC7999a interfaceC7999a) {
    }

    public ImDiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
