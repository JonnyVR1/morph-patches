package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;
import p151v.VScroll;
import p153l.bm50;

/* JADX INFO: loaded from: classes4.dex */
public class VScrollProfile extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f33944e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VScrollProfile$a */
    public interface InterfaceC8791a extends bm50 {
    }

    public VScrollProfile(Context context) {
        super(context);
        m52006c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m52006c(Context context) {
        this.f33944e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // p151v.VScroll, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.m82486a(null)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public InterfaceC8791a getOnDispatchTouchEventListener() {
        return null;
    }

    @Override // p151v.VScroll, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getOnDispatchTouchEventListener();
        if (!NullChecker.m82486a(null)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        getOnDispatchTouchEventListener();
        throw null;
    }

    public void setOnDispatchTouchEventListener(InterfaceC8791a interfaceC8791a) {
    }

    public VScrollProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m52006c(context);
    }

    public VScrollProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52006c(context);
    }
}
