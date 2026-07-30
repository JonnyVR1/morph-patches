package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.mkd0;
import p149l.n250;
import p149l.spg;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedBeautyMakeupPageView f39582a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f39583b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f39584c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f39585d;

    /* JADX INFO: renamed from: e */
    public TextView f39586e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f39587f;

    /* JADX INFO: renamed from: g */
    public int f39588g;

    /* JADX INFO: renamed from: h */
    public C11185b f39589h;

    /* JADX INFO: renamed from: i */
    public C11184a f39590i;

    /* JADX INFO: renamed from: j */
    public g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f39591j;

    /* JADX INFO: renamed from: k */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f39592k;

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> f39593l;

    /* JADX INFO: renamed from: m */
    public List<FeedMakeupPageAdapter.MakeupItem> f39594m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f39595n;

    /* JADX INFO: renamed from: o */
    public MakeUpMenuView.MakeupCategory f39596o;

    /* JADX INFO: renamed from: p */
    public int f39597p;

    /* JADX INFO: renamed from: q */
    public int f39598q;

    /* JADX INFO: renamed from: r */
    public Runnable f39599r;

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39588g = 2;
        this.f39593l = new ArrayList();
        this.f39594m = new ArrayList();
        this.f39595n = new HashMap();
        this.f39598q = 0;
        this.f39599r = new Runnable() { // from class: l.kpg
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151578h(R$string.f38916J0);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m61476A(int i, int i2) {
        C11185b c11185b = this.f39589h;
        if (c11185b != null) {
            c11185b.m61765T(i);
            this.f39587f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m61477B(int i) {
        int i2 = 0;
        if (i == 1) {
            xdl0.m208344M(this.f39584c, true);
            xdl0.m208344M(this.f39583b, false);
            int iM61350D = CameraEffectMgr.m61340V().m61350D(this.f39596o.type);
            i2 = iM61350D > 0 ? 1 : 0;
            this.f39598q = iM61350D;
        } else {
            if (this.f39596o != null && this.f39598q != 0) {
                CameraEffectMgr.m61340V().m61392m0(this.f39596o.type, this.f39598q);
            }
            xdl0.m208344M(this.f39584c, false);
            xdl0.m208344M(this.f39583b, true);
        }
        CameraEffectMgr.m61340V().m61366X().m61859s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m61478i(View view) {
        spg.m185366a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m61479j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m61480k(int i) {
        if (this.f39590i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m61479j());
        linearLayoutManager.setOrientation(0);
        this.f39590i = new C11184a(m61479j(), i);
        this.f39583b.setLayoutManager(linearLayoutManager);
        this.f39583b.setAdapter(this.f39590i);
        this.f39590i.m61747K(m61479j(), this.f39593l);
        this.f39590i.m61745I(new g30() { // from class: l.lpg
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f129205a.m61482m((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f39585d.setOnClickListener(new View.OnClickListener() { // from class: l.mpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135045a.m61483n(view);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61850j().m2983i(m61479j(), new n250() { // from class: l.npg
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f139963a.m61484o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m61481l(int i) {
        C11185b c11185b = this.f39589h;
        if (c11185b != null) {
            c11185b.m61766U(m61479j(), this.f39594m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m61479j());
            linearLayoutManager.setOrientation(0);
            this.f39589h = new C11185b(i);
            this.f39587f.setLayoutManager(linearLayoutManager);
            this.f39587f.setAdapter(this.f39589h);
            this.f39587f.scrollToPosition(0);
            this.f39589h.m61766U(m61479j(), this.f39594m);
            this.f39589h.m61764S(new g30() { // from class: l.qpg
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f155747a.m61485p((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        CameraEffectMgr.m61340V().m61366X().m61843c().m2983i(m61479j(), new n250() { // from class: l.rpg
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f160500a.m61486q((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m61482m(MakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f39596o = makeupCategory;
        this.f39597p = num.intValue();
        if (bool.booleanValue()) {
            this.f39586e.setText(makeupCategory.name);
            g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f39591j;
            if (g30Var != null) {
                g30Var.mo36055a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m61492w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m61483n(View view) {
        m61477B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m61484o(Integer num) {
        if (num.intValue() == 4) {
            int iM61351E = CameraEffectMgr.m61340V().m61351E();
            m61495z(iM61351E, iM61351E);
            m61477B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61478i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m61485p(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f39598q = num.intValue();
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f39592k;
        if (g30Var != null) {
            g30Var.mo36055a(makeupItem, num, bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m61486q(xaj0 xaj0Var) {
        int iM61350D = CameraEffectMgr.m61340V().m61350D(((MakeUpMenuView.MakeupCategory) xaj0Var.f191751a).type);
        m61476A(iM61350D, iM61350D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m61487r(MakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f39599r);
        m61489t(CameraEffectMgr.m61340V().m61399q(makeupCategory, list));
        m61481l(2);
        m61477B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m61488s(List<MakeUpMenuView.MakeupCategory> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f39593l.clear();
        this.f39593l.addAll(list);
    }

    public void setOnCategoryClicked(g30<MakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f39591j = g30Var;
    }

    public void setOnItemClicked(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f39592k = g30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m61489t(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f39594m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m61490u(int i) {
        C11184a c11184a = this.f39590i;
        if (c11184a != null) {
            c11184a.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m61491v(int i) {
        C11185b c11185b = this.f39589h;
        if (c11185b != null) {
            c11185b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m61492w(final MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> listM61360Q = CameraEffectMgr.m61340V().m61360Q(makeupCategory);
        if (vwb.m200296J(listM61360Q) || listM61360Q.size() <= 1) {
            postDelayed(this.f39599r, 1500L);
            FeedModule.f38853b.m60499Q2(makeupCategory.f39217id).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.opg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144993a.m61487r(makeupCategory, (List) obj);
                }
            }, new e30() { // from class: l.ppg
                @Override // p149l.e30
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m61489t(listM61360Q);
            m61481l(2);
            m61477B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m61493x() {
        CameraEffectMgr.m61340V().m61370b();
        CameraEffectMgr.m61340V().m61376e();
        CameraEffectMgr.m61340V().m61374d();
        CameraEffectMgr.m61340V().m61372c();
        CameraEffectMgr.m61340V().m61383h0(0);
        Iterator<MakeUpMenuView.MakeupCategory> it = this.f39593l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C11184a c11184a = this.f39590i;
        if (c11184a != null) {
            c11184a.m61748M(0);
            this.f39590i.notifyDataSetChanged();
        }
        this.f39583b.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y */
    public void m61494y() {
        this.f39588g = 2;
        m61477B(2);
        C11185b c11185b = this.f39589h;
        if (c11185b != null) {
            c11185b.m61765T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m61495z(int i, int i2) {
        C11184a c11184a = this.f39590i;
        if (c11184a != null) {
            c11184a.m61746J(i);
            this.f39583b.smoothScrollToPosition(i2);
        }
    }

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
