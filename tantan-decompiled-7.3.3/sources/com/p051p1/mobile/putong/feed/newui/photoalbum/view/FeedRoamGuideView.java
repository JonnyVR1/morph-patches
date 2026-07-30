package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VText;
import p153l.gt0;
import p153l.ksg;
import p153l.lbc0;
import p153l.myh;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedRoamGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamGuideView f43309a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f43310b;

    /* JADX INFO: renamed from: c */
    public VText f43311c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f43312d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43313e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43314f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f43315g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f43316h;

    /* JADX INFO: renamed from: i */
    public List<String> f43317i;

    /* JADX INFO: renamed from: j */
    public List<String> f43318j;

    /* JADX INFO: renamed from: k */
    public int f43319k;

    /* JADX INFO: renamed from: l */
    public int f43320l;

    /* JADX INFO: renamed from: m */
    public int f43321m;

    /* JADX INFO: renamed from: n */
    public int f43322n;

    /* JADX INFO: renamed from: o */
    public int f43323o;

    /* JADX INFO: renamed from: p */
    public Animator f43324p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f43325q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f43326r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f43327s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f43328t;

    public FeedRoamGuideView(Context context) {
        super(context);
        this.f43317i = new ArrayList();
        this.f43318j = new ArrayList();
        this.f43319k = qa00.m175859d(26.0f);
        this.f43320l = qa00.m175859d(13.0f);
        this.f43321m = 0;
        this.f43322n = qa00.m175859d(7.0f);
    }

    private String getNextUserIconUrl() {
        String str = this.f43318j.get(this.f43323o);
        int i = this.f43323o + 1;
        this.f43323o = i;
        this.f43323o = i % this.f43318j.size();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m66372c(View view) {
        myh.m160792a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m66373d() {
        if (this.f43324p == null) {
            this.f43325q = this.f43316h;
            this.f43326r = this.f43315g;
            this.f43327s = this.f43314f;
            this.f43328t = this.f43313e;
            post(new Runnable() { // from class: l.kyh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129315a.m66377h();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m66374e() {
        Property property = FrameLayout.ALPHA;
        Animator animatorM132166l = gt0.m132166l(this.f43325q, property, 0L, 600L, null, 1.0f, 0.0f);
        Property property2 = FrameLayout.SCALE_X;
        Animator animatorM132166l2 = gt0.m132166l(this.f43325q, property2, 0L, 600L, null, 1.0f, 0.9f);
        Property property3 = FrameLayout.SCALE_Y;
        Animator animatorM132166l3 = gt0.m132166l(this.f43325q, property3, 0L, 600L, null, 1.0f, 0.9f);
        VDraweeView vDraweeView = this.f43325q;
        float[] fArr = {vDraweeView.getTranslationX(), this.f43325q.getTranslationX() - this.f43322n};
        Property property4 = FrameLayout.TRANSLATION_X;
        Animator animatorM132166l4 = gt0.m132166l(vDraweeView, property4, 0L, 600L, null, fArr);
        VDraweeView vDraweeView2 = this.f43326r;
        Animator animatorM132166l5 = gt0.m132166l(vDraweeView2, property4, 100L, 600L, null, vDraweeView2.getTranslationX(), this.f43326r.getTranslationX() - this.f43320l);
        VDraweeView vDraweeView3 = this.f43327s;
        return gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, animatorM132166l4, animatorM132166l5, gt0.m132166l(vDraweeView3, property4, 100L, 600L, null, vDraweeView3.getTranslationX(), this.f43327s.getTranslationX() - this.f43320l), gt0.m132166l(this.f43328t, property, 100L, 600L, null, 0.0f, 1.0f), gt0.m132166l(this.f43328t, property2, 100L, 600L, null, 0.9f, 1.0f), gt0.m132166l(this.f43328t, property3, 100L, 600L, null, 0.9f, 1.0f), gt0.m132166l(this.f43328t, property4, 100L, 600L, null, this.f43322n, this.f43321m));
    }

    /* JADX INFO: renamed from: f */
    public final void m66375f() {
        boolean zM151199d0 = ksg.m151199d0();
        List<String> list = this.f43317i;
        if (zM151199d0) {
            list.add("res://" + getContext().getPackageName() + "/" + lbc0.f131147t4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131155u4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131163v4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131171w4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131179x4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131187y4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f131195z4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130803A4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130811B4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130819C4);
        } else {
            list.add("res://" + getContext().getPackageName() + "/" + lbc0.f130827D4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130835E4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130843F4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130851G4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130859H4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130867I4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130875J4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130883K4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130890L4);
            this.f43317i.add("res://" + getContext().getPackageName() + "/" + lbc0.f130897M4);
        }
        for (int i = 10; i > 5; i--) {
            int iNextInt = new Random().nextInt(i);
            String str = this.f43317i.get(iNextInt);
            this.f43317i.remove(iNextInt);
            this.f43318j.add(str);
        }
        m66376g();
    }

    /* JADX INFO: renamed from: g */
    public final void m66376g() {
        this.f43316h.setTranslationX(-this.f43319k);
        uqb0.f180374G.m127115L0(this.f43316h, getNextUserIconUrl());
        this.f43315g.setTranslationX(-this.f43320l);
        uqb0.f180374G.m127115L0(this.f43315g, getNextUserIconUrl());
        this.f43314f.setTranslationX(-this.f43321m);
        uqb0.f180374G.m127115L0(this.f43314f, getNextUserIconUrl());
        this.f43313e.setTranslationX(-this.f43321m);
        uqb0.f180374G.m127115L0(this.f43313e, getNextUserIconUrl());
        this.f43313e.bringToFront();
        this.f43314f.bringToFront();
        this.f43315g.bringToFront();
        this.f43316h.bringToFront();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m66377h() {
        m66380k(200L);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m66378i() {
        VDraweeView vDraweeView = this.f43325q;
        this.f43325q = this.f43326r;
        this.f43326r = this.f43327s;
        this.f43327s = this.f43328t;
        this.f43328t = vDraweeView;
        vDraweeView.bringToFront();
        this.f43327s.bringToFront();
        this.f43326r.bringToFront();
        this.f43325q.bringToFront();
        this.f43328t.setScaleX(1.0f);
        this.f43328t.setScaleY(1.0f);
        this.f43328t.setTranslationX(this.f43321m);
        this.f43328t.setAlpha(1.0f);
        uqb0.f180374G.m127115L0(vDraweeView, getNextUserIconUrl());
        if (isAttachedToWindow()) {
            m66380k(2000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m66379j(Moment moment, RawFeed rawFeed) {
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
        this.f43311c.getPaint().setFakeBoldText(true);
        this.f43311c.setText(sb.toString());
        m66373d();
    }

    /* JADX INFO: renamed from: k */
    public final void m66380k(long j) {
        if (NullChecker.m82486a(this.f43324p)) {
            this.f43324p.removeAllListeners();
            this.f43324p.cancel();
            this.f43324p = null;
        }
        Animator animatorM66374e = m66374e();
        this.f43324p = animatorM66374e;
        gt0.m132160f(animatorM66374e, new Runnable() { // from class: l.lyh
            @Override // java.lang.Runnable
            public final void run() {
                this.f134061a.m66378i();
            }
        });
        this.f43324p.setStartDelay(j);
        this.f43324p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f43324p)) {
            this.f43324p.removeAllListeners();
            this.f43324p.cancel();
            this.f43324p = null;
            m66376g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66372c(this);
        m66375f();
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43317i = new ArrayList();
        this.f43318j = new ArrayList();
        this.f43319k = qa00.m175859d(26.0f);
        this.f43320l = qa00.m175859d(13.0f);
        this.f43321m = 0;
        this.f43322n = qa00.m175859d(7.0f);
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43317i = new ArrayList();
        this.f43318j = new ArrayList();
        this.f43319k = qa00.m175859d(26.0f);
        this.f43320l = qa00.m175859d(13.0f);
        this.f43321m = 0;
        this.f43322n = qa00.m175859d(7.0f);
    }
}
