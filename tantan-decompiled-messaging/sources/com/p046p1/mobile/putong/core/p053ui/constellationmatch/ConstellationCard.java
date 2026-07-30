package com.p046p1.mobile.putong.core.p053ui.constellationmatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.ex5;
import p149l.qib0;

/* JADX INFO: loaded from: classes10.dex */
public class ConstellationCard extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f28789a;

    /* JADX INFO: renamed from: b */
    public float f28790b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8305a f28791c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationCard$a */
    public interface InterfaceC8305a {
        /* JADX INFO: renamed from: a */
        void mo44753a(View view);
    }

    public ConstellationCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f28790b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44752p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getRotation() != 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            if (NullChecker.m81303a(this.f28791c)) {
                this.f28791c.mo44753a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m44752p(View view) {
        ex5.m118576a(this, view);
    }

    public void setBg(String str) {
        qib0.f154691G.m102331L0(this.f28789a, str);
    }

    public void setBgVisibility(boolean z) {
        this.f28789a.setVisibility(z ? 0 : 4);
    }

    public void setLatestRotation(float f) {
        this.f28790b = f;
    }

    public void setListener(InterfaceC8305a interfaceC8305a) {
        this.f28791c = interfaceC8305a;
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
