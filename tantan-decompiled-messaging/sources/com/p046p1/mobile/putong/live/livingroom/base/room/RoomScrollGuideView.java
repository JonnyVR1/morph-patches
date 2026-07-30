package com.p046p1.mobile.putong.live.livingroom.base.room;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.view.ScrollGuideView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.cdd0;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.kig;
import p149l.l8d0;
import p149l.mkd0;
import p149l.o8d0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomScrollGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ScrollGuideView f47890a;

    /* JADX INFO: renamed from: b */
    public VImage f47891b;

    /* JADX INFO: renamed from: c */
    public VImage f47892c;

    /* JADX INFO: renamed from: d */
    public VText f47893d;

    /* JADX INFO: renamed from: e */
    public c4g0 f47894e;

    /* JADX INFO: renamed from: f */
    public o8d0 f47895f;

    /* JADX INFO: renamed from: g */
    public l8d0 f47896g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f47897h;

    public RoomScrollGuideView(Context context) {
        super(context);
        this.f47897h = new AnimatorSet();
    }

    /* JADX INFO: renamed from: e */
    public final void m71992e(View view) {
        cdd0.m106216a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m71993f() {
        AnimatorSet animatorSet = this.f47897h;
        if (animatorSet != null) {
            animatorSet.end();
        }
        mkd0.m154992z(this.f47894e);
        this.f47895f.m163134z();
        setOnClickListener(null);
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: g */
    public void m71994g(o8d0 o8d0Var, l8d0 l8d0Var) {
        this.f47895f = o8d0Var;
        this.f47896g = l8d0Var;
    }

    /* JADX INFO: renamed from: h */
    public boolean m71995h() {
        AnimatorSet animatorSet = this.f47897h;
        return animatorSet != null && animatorSet.isRunning();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m71996i() {
        this.f47895f.m163132x(t100.m186890d(-150.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m71997j() {
        xdl0.m208345M0(this.f47892c, false);
        xdl0.m208345M0(this.f47891b, false);
        xdl0.m208345M0(this.f47890a, false);
        this.f47892c.setTranslationY(0.0f);
        this.f47891b.setTranslationY(0.0f);
        this.f47890a.m76653a(110.0f, 110.0f);
        this.f47897h.removeAllListeners();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m71998k(View view) {
        m71993f();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m71999l(Long l2) {
        if (this.f47897h.isRunning() || !xdl0.m208349O0(this)) {
            return;
        }
        m72000m();
    }

    /* JADX INFO: renamed from: m */
    public final void m72000m() {
        xdl0.m208345M0(this.f47892c, true);
        xdl0.m208345M0(this.f47891b, true);
        xdl0.m208345M0(this.f47890a, true);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103743p = bt0.m103743p(this.f47892c, "translationY", 0L, 300L, linearInterpolator, 0.0f, t100.m186890d(-110.0f));
        Animator animatorM103743p2 = bt0.m103743p(this.f47891b, "translationY", 0L, 300L, linearInterpolator, 0.0f, t100.m186890d(-110.0f));
        Animator animatorM103743p3 = bt0.m103743p(this.f47890a, "topProgress", 0L, -1L, linearInterpolator, 110.0f, 0.0f);
        bt0.m103733f(animatorM103743p3, new Runnable() { // from class: l.add0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68927a.m71996i();
            }
        });
        Animator animatorM103743p4 = bt0.m103743p(this.f47890a, "bottomProgress", 0L, 300L, linearInterpolator, 110.0f, 0.0f);
        bt0.m103733f(animatorM103743p4, new Runnable() { // from class: l.bdd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75026a.m71997j();
            }
        });
        this.f47897h.setInterpolator(new kig());
        this.f47897h.play(animatorM103743p).with(animatorM103743p2).with(animatorM103743p3).before(animatorM103743p4);
        this.f47897h.start();
    }

    /* JADX INFO: renamed from: n */
    public void m72001n(int i) {
        xdl0.m208345M0(this, true);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ycd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197436a.m71998k(view);
            }
        });
        mkd0.m154992z(this.f47894e);
        this.f47894e = this.f47896g.duringCreated(C22306c.interval(0L, (long) (((double) i) + 0.6d), TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.zcd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202527a.m71999l((Long) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m71995h()) {
            m71993f();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71992e(this);
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47897h = new AnimatorSet();
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47897h = new AnimatorSet();
    }
}
