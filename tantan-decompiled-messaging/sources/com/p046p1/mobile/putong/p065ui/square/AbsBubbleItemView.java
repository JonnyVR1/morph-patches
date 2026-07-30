package com.p046p1.mobile.putong.p065ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.gf3;
import p149l.je50;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbsBubbleItemView<D extends gf3> extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final AnticipateOvershootInterpolator f54737c = new AnticipateOvershootInterpolator(0.68f);

    /* JADX INFO: renamed from: a */
    public D f54738a;

    /* JADX INFO: renamed from: b */
    public je50 f54739b;

    public AbsBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m80116a(float f) {
        this.f54738a.f102325c = f < 1.0f;
        float interpolation = f54737c.getInterpolation(f);
        getAnimLayout().setPivotX(getAnimLayout().getWidth());
        getAnimLayout().setPivotY(0.0f);
        getAnimLayout().setScaleX(interpolation);
        getAnimLayout().setScaleY(interpolation);
    }

    /* JADX INFO: renamed from: b */
    public void m80117b(boolean z) {
        mo54563c(this.f54738a.f102324b && z && getAnimLayout().getScaleY() >= 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo54563c(boolean z);

    /* JADX INFO: renamed from: d */
    public void m80118d(D d, je50 je50Var) {
        this.f54738a = d;
        this.f54739b = je50Var;
        if (d == null) {
            return;
        }
        setAlpha(d.f102326d ? 0.3f : 1.0f);
        m80117b(this.f54738a.f102324b);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo54564e(float f);

    /* JADX INFO: renamed from: f */
    public void m80119f() {
        this.f54738a.f102326d = true;
        if (NullChecker.m81303a(this.f54739b)) {
            this.f54739b.mo141101a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m80120g(float f, boolean z) {
        D d = this.f54738a;
        if (d == null) {
            return;
        }
        if (!z) {
            d.f102325c = false;
        }
        if (!d.f102325c) {
            mo54564e(f);
        }
        if (f >= 0.5f) {
            m80117b(true);
        } else {
            m80117b(false);
        }
    }

    public abstract View getAnimLayout();

    public D getDataWrapper() {
        return this.f54738a;
    }

    public void setShowContent(Boolean bool) {
        this.f54738a.f102324b = bool.booleanValue();
        if (NullChecker.m81303a(this.f54739b)) {
            this.f54739b.mo141101a();
        }
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
