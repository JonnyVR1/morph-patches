package com.p051p1.mobile.putong.p070ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.h1e0;
import p153l.jyb;
import p153l.ty6;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes10.dex */
public class MultipleChatIconView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final int[] f55126d;

    /* JADX INFO: renamed from: e */
    public final List<VDraweeView> f55127e;

    /* JADX INFO: renamed from: f */
    public List<String> f55128f;

    /* JADX INFO: renamed from: g */
    public float f55129g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f55130h;

    /* JADX INFO: renamed from: i */
    public boolean f55131i;

    public MultipleChatIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55126d = new int[]{View.generateViewId(), View.generateViewId(), View.generateViewId(), View.generateViewId()};
        this.f55127e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m80575l0() {
        ValueAnimator valueAnimator = this.f55130h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f55130h = null;
        }
        setPivotX(getWidth() >> 1);
        setPivotY(getWidth() >> 1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.1f);
        this.f55130h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.su10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f170636a.m80577n0(valueAnimator2);
            }
        });
        this.f55130h.setRepeatCount(-1);
        this.f55130h.setRepeatMode(2);
        this.f55130h.setDuration(800L);
        this.f55130h.start();
    }

    /* JADX INFO: renamed from: m0 */
    private void m80576m0(boolean z) {
        if (z) {
            post(new Runnable() { // from class: l.ru10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164891a.m80575l0();
                }
            });
            return;
        }
        ValueAnimator valueAnimator = this.f55130h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f55130h = null;
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m80577n0(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setSize, reason: merged with bridge method [inline-methods] */
    public void m80578o0(boolean z) {
        if (this.f55127e.size() == 1) {
            C0223a c0223a = new C0223a();
            c0223a.m1151e(this.f55126d[0], 6, 0, 6);
            c0223a.m1151e(this.f55126d[0], 7, 0, 7);
            c0223a.m1151e(this.f55126d[0], 3, 0, 3);
            c0223a.m1151e(this.f55126d[0], 4, 0, 4);
            c0223a.m1147a(this);
        } else if (this.f55127e.size() == 2) {
            C0223a c0223a2 = new C0223a();
            c0223a2.m1155i(this.f55126d[0], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a2.m1151e(this.f55126d[0], 6, 0, 6);
            c0223a2.m1151e(this.f55126d[0], 3, 0, 3);
            c0223a2.m1151e(this.f55126d[0], 4, 0, 4);
            c0223a2.m1155i(this.f55126d[1], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a2.m1151e(this.f55126d[1], 7, 0, 7);
            c0223a2.m1151e(this.f55126d[1], 3, 0, 3);
            c0223a2.m1151e(this.f55126d[1], 4, 0, 4);
            c0223a2.m1147a(this);
        } else if (this.f55127e.size() == 3) {
            C0223a c0223a3 = new C0223a();
            c0223a3.m1155i(this.f55126d[0], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a3.m1151e(this.f55126d[0], 6, 0, 6);
            c0223a3.m1151e(this.f55126d[0], 3, 0, 3);
            c0223a3.m1151e(this.f55126d[0], 4, 0, 4);
            c0223a3.m1155i(this.f55126d[1], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a3.m1154h(this.f55126d[1], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a3.m1151e(this.f55126d[1], 7, 0, 7);
            c0223a3.m1151e(this.f55126d[1], 3, 0, 3);
            c0223a3.m1155i(this.f55126d[2], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a3.m1154h(this.f55126d[2], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a3.m1151e(this.f55126d[2], 4, 0, 4);
            c0223a3.m1151e(this.f55126d[2], 7, 0, 7);
            c0223a3.m1147a(this);
        } else if (this.f55127e.size() == 4) {
            C0223a c0223a4 = new C0223a();
            c0223a4.m1155i(this.f55126d[0], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a4.m1154h(this.f55126d[0], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a4.m1151e(this.f55126d[0], 6, 0, 6);
            c0223a4.m1151e(this.f55126d[0], 3, 0, 3);
            c0223a4.m1155i(this.f55126d[1], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a4.m1154h(this.f55126d[1], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a4.m1151e(this.f55126d[1], 7, 0, 7);
            c0223a4.m1151e(this.f55126d[1], 3, 0, 3);
            c0223a4.m1155i(this.f55126d[2], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a4.m1154h(this.f55126d[2], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a4.m1151e(this.f55126d[2], 6, 0, 6);
            c0223a4.m1151e(this.f55126d[2], 4, 0, 4);
            c0223a4.m1155i(this.f55126d[3], (int) ((this.f55129g / 2.0f) - bnl0.m105587w(0.5f)));
            c0223a4.m1154h(this.f55126d[3], (getHeight() / 2) - bnl0.m105587w(0.5f));
            c0223a4.m1151e(this.f55126d[3], 7, 0, 7);
            c0223a4.m1151e(this.f55126d[3], 4, 0, 4);
            c0223a4.m1147a(this);
        }
        m80576m0(z);
    }

    /* JADX INFO: renamed from: k0 */
    public final AutoVDraweeView m80579k0(Context context, int i, int i2) {
        RoundingParams roundingParams;
        if (i == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
        } else if (i == 2) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f = this.f55129g;
                roundingParams.m8318r(f, 0.0f, 0.0f, f);
            } else {
                roundingParams = new RoundingParams();
                float f2 = this.f55129g;
                roundingParams.m8318r(0.0f, f2, f2, 0.0f);
            }
        } else if (i == 3) {
            if (i2 == 0) {
                roundingParams = new RoundingParams();
                float f3 = this.f55129g;
                roundingParams.m8318r(f3, 0.0f, 0.0f, f3);
            } else if (i2 == 1) {
                roundingParams = new RoundingParams();
                roundingParams.m8318r(0.0f, this.f55129g, 0.0f, 0.0f);
            } else {
                roundingParams = new RoundingParams();
                roundingParams.m8318r(0.0f, 0.0f, this.f55129g, 0.0f);
            }
        } else if (i != 4) {
            roundingParams = null;
        } else if (i2 == 0) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(this.f55129g, 0.0f, 0.0f, 0.0f);
        } else if (i2 == 1) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, this.f55129g, 0.0f, 0.0f);
        } else if (i2 == 2) {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, 0.0f, 0.0f, this.f55129g);
        } else {
            roundingParams = new RoundingParams();
            roundingParams.m8318r(0.0f, 0.0f, this.f55129g, 0.0f);
        }
        wlj wljVarM211638a = xlj.m211625u(getResources()).m211658v(h1e0.f107452i).m211661y(0).m211636K(roundingParams).m211638a();
        AutoVDraweeView autoVDraweeView = new AutoVDraweeView(context);
        autoVDraweeView.setHierarchy(wljVarM211638a);
        return autoVDraweeView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f55130h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f55130h = null;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m80580p0(List<String> list, final boolean z) {
        List<String> list2 = this.f55128f;
        if (list2 != null && jyb.m147518l(list2, list, new ty6()) && this.f55131i == z) {
            m80576m0(z);
            return;
        }
        this.f55131i = z;
        this.f55128f = list;
        removeAllViews();
        this.f55127e.clear();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i < 4) {
                    AutoVDraweeView autoVDraweeViewM80579k0 = m80579k0(getContext(), list.size(), i);
                    autoVDraweeViewM80579k0.setId(this.f55126d[i]);
                    autoVDraweeViewM80579k0.setImageUrl(list.get(i));
                    this.f55127e.add(autoVDraweeViewM80579k0);
                    addView(autoVDraweeViewM80579k0, new ConstraintLayout.C0221a(0, 0));
                }
            }
        }
        post(new Runnable() { // from class: l.tu10
            @Override // java.lang.Runnable
            public final void run() {
                this.f176129a.m80578o0(z);
            }
        });
    }

    public void setRadius(float f) {
        this.f55129g = bnl0.m105587w(f) - bnl0.m105587w(0.5f);
    }

    public MultipleChatIconView(Context context) {
        this(context, null);
    }
}
