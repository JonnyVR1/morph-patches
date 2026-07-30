package com.p046p1.mobile.putong.core.p053ui.match.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.awl;
import p149l.bt0;
import p149l.qib0;
import p149l.t100;
import p149l.wqf0;
import p149l.ydx;
import p149l.zvl;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessPopViewOpt extends FrameLayout implements awl {

    /* JADX INFO: renamed from: a */
    public MatchSuccessPopViewOpt f30590a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30591b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30592c;

    /* JADX INFO: renamed from: d */
    public VText f30593d;

    /* JADX INFO: renamed from: e */
    public zvl f30594e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopViewOpt$a */
    public class C8468a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f30595a;

        public C8468a(Runnable runnable) {
            this.f30595a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (NullChecker.m81303a(this.f30595a)) {
                this.f30595a.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    public MatchSuccessPopViewOpt(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: E */
    public void mo47744E(User user) {
        qib0.f154691G.m102327J0(this.f30592c, user.m60124fp().profileSmall(), false);
        m47758b(true);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: N */
    public void mo47745N(Runnable runnable) {
        PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f30590a, View.ALPHA, 0L, this.f30594e.getConfig().getPopOutDuring(), pathInterpolator, 1.0f, 0.0f), bt0.m103739l(this.f30590a, View.TRANSLATION_Y, 0L, this.f30594e.getConfig().getPopOutDuring(), pathInterpolator, -t100.m186890d(120.0f)));
        animatorM103753z.addListener(new C8468a(runnable));
        animatorM103753z.start();
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: V */
    public void mo47746V() {
        m47759c();
        m47758b(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m47757a(View view) {
        ydx.m214331a(this, view);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: a0 */
    public boolean mo47747a0() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m47758b(boolean z) {
        if (mo47747a0()) {
            return;
        }
        int avatarX = this.f30594e.getConfig().getAvatarX();
        int avatarDelay = this.f30594e.getConfig().getAvatarDelay();
        wqf0 wqf0Var = new wqf0(0.5f);
        Animator animatorM103737j = bt0.m103737j(avatarDelay);
        if (z) {
            long j = avatarDelay;
            Property property = View.ALPHA;
            animatorM103737j = bt0.m103753z(bt0.m103739l(this.f30591b, property, 0L, j, new LinearInterpolator(), 1.0f, 0.0f), bt0.m103739l(this.f30592c, property, 0L, j, new LinearInterpolator(), 1.0f, 0.0f));
        }
        Animator animator = animatorM103737j;
        VDraweeView vDraweeView = this.f30591b;
        long j2 = avatarDelay;
        long j3 = avatarX;
        zvl zvlVar = this.f30594e;
        float[] fArr = {-t100.m186890d(z ? zvlVar.getConfig().avatarRepeatTransX : zvlVar.getConfig().avatarTransX), t100.m186890d(0.0f)};
        Property property2 = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vDraweeView, property2, j2, j3, wqf0Var, fArr);
        VDraweeView vDraweeView2 = this.f30592c;
        zvl zvlVar2 = this.f30594e;
        Animator animatorM103739l2 = bt0.m103739l(vDraweeView2, property2, j2, j3, wqf0Var, t100.m186890d(z ? zvlVar2.getConfig().avatarRepeatTransX : zvlVar2.getConfig().avatarTransX), t100.m186890d(0.0f));
        Property property3 = View.ALPHA;
        bt0.m103753z(animator, animatorM103739l, animatorM103739l2, bt0.m103739l(this.f30591b, property3, j2, this.f30594e.getConfig().getAvatarAlpha(), new LinearInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f30592c, property3, j2, this.f30594e.getConfig().getAvatarAlpha(), new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m47759c() {
        if (mo47747a0()) {
            return;
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.83f, 0.4f, 1.0f);
        bt0.m103753z(bt0.m103739l(this.f30590a, View.ALPHA, 0L, this.f30594e.getConfig().getPopEnterDuring(), pathInterpolator, 0.0f, 1.0f), bt0.m103739l(this.f30590a, View.TRANSLATION_Y, 0L, this.f30594e.getConfig().getPopEnterDuring(), pathInterpolator, -t100.m186890d(120.0f), 0.0f)).start();
    }

    @Override // android.view.View, p149l.awl
    public View getRootView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47757a(this);
        this.f30593d.getPaint().setFakeBoldText(true);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: r */
    public void mo47753r() {
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: s */
    public void mo47754s() {
        super.mo47754s();
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: w */
    public void mo47755w(User user, boolean z) {
        qib0.f154691G.m102327J0(this.f30591b, CoreModule.m29932K().me_().m60124fp().profileSmall(), false);
        qib0.f154691G.m102327J0(this.f30592c, user.m60124fp().profileSmall(), false);
    }

    @Override // p149l.awl
    /* JADX INFO: renamed from: x */
    public void mo47756x(zvl zvlVar) {
        super.mo47756x(zvlVar);
        this.f30594e = zvlVar;
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
