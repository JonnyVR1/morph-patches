package com.p051p1.mobile.putong.live.livingroom.base.room;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.view.ScrollGuideView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.eld0;
import p153l.fo0;
import p153l.gt0;
import p153l.kcg0;
import p153l.ogd0;
import p153l.psd0;
import p153l.qa00;
import p153l.rgd0;
import p153l.y20;
import p153l.yjg;

/* JADX INFO: loaded from: classes4.dex */
public class RoomScrollGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ScrollGuideView f48738a;

    /* JADX INFO: renamed from: b */
    public VImage f48739b;

    /* JADX INFO: renamed from: c */
    public VImage f48740c;

    /* JADX INFO: renamed from: d */
    public VText f48741d;

    /* JADX INFO: renamed from: e */
    public kcg0 f48742e;

    /* JADX INFO: renamed from: f */
    public rgd0 f48743f;

    /* JADX INFO: renamed from: g */
    public ogd0 f48744g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f48745h;

    public RoomScrollGuideView(Context context) {
        super(context);
        this.f48745h = new AnimatorSet();
    }

    /* JADX INFO: renamed from: e */
    public final void m73175e(View view) {
        eld0.m121146a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m73176f() {
        AnimatorSet animatorSet = this.f48745h;
        if (animatorSet != null) {
            animatorSet.end();
        }
        psd0.m173633z(this.f48742e);
        this.f48743f.m181426z();
        setOnClickListener(null);
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: g */
    public void m73177g(rgd0 rgd0Var, ogd0 ogd0Var) {
        this.f48743f = rgd0Var;
        this.f48744g = ogd0Var;
    }

    /* JADX INFO: renamed from: h */
    public boolean m73178h() {
        AnimatorSet animatorSet = this.f48745h;
        return animatorSet != null && animatorSet.isRunning();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73179i() {
        this.f48743f.m181424x(qa00.m175859d(-150.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73180j() {
        bnl0.m105525M0(this.f48740c, false);
        bnl0.m105525M0(this.f48739b, false);
        bnl0.m105525M0(this.f48738a, false);
        this.f48740c.setTranslationY(0.0f);
        this.f48739b.setTranslationY(0.0f);
        this.f48738a.m77836a(110.0f, 110.0f);
        this.f48745h.removeAllListeners();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73181k(View view) {
        m73176f();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73182l(Long l2) {
        if (this.f48745h.isRunning() || !bnl0.m105529O0(this)) {
            return;
        }
        m73183m();
    }

    /* JADX INFO: renamed from: m */
    public final void m73183m() {
        bnl0.m105525M0(this.f48740c, true);
        bnl0.m105525M0(this.f48739b, true);
        bnl0.m105525M0(this.f48738a, true);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132170p = gt0.m132170p(this.f48740c, "translationY", 0L, 300L, linearInterpolator, 0.0f, qa00.m175859d(-110.0f));
        Animator animatorM132170p2 = gt0.m132170p(this.f48739b, "translationY", 0L, 300L, linearInterpolator, 0.0f, qa00.m175859d(-110.0f));
        Animator animatorM132170p3 = gt0.m132170p(this.f48738a, "topProgress", 0L, -1L, linearInterpolator, 110.0f, 0.0f);
        gt0.m132160f(animatorM132170p3, new Runnable() { // from class: l.cld0
            @Override // java.lang.Runnable
            public final void run() {
                this.f82369a.m73179i();
            }
        });
        Animator animatorM132170p4 = gt0.m132170p(this.f48738a, "bottomProgress", 0L, 300L, linearInterpolator, 110.0f, 0.0f);
        gt0.m132160f(animatorM132170p4, new Runnable() { // from class: l.dld0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89527a.m73180j();
            }
        });
        this.f48745h.setInterpolator(new yjg());
        this.f48745h.play(animatorM132170p).with(animatorM132170p2).with(animatorM132170p3).before(animatorM132170p4);
        this.f48745h.start();
    }

    /* JADX INFO: renamed from: n */
    public void m73184n(int i) {
        bnl0.m105525M0(this, true);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ald0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72101a.m73181k(view);
            }
        });
        psd0.m173633z(this.f48742e);
        this.f48742e = this.f48744g.duringCreated(C22421c.interval(0L, (long) (((double) i) + 0.6d), TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.bld0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77185a.m73182l((Long) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m73178h()) {
            m73176f();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73175e(this);
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48745h = new AnimatorSet();
    }

    public RoomScrollGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48745h = new AnimatorSet();
    }
}
