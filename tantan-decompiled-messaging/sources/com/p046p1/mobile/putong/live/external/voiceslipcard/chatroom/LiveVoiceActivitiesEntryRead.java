package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VRelative;
import p149l.bt0;
import p149l.c4g0;
import p149l.czu;
import p149l.e30;
import p149l.ffw;
import p149l.fpn0;
import p149l.g0v;
import p149l.hxs;
import p149l.iyu;
import p149l.jo0;
import p149l.mkd0;
import p149l.qx6;
import p149l.t100;
import p149l.u3v;
import p149l.vwb;
import p149l.vyu;
import p149l.wyu;
import p149l.xdl0;
import p149l.xyu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesEntryRead extends VRelative implements g0v {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46480d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f46481e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f46482f;

    /* JADX INFO: renamed from: g */
    public final List<String> f46483g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Animator f46484h;

    /* JADX INFO: renamed from: i */
    public c4g0 f46485i;

    /* JADX INFO: renamed from: j */
    public int f46486j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$a */
    public class C12601a extends AnimatorListenerAdapter {
        public C12601a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.f46480d.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$b */
    public class C12602b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46488a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46489b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f46490c;

        public C12602b(boolean z, int i, int i2) {
            this.f46488a = z;
            this.f46489b = i;
            this.f46490c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m71073c0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead = LiveVoiceActivitiesEntryRead.this;
            liveVoiceActivitiesEntryRead.m71071Z(liveVoiceActivitiesEntryRead.mo71040K(this.f46488a), LiveVoiceActivitiesEntryRead.this.mo71046u(this.f46488a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m71073c0(-this.f46489b, -this.f46490c, 0.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$c */
    public class C12603c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46492a;

        public C12603c(boolean z) {
            this.f46492a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m71073c0(0.0f, 0.0f, 1.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryRead.this, false);
            LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead = LiveVoiceActivitiesEntryRead.this;
            liveVoiceActivitiesEntryRead.m71071Z(liveVoiceActivitiesEntryRead.mo71040K(this.f46492a), LiveVoiceActivitiesEntryRead.this.mo71046u(this.f46492a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public LiveVoiceActivitiesEntryRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46483g = new ArrayList();
        this.f46486j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m71069V(Long l2) {
        Animator animator = this.f46484h;
        if (animator != null) {
            animator.cancel();
            this.f46484h.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m71070W() {
        if (vwb.m200296J(this.f46483g)) {
            return;
        }
        int size = (this.f46486j + 1) % this.f46483g.size();
        this.f46486j = size;
        hxs.m133406s("context_square", this.f46480d, this.f46483g.get(size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m71071Z(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m71072a0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m71073c0(float f, float f2, float f3) {
        this.f46480d.setTranslationX(f);
        this.f46480d.setTranslationY(f2);
        this.f46480d.setAlpha(f3);
        this.f46481e.setTranslationX(f);
        this.f46481e.setTranslationY(f2);
        this.f46481e.setAlpha(f3);
        this.f46482f.setTranslationX(f);
        this.f46482f.setTranslationY(f2);
        this.f46482f.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f46481e.setAlpha(f);
        this.f46482f.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        xdl0.m208344M(this.f46481e, z);
        xdl0.m208344M(this.f46482f, z);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: C */
    public Animator mo71037C(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zyu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f205731a.m71081T(z, g0vVar, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12603c(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: E */
    public Animator mo71038E(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yyu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f200815a.m71080S(g0vVar, z, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12602b(z, iMo71040K, iMo71046u));
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: F */
    public void mo71039F() {
        m124010w(getWidth(), t100.m186890d(70.0f), new vyu(this), new wyu(this), new xyu(this));
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: K */
    public int mo71040K(boolean z) {
        return t100.m186890d(z ? 70.0f : 167.0f);
    }

    /* JADX INFO: renamed from: P */
    public final void m71077P(View view) {
        czu.m109430a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m71078Q() {
        mkd0.m154992z(this.f46485i);
        Animator animator = this.f46484h;
        if (animator != null) {
            animator.cancel();
        }
        this.f46486j = 0;
        this.f46483g.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m71079R(boolean z) {
        this.f46481e.setTextColor(fpn0.m122612b(z).mo108471k());
        this.f46482f.setTextColor(fpn0.m122612b(z).mo108474n());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m71080S(g0v g0vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71071Z((int) (g0vVar.mo71040K(z) + ((mo71040K(z) - g0vVar.mo71040K(z)) * animatedFraction)), (int) (g0vVar.mo71046u(z) + ((mo71046u(z) - g0vVar.mo71046u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m71073c0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m71081T(boolean z, g0v g0vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71071Z((int) (mo71040K(z) + ((g0vVar.mo71040K(z) - mo71040K(z)) * animatedFraction)), (int) (mo71046u(z) + ((g0vVar.mo71046u(z) - mo71046u(z)) * animatedFraction)));
        m71073c0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - animatedFraction);
    }

    /* JADX INFO: renamed from: X */
    public void m71082X(Act act) {
        mkd0.m154992z(this.f46485i);
        if (act == null) {
            return;
        }
        hxs.m133406s("context_square", this.f46480d, this.f46483g.get(0));
        if (this.f46484h == null) {
            Animator animatorM103746s = bt0.m103746s(bt0.m103733f(bt0.m103743p(this.f46480d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.azu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72380a.m71070W();
                }
            }), bt0.m103743p(this.f46480d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103737j(2000));
            this.f46484h = animatorM103746s;
            animatorM103746s.addListener(new C12601a());
        }
        this.f46485i = act.duringCreated(C22306c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.bzu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78061a.m71069V((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m71083Y(iyu iyuVar, u3v u3vVar) {
        this.f46481e.setText(iyuVar.m139013b());
        this.f46482f.setText(iyuVar.m139018g());
        if (vwb.m200335l(this.f46483g, iyuVar.m139014c(), new qx6())) {
            return;
        }
        m71078Q();
        m71084b0(iyuVar, u3vVar.act());
    }

    /* JADX INFO: renamed from: b0 */
    public void m71084b0(iyu iyuVar, Act act) {
        if (iyuVar == null) {
            return;
        }
        this.f46483g.addAll(iyuVar.m139014c());
        if (this.f46483g.size() >= 2) {
            m71082X(act);
        } else {
            if (this.f46483g.isEmpty()) {
                return;
            }
            hxs.m133406s("context_square", this.f46480d, this.f46483g.get(0));
        }
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: j */
    public void mo71045j() {
        m124009l(t100.m186890d(167.0f), getWidth(), new vyu(this), new wyu(this), new xyu(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71078Q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71077P(this);
        m71079R(false);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: u */
    public int mo71046u(boolean z) {
        return t100.m186890d(70.0f);
    }
}
