package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.C4650a;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.C16351dg;
import p149l.C19490qg;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.mkd0;
import p149l.n250;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountBeautyMakeupPageView f16715a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f16716b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f16717c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f16718d;

    /* JADX INFO: renamed from: e */
    public TextView f16719e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f16720f;

    /* JADX INFO: renamed from: g */
    public int f16721g;

    /* JADX INFO: renamed from: h */
    public C4650a f16722h;

    /* JADX INFO: renamed from: i */
    public C16351dg f16723i;

    /* JADX INFO: renamed from: j */
    public g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f16724j;

    /* JADX INFO: renamed from: k */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f16725k;

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> f16726l;

    /* JADX INFO: renamed from: m */
    public List<AccountMakeupPageAdapter.MakeupItem> f16727m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f16728n;

    /* JADX INFO: renamed from: o */
    public AccountMakeUpMenuView.MakeupCategory f16729o;

    /* JADX INFO: renamed from: p */
    public int f16730p;

    /* JADX INFO: renamed from: q */
    public int f16731q;

    /* JADX INFO: renamed from: r */
    public Runnable f16732r;

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16721g = 2;
        this.f16726l = new ArrayList();
        this.f16727m = new ArrayList();
        this.f16728n = new HashMap();
        this.f16731q = 0;
        this.f16732r = new Runnable() { // from class: l.ig
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151580j("滤镜资源正在加载中...");
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m28885A(int i, int i2) {
        C4650a c4650a = this.f16722h;
        if (c4650a != null) {
            c4650a.m28837T(i);
            this.f16720f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m28886B(int i) {
        int i2 = 0;
        if (i == 1) {
            xdl0.m208344M(this.f16717c, true);
            xdl0.m208344M(this.f16716b, false);
            int iM28708D = AccountCameraEffectMgr.m28698V().m28708D(this.f16729o.type);
            i2 = iM28708D > 0 ? 1 : 0;
            this.f16731q = iM28708D;
        } else {
            if (this.f16729o != null && this.f16731q != 0) {
                AccountCameraEffectMgr.m28698V().m28750m0(this.f16729o.type, this.f16731q);
            }
            xdl0.m208344M(this.f16717c, false);
            xdl0.m208344M(this.f16716b, true);
        }
        AccountCameraEffectMgr.m28698V().m28724X().m28784s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m28887i(View view) {
        C19490qg.m174378a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m28888j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m28889k(int i) {
        if (this.f16723i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m28888j());
        linearLayoutManager.setOrientation(0);
        this.f16723i = new C16351dg(m28888j(), i);
        this.f16716b.setLayoutManager(linearLayoutManager);
        this.f16716b.setAdapter(this.f16723i);
        this.f16723i.m111538K(m28888j(), this.f16726l);
        this.f16723i.m111536I(new g30() { // from class: l.jg
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f117703a.m28891m((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f16718d.setOnClickListener(new View.OnClickListener() { // from class: l.kg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122988a.m28892n(view);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28775j().m2983i(m28888j(), new n250() { // from class: l.lg
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f127938a.m28893o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m28890l(int i) {
        C4650a c4650a = this.f16722h;
        if (c4650a != null) {
            c4650a.m28838U(m28888j(), this.f16727m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m28888j());
            linearLayoutManager.setOrientation(0);
            this.f16722h = new C4650a(i);
            this.f16720f.setLayoutManager(linearLayoutManager);
            this.f16720f.setAdapter(this.f16722h);
            this.f16720f.scrollToPosition(0);
            this.f16722h.m28838U(m28888j(), this.f16727m);
            this.f16722h.m28836S(new g30() { // from class: l.og
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f143794a.m28894p((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        AccountCameraEffectMgr.m28698V().m28724X().m28768c().m2983i(m28888j(), new n250() { // from class: l.pg
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f148603a.m28895q((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m28891m(AccountMakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f16729o = makeupCategory;
        this.f16730p = num.intValue();
        if (bool.booleanValue()) {
            this.f16719e.setText(makeupCategory.name);
            g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var = this.f16724j;
            if (g30Var != null) {
                g30Var.mo36055a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m28901w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m28892n(View view) {
        m28886B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m28893o(Integer num) {
        if (num.intValue() == 4) {
            int iM28709E = AccountCameraEffectMgr.m28698V().m28709E();
            m28904z(iM28709E, iM28709E);
            m28886B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28887i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m28894p(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f16731q = num.intValue();
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f16725k;
        if (g30Var != null) {
            g30Var.mo36055a(makeupItem, num, bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m28895q(xaj0 xaj0Var) {
        int iM28708D = AccountCameraEffectMgr.m28698V().m28708D(((AccountMakeUpMenuView.MakeupCategory) xaj0Var.f191751a).type);
        m28885A(iM28708D, iM28708D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m28896r(AccountMakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f16732r);
        m28898t(AccountCameraEffectMgr.m28698V().m28757q(makeupCategory, list));
        m28890l(2);
        m28886B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m28897s(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f16726l.clear();
        this.f16726l.addAll(list);
    }

    public void setOnCategoryClicked(g30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> g30Var) {
        this.f16724j = g30Var;
    }

    public void setOnItemClicked(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f16725k = g30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m28898t(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f16727m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m28899u(int i) {
        C16351dg c16351dg = this.f16723i;
        if (c16351dg != null) {
            c16351dg.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m28900v(int i) {
        C4650a c4650a = this.f16722h;
        if (c4650a != null) {
            c4650a.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m28901w(final AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> listM28718Q = AccountCameraEffectMgr.m28698V().m28718Q(makeupCategory);
        if (vwb.m200296J(listM28718Q) || listM28718Q.size() <= 1) {
            postDelayed(this.f16732r, 1500L);
            SignUpAiAct.f16355c.m174493M(makeupCategory.f16342id).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.mg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133632a.m28896r(makeupCategory, (List) obj);
                }
            }, new e30() { // from class: l.ng
                @Override // p149l.e30
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m28898t(listM28718Q);
            m28890l(2);
            m28886B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m28902x() {
        AccountCameraEffectMgr.m28698V().m28728b();
        AccountCameraEffectMgr.m28698V().m28734e();
        AccountCameraEffectMgr.m28698V().m28732d();
        AccountCameraEffectMgr.m28698V().m28730c();
        AccountCameraEffectMgr.m28698V().m28741h0(0);
        Iterator<AccountMakeUpMenuView.MakeupCategory> it = this.f16726l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C16351dg c16351dg = this.f16723i;
        if (c16351dg != null) {
            c16351dg.m111539M(0);
            this.f16723i.notifyDataSetChanged();
        }
        if (NullChecker.m81303a(this.f16716b)) {
            this.f16716b.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m28903y() {
        this.f16721g = 2;
        m28886B(2);
        C4650a c4650a = this.f16722h;
        if (c4650a != null) {
            c4650a.m28837T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m28904z(int i, int i2) {
        C16351dg c16351dg = this.f16723i;
        if (c16351dg != null) {
            c16351dg.m111537J(i);
            this.f16716b.smoothScrollToPosition(i2);
        }
    }

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
