package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import l.bt0;
import l.qib0;
import l.t100;
import p007l.f3c0;
import p007l.vqg;
import p007l.xwh;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedRoamGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamGuideView f3922a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f3923b;

    /* JADX INFO: renamed from: c */
    public VText f3924c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3925d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f3926e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3927f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3928g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f3929h;

    /* JADX INFO: renamed from: i */
    public List<String> f3930i;

    /* JADX INFO: renamed from: j */
    public List<String> f3931j;

    /* JADX INFO: renamed from: k */
    public int f3932k;

    /* JADX INFO: renamed from: l */
    public int f3933l;

    /* JADX INFO: renamed from: m */
    public int f3934m;

    /* JADX INFO: renamed from: n */
    public int f3935n;

    /* JADX INFO: renamed from: o */
    public int f3936o;

    /* JADX INFO: renamed from: p */
    public Animator f3937p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f3938q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f3939r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f3940s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f3941t;

    public FeedRoamGuideView(Context context) {
        super(context);
        this.f3930i = new ArrayList();
        this.f3931j = new ArrayList();
        this.f3932k = t100.d(26.0f);
        this.f3933l = t100.d(13.0f);
        this.f3934m = 0;
        this.f3935n = t100.d(7.0f);
    }

    private String getNextUserIconUrl() {
        String str = this.f3931j.get(this.f3936o);
        int i = this.f3936o + 1;
        this.f3936o = i;
        this.f3936o = i % this.f3931j.size();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m6290c(View view) {
        xwh.m16865a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m6291d() {
        if (this.f3937p == null) {
            this.f3938q = this.f3929h;
            this.f3939r = this.f3928g;
            this.f3940s = this.f3927f;
            this.f3941t = this.f3926e;
            post(new Runnable() { // from class: l.vwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14314a.m6295h();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m6292e() {
        Property property = FrameLayout.ALPHA;
        Animator animatorL = bt0.l(this.f3938q, property, 0L, 600L, (Interpolator) null, new float[]{1.0f, 0.0f});
        Property property2 = FrameLayout.SCALE_X;
        Animator animatorL2 = bt0.l(this.f3938q, property2, 0L, 600L, (Interpolator) null, new float[]{1.0f, 0.9f});
        Property property3 = FrameLayout.SCALE_Y;
        Animator animatorL3 = bt0.l(this.f3938q, property3, 0L, 600L, (Interpolator) null, new float[]{1.0f, 0.9f});
        VDraweeView vDraweeView = this.f3938q;
        float[] fArr = {vDraweeView.getTranslationX(), this.f3938q.getTranslationX() - this.f3935n};
        Property property4 = FrameLayout.TRANSLATION_X;
        Animator animatorL4 = bt0.l(vDraweeView, property4, 0L, 600L, (Interpolator) null, fArr);
        VDraweeView vDraweeView2 = this.f3939r;
        Animator animatorL5 = bt0.l(vDraweeView2, property4, 100L, 600L, (Interpolator) null, new float[]{vDraweeView2.getTranslationX(), this.f3939r.getTranslationX() - this.f3933l});
        VDraweeView vDraweeView3 = this.f3940s;
        return bt0.z(new Animator[]{animatorL, animatorL2, animatorL3, animatorL4, animatorL5, bt0.l(vDraweeView3, property4, 100L, 600L, (Interpolator) null, new float[]{vDraweeView3.getTranslationX(), this.f3940s.getTranslationX() - this.f3933l}), bt0.l(this.f3941t, property, 100L, 600L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.l(this.f3941t, property2, 100L, 600L, (Interpolator) null, new float[]{0.9f, 1.0f}), bt0.l(this.f3941t, property3, 100L, 600L, (Interpolator) null, new float[]{0.9f, 1.0f}), bt0.l(this.f3941t, property4, 100L, 600L, (Interpolator) null, new float[]{this.f3935n, this.f3934m})});
    }

    /* JADX INFO: renamed from: f */
    public final void m6293f() {
        boolean zM15510d0 = vqg.m15510d0();
        List<String> list = this.f3930i;
        if (zM15510d0) {
            list.add("res://" + getContext().getPackageName() + "/" + f3c0.f7912t4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7920u4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7928v4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7936w4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7944x4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7952y4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7960z4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7568A4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7576B4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7584C4);
        } else {
            list.add("res://" + getContext().getPackageName() + "/" + f3c0.f7592D4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7600E4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7608F4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7616G4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7624H4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7632I4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7640J4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7648K4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7655L4);
            this.f3930i.add("res://" + getContext().getPackageName() + "/" + f3c0.f7662M4);
        }
        for (int i = 10; i > 5; i--) {
            int iNextInt = new Random().nextInt(i);
            String str = this.f3930i.get(iNextInt);
            this.f3930i.remove(iNextInt);
            this.f3931j.add(str);
        }
        m6294g();
    }

    /* JADX INFO: renamed from: g */
    public final void m6294g() {
        this.f3929h.setTranslationX(-this.f3932k);
        qib0.G.L0(this.f3929h, getNextUserIconUrl());
        this.f3928g.setTranslationX(-this.f3933l);
        qib0.G.L0(this.f3928g, getNextUserIconUrl());
        this.f3927f.setTranslationX(-this.f3934m);
        qib0.G.L0(this.f3927f, getNextUserIconUrl());
        this.f3926e.setTranslationX(-this.f3934m);
        qib0.G.L0(this.f3926e, getNextUserIconUrl());
        this.f3926e.bringToFront();
        this.f3927f.bringToFront();
        this.f3928g.bringToFront();
        this.f3929h.bringToFront();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6295h() {
        m6298k(200L);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6296i() {
        VDraweeView vDraweeView = this.f3938q;
        this.f3938q = this.f3939r;
        this.f3939r = this.f3940s;
        this.f3940s = this.f3941t;
        this.f3941t = vDraweeView;
        vDraweeView.bringToFront();
        this.f3940s.bringToFront();
        this.f3939r.bringToFront();
        this.f3938q.bringToFront();
        this.f3941t.setScaleX(1.0f);
        this.f3941t.setScaleY(1.0f);
        this.f3941t.setTranslationX(this.f3934m);
        this.f3941t.setAlpha(1.0f);
        qib0.G.L0(vDraweeView, getNextUserIconUrl());
        if (isAttachedToWindow()) {
            m6298k(2000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m6297j(Moment moment, RawFeed rawFeed) {
        StringBuilder sb = new StringBuilder();
        if (rawFeed == null || TextUtils.isEmpty(rawFeed.city)) {
            sb.append("切换定位探索各地动态");
        } else {
            int length = rawFeed.city.length();
            String str = rawFeed.city;
            if (length <= 4) {
                sb.append(str);
            } else {
                sb.append(str.substring(0, 4));
                sb.append("…");
            }
            sb.append(" · 切换定位探索各地动态");
        }
        this.f3924c.getPaint().setFakeBoldText(true);
        this.f3924c.setText(sb.toString());
        m6291d();
    }

    /* JADX INFO: renamed from: k */
    public final void m6298k(long j) {
        if (NullChecker.a(this.f3937p)) {
            this.f3937p.removeAllListeners();
            this.f3937p.cancel();
            this.f3937p = null;
        }
        Animator animatorM6292e = m6292e();
        this.f3937p = animatorM6292e;
        bt0.f(animatorM6292e, new Runnable() { // from class: l.wwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f14698a.m6296i();
            }
        });
        this.f3937p.setStartDelay(j);
        this.f3937p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f3937p)) {
            this.f3937p.removeAllListeners();
            this.f3937p.cancel();
            this.f3937p = null;
            m6294g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6290c(this);
        m6293f();
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3930i = new ArrayList();
        this.f3931j = new ArrayList();
        this.f3932k = t100.d(26.0f);
        this.f3933l = t100.d(13.0f);
        this.f3934m = 0;
        this.f3935n = t100.d(7.0f);
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3930i = new ArrayList();
        this.f3931j = new ArrayList();
        this.f3932k = t100.d(26.0f);
        this.f3933l = t100.d(13.0f);
        this.f3934m = 0;
        this.f3935n = t100.d(7.0f);
    }
}
