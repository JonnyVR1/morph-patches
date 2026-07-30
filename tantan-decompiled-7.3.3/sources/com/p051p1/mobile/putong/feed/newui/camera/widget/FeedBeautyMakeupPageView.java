package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.a30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.fo0;
import p153l.hrg;
import p153l.jyb;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedBeautyMakeupPageView f40430a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f40431b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f40432c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f40433d;

    /* JADX INFO: renamed from: e */
    public TextView f40434e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f40435f;

    /* JADX INFO: renamed from: g */
    public int f40436g;

    /* JADX INFO: renamed from: h */
    public C11348b f40437h;

    /* JADX INFO: renamed from: i */
    public C11347a f40438i;

    /* JADX INFO: renamed from: j */
    public a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> f40439j;

    /* JADX INFO: renamed from: k */
    public a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f40440k;

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> f40441l;

    /* JADX INFO: renamed from: m */
    public List<FeedMakeupPageAdapter.MakeupItem> f40442m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f40443n;

    /* JADX INFO: renamed from: o */
    public MakeUpMenuView.MakeupCategory f40444o;

    /* JADX INFO: renamed from: p */
    public int f40445p;

    /* JADX INFO: renamed from: q */
    public int f40446q;

    /* JADX INFO: renamed from: r */
    public Runnable f40447r;

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40436g = 2;
        this.f40441l = new ArrayList();
        this.f40442m = new ArrayList();
        this.f40443n = new HashMap();
        this.f40446q = 0;
        this.f40447r = new Runnable() { // from class: l.zqg
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165634h(R$string.f39764J0);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m62660A(int i, int i2) {
        C11348b c11348b = this.f40437h;
        if (c11348b != null) {
            c11348b.m62948T(i);
            this.f40435f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m62661B(int i) {
        int i2 = 0;
        if (i == 1) {
            bnl0.m105524M(this.f40432c, true);
            bnl0.m105524M(this.f40431b, false);
            int iM62534D = CameraEffectMgr.m62524V().m62534D(this.f40444o.type);
            i2 = iM62534D > 0 ? 1 : 0;
            this.f40446q = iM62534D;
        } else {
            if (this.f40444o != null && this.f40446q != 0) {
                CameraEffectMgr.m62524V().m62576m0(this.f40444o.type, this.f40446q);
            }
            bnl0.m105524M(this.f40432c, false);
            bnl0.m105524M(this.f40431b, true);
        }
        CameraEffectMgr.m62524V().m62550X().m63042s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m62662i(View view) {
        hrg.m136849a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m62663j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m62664k(int i) {
        if (this.f40438i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m62663j());
        linearLayoutManager.setOrientation(0);
        this.f40438i = new C11347a(m62663j(), i);
        this.f40431b.setLayoutManager(linearLayoutManager);
        this.f40431b.setAdapter(this.f40438i);
        this.f40438i.m62930K(m62663j(), this.f40441l);
        this.f40438i.m62928I(new a30() { // from class: l.arg
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f72933a.m62666m((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f40433d.setOnClickListener(new View.OnClickListener() { // from class: l.brg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78024a.m62667n(view);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63033j().m2984i(m62663j(), new cb50() { // from class: l.crg
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f83321a.m62668o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m62665l(int i) {
        C11348b c11348b = this.f40437h;
        if (c11348b != null) {
            c11348b.m62949U(m62663j(), this.f40442m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m62663j());
            linearLayoutManager.setOrientation(0);
            this.f40437h = new C11348b(i);
            this.f40435f.setLayoutManager(linearLayoutManager);
            this.f40435f.setAdapter(this.f40437h);
            this.f40435f.scrollToPosition(0);
            this.f40437h.m62949U(m62663j(), this.f40442m);
            this.f40437h.m62947S(new a30() { // from class: l.frg
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f100412a.m62669p((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        CameraEffectMgr.m62524V().m62550X().m63026c().m2984i(m62663j(), new cb50() { // from class: l.grg
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f106035a.m62670q((bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m62666m(MakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f40444o = makeupCategory;
        this.f40445p = num.intValue();
        if (bool.booleanValue()) {
            this.f40434e.setText(makeupCategory.name);
            a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var = this.f40439j;
            if (a30Var != null) {
                a30Var.mo37058a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m62676w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m62667n(View view) {
        m62661B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m62668o(Integer num) {
        if (num.intValue() == 4) {
            int iM62535E = CameraEffectMgr.m62524V().m62535E();
            m62679z(iM62535E, iM62535E);
            m62661B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62662i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m62669p(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f40446q = num.intValue();
        a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f40440k;
        if (a30Var != null) {
            a30Var.mo37058a(makeupItem, num, bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m62670q(bkj0 bkj0Var) {
        int iM62534D = CameraEffectMgr.m62524V().m62534D(((MakeUpMenuView.MakeupCategory) bkj0Var.f77081a).type);
        m62660A(iM62534D, iM62534D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m62671r(MakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f40447r);
        m62673t(CameraEffectMgr.m62524V().m62583q(makeupCategory, list));
        m62665l(2);
        m62661B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m62672s(List<MakeUpMenuView.MakeupCategory> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f40441l.clear();
        this.f40441l.addAll(list);
    }

    public void setOnCategoryClicked(a30<MakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var) {
        this.f40439j = a30Var;
    }

    public void setOnItemClicked(a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f40440k = a30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m62673t(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f40442m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m62674u(int i) {
        C11347a c11347a = this.f40438i;
        if (c11347a != null) {
            c11347a.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m62675v(int i) {
        C11348b c11348b = this.f40437h;
        if (c11348b != null) {
            c11348b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m62676w(final MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> listM62544Q = CameraEffectMgr.m62524V().m62544Q(makeupCategory);
        if (jyb.m147479J(listM62544Q) || listM62544Q.size() <= 1) {
            postDelayed(this.f40447r, 1500L);
            FeedModule.f39701b.m61683Q2(makeupCategory.f40065id).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.drg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90386a.m62671r(makeupCategory, (List) obj);
                }
            }, new y20() { // from class: l.erg
                @Override // p153l.y20
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m62673t(listM62544Q);
            m62665l(2);
            m62661B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m62677x() {
        CameraEffectMgr.m62524V().m62554b();
        CameraEffectMgr.m62524V().m62560e();
        CameraEffectMgr.m62524V().m62558d();
        CameraEffectMgr.m62524V().m62556c();
        CameraEffectMgr.m62524V().m62567h0(0);
        Iterator<MakeUpMenuView.MakeupCategory> it = this.f40441l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C11347a c11347a = this.f40438i;
        if (c11347a != null) {
            c11347a.m62931M(0);
            this.f40438i.notifyDataSetChanged();
        }
        this.f40431b.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: y */
    public void m62678y() {
        this.f40436g = 2;
        m62661B(2);
        C11348b c11348b = this.f40437h;
        if (c11348b != null) {
            c11348b.m62948T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m62679z(int i, int i2) {
        C11347a c11347a = this.f40438i;
        if (c11347a != null) {
            c11347a.m62929J(i);
            this.f40431b.smoothScrollToPosition(i2);
        }
    }

    public FeedBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
