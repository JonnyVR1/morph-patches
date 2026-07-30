package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.C0076a;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
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
import p006l.C0639dg;
import p006l.C1166qg;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountBeautyMakeupPageView f704a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f705b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f706c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f707d;

    /* JADX INFO: renamed from: e */
    public TextView f708e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f709f;

    /* JADX INFO: renamed from: g */
    public int f710g;

    /* JADX INFO: renamed from: h */
    public C0076a f711h;

    /* JADX INFO: renamed from: i */
    public C0639dg f712i;

    /* JADX INFO: renamed from: j */
    public g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f713j;

    /* JADX INFO: renamed from: k */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f714k;

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> f715l;

    /* JADX INFO: renamed from: m */
    public List<AccountMakeupPageAdapter.MakeupItem> f716m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f717n;

    /* JADX INFO: renamed from: o */
    public AccountMakeUpMenuView.MakeupCategory f718o;

    /* JADX INFO: renamed from: p */
    public int f719p;

    /* JADX INFO: renamed from: q */
    public int f720q;

    /* JADX INFO: renamed from: r */
    public Runnable f721r;

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f710g = 2;
        this.f715l = new ArrayList();
        this.f716m = new ArrayList();
        this.f717n = new HashMap();
        this.f720q = 0;
        this.f721r = new Runnable() { // from class: l.ig
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.j("滤镜资源正在加载中...");
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m791A(int i, int i2) {
        C0076a c0076a = this.f711h;
        if (c0076a != null) {
            c0076a.m737T(i);
            this.f709f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m792B(int i) {
        int i2 = 0;
        if (i == 1) {
            xdl0.M(this.f706c, true);
            xdl0.M(this.f705b, false);
            int iM607D = AccountCameraEffectMgr.m597V().m607D(this.f718o.type);
            i2 = iM607D > 0 ? 1 : 0;
            this.f720q = iM607D;
        } else {
            if (this.f718o != null && this.f720q != 0) {
                AccountCameraEffectMgr.m597V().m649m0(this.f718o.type, this.f720q);
            }
            xdl0.M(this.f706c, false);
            xdl0.M(this.f705b, true);
        }
        AccountCameraEffectMgr.m597V().m623X().m683s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m793i(View view) {
        C1166qg.m22016a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m794j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m795k(int i) {
        if (this.f712i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m794j());
        linearLayoutManager.setOrientation(0);
        this.f712i = new C0639dg(m794j(), i);
        this.f705b.setLayoutManager(linearLayoutManager);
        this.f705b.setAdapter(this.f712i);
        this.f712i.m14034K(m794j(), this.f715l);
        this.f712i.m14032I(new g30() { // from class: l.jg
            /* JADX INFO: renamed from: a */
            public final void m17438a(Object obj, Object obj2, Object obj3) {
                this.f15142a.m797m((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f707d.setOnClickListener(new View.OnClickListener() { // from class: l.kg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15806a.m798n(view);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m674j().i(m794j(), new n250() { // from class: l.lg
            public final void onChanged(Object obj) {
                this.f16404a.m799o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m796l(int i) {
        C0076a c0076a = this.f711h;
        if (c0076a != null) {
            c0076a.m738U(m794j(), this.f716m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m794j());
            linearLayoutManager.setOrientation(0);
            this.f711h = new C0076a(i);
            this.f709f.setLayoutManager(linearLayoutManager);
            this.f709f.setAdapter(this.f711h);
            this.f709f.scrollToPosition(0);
            this.f711h.m738U(m794j(), this.f716m);
            this.f711h.m736S(new g30() { // from class: l.og
                /* JADX INFO: renamed from: a */
                public final void m20611a(Object obj, Object obj2, Object obj3) {
                    this.f18224a.m800p((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        AccountCameraEffectMgr.m597V().m623X().m667c().i(m794j(), new n250() { // from class: l.pg
            public final void onChanged(Object obj) {
                this.f18720a.m801q((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m797m(AccountMakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f718o = makeupCategory;
        this.f719p = num.intValue();
        if (bool.booleanValue()) {
            this.f708e.setText(makeupCategory.name);
            g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f713j;
            if (g30Var != null) {
                g30Var.a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m807w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m798n(View view) {
        m792B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m799o(Integer num) {
        if (num.intValue() == 4) {
            int iM608E = AccountCameraEffectMgr.m597V().m608E();
            m810z(iM608E, iM608E);
            m792B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m793i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m800p(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f720q = num.intValue();
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f714k;
        if (g30Var != null) {
            g30Var.a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m801q(xaj0 xaj0Var) {
        int iM607D = AccountCameraEffectMgr.m597V().m607D(((AccountMakeUpMenuView.MakeupCategory) xaj0Var.a).type);
        m791A(iM607D, iM607D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m802r(AccountMakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f721r);
        m804t(AccountCameraEffectMgr.m597V().m656q(makeupCategory, list));
        m796l(2);
        m792B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m803s(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f715l.clear();
        this.f715l.addAll(list);
    }

    public void setOnCategoryClicked(g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f713j = g30Var;
    }

    public void setOnItemClicked(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f714k = g30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m804t(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f716m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m805u(int i) {
        C0639dg c0639dg = this.f712i;
        if (c0639dg != null) {
            c0639dg.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m806v(int i) {
        C0076a c0076a = this.f711h;
        if (c0076a != null) {
            c0076a.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m807w(final AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> listM617Q = AccountCameraEffectMgr.m597V().m617Q(makeupCategory);
        if (vwb.J(listM617Q) || listM617Q.size() <= 1) {
            postDelayed(this.f721r, 1500L);
            SignUpAiAct.f344c.m22077M(makeupCategory.f331id).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.mg
                public final void call(Object obj) {
                    this.f16960a.m802r(makeupCategory, (List) obj);
                }
            }, new e30() { // from class: l.ng
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m804t(listM617Q);
            m796l(2);
            m792B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m808x() {
        AccountCameraEffectMgr.m597V().m627b();
        AccountCameraEffectMgr.m597V().m633e();
        AccountCameraEffectMgr.m597V().m631d();
        AccountCameraEffectMgr.m597V().m629c();
        AccountCameraEffectMgr.m597V().m640h0(0);
        Iterator<AccountMakeUpMenuView.MakeupCategory> it = this.f715l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C0639dg c0639dg = this.f712i;
        if (c0639dg != null) {
            c0639dg.m14035M(0);
            this.f712i.notifyDataSetChanged();
        }
        if (NullChecker.a(this.f705b)) {
            this.f705b.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m809y() {
        this.f710g = 2;
        m792B(2);
        C0076a c0076a = this.f711h;
        if (c0076a != null) {
            c0076a.m737T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m810z(int i, int i2) {
        C0639dg c0639dg = this.f712i;
        if (c0639dg != null) {
            c0639dg.m14033J(i);
            this.f705b.smoothScrollToPosition(i2);
        }
    }

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
