package com.p000p1.mobile.putong.live.livingroom.other.voicewindow;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.xdl0;
import p002l.g5c0;
import p002l.mzb0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnExitPopupView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final View f7321a;

    /* JADX INFO: renamed from: b */
    public final View f7322b;

    /* JADX INFO: renamed from: c */
    public final TextView f7323c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f7324d;

    /* JADX INFO: renamed from: e */
    public Animation f7325e;

    /* JADX INFO: renamed from: f */
    public boolean f7326f;

    /* JADX INFO: renamed from: g */
    public boolean f7327g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView$a */
    public class C0482a extends bt0.j {
        public C0482a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewParent parent = OnExitPopupView.this.getParent();
            if (NullChecker.a(parent)) {
                ((ViewGroup) parent).removeView(OnExitPopupView.this);
            }
        }
    }

    public OnExitPopupView(Context context) {
        super(context);
        View viewInflate = View.inflate(context, t6c0.f20026tb, this);
        this.f7321a = viewInflate.findViewById(g5c0.f11224v1);
        this.f7322b = viewInflate.findViewById(g5c0.f11233w1);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f11215u1);
        this.f7323c = textView;
        textView.setText("退出群聊");
    }

    /* JADX INFO: renamed from: c */
    public void m9236c() {
        this.f7327g = false;
        final View viewFindViewById = findViewById(g5c0.f11224v1);
        final float f = viewFindViewById.getLayoutParams().height;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f7324d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vd50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21084a.m9238e(f, viewFindViewById, valueAnimator);
            }
        });
        this.f7324d.addListener(new C0482a());
        this.f7324d.start();
    }

    /* JADX INFO: renamed from: d */
    public boolean m9237d() {
        return this.f7327g;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9238e(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9239f(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: g */
    public void m9240g(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ValueAnimator valueAnimator = this.f7324d;
        if ((valueAnimator == null || !valueAnimator.isStarted()) && (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content)) != null) {
            int i = xdl0.e;
            viewGroup2.addView(this, new ViewGroup.LayoutParams(i, i));
            final View viewFindViewById = findViewById(g5c0.f11224v1);
            xdl0.M0(this.f7322b, false);
            final float f = viewFindViewById.getLayoutParams().height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            this.f7324d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wd50
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f21654a.m9239f(f, viewFindViewById, valueAnimator2);
                }
            });
            this.f7324d.start();
            this.f7327g = true;
        }
    }

    public View getExitAreaView() {
        return this.f7321a;
    }

    /* JADX INFO: renamed from: h */
    public void m9241h() {
        if (this.f7326f) {
            return;
        }
        this.f7326f = true;
        xdl0.M0(this.f7322b, true);
        if (this.f7325e == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f7322b.getContext(), mzb0.f15753b);
            this.f7325e = animationLoadAnimation;
            animationLoadAnimation.setDuration(100L);
        }
        this.f7322b.startAnimation(this.f7325e);
    }

    /* JADX INFO: renamed from: i */
    public void m9242i() {
        if (this.f7326f) {
            this.f7325e.cancel();
            xdl0.M0(this.f7322b, false);
            this.f7326f = false;
        }
    }

    public void setExitText(String str) {
        this.f7323c.setText(str);
    }
}
