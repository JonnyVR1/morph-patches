package com.p046p1.mobile.putong.p065ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p149l.djj;
import p149l.ejj;
import p149l.ftd0;
import p149l.qx6;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class MultipleChatIconView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final int[] f54278d;

    /* JADX INFO: renamed from: e */
    public final List<VDraweeView> f54279e;

    /* JADX INFO: renamed from: f */
    public List<String> f54280f;

    /* JADX INFO: renamed from: g */
    public float f54281g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f54282h;

    /* JADX INFO: renamed from: i */
    public boolean f54283i;

    public MultipleChatIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54278d = new int[]{View.generateViewId(), View.generateViewId(), View.generateViewId(), View.generateViewId()};
        this.f54279e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m79392l0() {
        ValueAnimator valueAnimator = this.f54282h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54282h = null;
        }
        setPivotX(getWidth() >> 1);
        setPivotY(getWidth() >> 1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        this.f54282h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.km10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f123731a.m79394n0(valueAnimator2);
            }
        });
        this.f54282h.setRepeatCount(-1);
        this.f54282h.setRepeatMode(2);
        this.f54282h.setDuration(800L);
        this.f54282h.start();
    }

    /* JADX INFO: renamed from: m0 */
    private void m79393m0(boolean z) {
        if (z) {
            post(new Runnable() { // from class: l.jm10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118608a.m79392l0();
                }
            });
            return;
        }
        ValueAnimator valueAnimator = this.f54282h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54282h = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m79394n0(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSize, reason: merged with bridge method [inline-methods] */
    public void m79395o0(boolean z) {
        if (this.f54279e.size() == 1) {
            C0222a c0222a = new C0222a();
            c0222a.m1150e(this.f54278d[0], 6, 0, 6);
            c0222a.m1150e(this.f54278d[0], 7, 0, 7);
            c0222a.m1150e(this.f54278d[0], 3, 0, 3);
            c0222a.m1150e(this.f54278d[0], 4, 0, 4);
            c0222a.m1146a(this);
        } else if (this.f54279e.size() == 2) {
            C0222a c0222a2 = new C0222a();
            c0222a2.m1154i(this.f54278d[0], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a2.m1150e(this.f54278d[0], 6, 0, 6);
            c0222a2.m1150e(this.f54278d[0], 3, 0, 3);
            c0222a2.m1150e(this.f54278d[0], 4, 0, 4);
            c0222a2.m1154i(this.f54278d[1], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a2.m1150e(this.f54278d[1], 7, 0, 7);
            c0222a2.m1150e(this.f54278d[1], 3, 0, 3);
            c0222a2.m1150e(this.f54278d[1], 4, 0, 4);
            c0222a2.m1146a(this);
        } else if (this.f54279e.size() == 3) {
            C0222a c0222a3 = new C0222a();
            c0222a3.m1154i(this.f54278d[0], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a3.m1150e(this.f54278d[0], 6, 0, 6);
            c0222a3.m1150e(this.f54278d[0], 3, 0, 3);
            c0222a3.m1150e(this.f54278d[0], 4, 0, 4);
            c0222a3.m1154i(this.f54278d[1], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a3.m1153h(this.f54278d[1], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a3.m1150e(this.f54278d[1], 7, 0, 7);
            c0222a3.m1150e(this.f54278d[1], 3, 0, 3);
            c0222a3.m1154i(this.f54278d[2], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a3.m1153h(this.f54278d[2], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a3.m1150e(this.f54278d[2], 4, 0, 4);
            c0222a3.m1150e(this.f54278d[2], 7, 0, 7);
            c0222a3.m1146a(this);
        } else if (this.f54279e.size() == 4) {
            C0222a c0222a4 = new C0222a();
            c0222a4.m1154i(this.f54278d[0], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a4.m1153h(this.f54278d[0], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a4.m1150e(this.f54278d[0], 6, 0, 6);
            c0222a4.m1150e(this.f54278d[0], 3, 0, 3);
            c0222a4.m1154i(this.f54278d[1], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a4.m1153h(this.f54278d[1], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a4.m1150e(this.f54278d[1], 7, 0, 7);
            c0222a4.m1150e(this.f54278d[1], 3, 0, 3);
            c0222a4.m1154i(this.f54278d[2], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a4.m1153h(this.f54278d[2], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a4.m1150e(this.f54278d[2], 6, 0, 6);
            c0222a4.m1150e(this.f54278d[2], 4, 0, 4);
            c0222a4.m1154i(this.f54278d[3], (int) ((this.f54281g / 2.0f) - xdl0.m208407w(0.5f)));
            c0222a4.m1153h(this.f54278d[3], (getHeight() / 2) - xdl0.m208407w(0.5f));
            c0222a4.m1150e(this.f54278d[3], 7, 0, 7);
            c0222a4.m1150e(this.f54278d[3], 4, 0, 4);
            c0222a4.m1146a(this);
        }
        m79393m0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public final AutoVDraweeView m79396k0(Context context, int i, int i2) {
        RoundingParams roundingParams;
        if (i == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
        } else if (i == 2) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f = this.f54281g;
                roundingParams.m8264r(f, 0.0f, 0.0f, f);
            } else {
                roundingParams = new RoundingParams();
                float f2 = this.f54281g;
                roundingParams.m8264r(0.0f, f2, f2, 0.0f);
            }
        } else if (i == 3) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f3 = this.f54281g;
                roundingParams.m8264r(f3, 0.0f, 0.0f, f3);
            } else if (i2 == 1) {
                roundingParams = new RoundingParams();
                roundingParams.m8264r(0.0f, this.f54281g, 0.0f, 0.0f);
            } else {
                roundingParams = new RoundingParams();
                roundingParams.m8264r(0.0f, 0.0f, this.f54281g, 0.0f);
            }
        } else if (i != 4) {
            roundingParams = null;
        } else if (i2 == 0) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(this.f54281g, 0.0f, 0.0f, 0.0f);
        } else if (i2 == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, this.f54281g, 0.0f, 0.0f);
        } else if (i2 == 2) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, 0.0f, 0.0f, this.f54281g);
        } else {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, 0.0f, this.f54281g, 0.0f);
        }
        djj djjVarM116872a = ejj.m116859u(getResources()).m116892v(ftd0.f99185i).m116895y(0).m116870K(roundingParams).m116872a();
        AutoVDraweeView autoVDraweeView = new AutoVDraweeView(context);
        autoVDraweeView.setHierarchy(djjVarM116872a);
        return autoVDraweeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f54282h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54282h = null;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m79397p0(List<String> list, final boolean z) {
        List<String> list2 = this.f54280f;
        if (list2 != null && vwb.m200335l(list2, list, new qx6()) && this.f54283i == z) {
            m79393m0(z);
            return;
        }
        this.f54283i = z;
        this.f54280f = list;
        removeAllViews();
        this.f54279e.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < 4) {
                    AutoVDraweeView autoVDraweeViewM79396k0 = m79396k0(getContext(), list.size(), i);
                    autoVDraweeViewM79396k0.setId(this.f54278d[i]);
                    autoVDraweeViewM79396k0.setImageUrl(list.get(i));
                    this.f54279e.add(autoVDraweeViewM79396k0);
                    addView(autoVDraweeViewM79396k0, new ConstraintLayout.C0220a(0, 0));
                }
            }
        }
        post(new Runnable() { // from class: l.lm10
            @Override // java.lang.Runnable
            public final void run() {
                this.f128767a.m79395o0(z);
            }
        });
    }

    public void setRadius(float f) {
        this.f54281g = xdl0.m208407w(f) - xdl0.m208407w(0.5f);
    }

    public MultipleChatIconView(Context context) {
        this(context, null);
    }
}
