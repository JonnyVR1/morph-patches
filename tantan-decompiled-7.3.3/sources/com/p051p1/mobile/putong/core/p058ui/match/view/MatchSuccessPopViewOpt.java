package com.p051p1.mobile.putong.core.p058ui.match.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.fzf0;
import p153l.gt0;
import p153l.qa00;
import p153l.ryl;
import p153l.syl;
import p153l.uqb0;
import p153l.xgx;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessPopViewOpt extends FrameLayout implements syl {

    /* JADX INFO: renamed from: a */
    public MatchSuccessPopViewOpt f31438a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31439b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31440c;

    /* JADX INFO: renamed from: d */
    public VText f31441d;

    /* JADX INFO: renamed from: e */
    public ryl f31442e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopViewOpt$a */
    public class C8631a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f31443a;

        public C8631a(Runnable runnable) {
            this.f31443a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (NullChecker.m82486a(this.f31443a)) {
                this.f31443a.run();
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

    @Override // p153l.syl
    /* JADX INFO: renamed from: E */
    public void mo48927E(User user) {
        uqb0.f180374G.m127111J0(this.f31440c, user.m61308fp().profileSmall(), false);
        m48941b(true);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: N */
    public void mo48928N(Runnable runnable) {
        PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f31438a, View.ALPHA, 0L, this.f31442e.getConfig().getPopOutDuring(), pathInterpolator, 1.0f, 0.0f), gt0.m132166l(this.f31438a, View.TRANSLATION_Y, 0L, this.f31442e.getConfig().getPopOutDuring(), pathInterpolator, -qa00.m175859d(120.0f)));
        animatorM132180z.addListener(new C8631a(runnable));
        animatorM132180z.start();
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: V */
    public void mo48929V() {
        m48942c();
        m48941b(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m48940a(View view) {
        xgx.m210966a(this, view);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: a0 */
    public boolean mo48930a0() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m48941b(boolean z) {
        if (mo48930a0()) {
            return;
        }
        int avatarX = this.f31442e.getConfig().getAvatarX();
        int avatarDelay = this.f31442e.getConfig().getAvatarDelay();
        fzf0 fzf0Var = new fzf0(0.5f);
        Animator animatorM132164j = gt0.m132164j(avatarDelay);
        if (z) {
            long j = avatarDelay;
            Property property = View.ALPHA;
            animatorM132164j = gt0.m132180z(gt0.m132166l(this.f31439b, property, 0L, j, new LinearInterpolator(), 1.0f, 0.0f), gt0.m132166l(this.f31440c, property, 0L, j, new LinearInterpolator(), 1.0f, 0.0f));
        }
        Animator animator = animatorM132164j;
        VDraweeView vDraweeView = this.f31439b;
        long j2 = avatarDelay;
        long j3 = avatarX;
        ryl rylVar = this.f31442e;
        float[] fArr = {-qa00.m175859d(z ? rylVar.getConfig().avatarRepeatTransX : rylVar.getConfig().avatarTransX), qa00.m175859d(0.0f)};
        Property property2 = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vDraweeView, property2, j2, j3, fzf0Var, fArr);
        VDraweeView vDraweeView2 = this.f31440c;
        ryl rylVar2 = this.f31442e;
        Animator animatorM132166l2 = gt0.m132166l(vDraweeView2, property2, j2, j3, fzf0Var, qa00.m175859d(z ? rylVar2.getConfig().avatarRepeatTransX : rylVar2.getConfig().avatarTransX), qa00.m175859d(0.0f));
        Property property3 = View.ALPHA;
        gt0.m132180z(animator, animatorM132166l, animatorM132166l2, gt0.m132166l(this.f31439b, property3, j2, this.f31442e.getConfig().getAvatarAlpha(), new LinearInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f31440c, property3, j2, this.f31442e.getConfig().getAvatarAlpha(), new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m48942c() {
        if (mo48930a0()) {
            return;
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.83f, 0.4f, 1.0f);
        gt0.m132180z(gt0.m132166l(this.f31438a, View.ALPHA, 0L, this.f31442e.getConfig().getPopEnterDuring(), pathInterpolator, 0.0f, 1.0f), gt0.m132166l(this.f31438a, View.TRANSLATION_Y, 0L, this.f31442e.getConfig().getPopEnterDuring(), pathInterpolator, -qa00.m175859d(120.0f), 0.0f)).start();
    }

    @Override // android.view.View, p153l.syl
    public View getRootView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48940a(this);
        this.f31441d.getPaint().setFakeBoldText(true);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: r */
    public void mo48936r() {
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: s */
    public void mo48937s() {
        super.mo48937s();
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: w */
    public void mo48938w(User user, boolean z) {
        uqb0.f180374G.m127111J0(this.f31439b, CoreModule.m30930K().me_().m61308fp().profileSmall(), false);
        uqb0.f180374G.m127111J0(this.f31440c, user.m61308fp().profileSmall(), false);
    }

    @Override // p153l.syl
    /* JADX INFO: renamed from: x */
    public void mo48939x(ryl rylVar) {
        super.mo48939x(rylVar);
        this.f31442e = rylVar;
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
