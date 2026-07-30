package com.p046p1.mobile.putong.live.livingroom.other.voicewindow;

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
import p149l.bt0;
import p149l.g5c0;
import p149l.mzb0;
import p149l.t6c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnExitPopupView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final View f51279a;

    /* JADX INFO: renamed from: b */
    public final View f51280b;

    /* JADX INFO: renamed from: c */
    public final TextView f51281c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f51282d;

    /* JADX INFO: renamed from: e */
    public Animation f51283e;

    /* JADX INFO: renamed from: f */
    public boolean f51284f;

    /* JADX INFO: renamed from: g */
    public boolean f51285g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.voicewindow.OnExitPopupView$a */
    public class C12893a extends bt0.C15966j {
        public C12893a() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewParent parent = OnExitPopupView.this.getParent();
            if (NullChecker.m81303a(parent)) {
                ((ViewGroup) parent).removeView(OnExitPopupView.this);
            }
        }
    }

    public OnExitPopupView(Context context) {
        super(context);
        View viewInflate = View.inflate(context, t6c0.f168530tb, this);
        this.f51279a = viewInflate.findViewById(g5c0.f101074v1);
        this.f51280b = viewInflate.findViewById(g5c0.f101083w1);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f101065u1);
        this.f51281c = textView;
        textView.setText("退出群聊");
    }

    /* JADX INFO: renamed from: c */
    public void m75595c() {
        this.f51285g = false;
        final View viewFindViewById = findViewById(g5c0.f101074v1);
        final float f = viewFindViewById.getLayoutParams().height;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f51282d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vd50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f181021a.m75597e(f, viewFindViewById, valueAnimator);
            }
        });
        this.f51282d.addListener(new C12893a());
        this.f51282d.start();
    }

    /* JADX INFO: renamed from: d */
    public boolean m75596d() {
        return this.f51285g;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m75597e(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m75598f(float f, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (int) (fFloatValue - f);
        view.setLayoutParams(layoutParams);
        setAlpha(fFloatValue / f);
    }

    /* JADX INFO: renamed from: g */
    public void m75599g(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ValueAnimator valueAnimator = this.f51282d;
        if ((valueAnimator == null || !valueAnimator.isStarted()) && (viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content)) != null) {
            int i = xdl0.f192403e;
            viewGroup2.addView(this, new ViewGroup.LayoutParams(i, i));
            final View viewFindViewById = findViewById(g5c0.f101074v1);
            xdl0.m208345M0(this.f51280b, false);
            final float f = viewFindViewById.getLayoutParams().height;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            this.f51282d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wd50
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f185767a.m75598f(f, viewFindViewById, valueAnimator2);
                }
            });
            this.f51282d.start();
            this.f51285g = true;
        }
    }

    public View getExitAreaView() {
        return this.f51279a;
    }

    /* JADX INFO: renamed from: h */
    public void m75600h() {
        if (this.f51284f) {
            return;
        }
        this.f51284f = true;
        xdl0.m208345M0(this.f51280b, true);
        if (this.f51283e == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f51280b.getContext(), mzb0.f136366b);
            this.f51283e = animationLoadAnimation;
            animationLoadAnimation.setDuration(100L);
        }
        this.f51280b.startAnimation(this.f51283e);
    }

    /* JADX INFO: renamed from: i */
    public void m75601i() {
        if (this.f51284f) {
            this.f51283e.cancel();
            xdl0.m208345M0(this.f51280b, false);
            this.f51284f = false;
        }
    }

    public void setExitText(String str) {
        this.f51281c.setText(str);
    }
}
