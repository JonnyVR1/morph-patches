package com.p000p1.mobile.putong.core.p001ui.constellationmatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.qib0;
import p003l.ex5;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ConstellationCard extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1183a;

    /* JADX INFO: renamed from: b */
    public float f1184b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3080a f1185c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationCard$a */
    public interface InterfaceC3080a {
        /* JADX INFO: renamed from: a */
        void mo2067a(View view);
    }

    public ConstellationCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f1184b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2066p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getRotation() != 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            if (NullChecker.a(this.f1185c)) {
                this.f1185c.mo2067a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2066p(View view) {
        ex5.m6355a(this, view);
    }

    public void setBg(String str) {
        qib0.G.L0(this.f1183a, str);
    }

    public void setBgVisibility(boolean z) {
        this.f1183a.setVisibility(z ? 0 : 4);
    }

    public void setLatestRotation(float f) {
        this.f1184b = f;
    }

    public void setListener(InterfaceC3080a interfaceC3080a) {
        this.f1185c = interfaceC3080a;
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
