package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserInfoProfileOptTransAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC0401c f5538a;

    /* JADX INFO: renamed from: b */
    public int f5539b;

    /* JADX INFO: renamed from: c */
    public float f5540c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f5541d;

    /* JADX INFO: renamed from: e */
    public int f5542e;

    /* JADX INFO: renamed from: f */
    public int f5543f;

    /* JADX INFO: renamed from: g */
    public View f5544g;

    /* JADX INFO: renamed from: h */
    public View f5545h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$a */
    public class C0399a implements ValueAnimator.AnimatorUpdateListener {
        public C0399a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserInfoProfileOptTransAnimLayout.this.f5540c = fFloatValue;
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout = UserInfoProfileOptTransAnimLayout.this;
            InterfaceC0401c interfaceC0401c = userInfoProfileOptTransAnimLayout.f5538a;
            if (interfaceC0401c != null) {
                interfaceC0401c.mo7776b(fFloatValue, userInfoProfileOptTransAnimLayout.f5539b != 0);
            }
            if (UserInfoProfileOptTransAnimLayout.this.f5543f <= 0 || UserInfoProfileOptTransAnimLayout.this.f5542e <= 0) {
                return;
            }
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout2 = UserInfoProfileOptTransAnimLayout.this;
            xdl0.C0(userInfoProfileOptTransAnimLayout2, userInfoProfileOptTransAnimLayout2.f5542e + ((int) ((UserInfoProfileOptTransAnimLayout.this.f5543f - UserInfoProfileOptTransAnimLayout.this.f5542e) * fFloatValue)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$b */
    public class C0400b implements Animator.AnimatorListener {
        public C0400b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            UserInfoProfileOptTransAnimLayout.this.m7772h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$c */
    public interface InterfaceC0401c {
        /* JADX INFO: renamed from: a */
        void mo7775a(int i);

        /* JADX INFO: renamed from: b */
        void mo7776b(float f, boolean z);

        /* JADX INFO: renamed from: c */
        void mo7777c(int i, float f);
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context) {
        super(context);
        this.f5539b = -1;
        this.f5540c = 0.0f;
        this.f5542e = -1;
        this.f5543f = -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m7770f() {
        this.f5544g = findViewById(u4c0.Te);
        this.f5545h = findViewById(u4c0.Ue);
    }

    /* JADX INFO: renamed from: g */
    public final void m7771g(float f) {
        ValueAnimator valueAnimator = this.f5541d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5541d.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5540c, f);
        this.f5541d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5541d.addUpdateListener(new C0399a());
        this.f5541d.addListener(new C0400b());
        this.f5541d.setDuration(660L);
        this.f5541d.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m7772h() {
        InterfaceC0401c interfaceC0401c = this.f5538a;
        if (interfaceC0401c != null) {
            interfaceC0401c.mo7775a(this.f5539b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7773i() {
        InterfaceC0401c interfaceC0401c = this.f5538a;
        if (interfaceC0401c != null) {
            interfaceC0401c.mo7777c(this.f5539b, this.f5540c);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m7774j(int i) {
        int i2 = this.f5539b;
        if (i2 == -1) {
            this.f5539b = i;
            this.f5540c = i == 0 ? 0.0f : 1.0f;
            m7772h();
        } else if (i2 != i) {
            this.f5539b = i;
            m7773i();
            m7771g(this.f5539b == 0 ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7770f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(10000, 0));
        int measuredHeight = this.f5544g.getMeasuredHeight();
        int measuredHeight2 = this.f5545h.getMeasuredHeight();
        if (this.f5542e != measuredHeight && measuredHeight > 0) {
            this.f5542e = measuredHeight;
        }
        if (this.f5543f != measuredHeight2 && measuredHeight2 > 0) {
            this.f5543f = measuredHeight2;
        }
        if (this.f5543f <= 0 || this.f5542e <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f5542e;
        setMeasuredDimension(measuredWidth, i3 + ((int) ((this.f5543f - i3) * this.f5540c)));
    }

    public void setTransCallback(InterfaceC0401c interfaceC0401c) {
        this.f5538a = interfaceC0401c;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5539b = -1;
        this.f5540c = 0.0f;
        this.f5542e = -1;
        this.f5543f = -1;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5539b = -1;
        this.f5540c = 0.0f;
        this.f5542e = -1;
        this.f5543f = -1;
    }
}
