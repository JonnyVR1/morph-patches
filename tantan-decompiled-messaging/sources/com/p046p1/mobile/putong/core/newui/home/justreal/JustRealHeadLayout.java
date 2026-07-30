package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.animation.Animator;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.AbstractC19126p4;
import p149l.bt0;
import p149l.e30;
import p149l.frq;
import p149l.j2e0;
import p149l.mkd0;
import p149l.ogl0;
import p149l.rt20;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealHeadLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f23107a;

    /* JADX INFO: renamed from: b */
    public AbstractC19126p4 f23108b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$a */
    public class C8007a implements e30<Integer> {
        public C8007a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            JustRealHeadLayout.this.f23108b.mo122891c().setTranslationX(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadLayout$b */
    public class C8008b implements Animator.AnimatorListener {
        public C8008b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            JustRealHeadLayout.this.setVisibility(8);
            JustRealHeadLayout.this.f23108b.mo167333f(false);
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
    public static /* synthetic */ void m38660c(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m38662e(View view) {
        zvf0.m220396r("e_trial_go_verify", "p_suggest_users_home_view");
        j2e0.m139446m(xdl0.m208326D(getContext()), Uri.parse("tantanapp://verificationcenter"));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m38663f(VerificationCenter verificationCenter) {
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo) && NullChecker.m81303a(verificationCenter.picVerificationInfo.status) && (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending))) {
            this.f23108b.mo122892d().setText("认证审核中");
        } else {
            this.f23108b.mo122892d().setText("去认证");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38664g(boolean z, boolean z2) {
        if (z) {
            xdl0.m208344M(this, true);
            this.f23108b.mo167333f(true);
            if (getAlpha() == 1.0f && getTranslationY() == 0.0f) {
                return;
            }
            zvf0.m220402x("e_trial_go_verify", "p_suggest_users_home_view");
            bt0.m103753z(bt0.m103744q(this, "alpha", 0.0f, 1.0f), bt0.m103744q(this, "translationY", getTranslationY(), 0.0f)).setDuration(300L).start();
            return;
        }
        if (getAlpha() == 0.0f && getTranslationY() == t100.m186890d(50.0f)) {
            return;
        }
        float fM186890d = t100.m186890d(50.0f);
        if (z2) {
            Animator animatorM103753z = bt0.m103753z(bt0.m103744q(this, "alpha", getAlpha(), 0.0f), bt0.m103744q(this, "translationY", getTranslationY(), fM186890d));
            animatorM103753z.addListener(new C8008b());
            animatorM103753z.setDuration(300L).start();
        } else {
            setTranslationY(t100.m186890d(50.0f));
            setAlpha(0.0f);
            setVisibility(8);
            this.f23108b.mo167333f(false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m38665h(Act act, View view) {
        this.f23107a = view;
        this.f23108b.mo122890a().m38639g(act);
        if (ogl0.m164222A() || ogl0.m164223B()) {
            this.f23108b.mo167332b().m38653i(act);
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.drq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87657a.m38662e(view2);
            }
        });
        act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.erq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92955a.m38663f((VerificationCenter) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (ogl0.m164222A() || ogl0.m164223B()) {
            this.f23108b = new rt20();
        } else {
            this.f23108b = new frq();
        }
        this.f23108b.mo122893e(this);
        this.f23108b.mo122890a().setTitleTransCall(new C8007a());
        xdl0.m208329E0(this.f23108b.mo122892d(), new View.OnClickListener() { // from class: l.crq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustRealHeadLayout.m38660c(view);
            }
        });
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.m81303a(this.f23107a)) {
            this.f23107a.setVisibility(i);
        }
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JustRealHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
