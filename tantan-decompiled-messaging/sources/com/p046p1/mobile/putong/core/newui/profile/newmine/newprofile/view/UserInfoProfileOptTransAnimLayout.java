package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class UserInfoProfileOptTransAnimLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC8237c f26760a;

    /* JADX INFO: renamed from: b */
    public int f26761b;

    /* JADX INFO: renamed from: c */
    public float f26762c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f26763d;

    /* JADX INFO: renamed from: e */
    public int f26764e;

    /* JADX INFO: renamed from: f */
    public int f26765f;

    /* JADX INFO: renamed from: g */
    public View f26766g;

    /* JADX INFO: renamed from: h */
    public View f26767h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$a */
    public class C8235a implements ValueAnimator.AnimatorUpdateListener {
        public C8235a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            UserInfoProfileOptTransAnimLayout.this.f26762c = fFloatValue;
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout = UserInfoProfileOptTransAnimLayout.this;
            InterfaceC8237c interfaceC8237c = userInfoProfileOptTransAnimLayout.f26760a;
            if (interfaceC8237c != null) {
                interfaceC8237c.mo43530b(fFloatValue, userInfoProfileOptTransAnimLayout.f26761b != 0);
            }
            if (UserInfoProfileOptTransAnimLayout.this.f26765f <= 0 || UserInfoProfileOptTransAnimLayout.this.f26764e <= 0) {
                return;
            }
            UserInfoProfileOptTransAnimLayout userInfoProfileOptTransAnimLayout2 = UserInfoProfileOptTransAnimLayout.this;
            xdl0.m208325C0(userInfoProfileOptTransAnimLayout2, userInfoProfileOptTransAnimLayout2.f26764e + ((int) ((UserInfoProfileOptTransAnimLayout.this.f26765f - UserInfoProfileOptTransAnimLayout.this.f26764e) * fFloatValue)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$b */
    public class C8236b implements Animator.AnimatorListener {
        public C8236b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            UserInfoProfileOptTransAnimLayout.this.m43526h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout$c */
    public interface InterfaceC8237c {
        /* JADX INFO: renamed from: a */
        void mo43529a(int i);

        /* JADX INFO: renamed from: b */
        void mo43530b(float f, boolean z);

        /* JADX INFO: renamed from: c */
        void mo43531c(int i, float f);
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context) {
        super(context);
        this.f26761b = -1;
        this.f26762c = 0.0f;
        this.f26764e = -1;
        this.f26765f = -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m43524f() {
        this.f26766g = findViewById(u4c0.f174054Te);
        this.f26767h = findViewById(u4c0.f174070Ue);
    }

    /* JADX INFO: renamed from: g */
    public final void m43525g(float f) {
        ValueAnimator valueAnimator = this.f26763d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f26763d.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f26762c, f);
        this.f26763d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f26763d.addUpdateListener(new C8235a());
        this.f26763d.addListener(new C8236b());
        this.f26763d.setDuration(660L);
        this.f26763d.start();
    }

    /* JADX INFO: renamed from: h */
    public final void m43526h() {
        InterfaceC8237c interfaceC8237c = this.f26760a;
        if (interfaceC8237c != null) {
            interfaceC8237c.mo43529a(this.f26761b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m43527i() {
        InterfaceC8237c interfaceC8237c = this.f26760a;
        if (interfaceC8237c != null) {
            interfaceC8237c.mo43531c(this.f26761b, this.f26762c);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m43528j(int i) {
        int i2 = this.f26761b;
        if (i2 == -1) {
            this.f26761b = i;
            this.f26762c = i == 0 ? 0.0f : 1.0f;
            m43526h();
        } else if (i2 != i) {
            this.f26761b = i;
            m43527i();
            m43525g(this.f26761b == 0 ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43524f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(10000, 0));
        int measuredHeight = this.f26766g.getMeasuredHeight();
        int measuredHeight2 = this.f26767h.getMeasuredHeight();
        if (this.f26764e != measuredHeight && measuredHeight > 0) {
            this.f26764e = measuredHeight;
        }
        if (this.f26765f != measuredHeight2 && measuredHeight2 > 0) {
            this.f26765f = measuredHeight2;
        }
        if (this.f26765f <= 0 || this.f26764e <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f26764e;
        setMeasuredDimension(measuredWidth, i3 + ((int) ((this.f26765f - i3) * this.f26762c)));
    }

    public void setTransCallback(InterfaceC8237c interfaceC8237c) {
        this.f26760a = interfaceC8237c;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26761b = -1;
        this.f26762c = 0.0f;
        this.f26764e = -1;
        this.f26765f = -1;
    }

    public UserInfoProfileOptTransAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26761b = -1;
        this.f26762c = 0.0f;
        this.f26764e = -1;
        this.f26765f = -1;
    }
}
