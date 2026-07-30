package com.p051p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.AbstractC19020o4;
import p153l.b230;
import p153l.bnl0;
import p153l.gt0;
import p153l.gtq;
import p153l.i4g0;
import p153l.nae0;
import p153l.psd0;
import p153l.qa00;
import p153l.spl0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHeadLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f23849a;

    /* JADX INFO: renamed from: b */
    public AbstractC19020o4 f23850b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$a */
    public class C8158a implements y20<Integer> {
        public C8158a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            JustRealHeadLayout.this.f23850b.mo101615c().setTranslationX(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$b */
    public class C8159b implements Animator.AnimatorListener {
        public C8159b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            JustRealHeadLayout.this.setVisibility(8);
            JustRealHeadLayout.this.f23850b.mo101618f(false);
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
    public static /* synthetic */ void m39663c(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m39665e(View view) {
        i4g0.m138520r("e_trial_go_verify", "p_suggest_users_home_view");
        nae0.m162083m(bnl0.m105506D(getContext()), Uri.parse("tantanapp://verificationcenter"));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39666f(VerificationCenter verificationCenter) {
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo) && NullChecker.m82486a(verificationCenter.picVerificationInfo.status) && (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending))) {
            this.f23850b.mo101616d().setText("认证审核中");
        } else {
            this.f23850b.mo101616d().setText("去认证");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39667g(boolean z, boolean z2) {
        if (z) {
            bnl0.m105524M(this, true);
            this.f23850b.mo101618f(true);
            if (getAlpha() == 1.0f && getTranslationY() == 0.0f) {
                return;
            }
            i4g0.m138526x("e_trial_go_verify", "p_suggest_users_home_view");
            gt0.m132180z(gt0.m132171q(this, "alpha", 0.0f, 1.0f), gt0.m132171q(this, "translationY", getTranslationY(), 0.0f)).setDuration(300L).start();
            return;
        }
        if (getAlpha() == 0.0f && getTranslationY() == qa00.m175859d(50.0f)) {
            return;
        }
        float fM175859d = qa00.m175859d(50.0f);
        if (z2) {
            Animator animatorM132180z = gt0.m132180z(gt0.m132171q(this, "alpha", getAlpha(), 0.0f), gt0.m132171q(this, "translationY", getTranslationY(), fM175859d));
            animatorM132180z.addListener(new C8159b());
            animatorM132180z.setDuration(300L).start();
        } else {
            setTranslationY(qa00.m175859d(50.0f));
            setAlpha(0.0f);
            setVisibility(8);
            this.f23850b.mo101618f(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m39668h(Act act, View view) {
        this.f23849a = view;
        this.f23850b.mo101613a().m39642g(act);
        if (spl0.m187349A() || spl0.m187350B()) {
            this.f23850b.mo101614b().m39656i(act);
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.etq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f95796a.m39665e(view2);
            }
        });
        act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ftq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100787a.m39666f((VerificationCenter) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (spl0.m187349A() || spl0.m187350B()) {
            this.f23850b = new b230();
        } else {
            this.f23850b = new gtq();
        }
        this.f23850b.mo101617e(this);
        this.f23850b.mo101613a().setTitleTransCall(new C8158a());
        bnl0.m105509E0(this.f23850b.mo101616d(), new View.OnClickListener() { // from class: l.dtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustRealHeadLayout.m39663c(view);
            }
        });
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.m82486a(this.f23849a)) {
            this.f23849a.setVisibility(i);
        }
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
