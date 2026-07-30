package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import l.ud50;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VScrollProfile extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f918e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VScrollProfile$a */
    public interface InterfaceC0053a extends ud50 {
    }

    public VScrollProfile(Context context) {
        super(context);
        m1269c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m1269c(Context context) {
        this.f918e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.a((Object) null)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public InterfaceC0053a getOnDispatchTouchEventListener() {
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.a((Object) null)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public void setOnDispatchTouchEventListener(InterfaceC0053a interfaceC0053a) {
    }

    public VScrollProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1269c(context);
    }

    public VScrollProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1269c(context);
    }
}
