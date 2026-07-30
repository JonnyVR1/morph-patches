package com.p046p1.mobile.putong.live.external.page.profile.myroomnew.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.djj;
import p149l.ejj;
import p149l.ftd0;
import p149l.hxs;
import p149l.qx6;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MultipleAvatarView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final int[] f46002d;

    /* JADX INFO: renamed from: e */
    public final List<VDraweeView> f46003e;

    /* JADX INFO: renamed from: f */
    public List<String> f46004f;

    /* JADX INFO: renamed from: g */
    public float f46005g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f46006h;

    /* JADX INFO: renamed from: i */
    public boolean f46007i;

    public MultipleAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46002d = new int[]{View.generateViewId(), View.generateViewId(), View.generateViewId(), View.generateViewId()};
        this.f46003e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSize, reason: merged with bridge method [inline-methods] */
    public void m70558o0(boolean z) {
        if (this.f46003e.size() == 1) {
            C0222a c0222a = new C0222a();
            c0222a.m1150e(this.f46002d[0], 6, 0, 6);
            c0222a.m1150e(this.f46002d[0], 7, 0, 7);
            c0222a.m1150e(this.f46002d[0], 3, 0, 3);
            c0222a.m1150e(this.f46002d[0], 4, 0, 4);
            c0222a.m1146a(this);
        } else if (this.f46003e.size() == 2) {
            C0222a c0222a2 = new C0222a();
            c0222a2.m1154i(this.f46002d[0], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a2.m1150e(this.f46002d[0], 6, 0, 6);
            c0222a2.m1150e(this.f46002d[0], 3, 0, 3);
            c0222a2.m1150e(this.f46002d[0], 4, 0, 4);
            c0222a2.m1154i(this.f46002d[1], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a2.m1150e(this.f46002d[1], 7, 0, 7);
            c0222a2.m1150e(this.f46002d[1], 3, 0, 3);
            c0222a2.m1150e(this.f46002d[1], 4, 0, 4);
            c0222a2.m1146a(this);
        } else if (this.f46003e.size() == 3) {
            C0222a c0222a3 = new C0222a();
            c0222a3.m1154i(this.f46002d[0], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a3.m1150e(this.f46002d[0], 6, 0, 6);
            c0222a3.m1150e(this.f46002d[0], 3, 0, 3);
            c0222a3.m1150e(this.f46002d[0], 4, 0, 4);
            c0222a3.m1154i(this.f46002d[1], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a3.m1153h(this.f46002d[1], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a3.m1150e(this.f46002d[1], 7, 0, 7);
            c0222a3.m1150e(this.f46002d[1], 3, 0, 3);
            c0222a3.m1154i(this.f46002d[2], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a3.m1153h(this.f46002d[2], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a3.m1150e(this.f46002d[2], 4, 0, 4);
            c0222a3.m1150e(this.f46002d[2], 7, 0, 7);
            c0222a3.m1146a(this);
        } else if (this.f46003e.size() == 4) {
            C0222a c0222a4 = new C0222a();
            c0222a4.m1154i(this.f46002d[0], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1153h(this.f46002d[0], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1150e(this.f46002d[0], 6, 0, 6);
            c0222a4.m1150e(this.f46002d[0], 3, 0, 3);
            c0222a4.m1154i(this.f46002d[1], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1153h(this.f46002d[1], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1150e(this.f46002d[1], 7, 0, 7);
            c0222a4.m1150e(this.f46002d[1], 3, 0, 3);
            c0222a4.m1154i(this.f46002d[2], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1153h(this.f46002d[2], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1150e(this.f46002d[2], 6, 0, 6);
            c0222a4.m1150e(this.f46002d[2], 4, 0, 4);
            c0222a4.m1154i(this.f46002d[3], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1153h(this.f46002d[3], (getWidth() / 2) - t100.m186890d(0.5f));
            c0222a4.m1150e(this.f46002d[3], 7, 0, 7);
            c0222a4.m1150e(this.f46002d[3], 4, 0, 4);
            c0222a4.m1146a(this);
        }
        m70556m0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public final VDraweeView m70554k0(Context context, int i, int i2) {
        RoundingParams roundingParams;
        if (i == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
        } else if (i == 2) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f = this.f46005g;
                roundingParams.m8264r(f, 0.0f, 0.0f, f);
            } else {
                roundingParams = new RoundingParams();
                float f2 = this.f46005g;
                roundingParams.m8264r(0.0f, f2, f2, 0.0f);
            }
        } else if (i == 3) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f3 = this.f46005g;
                roundingParams.m8264r(f3, 0.0f, 0.0f, f3);
            } else if (i2 == 1) {
                roundingParams = new RoundingParams();
                roundingParams.m8264r(0.0f, this.f46005g, 0.0f, 0.0f);
            } else {
                roundingParams = new RoundingParams();
                roundingParams.m8264r(0.0f, 0.0f, this.f46005g, 0.0f);
            }
        } else if (i != 4) {
            roundingParams = null;
        } else if (i2 == 0) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(this.f46005g, 0.0f, 0.0f, 0.0f);
        } else if (i2 == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, this.f46005g, 0.0f, 0.0f);
        } else if (i2 == 2) {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, 0.0f, 0.0f, this.f46005g);
        } else {
            roundingParams = new RoundingParams();
            roundingParams.m8264r(0.0f, 0.0f, this.f46005g, 0.0f);
        }
        djj djjVarM116872a = ejj.m116859u(getResources()).m116892v(ftd0.f99185i).m116895y(0).m116870K(roundingParams).m116872a();
        VDraweeView vDraweeView = new VDraweeView(context);
        vDraweeView.setHierarchy(djjVarM116872a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m70555l0() {
        ValueAnimator valueAnimator = this.f46006h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46006h = null;
        }
        setPivotX(getWidth() >> 1);
        setPivotY(getWidth() >> 1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        this.f46006h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gm10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f103420a.m70557n0(valueAnimator2);
            }
        });
        this.f46006h.setRepeatCount(-1);
        this.f46006h.setRepeatMode(2);
        this.f46006h.setDuration(800L);
        this.f46006h.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m70556m0(boolean z) {
        if (z) {
            post(new Runnable() { // from class: l.fm10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98236a.m70555l0();
                }
            });
            return;
        }
        ValueAnimator valueAnimator = this.f46006h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46006h = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m70557n0(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f46006h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46006h = null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            VDraweeView vDraweeView = (VDraweeView) findViewById(this.f46002d[i5]);
            if (vDraweeView != null) {
                hxs.m133408u("context_common", vDraweeView, this.f46004f.get(i5), vDraweeView.getMeasuredWidth(), vDraweeView.getMeasuredHeight());
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m70559p0(List<String> list, final boolean z) {
        List<String> list2 = this.f46004f;
        if (list2 != null && vwb.m200335l(list2, list, new qx6()) && this.f46007i == z) {
            m70556m0(z);
            return;
        }
        this.f46007i = z;
        this.f46004f = list;
        removeAllViews();
        this.f46003e.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < 4) {
                    VDraweeView vDraweeViewM70554k0 = m70554k0(getContext(), list.size(), i);
                    vDraweeViewM70554k0.setId(this.f46002d[i]);
                    this.f46003e.add(vDraweeViewM70554k0);
                    addView(vDraweeViewM70554k0, new ConstraintLayout.C0220a(0, 0));
                }
            }
        }
        post(new Runnable() { // from class: l.hm10
            @Override // java.lang.Runnable
            public final void run() {
                this.f108385a.m70558o0(z);
            }
        });
    }

    public void setRadius(float f) {
        this.f46005g = xdl0.m208407w(f) - t100.m186890d(0.5f);
    }

    public MultipleAvatarView(Context context) {
        this(context, null);
    }
}
