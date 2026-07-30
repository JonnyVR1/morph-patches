package com.p000p1.mobile.putong.live.livingroom.base.room;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.livingroom.view.ScrollGuideView;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.kig;
import l.mkd0;
import l.t100;
import l.xdl0;
import p002l.cdd0;
import p002l.l8d0;
import p002l.o8d0;
import rx.c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomScrollGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ScrollGuideView f3932a;

    /* JADX INFO: renamed from: b */
    public VImage f3933b;

    /* JADX INFO: renamed from: c */
    public VImage f3934c;

    /* JADX INFO: renamed from: d */
    public VText f3935d;

    /* JADX INFO: renamed from: e */
    public c4g0 f3936e;

    /* JADX INFO: renamed from: f */
    public o8d0 f3937f;

    /* JADX INFO: renamed from: g */
    public l8d0 f3938g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f3939h;

    public RoomScrollGuideView(Context context) {
        super(context);
        this.f3939h = new AnimatorSet();
    }

    /* JADX INFO: renamed from: e */
    public final void m5383e(View view) {
        cdd0.m10934a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m5384f() {
        AnimatorSet animatorSet = this.f3939h;
        if (animatorSet != null) {
            animatorSet.end();
        }
        mkd0.z(this.f3936e);
        this.f3937f.m19312z();
        setOnClickListener(null);
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: g */
    public void m5385g(o8d0 o8d0Var, l8d0 l8d0Var) {
        this.f3937f = o8d0Var;
        this.f3938g = l8d0Var;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5386h() {
        AnimatorSet animatorSet = this.f3939h;
        return animatorSet != null && animatorSet.isRunning();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5387i() {
        this.f3937f.m19310x(t100.d(-150.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m5388j() {
        xdl0.M0(this.f3934c, false);
        xdl0.M0(this.f3933b, false);
        xdl0.M0(this.f3932a, false);
        this.f3934c.setTranslationY(0.0f);
        this.f3933b.setTranslationY(0.0f);
        this.f3932a.a(110.0f, 110.0f);
        this.f3939h.removeAllListeners();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5389k(View view) {
        m5384f();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5390l(Long l2) {
        if (this.f3939h.isRunning() || !xdl0.O0(this)) {
            return;
        }
        m5391m();
    }

    /* JADX INFO: renamed from: m */
    public final void m5391m() {
        xdl0.M0(this.f3934c, true);
        xdl0.M0(this.f3933b, true);
        xdl0.M0(this.f3932a, true);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorP = bt0.p(this.f3934c, "translationY", 0L, 300L, linearInterpolator, new float[]{0.0f, t100.d(-110.0f)});
        Animator animatorP2 = bt0.p(this.f3933b, "translationY", 0L, 300L, linearInterpolator, new float[]{0.0f, t100.d(-110.0f)});
        Animator animatorP3 = bt0.p(this.f3932a, "topProgress", 0L, -1L, linearInterpolator, new float[]{110.0f, 0.0f});
        bt0.f(animatorP3, new Runnable() { // from class: l.add0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7509a.m5387i();
            }
        });
        Animator animatorP4 = bt0.p(this.f3932a, "bottomProgress", 0L, 300L, linearInterpolator, new float[]{110.0f, 0.0f});
        bt0.f(animatorP4, new Runnable() { // from class: l.bdd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8076a.m5388j();
            }
        });
        this.f3939h.setInterpolator(new kig());
        this.f3939h.play(animatorP).with(animatorP2).with(animatorP3).before(animatorP4);
        this.f3939h.start();
    }

    /* JADX INFO: renamed from: n */
    public void m5392n(int i) {
        xdl0.M0(this, true);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ycd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22800a.m5389k(view);
            }
        });
        mkd0.z(this.f3936e);
        this.f3936e = this.f3938g.duringCreated(c.interval(0L, (long) (((double) i) + 0.6d), TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.zcd0
            public final void call(Object obj) {
                this.f23338a.m5390l((Long) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m5386h()) {
            m5384f();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5383e(this);
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3939h = new AnimatorSet();
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3939h = new AnimatorSet();
    }
}
