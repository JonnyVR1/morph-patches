package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.g5c0;
import p149l.i3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchProfileBlackView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51703a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51704b;

    /* JADX INFO: renamed from: c */
    public VImage f51705c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<Integer> f51706d;

    /* JADX INFO: renamed from: e */
    public int f51707e;

    /* JADX INFO: renamed from: f */
    public boolean f51708f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f51709g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkMatchProfileBlackView$a */
    public class C12911a implements Animator.AnimatorListener {
        public C12911a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PkMatchProfileBlackView.this.f51703a.getVisibility() != 0) {
                return;
            }
            PkMatchProfileBlackView pkMatchProfileBlackView = PkMatchProfileBlackView.this;
            pkMatchProfileBlackView.f51707e = pkMatchProfileBlackView.f51707e + 1 >= PkMatchProfileBlackView.this.f51706d.size() ? 0 : PkMatchProfileBlackView.this.f51707e + 1;
            boolean z = PkMatchProfileBlackView.this.f51708f;
            PkMatchProfileBlackView pkMatchProfileBlackView2 = PkMatchProfileBlackView.this;
            if (z) {
                pkMatchProfileBlackView2.f51703a.setActualImageResource(PkMatchProfileBlackView.this.getNextPic());
            } else {
                pkMatchProfileBlackView2.f51704b.setActualImageResource(PkMatchProfileBlackView.this.getNextPic());
            }
            PkMatchProfileBlackView pkMatchProfileBlackView3 = PkMatchProfileBlackView.this;
            pkMatchProfileBlackView3.f51708f = !pkMatchProfileBlackView3.f51708f;
            PkMatchProfileBlackView.this.f51709g.start();
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
        this.f51706d = new ArrayList<>();
        this.f51708f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getNextPic() {
        if (this.f51707e < 0 || this.f51706d.size() <= 1) {
            return 0;
        }
        int i = this.f51707e + 1;
        int size = this.f51706d.size();
        ArrayList<Integer> arrayList = this.f51706d;
        return i >= size ? arrayList.get(0).intValue() : arrayList.get(this.f51707e + 1).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m76195k() {
        this.f51703a.setActualImageResource(this.f51706d.get(this.f51707e).intValue());
        this.f51704b.setActualImageResource(getNextPic());
        ValueAnimator valueAnimator = this.f51709g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f51709g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lv70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f130143a.m76196l(valueAnimator2);
            }
        });
        this.f51709g.addListener(new C12911a());
        this.f51709g.setDuration(1500L);
        this.f51709g.start();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76196l(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1.0f - fFloatValue;
        if (f > 1.0f) {
            return;
        }
        boolean z = this.f51708f;
        VDraweeView vDraweeView = this.f51703a;
        if (z) {
            vDraweeView.setAlpha(f);
            this.f51704b.setAlpha(fFloatValue);
        } else {
            vDraweeView.setAlpha(fFloatValue);
            this.f51704b.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m76197m() {
        this.f51705c.setScaleX(0.0f);
        bt0.m103739l(this.f51705c, bt0.f77162i, 0L, 400L, new LinearInterpolator(), 0.0f, 1.0f).start();
    }

    /* JADX INFO: renamed from: n */
    public void m76198n() {
        this.f51709g.cancel();
        xdl0.m208344M(this.f51705c, true);
        xdl0.m208345M0(this, true);
        m76197m();
    }

    /* JADX INFO: renamed from: o */
    public void m76199o() {
        m76202r();
        m76198n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f51709g.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f51703a = (VDraweeView) findViewById(g5c0.f100837W0);
        this.f51704b = (VDraweeView) findViewById(g5c0.f100957i4);
        VImage vImage = (VImage) findViewById(g5c0.f101110z1);
        this.f51705c = vImage;
        xdl0.m208344M(vImage, false);
        this.f51706d.add(Integer.valueOf(i3c0.f111003f5));
        this.f51706d.add(Integer.valueOf(i3c0.f111015g5));
        this.f51706d.add(Integer.valueOf(i3c0.f111027h5));
        this.f51706d.add(Integer.valueOf(i3c0.f111039i5));
        this.f51706d.add(Integer.valueOf(i3c0.f111051j5));
        m76195k();
    }

    /* JADX INFO: renamed from: p */
    public void m76200p() {
        m76202r();
    }

    /* JADX INFO: renamed from: q */
    public void m76201q() {
        this.f51709g.start();
        xdl0.m208344M(this.f51705c, false);
        xdl0.m208344M(this.f51703a, true);
        xdl0.m208344M(this.f51704b, true);
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: renamed from: r */
    public void m76202r() {
        xdl0.m208344M(this.f51703a, false);
        xdl0.m208344M(this.f51704b, false);
        this.f51709g.cancel();
    }

    public PkMatchProfileBlackView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51706d = new ArrayList<>();
        this.f51708f = true;
    }

    public PkMatchProfileBlackView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51706d = new ArrayList<>();
        this.f51708f = true;
    }
}
