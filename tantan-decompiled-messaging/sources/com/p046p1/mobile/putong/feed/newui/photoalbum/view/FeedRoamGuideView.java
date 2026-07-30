package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.f3c0;
import p149l.qib0;
import p149l.t100;
import p149l.vqg;
import p149l.xwh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedRoamGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedRoamGuideView f42461a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f42462b;

    /* JADX INFO: renamed from: c */
    public VText f42463c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f42464d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42465e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42466f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f42467g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f42468h;

    /* JADX INFO: renamed from: i */
    public List<String> f42469i;

    /* JADX INFO: renamed from: j */
    public List<String> f42470j;

    /* JADX INFO: renamed from: k */
    public int f42471k;

    /* JADX INFO: renamed from: l */
    public int f42472l;

    /* JADX INFO: renamed from: m */
    public int f42473m;

    /* JADX INFO: renamed from: n */
    public int f42474n;

    /* JADX INFO: renamed from: o */
    public int f42475o;

    /* JADX INFO: renamed from: p */
    public Animator f42476p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f42477q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f42478r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f42479s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f42480t;

    public FeedRoamGuideView(Context context) {
        super(context);
        this.f42469i = new ArrayList();
        this.f42470j = new ArrayList();
        this.f42471k = t100.m186890d(26.0f);
        this.f42472l = t100.m186890d(13.0f);
        this.f42473m = 0;
        this.f42474n = t100.m186890d(7.0f);
    }

    private String getNextUserIconUrl() {
        String str = this.f42470j.get(this.f42475o);
        int i = this.f42475o + 1;
        this.f42475o = i;
        this.f42475o = i % this.f42470j.size();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m65189c(View view) {
        xwh.m211336a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m65190d() {
        if (this.f42476p == null) {
            this.f42477q = this.f42468h;
            this.f42478r = this.f42467g;
            this.f42479s = this.f42466f;
            this.f42480t = this.f42465e;
            post(new Runnable() { // from class: l.vwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183340a.m65194h();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final Animator m65191e() {
        Property property = FrameLayout.ALPHA;
        Animator animatorM103739l = bt0.m103739l(this.f42477q, property, 0L, 600L, null, 1.0f, 0.0f);
        Property property2 = FrameLayout.SCALE_X;
        Animator animatorM103739l2 = bt0.m103739l(this.f42477q, property2, 0L, 600L, null, 1.0f, 0.9f);
        Property property3 = FrameLayout.SCALE_Y;
        Animator animatorM103739l3 = bt0.m103739l(this.f42477q, property3, 0L, 600L, null, 1.0f, 0.9f);
        VDraweeView vDraweeView = this.f42477q;
        float[] fArr = {vDraweeView.getTranslationX(), this.f42477q.getTranslationX() - this.f42474n};
        Property property4 = FrameLayout.TRANSLATION_X;
        Animator animatorM103739l4 = bt0.m103739l(vDraweeView, property4, 0L, 600L, null, fArr);
        VDraweeView vDraweeView2 = this.f42478r;
        Animator animatorM103739l5 = bt0.m103739l(vDraweeView2, property4, 100L, 600L, null, vDraweeView2.getTranslationX(), this.f42478r.getTranslationX() - this.f42472l);
        VDraweeView vDraweeView3 = this.f42479s;
        return bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l4, animatorM103739l5, bt0.m103739l(vDraweeView3, property4, 100L, 600L, null, vDraweeView3.getTranslationX(), this.f42479s.getTranslationX() - this.f42472l), bt0.m103739l(this.f42480t, property, 100L, 600L, null, 0.0f, 1.0f), bt0.m103739l(this.f42480t, property2, 100L, 600L, null, 0.9f, 1.0f), bt0.m103739l(this.f42480t, property3, 100L, 600L, null, 0.9f, 1.0f), bt0.m103739l(this.f42480t, property4, 100L, 600L, null, this.f42474n, this.f42473m));
    }

    /* JADX INFO: renamed from: f */
    public final void m65192f() {
        boolean zM199540d0 = vqg.m199540d0();
        List<String> list = this.f42469i;
        if (zM199540d0) {
            list.add("res://" + getContext().getPackageName() + "/" + f3c0.f94629t4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94637u4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94645v4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94653w4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94661x4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94669y4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94677z4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94285A4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94293B4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94301C4);
        } else {
            list.add("res://" + getContext().getPackageName() + "/" + f3c0.f94309D4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94317E4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94325F4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94333G4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94341H4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94349I4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94357J4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94365K4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94372L4);
            this.f42469i.add("res://" + getContext().getPackageName() + "/" + f3c0.f94379M4);
        }
        for (int i = 10; i > 5; i--) {
            int iNextInt = new Random().nextInt(i);
            String str = this.f42469i.get(iNextInt);
            this.f42469i.remove(iNextInt);
            this.f42470j.add(str);
        }
        m65193g();
    }

    /* JADX INFO: renamed from: g */
    public final void m65193g() {
        this.f42468h.setTranslationX(-this.f42471k);
        qib0.f154691G.m102331L0(this.f42468h, getNextUserIconUrl());
        this.f42467g.setTranslationX(-this.f42472l);
        qib0.f154691G.m102331L0(this.f42467g, getNextUserIconUrl());
        this.f42466f.setTranslationX(-this.f42473m);
        qib0.f154691G.m102331L0(this.f42466f, getNextUserIconUrl());
        this.f42465e.setTranslationX(-this.f42473m);
        qib0.f154691G.m102331L0(this.f42465e, getNextUserIconUrl());
        this.f42465e.bringToFront();
        this.f42466f.bringToFront();
        this.f42467g.bringToFront();
        this.f42468h.bringToFront();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m65194h() {
        m65197k(200L);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m65195i() {
        VDraweeView vDraweeView = this.f42477q;
        this.f42477q = this.f42478r;
        this.f42478r = this.f42479s;
        this.f42479s = this.f42480t;
        this.f42480t = vDraweeView;
        vDraweeView.bringToFront();
        this.f42479s.bringToFront();
        this.f42478r.bringToFront();
        this.f42477q.bringToFront();
        this.f42480t.setScaleX(1.0f);
        this.f42480t.setScaleY(1.0f);
        this.f42480t.setTranslationX(this.f42473m);
        this.f42480t.setAlpha(1.0f);
        qib0.f154691G.m102331L0(vDraweeView, getNextUserIconUrl());
        if (isAttachedToWindow()) {
            m65197k(2000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m65196j(Moment moment, RawFeed rawFeed) {
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
        this.f42463c.getPaint().setFakeBoldText(true);
        this.f42463c.setText(sb.toString());
        m65190d();
    }

    /* JADX INFO: renamed from: k */
    public final void m65197k(long j) {
        if (NullChecker.m81303a(this.f42476p)) {
            this.f42476p.removeAllListeners();
            this.f42476p.cancel();
            this.f42476p = null;
        }
        Animator animatorM65191e = m65191e();
        this.f42476p = animatorM65191e;
        bt0.m103733f(animatorM65191e, new Runnable() { // from class: l.wwh
            @Override // java.lang.Runnable
            public final void run() {
                this.f188372a.m65195i();
            }
        });
        this.f42476p.setStartDelay(j);
        this.f42476p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f42476p)) {
            this.f42476p.removeAllListeners();
            this.f42476p.cancel();
            this.f42476p = null;
            m65193g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65189c(this);
        m65192f();
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42469i = new ArrayList();
        this.f42470j = new ArrayList();
        this.f42471k = t100.m186890d(26.0f);
        this.f42472l = t100.m186890d(13.0f);
        this.f42473m = 0;
        this.f42474n = t100.m186890d(7.0f);
    }

    public FeedRoamGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42469i = new ArrayList();
        this.f42470j = new ArrayList();
        this.f42471k = t100.m186890d(26.0f);
        this.f42472l = t100.m186890d(13.0f);
        this.f42473m = 0;
        this.f42474n = t100.m186890d(7.0f);
    }
}
