package com.p000p1.mobile.putong.core.p001ui.match.view;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.qib0;
import l.t100;
import l.wqf0;
import l.ydx;
import p003l.awl;
import p003l.zvl;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchSuccessPopViewOpt extends FrameLayout implements awl {

    /* JADX INFO: renamed from: a */
    public MatchSuccessPopViewOpt f481a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f482b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f483c;

    /* JADX INFO: renamed from: d */
    public VText f484d;

    /* JADX INFO: renamed from: e */
    public zvl f485e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopViewOpt$a */
    public class C0051a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f486a;

        public C0051a(Runnable runnable) {
            this.f486a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (NullChecker.a(this.f486a)) {
                this.f486a.run();
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

    @Override // p003l.awl
    /* JADX INFO: renamed from: E */
    public void mo808E(User user) {
        qib0.G.J0(this.f483c, user.fp().profileSmall(), false);
        m822b(true);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: N */
    public void mo809N(Runnable runnable) {
        PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(this.f481a, View.ALPHA, 0L, this.f485e.getConfig().getPopOutDuring(), pathInterpolator, new float[]{1.0f, 0.0f}), bt0.l(this.f481a, View.TRANSLATION_Y, 0L, this.f485e.getConfig().getPopOutDuring(), pathInterpolator, new float[]{-t100.d(120.0f)})});
        animatorZ.addListener(new C0051a(runnable));
        animatorZ.start();
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: V */
    public void mo810V() {
        m823c();
        m822b(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m821a(View view) {
        ydx.a(this, view);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: a0 */
    public boolean mo811a0() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m822b(boolean z) {
        if (mo811a0()) {
            return;
        }
        int avatarX = this.f485e.getConfig().getAvatarX();
        int avatarDelay = this.f485e.getConfig().getAvatarDelay();
        wqf0 wqf0Var = new wqf0(0.5f);
        Animator animatorJ = bt0.j(avatarDelay);
        if (z) {
            long j = avatarDelay;
            Property property = View.ALPHA;
            animatorJ = bt0.z(new Animator[]{bt0.l(this.f482b, property, 0L, j, new LinearInterpolator(), new float[]{1.0f, 0.0f}), bt0.l(this.f483c, property, 0L, j, new LinearInterpolator(), new float[]{1.0f, 0.0f})});
        }
        Animator animator = animatorJ;
        SimpleDraweeView simpleDraweeView = this.f482b;
        long j2 = avatarDelay;
        long j3 = avatarX;
        zvl zvlVar = this.f485e;
        float[] fArr = {-t100.d(z ? zvlVar.getConfig().avatarRepeatTransX : zvlVar.getConfig().avatarTransX), t100.d(0.0f)};
        Property property2 = View.TRANSLATION_X;
        Animator animatorL = bt0.l(simpleDraweeView, property2, j2, j3, wqf0Var, fArr);
        SimpleDraweeView simpleDraweeView2 = this.f483c;
        zvl zvlVar2 = this.f485e;
        Animator animatorL2 = bt0.l(simpleDraweeView2, property2, j2, j3, wqf0Var, new float[]{t100.d(z ? zvlVar2.getConfig().avatarRepeatTransX : zvlVar2.getConfig().avatarTransX), t100.d(0.0f)});
        Property property3 = View.ALPHA;
        bt0.z(new Animator[]{animator, animatorL, animatorL2, bt0.l(this.f482b, property3, j2, this.f485e.getConfig().getAvatarAlpha(), new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f483c, property3, j2, this.f485e.getConfig().getAvatarAlpha(), new LinearInterpolator(), new float[]{0.0f, 1.0f})}).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m823c() {
        if (mo811a0()) {
            return;
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.83f, 0.4f, 1.0f);
        bt0.z(new Animator[]{bt0.l(this.f481a, View.ALPHA, 0L, this.f485e.getConfig().getPopEnterDuring(), pathInterpolator, new float[]{0.0f, 1.0f}), bt0.l(this.f481a, View.TRANSLATION_Y, 0L, this.f485e.getConfig().getPopEnterDuring(), pathInterpolator, new float[]{-t100.d(120.0f), 0.0f})}).start();
    }

    @Override // android.view.View, p003l.awl
    public View getRootView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m821a(this);
        this.f484d.getPaint().setFakeBoldText(true);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: r */
    public void mo817r() {
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: s */
    public void mo818s() {
        super.mo818s();
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: w */
    public void mo819w(User user, boolean z) {
        qib0.G.J0(this.f482b, CoreModule.K().me_().fp().profileSmall(), false);
        qib0.G.J0(this.f483c, user.fp().profileSmall(), false);
    }

    @Override // p003l.awl
    /* JADX INFO: renamed from: x */
    public void mo820x(zvl zvlVar) {
        super.mo820x(zvlVar);
        this.f485e = zvlVar;
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatchSuccessPopViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
