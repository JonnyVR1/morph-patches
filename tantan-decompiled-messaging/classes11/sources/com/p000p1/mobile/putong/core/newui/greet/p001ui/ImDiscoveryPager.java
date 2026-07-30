package com.p000p1.mobile.putong.core.newui.greet.p001ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ImDiscoveryPager extends VPager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.greet.ui.ImDiscoveryPager$a */
    public interface InterfaceC0012a {
    }

    public ImDiscoveryPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onDetachedFromWindow() {
        super/*androidx.viewpager.widget.ViewPager*/.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && NullChecker.a((Object) null)) {
            throw null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEdgeTouch(InterfaceC0012a interfaceC0012a) {
    }

    public ImDiscoveryPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
