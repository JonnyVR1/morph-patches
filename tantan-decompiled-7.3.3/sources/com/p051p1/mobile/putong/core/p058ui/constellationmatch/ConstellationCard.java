package com.p051p1.mobile.putong.core.p058ui.constellationmatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.jy5;
import p153l.uqb0;

/* JADX INFO: loaded from: classes10.dex */
public class ConstellationCard extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29637a;

    /* JADX INFO: renamed from: b */
    public float f29638b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8468a f29639c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationCard$a */
    public interface InterfaceC8468a {
        /* JADX INFO: renamed from: a */
        void mo45936a(View view);
    }

    public ConstellationCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f29638b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45935p(this);
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
            if (NullChecker.m82486a(this.f29639c)) {
                this.f29639c.mo45936a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m45935p(View view) {
        jy5.m147467a(this, view);
    }

    public void setBg(String str) {
        uqb0.f180374G.m127115L0(this.f29637a, str);
    }

    public void setBgVisibility(boolean z) {
        this.f29637a.setVisibility(z ? 0 : 4);
    }

    public void setLatestRotation(float f) {
        this.f29638b = f;
    }

    public void setListener(InterfaceC8468a interfaceC8468a) {
        this.f29639c = interfaceC8468a;
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstellationCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
