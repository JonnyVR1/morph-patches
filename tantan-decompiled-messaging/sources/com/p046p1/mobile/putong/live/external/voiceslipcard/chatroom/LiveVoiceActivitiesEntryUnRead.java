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
import p147v.VFrame;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VRelative;
import p149l.bt0;
import p149l.c4g0;
import p149l.dzu;
import p149l.e30;
import p149l.ezu;
import p149l.ffw;
import p149l.fpn0;
import p149l.fzu;
import p149l.g0v;
import p149l.hxs;
import p149l.iyu;
import p149l.jo0;
import p149l.kzu;
import p149l.mkd0;
import p149l.qx6;
import p149l.t100;
import p149l.u3v;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesEntryUnRead extends VRelative implements g0v {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46494d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f46495e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f46496f;

    /* JADX INFO: renamed from: g */
    public VFrame f46497g;

    /* JADX INFO: renamed from: h */
    public VImage f46498h;

    /* JADX INFO: renamed from: i */
    public final List<String> f46499i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Animator f46500j;

    /* JADX INFO: renamed from: k */
    public c4g0 f46501k;

    /* JADX INFO: renamed from: l */
    public int f46502l;

    /* JADX INFO: renamed from: m */
    public boolean f46503m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$a */
    public class C12604a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46504a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46505b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f46506c;

        public C12604a(boolean z, int i, int i2) {
            this.f46504a = z;
            this.f46505b = i;
            this.f46506c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m71097c0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead = LiveVoiceActivitiesEntryUnRead.this;
            liveVoiceActivitiesEntryUnRead.m71094Z(liveVoiceActivitiesEntryUnRead.mo71040K(this.f46504a), LiveVoiceActivitiesEntryUnRead.this.mo71046u(this.f46504a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m71097c0(-this.f46505b, -this.f46506c, 0.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryUnRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$b */
    public class C12605b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46508a;

        public C12605b(boolean z) {
            this.f46508a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m71097c0(0.0f, 0.0f, 1.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryUnRead.this, false);
            LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead = LiveVoiceActivitiesEntryUnRead.this;
            liveVoiceActivitiesEntryUnRead.m71094Z(liveVoiceActivitiesEntryUnRead.mo71040K(this.f46508a), LiveVoiceActivitiesEntryUnRead.this.mo71046u(this.f46508a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$c */
    public class C12606c extends AnimatorListenerAdapter {
        public C12606c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.f46494d.setAlpha(1.0f);
        }
    }

    public LiveVoiceActivitiesEntryUnRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46499i = new ArrayList();
        this.f46502l = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m71091S(g0v g0vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71094Z((int) (g0vVar.mo71040K(z) + ((mo71040K(z) - g0vVar.mo71040K(z)) * animatedFraction)), (int) (g0vVar.mo71046u(z) + ((mo71046u(z) - g0vVar.mo71046u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m71097c0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m71092T(boolean z, g0v g0vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71094Z((int) (mo71040K(z) + ((g0vVar.mo71040K(z) - mo71040K(z)) * animatedFraction)), (int) (mo71046u(z) + ((g0vVar.mo71046u(z) - mo71046u(z)) * animatedFraction)));
        m71097c0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m71093W() {
        if (vwb.m200296J(this.f46499i)) {
            return;
        }
        int size = (this.f46502l + 1) % this.f46499i.size();
        this.f46502l = size;
        hxs.m133406s("context_square", this.f46494d, this.f46499i.get(size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m71094Z(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m71095a0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b0 */
    private void m71096b0(iyu iyuVar, Act act) {
        if (iyuVar == null) {
            return;
        }
        this.f46499i.addAll(iyuVar.m139014c());
        if (this.f46499i.size() >= 2) {
            m71105X(act);
        } else {
            if (this.f46499i.isEmpty()) {
                return;
            }
            hxs.m133406s("context_square", this.f46494d, this.f46499i.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m71097c0(float f, float f2, float f3) {
        this.f46494d.setTranslationX(f);
        this.f46494d.setTranslationY(f2);
        this.f46494d.setAlpha(f3);
        this.f46495e.setTranslationX(f);
        this.f46495e.setTranslationY(f2);
        this.f46495e.setAlpha(f3);
        this.f46496f.setTranslationX(f);
        this.f46496f.setTranslationY(f2);
        this.f46496f.setAlpha(f3);
        this.f46497g.setTranslationX(f);
        this.f46497g.setTranslationY(f2);
        this.f46497g.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f46495e.setAlpha(f);
        this.f46496f.setAlpha(f);
        this.f46497g.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        xdl0.m208344M(this.f46495e, z);
        xdl0.m208344M(this.f46496f, z);
        xdl0.m208344M(this.f46497g, z && !this.f46503m);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: C */
    public Animator mo71037C(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hzu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f110227a.m71092T(z, g0vVar, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12605b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: E */
    public Animator mo71038E(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gzu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f105175a.m71091S(g0vVar, z, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12604a(z, iMo71040K, iMo71046u));
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: F */
    public void mo71039F() {
        m124010w(getWidth(), t100.m186890d(70.0f), new dzu(this), new ezu(this), new fzu(this));
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: K */
    public int mo71040K(boolean z) {
        if (z) {
            return t100.m186890d(70.0f);
        }
        return !this.f46503m ? t100.m186890d(173.0f) : t100.m186890d(197.0f);
    }

    /* JADX INFO: renamed from: P */
    public final void m71101P(View view) {
        kzu.m147954a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m71102Q() {
        mkd0.m154992z(this.f46501k);
        Animator animator = this.f46500j;
        if (animator != null) {
            animator.cancel();
        }
        this.f46502l = 0;
        this.f46499i.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m71103R(boolean z) {
        this.f46495e.setTextColor(fpn0.m122612b(z).mo108471k());
        this.f46496f.setTextColor(fpn0.m122612b(z).mo108474n());
        this.f46498h.setImageResource(fpn0.m122612b(z).mo108469i());
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m71104V(Long l2) {
        Animator animator = this.f46500j;
        if (animator != null) {
            animator.cancel();
            this.f46500j.start();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m71105X(Act act) {
        if (act == null) {
            return;
        }
        hxs.m133406s("context_square", this.f46494d, this.f46499i.get(0));
        if (this.f46500j == null) {
            Animator animatorM103746s = bt0.m103746s(bt0.m103733f(bt0.m103743p(this.f46494d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.izu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115600a.m71093W();
                }
            }), bt0.m103743p(this.f46494d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103737j(2000));
            this.f46500j = animatorM103746s;
            animatorM103746s.addListener(new C12606c());
        }
        mkd0.m154992z(this.f46501k);
        this.f46501k = act.duringCreated(C22306c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jzu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120417a.m71104V((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m71106Y(iyu iyuVar, u3v u3vVar, boolean z) {
        boolean zM139019h = iyuVar.m139019h();
        this.f46503m = zM139019h;
        xdl0.m208344M(this.f46497g, zM139019h);
        m71095a0(mo71040K(z));
        this.f46495e.setText(iyuVar.m139013b());
        this.f46496f.setText(iyuVar.m139018g());
        if (vwb.m200335l(this.f46499i, iyuVar.m139014c(), new qx6())) {
            return;
        }
        m71102Q();
        m71096b0(iyuVar, u3vVar.act());
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: j */
    public void mo71045j() {
        m124009l(t100.m186890d(this.f46503m ? 197.0f : 173.0f), getWidth(), new dzu(this), new ezu(this), new fzu(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71102Q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71101P(this);
        m71103R(false);
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f46497g, onClickListener);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: u */
    public int mo71046u(boolean z) {
        return t100.m186890d(70.0f);
    }
}
