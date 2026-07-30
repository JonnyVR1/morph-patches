package com.p051p1.mobile.putong.live.external.page.profile.myroomnew.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.h1e0;
import p153l.izs;
import p153l.jyb;
import p153l.qa00;
import p153l.ty6;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes9.dex */
public class MultipleAvatarView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final int[] f46850d;

    /* JADX INFO: renamed from: e */
    public final List<VDraweeView> f46851e;

    /* JADX INFO: renamed from: f */
    public List<String> f46852f;

    /* JADX INFO: renamed from: g */
    public float f46853g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f46854h;

    /* JADX INFO: renamed from: i */
    public boolean f46855i;

    public MultipleAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46850d = new int[]{View.generateViewId(), View.generateViewId(), View.generateViewId(), View.generateViewId()};
        this.f46851e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSize, reason: merged with bridge method [inline-methods] */
    public void m71741o0(boolean z) {
        if (this.f46851e.size() == 1) {
            C0223a c0223a = new C0223a();
            c0223a.m1151e(this.f46850d[0], 6, 0, 6);
            c0223a.m1151e(this.f46850d[0], 7, 0, 7);
            c0223a.m1151e(this.f46850d[0], 3, 0, 3);
            c0223a.m1151e(this.f46850d[0], 4, 0, 4);
            c0223a.m1147a(this);
        } else if (this.f46851e.size() == 2) {
            C0223a c0223a2 = new C0223a();
            c0223a2.m1155i(this.f46850d[0], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a2.m1151e(this.f46850d[0], 6, 0, 6);
            c0223a2.m1151e(this.f46850d[0], 3, 0, 3);
            c0223a2.m1151e(this.f46850d[0], 4, 0, 4);
            c0223a2.m1155i(this.f46850d[1], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a2.m1151e(this.f46850d[1], 7, 0, 7);
            c0223a2.m1151e(this.f46850d[1], 3, 0, 3);
            c0223a2.m1151e(this.f46850d[1], 4, 0, 4);
            c0223a2.m1147a(this);
        } else if (this.f46851e.size() == 3) {
            C0223a c0223a3 = new C0223a();
            c0223a3.m1155i(this.f46850d[0], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a3.m1151e(this.f46850d[0], 6, 0, 6);
            c0223a3.m1151e(this.f46850d[0], 3, 0, 3);
            c0223a3.m1151e(this.f46850d[0], 4, 0, 4);
            c0223a3.m1155i(this.f46850d[1], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a3.m1154h(this.f46850d[1], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a3.m1151e(this.f46850d[1], 7, 0, 7);
            c0223a3.m1151e(this.f46850d[1], 3, 0, 3);
            c0223a3.m1155i(this.f46850d[2], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a3.m1154h(this.f46850d[2], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a3.m1151e(this.f46850d[2], 4, 0, 4);
            c0223a3.m1151e(this.f46850d[2], 7, 0, 7);
            c0223a3.m1147a(this);
        } else if (this.f46851e.size() == 4) {
            C0223a c0223a4 = new C0223a();
            c0223a4.m1155i(this.f46850d[0], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1154h(this.f46850d[0], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1151e(this.f46850d[0], 6, 0, 6);
            c0223a4.m1151e(this.f46850d[0], 3, 0, 3);
            c0223a4.m1155i(this.f46850d[1], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1154h(this.f46850d[1], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1151e(this.f46850d[1], 7, 0, 7);
            c0223a4.m1151e(this.f46850d[1], 3, 0, 3);
            c0223a4.m1155i(this.f46850d[2], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1154h(this.f46850d[2], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1151e(this.f46850d[2], 6, 0, 6);
            c0223a4.m1151e(this.f46850d[2], 4, 0, 4);
            c0223a4.m1155i(this.f46850d[3], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1154h(this.f46850d[3], (getWidth() / 2) - qa00.m175859d(0.5f));
            c0223a4.m1151e(this.f46850d[3], 7, 0, 7);
            c0223a4.m1151e(this.f46850d[3], 4, 0, 4);
            c0223a4.m1147a(this);
        }
        m71739m0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public final VDraweeView m71737k0(Context context, int i, int i2) {
        RoundingParams roundingParams;
        if (i == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
        } else if (i == 2) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f = this.f46853g;
                roundingParams.m8318r(f, 0.0f, 0.0f, f);
            } else {
                roundingParams = new RoundingParams();
                float f2 = this.f46853g;
                roundingParams.m8318r(0.0f, f2, f2, 0.0f);
            }
        } else if (i == 3) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f3 = this.f46853g;
                roundingParams.m8318r(f3, 0.0f, 0.0f, f3);
            } else if (i2 == 1) {
                roundingParams = new RoundingParams();
                roundingParams.m8318r(0.0f, this.f46853g, 0.0f, 0.0f);
            } else {
                roundingParams = new RoundingParams();
                roundingParams.m8318r(0.0f, 0.0f, this.f46853g, 0.0f);
            }
        } else if (i != 4) {
            roundingParams = null;
        } else if (i2 == 0) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(this.f46853g, 0.0f, 0.0f, 0.0f);
        } else if (i2 == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, this.f46853g, 0.0f, 0.0f);
        } else if (i2 == 2) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, 0.0f, 0.0f, this.f46853g);
        } else {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, 0.0f, this.f46853g, 0.0f);
        }
        wlj wljVarM211638a = xlj.m211625u(getResources()).m211658v(h1e0.f107452i).m211661y(0).m211636K(roundingParams).m211638a();
        VDraweeView vDraweeView = new VDraweeView(context);
        vDraweeView.setHierarchy(wljVarM211638a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m71738l0() {
        ValueAnimator valueAnimator = this.f46854h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46854h = null;
        }
        setPivotX(getWidth() >> 1);
        setPivotY(getWidth() >> 1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        this.f46854h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ou10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f149045a.m71740n0(valueAnimator2);
            }
        });
        this.f46854h.setRepeatCount(-1);
        this.f46854h.setRepeatMode(2);
        this.f46854h.setDuration(800L);
        this.f46854h.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m71739m0(boolean z) {
        if (z) {
            post(new Runnable() { // from class: l.nu10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143664a.m71738l0();
                }
            });
            return;
        }
        ValueAnimator valueAnimator = this.f46854h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46854h = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m71740n0(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f46854h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46854h = null;
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
            VDraweeView vDraweeView = (VDraweeView) findViewById(this.f46850d[i5]);
            if (vDraweeView != null) {
                izs.m142870u("context_common", vDraweeView, this.f46852f.get(i5), vDraweeView.getMeasuredWidth(), vDraweeView.getMeasuredHeight());
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m71742p0(List<String> list, final boolean z) {
        List<String> list2 = this.f46852f;
        if (list2 != null && jyb.m147518l(list2, list, new ty6()) && this.f46855i == z) {
            m71739m0(z);
            return;
        }
        this.f46855i = z;
        this.f46852f = list;
        removeAllViews();
        this.f46851e.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < 4) {
                    VDraweeView vDraweeViewM71737k0 = m71737k0(getContext(), list.size(), i);
                    vDraweeViewM71737k0.setId(this.f46850d[i]);
                    this.f46851e.add(vDraweeViewM71737k0);
                    addView(vDraweeViewM71737k0, new ConstraintLayout.C0221a(0, 0));
                }
            }
        }
        post(new Runnable() { // from class: l.pu10
            @Override // java.lang.Runnable
            public final void run() {
                this.f154133a.m71741o0(z);
            }
        });
    }

    public void setRadius(float f) {
        this.f46853g = bnl0.m105587w(f) - qa00.m175859d(0.5f);
    }

    public MultipleAvatarView(Context context) {
        this(context, null);
    }
}
