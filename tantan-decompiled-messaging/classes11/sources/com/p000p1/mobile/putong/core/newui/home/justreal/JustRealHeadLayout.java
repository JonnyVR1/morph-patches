package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e30;
import l.j2e0;
import l.mkd0;
import l.ogl0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p009l.AbstractC1100p4;
import p009l.frq;
import p009l.rt20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealHeadLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f1885a;

    /* JADX INFO: renamed from: b */
    public AbstractC1100p4 f1886b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$a */
    public class C0171a implements e30<Integer> {
        public C0171a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            JustRealHeadLayout.this.f1886b.mo14576c().setTranslationX(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$b */
    public class C0172b implements Animator.AnimatorListener {
        public C0172b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            JustRealHeadLayout.this.setVisibility(8);
            JustRealHeadLayout.this.f1886b.mo20103f(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    public JustRealHeadLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2646c(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2648e(View view) {
        zvf0.r("e_trial_go_verify", "p_suggest_users_home_view");
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantanapp://verificationcenter"));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2649f(VerificationCenter verificationCenter) {
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo) && NullChecker.a(verificationCenter.picVerificationInfo.status) && (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "prePending"))) {
            this.f1886b.mo14577d().setText("认证审核中");
        } else {
            this.f1886b.mo14577d().setText("去认证");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2650g(boolean z, boolean z2) {
        if (z) {
            xdl0.M(this, true);
            this.f1886b.mo20103f(true);
            if (getAlpha() == 1.0f && getTranslationY() == 0.0f) {
                return;
            }
            zvf0.x("e_trial_go_verify", "p_suggest_users_home_view");
            bt0.z(new Animator[]{bt0.q(this, "alpha", new float[]{0.0f, 1.0f}), bt0.q(this, "translationY", new float[]{getTranslationY(), 0.0f})}).setDuration(300L).start();
            return;
        }
        if (getAlpha() == 0.0f && getTranslationY() == t100.d(50.0f)) {
            return;
        }
        float fD = t100.d(50.0f);
        if (z2) {
            Animator animatorZ = bt0.z(new Animator[]{bt0.q(this, "alpha", new float[]{getAlpha(), 0.0f}), bt0.q(this, "translationY", new float[]{getTranslationY(), fD})});
            animatorZ.addListener(new C0172b());
            animatorZ.setDuration(300L).start();
        } else {
            setTranslationY(t100.d(50.0f));
            setAlpha(0.0f);
            setVisibility(8);
            this.f1886b.mo20103f(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2651h(Act act, View view) {
        this.f1885a = view;
        this.f1886b.mo14575a().m2625g(act);
        if (ogl0.A() || ogl0.B()) {
            this.f1886b.mo20102b().m2639i(act);
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.drq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11972a.m2648e(view2);
            }
        });
        act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.erq
            public final void call(Object obj) {
                this.f12675a.m2649f((VerificationCenter) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (ogl0.A() || ogl0.B()) {
            this.f1886b = new rt20();
        } else {
            this.f1886b = new frq();
        }
        this.f1886b.mo14578e(this);
        this.f1886b.mo14575a().setTitleTransCall(new C0171a());
        xdl0.E0(this.f1886b.mo14577d(), new View.OnClickListener() { // from class: l.crq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustRealHeadLayout.m2646c(view);
            }
        });
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.a(this.f1885a)) {
            this.f1885a.setVisibility(i);
        }
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
