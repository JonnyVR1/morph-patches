package com.p051p1.mobile.putong.p070ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.qm50;
import p153l.uf3;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbsBubbleItemView<D extends uf3> extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final AnticipateOvershootInterpolator f55585c = new AnticipateOvershootInterpolator(0.68f);

    /* JADX INFO: renamed from: a */
    public D f55586a;

    /* JADX INFO: renamed from: b */
    public qm50 f55587b;

    public AbsBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m81299a(float f) {
        this.f55586a.f178731c = f < 1.0f;
        float interpolation = f55585c.getInterpolation(f);
        getAnimLayout().setPivotX(getAnimLayout().getWidth());
        getAnimLayout().setPivotY(0.0f);
        getAnimLayout().setScaleX(interpolation);
        getAnimLayout().setScaleY(interpolation);
    }

    /* JADX INFO: renamed from: b */
    public void m81300b(boolean z) {
        mo55746c(this.f55586a.f178730b && z && getAnimLayout().getScaleY() >= 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo55746c(boolean z);

    /* JADX INFO: renamed from: d */
    public void m81301d(D d, qm50 qm50Var) {
        this.f55586a = d;
        this.f55587b = qm50Var;
        if (d == null) {
            return;
        }
        setAlpha(d.f178732d ? 0.3f : 1.0f);
        m81300b(this.f55586a.f178730b);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo55747e(float f);

    /* JADX INFO: renamed from: f */
    public void m81302f() {
        this.f55586a.f178732d = true;
        if (NullChecker.m82486a(this.f55587b)) {
            this.f55587b.mo118859a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m81303g(float f, boolean z) {
        D d = this.f55586a;
        if (d == null) {
            return;
        }
        if (!z) {
            d.f178731c = false;
        }
        if (!d.f178731c) {
            mo55747e(f);
        }
        if (f >= 0.5f) {
            m81300b(true);
        } else {
            m81300b(false);
        }
    }

    public abstract View getAnimLayout();

    public D getDataWrapper() {
        return this.f55586a;
    }

    public void setShowContent(Boolean bool) {
        this.f55586a.f178730b = bool.booleanValue();
        if (NullChecker.m82486a(this.f55587b)) {
            this.f55587b.mo118859a();
        }
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
