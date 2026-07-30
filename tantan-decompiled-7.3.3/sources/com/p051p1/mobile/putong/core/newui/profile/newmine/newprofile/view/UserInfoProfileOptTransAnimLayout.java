package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.adc0;
import p153l.bnl0;

/* JADX INFO: loaded from: classes11.dex */
public class UserInfoProfileOptTransAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC8400c f27608a;

    /* JADX INFO: renamed from: b */
    public int f27609b;

    /* JADX INFO: renamed from: c */
    public float f27610c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f27611d;

    /* JADX INFO: renamed from: e */
    public int f27612e;

    /* JADX INFO: renamed from: f */
    public int f27613f;

    /* JADX INFO: renamed from: g */
    public View f27614g;

    /* JADX INFO: renamed from: h */
    public View f27615h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$a */
    public class C8398a implements ValueAnimator.AnimatorUpdateListener {
        public C8398a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserInfoProfileOptTransAnimLayout.this.f27610c = fFloatValue;
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout = UserInfoProfileOptTransAnimLayout.this;
            InterfaceC8400c interfaceC8400c = userInfoProfileOptTransAnimLayout.f27608a;
            if (interfaceC8400c != null) {
                interfaceC8400c.mo44716b(fFloatValue, userInfoProfileOptTransAnimLayout.f27609b != 0);
            }
            if (UserInfoProfileOptTransAnimLayout.this.f27613f <= 0 || UserInfoProfileOptTransAnimLayout.this.f27612e <= 0) {
                return;
            }
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout2 = UserInfoProfileOptTransAnimLayout.this;
            bnl0.m105505C0(userInfoProfileOptTransAnimLayout2, userInfoProfileOptTransAnimLayout2.f27612e + ((int) ((UserInfoProfileOptTransAnimLayout.this.f27613f - UserInfoProfileOptTransAnimLayout.this.f27612e) * fFloatValue)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$b */
    public class C8399b implements Animator.AnimatorListener {
        public C8399b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            UserInfoProfileOptTransAnimLayout.this.m44712h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$c */
    public interface InterfaceC8400c {
        /* JADX INFO: renamed from: a */
        void mo44715a(int i);

        /* JADX INFO: renamed from: b */
        void mo44716b(float f, boolean z);

        /* JADX INFO: renamed from: c */
        void mo44717c(int i, float f);
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context) {
        super(context);
        this.f27609b = -1;
        this.f27610c = 0.0f;
        this.f27612e = -1;
        this.f27613f = -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m44710f() {
        this.f27614g = findViewById(adc0.f70193We);
        this.f27615h = findViewById(adc0.f70209Xe);
    }

    /* JADX INFO: renamed from: g */
    public final void m44711g(float f) {
        ValueAnimator valueAnimator = this.f27611d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27611d.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27610c, f);
        this.f27611d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f27611d.addUpdateListener(new C8398a());
        this.f27611d.addListener(new C8399b());
        this.f27611d.setDuration(660L);
        this.f27611d.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m44712h() {
        InterfaceC8400c interfaceC8400c = this.f27608a;
        if (interfaceC8400c != null) {
            interfaceC8400c.mo44715a(this.f27609b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m44713i() {
        InterfaceC8400c interfaceC8400c = this.f27608a;
        if (interfaceC8400c != null) {
            interfaceC8400c.mo44717c(this.f27609b, this.f27610c);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m44714j(int i) {
        int i2 = this.f27609b;
        if (i2 == -1) {
            this.f27609b = i;
            this.f27610c = i == 0 ? 0.0f : 1.0f;
            m44712h();
        } else if (i2 != i) {
            this.f27609b = i;
            m44713i();
            m44711g(this.f27609b == 0 ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44710f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(10000, 0));
        int measuredHeight = this.f27614g.getMeasuredHeight();
        int measuredHeight2 = this.f27615h.getMeasuredHeight();
        if (this.f27612e != measuredHeight && measuredHeight > 0) {
            this.f27612e = measuredHeight;
        }
        if (this.f27613f != measuredHeight2 && measuredHeight2 > 0) {
            this.f27613f = measuredHeight2;
        }
        if (this.f27613f <= 0 || this.f27612e <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f27612e;
        setMeasuredDimension(measuredWidth, i3 + ((int) ((this.f27613f - i3) * this.f27610c)));
    }

    public void setTransCallback(InterfaceC8400c interfaceC8400c) {
        this.f27608a = interfaceC8400c;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27609b = -1;
        this.f27610c = 0.0f;
        this.f27612e = -1;
        this.f27613f = -1;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27609b = -1;
        this.f27610c = 0.0f;
        this.f27612e = -1;
        this.f27613f = -1;
    }
}
