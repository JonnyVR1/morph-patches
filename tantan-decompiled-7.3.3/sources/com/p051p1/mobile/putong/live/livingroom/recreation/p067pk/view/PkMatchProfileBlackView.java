package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.mdc0;
import p153l.obc0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchProfileBlackView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52551a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52552b;

    /* JADX INFO: renamed from: c */
    public VImage f52553c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<Integer> f52554d;

    /* JADX INFO: renamed from: e */
    public int f52555e;

    /* JADX INFO: renamed from: f */
    public boolean f52556f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f52557g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkMatchProfileBlackView$a */
    public class C13074a implements Animator.AnimatorListener {
        public C13074a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PkMatchProfileBlackView.this.f52551a.getVisibility() != 0) {
                return;
            }
            PkMatchProfileBlackView pkMatchProfileBlackView = PkMatchProfileBlackView.this;
            pkMatchProfileBlackView.f52555e = pkMatchProfileBlackView.f52555e + 1 >= PkMatchProfileBlackView.this.f52554d.size() ? 0 : PkMatchProfileBlackView.this.f52555e + 1;
            boolean z = PkMatchProfileBlackView.this.f52556f;
            PkMatchProfileBlackView pkMatchProfileBlackView2 = PkMatchProfileBlackView.this;
            if (z) {
                pkMatchProfileBlackView2.f52551a.setActualImageResource(PkMatchProfileBlackView.this.getNextPic());
            } else {
                pkMatchProfileBlackView2.f52552b.setActualImageResource(PkMatchProfileBlackView.this.getNextPic());
            }
            PkMatchProfileBlackView pkMatchProfileBlackView3 = PkMatchProfileBlackView.this;
            pkMatchProfileBlackView3.f52556f = !pkMatchProfileBlackView3.f52556f;
            PkMatchProfileBlackView.this.f52557g.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public PkMatchProfileBlackView(@NonNull Context context) {
        super(context);
        this.f52554d = new ArrayList<>();
        this.f52556f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNextPic() {
        if (this.f52555e < 0 || this.f52554d.size() <= 1) {
            return 0;
        }
        int i = this.f52555e + 1;
        int size = this.f52554d.size();
        ArrayList<Integer> arrayList = this.f52554d;
        return i >= size ? arrayList.get(0).intValue() : arrayList.get(this.f52555e + 1).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m77378k() {
        this.f52551a.setActualImageResource(this.f52554d.get(this.f52555e).intValue());
        this.f52552b.setActualImageResource(getNextPic());
        ValueAnimator valueAnimator = this.f52557g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52557g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r380
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f161016a.m77379l(valueAnimator2);
            }
        });
        this.f52557g.addListener(new C13074a());
        this.f52557g.setDuration(1500L);
        this.f52557g.start();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m77379l(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1.0f - fFloatValue;
        if (f > 1.0f) {
            return;
        }
        boolean z = this.f52556f;
        VDraweeView vDraweeView = this.f52551a;
        if (z) {
            vDraweeView.setAlpha(f);
            this.f52552b.setAlpha(fFloatValue);
        } else {
            vDraweeView.setAlpha(fFloatValue);
            this.f52552b.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m77380m() {
        this.f52553c.setScaleX(0.0f);
        gt0.m132166l(this.f52553c, gt0.f106354i, 0L, 400L, new LinearInterpolator(), 0.0f, 1.0f).start();
    }

    /* JADX INFO: renamed from: n */
    public void m77381n() {
        this.f52557g.cancel();
        bnl0.m105524M(this.f52553c, true);
        bnl0.m105525M0(this, true);
        m77380m();
    }

    /* JADX INFO: renamed from: o */
    public void m77382o() {
        m77385r();
        m77381n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f52557g.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52551a = (VDraweeView) findViewById(mdc0.f136082W0);
        this.f52552b = (VDraweeView) findViewById(mdc0.f136202i4);
        VImage vImage = (VImage) findViewById(mdc0.f136355z1);
        this.f52553c = vImage;
        bnl0.m105524M(vImage, false);
        this.f52554d.add(Integer.valueOf(obc0.f146331f5));
        this.f52554d.add(Integer.valueOf(obc0.f146343g5));
        this.f52554d.add(Integer.valueOf(obc0.f146355h5));
        this.f52554d.add(Integer.valueOf(obc0.f146367i5));
        this.f52554d.add(Integer.valueOf(obc0.f146379j5));
        m77378k();
    }

    /* JADX INFO: renamed from: p */
    public void m77383p() {
        m77385r();
    }

    /* JADX INFO: renamed from: q */
    public void m77384q() {
        this.f52557g.start();
        bnl0.m105524M(this.f52553c, false);
        bnl0.m105524M(this.f52551a, true);
        bnl0.m105524M(this.f52552b, true);
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: r */
    public void m77385r() {
        bnl0.m105524M(this.f52551a, false);
        bnl0.m105524M(this.f52552b, false);
        this.f52557g.cancel();
    }

    public PkMatchProfileBlackView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52554d = new ArrayList<>();
        this.f52556f = true;
    }

    public PkMatchProfileBlackView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52554d = new ArrayList<>();
        this.f52556f = true;
    }
}
