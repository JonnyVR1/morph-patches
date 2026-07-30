package com.p000p1.mobile.putong.p004ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.List;
import l.djj;
import l.ejj;
import l.ftd0;
import l.qx6;
import l.vwb;
import l.xdl0;
import v.AutoVDraweeView;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MultipleChatIconView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final int[] f7884d;

    /* JADX INFO: renamed from: e */
    public final List<VDraweeView> f7885e;

    /* JADX INFO: renamed from: f */
    public List<String> f7886f;

    /* JADX INFO: renamed from: g */
    public float f7887g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f7888h;

    /* JADX INFO: renamed from: i */
    public boolean f7889i;

    public MultipleChatIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7884d = new int[]{View.generateViewId(), View.generateViewId(), View.generateViewId(), View.generateViewId()};
        this.f7885e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m9713l0() {
        ValueAnimator valueAnimator = this.f7888h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7888h = null;
        }
        setPivotX(getWidth() >> 1);
        setPivotY(getWidth() >> 1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        this.f7888h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.km10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f15761a.m9715n0(valueAnimator2);
            }
        });
        this.f7888h.setRepeatCount(-1);
        this.f7888h.setRepeatMode(2);
        this.f7888h.setDuration(800L);
        this.f7888h.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    private void m9714m0(boolean z) {
        if (z) {
            post(new Runnable() { // from class: l.jm10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15223a.m9713l0();
                }
            });
            return;
        }
        ValueAnimator valueAnimator = this.f7888h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7888h = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m9715n0(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setSize, reason: merged with bridge method [inline-methods] */
    public void m9716o0(boolean z) {
        if (this.f7885e.size() == 1) {
            a aVar = new a();
            aVar.e(this.f7884d[0], 6, 0, 6);
            aVar.e(this.f7884d[0], 7, 0, 7);
            aVar.e(this.f7884d[0], 3, 0, 3);
            aVar.e(this.f7884d[0], 4, 0, 4);
            aVar.a(this);
        } else if (this.f7885e.size() == 2) {
            a aVar2 = new a();
            aVar2.i(this.f7884d[0], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar2.e(this.f7884d[0], 6, 0, 6);
            aVar2.e(this.f7884d[0], 3, 0, 3);
            aVar2.e(this.f7884d[0], 4, 0, 4);
            aVar2.i(this.f7884d[1], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar2.e(this.f7884d[1], 7, 0, 7);
            aVar2.e(this.f7884d[1], 3, 0, 3);
            aVar2.e(this.f7884d[1], 4, 0, 4);
            aVar2.a(this);
        } else if (this.f7885e.size() == 3) {
            a aVar3 = new a();
            aVar3.i(this.f7884d[0], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar3.e(this.f7884d[0], 6, 0, 6);
            aVar3.e(this.f7884d[0], 3, 0, 3);
            aVar3.e(this.f7884d[0], 4, 0, 4);
            aVar3.i(this.f7884d[1], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar3.h(this.f7884d[1], (getHeight() / 2) - xdl0.w(0.5f));
            aVar3.e(this.f7884d[1], 7, 0, 7);
            aVar3.e(this.f7884d[1], 3, 0, 3);
            aVar3.i(this.f7884d[2], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar3.h(this.f7884d[2], (getHeight() / 2) - xdl0.w(0.5f));
            aVar3.e(this.f7884d[2], 4, 0, 4);
            aVar3.e(this.f7884d[2], 7, 0, 7);
            aVar3.a(this);
        } else if (this.f7885e.size() == 4) {
            a aVar4 = new a();
            aVar4.i(this.f7884d[0], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar4.h(this.f7884d[0], (getHeight() / 2) - xdl0.w(0.5f));
            aVar4.e(this.f7884d[0], 6, 0, 6);
            aVar4.e(this.f7884d[0], 3, 0, 3);
            aVar4.i(this.f7884d[1], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar4.h(this.f7884d[1], (getHeight() / 2) - xdl0.w(0.5f));
            aVar4.e(this.f7884d[1], 7, 0, 7);
            aVar4.e(this.f7884d[1], 3, 0, 3);
            aVar4.i(this.f7884d[2], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar4.h(this.f7884d[2], (getHeight() / 2) - xdl0.w(0.5f));
            aVar4.e(this.f7884d[2], 6, 0, 6);
            aVar4.e(this.f7884d[2], 4, 0, 4);
            aVar4.i(this.f7884d[3], (int) ((this.f7887g / 2.0f) - xdl0.w(0.5f)));
            aVar4.h(this.f7884d[3], (getHeight() / 2) - xdl0.w(0.5f));
            aVar4.e(this.f7884d[3], 7, 0, 7);
            aVar4.e(this.f7884d[3], 4, 0, 4);
            aVar4.a(this);
        }
        m9714m0(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final AutoVDraweeView m9717k0(Context context, int i, int i2) {
        RoundingParams roundingParams;
        if (i == 1) {
            roundingParams = new RoundingParams();
            roundingParams.v(true);
        } else if (i == 2) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f = this.f7887g;
                roundingParams.r(f, 0.0f, 0.0f, f);
            } else {
                roundingParams = new RoundingParams();
                float f2 = this.f7887g;
                roundingParams.r(0.0f, f2, f2, 0.0f);
            }
        } else if (i == 3) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f3 = this.f7887g;
                roundingParams.r(f3, 0.0f, 0.0f, f3);
            } else if (i2 == 1) {
                roundingParams = new RoundingParams();
                roundingParams.r(0.0f, this.f7887g, 0.0f, 0.0f);
            } else {
                roundingParams = new RoundingParams();
                roundingParams.r(0.0f, 0.0f, this.f7887g, 0.0f);
            }
        } else if (i != 4) {
            roundingParams = null;
        } else if (i2 == 0) {
            roundingParams = new RoundingParams();
            roundingParams.r(this.f7887g, 0.0f, 0.0f, 0.0f);
        } else if (i2 == 1) {
            roundingParams = new RoundingParams();
            roundingParams.r(0.0f, this.f7887g, 0.0f, 0.0f);
        } else if (i2 == 2) {
            roundingParams = new RoundingParams();
            roundingParams.r(0.0f, 0.0f, 0.0f, this.f7887g);
        } else {
            roundingParams = new RoundingParams();
            roundingParams.r(0.0f, 0.0f, this.f7887g, 0.0f);
        }
        djj djjVarA = ejj.u(getResources()).v(ftd0.i).y(0).K(roundingParams).a();
        AutoVDraweeView autoVDraweeView = new AutoVDraweeView(context);
        autoVDraweeView.setHierarchy(djjVarA);
        return autoVDraweeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7888h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7888h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public void m9718p0(List<String> list, final boolean z) {
        List<String> list2 = this.f7886f;
        if (list2 != null && vwb.l(list2, list, new qx6()) && this.f7889i == z) {
            m9714m0(z);
            return;
        }
        this.f7889i = z;
        this.f7886f = list;
        removeAllViews();
        this.f7885e.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < 4) {
                    VDraweeView vDraweeViewM9717k0 = m9717k0(getContext(), list.size(), i);
                    vDraweeViewM9717k0.setId(this.f7884d[i]);
                    vDraweeViewM9717k0.setImageUrl(list.get(i));
                    this.f7885e.add(vDraweeViewM9717k0);
                    addView(vDraweeViewM9717k0, new ConstraintLayout.a(0, 0));
                }
            }
        }
        post(new Runnable() { // from class: l.lm10
            @Override // java.lang.Runnable
            public final void run() {
                this.f16254a.m9716o0(z);
            }
        });
    }

    public void setRadius(float f) {
        this.f7887g = xdl0.w(f) - xdl0.w(0.5f);
    }

    public MultipleChatIconView(Context context) {
        this(context, null);
    }
}
