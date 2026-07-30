package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import p147v.VScroll;
import p149l.ud50;

/* JADX INFO: loaded from: classes4.dex */
public class VScrollProfile extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f33096e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VScrollProfile$a */
    public interface InterfaceC8628a extends ud50 {
    }

    public VScrollProfile(Context context) {
        super(context);
        m50823c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m50823c(Context context) {
        this.f33096e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // p147v.VScroll, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.m81303a(null)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public InterfaceC8628a getOnDispatchTouchEventListener() {
        return null;
    }

    @Override // p147v.VScroll, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.m81303a(null)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public void setOnDispatchTouchEventListener(InterfaceC8628a interfaceC8628a) {
    }

    public VScrollProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50823c(context);
    }

    public VScrollProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50823c(context);
    }
}
