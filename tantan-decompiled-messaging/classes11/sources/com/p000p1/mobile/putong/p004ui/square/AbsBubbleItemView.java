package com.p000p1.mobile.putong.p004ui.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import p009l.gf3;
import p009l.je50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbsBubbleItemView<D extends gf3> extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final AnticipateOvershootInterpolator f8343c = new AnticipateOvershootInterpolator(0.68f);

    /* JADX INFO: renamed from: a */
    public D f8344a;

    /* JADX INFO: renamed from: b */
    public je50 f8345b;

    public AbsBubbleItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m10445a(float f) {
        this.f8344a.f13501c = f < 1.0f;
        float interpolation = f8343c.getInterpolation(f);
        getAnimLayout().setPivotX(getAnimLayout().getWidth());
        getAnimLayout().setPivotY(0.0f);
        getAnimLayout().setScaleX(interpolation);
        getAnimLayout().setScaleY(interpolation);
    }

    /* JADX INFO: renamed from: b */
    public void m10446b(boolean z) {
        m10447c(this.f8344a.f13500b && z && getAnimLayout().getScaleY() >= 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public abstract void m10447c(boolean z);

    /* JADX INFO: renamed from: d */
    public void m10448d(D d, je50 je50Var) {
        this.f8344a = d;
        this.f8345b = je50Var;
        if (d == null) {
            return;
        }
        setAlpha(d.f13502d ? 0.3f : 1.0f);
        m10446b(this.f8344a.f13500b);
    }

    /* JADX INFO: renamed from: e */
    public abstract void m10449e(float f);

    /* JADX INFO: renamed from: f */
    public void m10450f() {
        this.f8344a.f13502d = true;
        if (NullChecker.a(this.f8345b)) {
            this.f8345b.m16943a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10451g(float f, boolean z) {
        D d = this.f8344a;
        if (d == null) {
            return;
        }
        if (!z) {
            d.f13501c = false;
        }
        if (!d.f13501c) {
            m10449e(f);
        }
        if (f >= 0.5f) {
            m10446b(true);
        } else {
            m10446b(false);
        }
    }

    public abstract View getAnimLayout();

    public D getDataWrapper() {
        return this.f8344a;
    }

    public void setShowContent(Boolean bool) {
        this.f8344a.f13500b = bool.booleanValue();
        if (NullChecker.a(this.f8345b)) {
            this.f8345b.m16943a();
        }
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsBubbleItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
