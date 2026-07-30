package com.p051p1.mobile.putong.live.livingroom.other.voicewindow;

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
import p153l.bnl0;
import p153l.gt0;
import p153l.mdc0;
import p153l.r7c0;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class OnExitPopupView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final View f52127a;

    /* JADX INFO: renamed from: b */
    public final View f52128b;

    /* JADX INFO: renamed from: c */
    public final TextView f52129c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f52130d;

    /* JADX INFO: renamed from: e */
    public Animation f52131e;

    /* JADX INFO: renamed from: f */
    public boolean f52132f;

    /* JADX INFO: renamed from: g */
    public boolean f52133g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView$a */
    public class C13056a extends gt0.C17308j {
        public C13056a() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewParent parent = OnExitPopupView.this.getParent();
            if (NullChecker.m82486a(parent)) {
                ((ViewGroup) parent).removeView(OnExitPopupView.this);
            }
        }
    }

    public OnExitPopupView(Context context) {
        super(context);
        View viewInflate = View.inflate(context, yec0.f199262tb, this);
        this.f52127a = viewInflate.findViewById(mdc0.f136319v1);
        this.f52128b = viewInflate.findViewById(mdc0.f136328w1);
        TextView textView = (TextView) viewInflate.findViewById(mdc0.f136310u1);
        this.f52129c = textView;
        textView.setText("退出群聊");
    }

    /* JADX INFO: renamed from: c */
    public void m76778c() {
        this.f52133g = false;
        final View viewFindViewById = findViewById(mdc0.f136319v1);
        final float f = viewFindViewById.getLayoutParams().height;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f52130d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cm50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f82513a.m76780e(f, viewFindViewById, valueAnimator);
            }
        });
        this.f52130d.addListener(new C13056a());
        this.f52130d.start();
    }

    /* JADX INFO: renamed from: d */
    public boolean m76779d() {
        return this.f52133g;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m76780e(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m76781f(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: g */
    public void m76782g(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ValueAnimator valueAnimator = this.f52130d;
        if ((valueAnimator == null || !valueAnimator.isStarted()) && (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content)) != null) {
            int i = bnl0.f77544e;
            viewGroup2.addView(this, new ViewGroup.LayoutParams(i, i));
            final View viewFindViewById = findViewById(mdc0.f136319v1);
            bnl0.m105525M0(this.f52128b, false);
            final float f = viewFindViewById.getLayoutParams().height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            this.f52130d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dm50
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f89606a.m76781f(f, viewFindViewById, valueAnimator2);
                }
            });
            this.f52130d.start();
            this.f52133g = true;
        }
    }

    public View getExitAreaView() {
        return this.f52127a;
    }

    /* JADX INFO: renamed from: h */
    public void m76783h() {
        if (this.f52132f) {
            return;
        }
        this.f52132f = true;
        bnl0.m105525M0(this.f52128b, true);
        if (this.f52131e == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f52128b.getContext(), r7c0.f161601b);
            this.f52131e = animationLoadAnimation;
            animationLoadAnimation.setDuration(100L);
        }
        this.f52128b.startAnimation(this.f52131e);
    }

    /* JADX INFO: renamed from: i */
    public void m76784i() {
        if (this.f52132f) {
            this.f52131e.cancel();
            bnl0.m105525M0(this.f52128b, false);
            this.f52132f = false;
        }
    }

    public void setExitText(String str) {
        this.f52129c.setText(str);
    }
}
