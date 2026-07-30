package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPager;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryPager extends VPager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.DiscoveryPager$a */
    public interface InterfaceC8134a {
    }

    public DiscoveryPager(Context context) {
        super(context);
    }

    @Override // p147v.VPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.m81303a(null)) {
            throw null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC8134a interfaceC8134a) {
    }

    public DiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
