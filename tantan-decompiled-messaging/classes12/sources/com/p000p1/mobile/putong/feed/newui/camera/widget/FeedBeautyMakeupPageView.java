package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.e30;
import l.g30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.n250;
import l.vwb;
import l.xaj0;
import l.xdl0;
import p007l.spg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedBeautyMakeupPageView f1043a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1044b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1045c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1046d;

    /* JADX INFO: renamed from: e */
    public TextView f1047e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f1048f;

    /* JADX INFO: renamed from: g */
    public int f1049g;

    /* JADX INFO: renamed from: h */
    public C2029b f1050h;

    /* JADX INFO: renamed from: i */
    public C2028a f1051i;

    /* JADX INFO: renamed from: j */
    public g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f1052j;

    /* JADX INFO: renamed from: k */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f1053k;

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> f1054l;

    /* JADX INFO: renamed from: m */
    public List<FeedMakeupPageAdapter.MakeupItem> f1055m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f1056n;

    /* JADX INFO: renamed from: o */
    public MakeUpMenuView.MakeupCategory f1057o;

    /* JADX INFO: renamed from: p */
    public int f1058p;

    /* JADX INFO: renamed from: q */
    public int f1059q;

    /* JADX INFO: renamed from: r */
    public Runnable f1060r;

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1049g = 2;
        this.f1054l = new ArrayList();
        this.f1055m = new ArrayList();
        this.f1056n = new HashMap();
        this.f1059q = 0;
        this.f1060r = new Runnable() { // from class: l.kpg
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.h(R$string.f377J0);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m2428A(int i, int i2) {
        C2029b c2029b = this.f1050h;
        if (c2029b != null) {
            c2029b.m2723T(i);
            this.f1048f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m2429B(int i) {
        int i2 = 0;
        if (i == 1) {
            xdl0.M(this.f1045c, true);
            xdl0.M(this.f1044b, false);
            int iM2299D = CameraEffectMgr.m2289V().m2299D(this.f1057o.type);
            i2 = iM2299D > 0 ? 1 : 0;
            this.f1059q = iM2299D;
        } else {
            if (this.f1057o != null && this.f1059q != 0) {
                CameraEffectMgr.m2289V().m2341m0(this.f1057o.type, this.f1059q);
            }
            xdl0.M(this.f1045c, false);
            xdl0.M(this.f1044b, true);
        }
        CameraEffectMgr.m2289V().m2315X().m2826s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m2430i(View view) {
        spg.m14278a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m2431j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m2432k(int i) {
        if (this.f1051i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m2431j());
        linearLayoutManager.setOrientation(0);
        this.f1051i = new C2028a(m2431j(), i);
        this.f1044b.setLayoutManager(linearLayoutManager);
        this.f1044b.setAdapter(this.f1051i);
        this.f1051i.m2702K(m2431j(), this.f1054l);
        this.f1051i.m2700I(new g30() { // from class: l.lpg
            /* JADX INFO: renamed from: a */
            public final void m11671a(Object obj, Object obj2, Object obj3) {
                this.f10089a.m2434m((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f1046d.setOnClickListener(new View.OnClickListener() { // from class: l.mpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10539a.m2435n(view);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2817j().i(m2431j(), new n250() { // from class: l.npg
            public final void onChanged(Object obj) {
                this.f10849a.m2436o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m2433l(int i) {
        C2029b c2029b = this.f1050h;
        if (c2029b != null) {
            c2029b.m2724U(m2431j(), this.f1055m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m2431j());
            linearLayoutManager.setOrientation(0);
            this.f1050h = new C2029b(i);
            this.f1048f.setLayoutManager(linearLayoutManager);
            this.f1048f.setAdapter(this.f1050h);
            this.f1048f.scrollToPosition(0);
            this.f1050h.m2724U(m2431j(), this.f1055m);
            this.f1050h.m2722S(new g30() { // from class: l.qpg
                /* JADX INFO: renamed from: a */
                public final void m13692a(Object obj, Object obj2, Object obj3) {
                    this.f12346a.m2437p((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        CameraEffectMgr.m2289V().m2315X().m2810c().i(m2431j(), new n250() { // from class: l.rpg
            public final void onChanged(Object obj) {
                this.f12708a.m2438q((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2434m(MakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f1057o = makeupCategory;
        this.f1058p = num.intValue();
        if (bool.booleanValue()) {
            this.f1047e.setText(makeupCategory.name);
            g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f1052j;
            if (g30Var != null) {
                g30Var.a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m2444w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2435n(View view) {
        m2429B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2436o(Integer num) {
        if (num.intValue() == 4) {
            int iM2300E = CameraEffectMgr.m2289V().m2300E();
            m2447z(iM2300E, iM2300E);
            m2429B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2430i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m2437p(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f1059q = num.intValue();
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f1053k;
        if (g30Var != null) {
            g30Var.a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2438q(xaj0 xaj0Var) {
        int iM2299D = CameraEffectMgr.m2289V().m2299D(((MakeUpMenuView.MakeupCategory) xaj0Var.a).type);
        m2428A(iM2299D, iM2299D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2439r(MakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f1060r);
        m2441t(CameraEffectMgr.m2289V().m2348q(makeupCategory, list));
        m2433l(2);
        m2429B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m2440s(List<MakeUpMenuView.MakeupCategory> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f1054l.clear();
        this.f1054l.addAll(list);
    }

    public void setOnCategoryClicked(g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f1052j = g30Var;
    }

    public void setOnItemClicked(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f1053k = g30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m2441t(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f1055m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m2442u(int i) {
        C2028a c2028a = this.f1051i;
        if (c2028a != null) {
            c2028a.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2443v(int i) {
        C2029b c2029b = this.f1050h;
        if (c2029b != null) {
            c2029b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2444w(final MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> listM2309Q = CameraEffectMgr.m2289V().m2309Q(makeupCategory);
        if (vwb.J(listM2309Q) || listM2309Q.size() <= 1) {
            postDelayed(this.f1060r, 1500L);
            FeedModule.f314b.m1425Q2(makeupCategory.f678id).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.opg
                public final void call(Object obj) {
                    this.f11551a.m2439r(makeupCategory, (List) obj);
                }
            }, new e30() { // from class: l.ppg
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m2441t(listM2309Q);
            m2433l(2);
            m2429B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2445x() {
        CameraEffectMgr.m2289V().m2319b();
        CameraEffectMgr.m2289V().m2325e();
        CameraEffectMgr.m2289V().m2323d();
        CameraEffectMgr.m2289V().m2321c();
        CameraEffectMgr.m2289V().m2332h0(0);
        Iterator<MakeUpMenuView.MakeupCategory> it = this.f1054l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C2028a c2028a = this.f1051i;
        if (c2028a != null) {
            c2028a.m2703M(0);
            this.f1051i.notifyDataSetChanged();
        }
        this.f1044b.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y */
    public void m2446y() {
        this.f1049g = 2;
        m2429B(2);
        C2029b c2029b = this.f1050h;
        if (c2029b != null) {
            c2029b.m2723T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2447z(int i, int i2) {
        C2028a c2028a = this.f1051i;
        if (c2028a != null) {
            c2028a.m2701J(i);
            this.f1044b.smoothScrollToPosition(i2);
        }
    }

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
