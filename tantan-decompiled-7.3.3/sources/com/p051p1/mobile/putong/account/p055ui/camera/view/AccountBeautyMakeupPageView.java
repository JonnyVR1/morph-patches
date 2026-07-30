package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.C4801a;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.C18389lg;
import p153l.C21567yf;
import p153l.a30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.fo0;
import p153l.jyb;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountBeautyMakeupPageView f17434a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f17435b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f17436c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f17437d;

    /* JADX INFO: renamed from: e */
    public TextView f17438e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f17439f;

    /* JADX INFO: renamed from: g */
    public int f17440g;

    /* JADX INFO: renamed from: h */
    public C4801a f17441h;

    /* JADX INFO: renamed from: i */
    public C21567yf f17442i;

    /* JADX INFO: renamed from: j */
    public a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> f17443j;

    /* JADX INFO: renamed from: k */
    public a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f17444k;

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> f17445l;

    /* JADX INFO: renamed from: m */
    public List<AccountMakeupPageAdapter.MakeupItem> f17446m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f17447n;

    /* JADX INFO: renamed from: o */
    public AccountMakeUpMenuView.MakeupCategory f17448o;

    /* JADX INFO: renamed from: p */
    public int f17449p;

    /* JADX INFO: renamed from: q */
    public int f17450q;

    /* JADX INFO: renamed from: r */
    public Runnable f17451r;

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17440g = 2;
        this.f17445l = new ArrayList();
        this.f17446m = new ArrayList();
        this.f17447n = new HashMap();
        this.f17450q = 0;
        this.f17451r = new Runnable() { // from class: l.dg
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165636j("滤镜资源正在加载中...");
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public void m29884A(int i, int i2) {
        C4801a c4801a = this.f17441h;
        if (c4801a != null) {
            c4801a.m29836T(i);
            this.f17439f.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m29885B(int i) {
        int i2 = 0;
        if (i == 1) {
            bnl0.m105524M(this.f17436c, true);
            bnl0.m105524M(this.f17435b, false);
            int iM29707D = AccountCameraEffectMgr.m29697V().m29707D(this.f17448o.type);
            i2 = iM29707D > 0 ? 1 : 0;
            this.f17450q = iM29707D;
        } else {
            if (this.f17448o != null && this.f17450q != 0) {
                AccountCameraEffectMgr.m29697V().m29749m0(this.f17448o.type, this.f17450q);
            }
            bnl0.m105524M(this.f17436c, false);
            bnl0.m105524M(this.f17435b, true);
        }
        AccountCameraEffectMgr.m29697V().m29723X().m29783s(new Pair<>((Integer) getTag(), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: i */
    public final void m29886i(View view) {
        C18389lg.m154056a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m29887j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m29888k(int i) {
        if (this.f17442i != null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m29887j());
        linearLayoutManager.setOrientation(0);
        this.f17442i = new C21567yf(m29887j(), i);
        this.f17435b.setLayoutManager(linearLayoutManager);
        this.f17435b.setAdapter(this.f17442i);
        this.f17442i.m215488K(m29887j(), this.f17445l);
        this.f17442i.m215486I(new a30() { // from class: l.eg
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f93885a.m29890m((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f17437d.setOnClickListener(new View.OnClickListener() { // from class: l.fg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98876a.m29891n(view);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29774j().m2984i(m29887j(), new cb50() { // from class: l.gg
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f103976a.m29892o((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public void m29889l(int i) {
        C4801a c4801a = this.f17441h;
        if (c4801a != null) {
            c4801a.m29837U(m29887j(), this.f17446m);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m29887j());
            linearLayoutManager.setOrientation(0);
            this.f17441h = new C4801a(i);
            this.f17439f.setLayoutManager(linearLayoutManager);
            this.f17439f.setAdapter(this.f17441h);
            this.f17439f.scrollToPosition(0);
            this.f17441h.m29837U(m29887j(), this.f17446m);
            this.f17441h.m29835S(new a30() { // from class: l.jg
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f120658a.m29893p((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
                }
            });
        }
        AccountCameraEffectMgr.m29697V().m29723X().m29767c().m2984i(m29887j(), new cb50() { // from class: l.kg
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f126537a.m29894q((bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m29890m(AccountMakeUpMenuView.MakeupCategory makeupCategory, Integer num, Boolean bool) {
        this.f17448o = makeupCategory;
        this.f17449p = num.intValue();
        if (bool.booleanValue()) {
            this.f17438e.setText(makeupCategory.name);
            a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var = this.f17443j;
            if (a30Var != null) {
                a30Var.mo37058a(makeupCategory, num, bool);
            }
            if (makeupCategory.isNone()) {
                return;
            }
            m29900w(makeupCategory);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m29891n(View view) {
        m29885B(2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m29892o(Integer num) {
        if (num.intValue() == 4) {
            int iM29708E = AccountCameraEffectMgr.m29697V().m29708E();
            m29903z(iM29708E, iM29708E);
            m29885B(2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29886i(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m29893p(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        this.f17450q = num.intValue();
        a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f17444k;
        if (a30Var != null) {
            a30Var.mo37058a(makeupItem, num, bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m29894q(bkj0 bkj0Var) {
        int iM29707D = AccountCameraEffectMgr.m29697V().m29707D(((AccountMakeUpMenuView.MakeupCategory) bkj0Var.f77081a).type);
        m29884A(iM29707D, iM29707D);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m29895r(AccountMakeUpMenuView.MakeupCategory makeupCategory, List list) {
        removeCallbacks(this.f17451r);
        m29897t(AccountCameraEffectMgr.m29697V().m29756q(makeupCategory, list));
        m29889l(2);
        m29885B(1);
    }

    /* JADX INFO: renamed from: s */
    public void m29896s(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f17445l.clear();
        this.f17445l.addAll(list);
    }

    public void setOnCategoryClicked(a30<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> a30Var) {
        this.f17443j = a30Var;
    }

    public void setOnItemClicked(a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f17444k = a30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m29897t(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f17446m = list;
    }

    /* JADX INFO: renamed from: u */
    public void m29898u(int i) {
        C21567yf c21567yf = this.f17442i;
        if (c21567yf != null) {
            c21567yf.notifyItemChanged(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m29899v(int i) {
        C4801a c4801a = this.f17441h;
        if (c4801a != null) {
            c4801a.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m29900w(final AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> listM29717Q = AccountCameraEffectMgr.m29697V().m29717Q(makeupCategory);
        if (jyb.m147479J(listM29717Q) || listM29717Q.size() <= 1) {
            postDelayed(this.f17451r, 1500L);
            SignUpAiAct.f17074c.m154186M(makeupCategory.f17061id).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.hg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109357a.m29895r(makeupCategory, (List) obj);
                }
            }, new y20() { // from class: l.ig
                @Override // p153l.y20
                public final void call(Object obj) {
                    Objects.toString((Throwable) obj);
                }
            }));
        } else {
            m29897t(listM29717Q);
            m29889l(2);
            m29885B(1);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m29901x() {
        AccountCameraEffectMgr.m29697V().m29727b();
        AccountCameraEffectMgr.m29697V().m29733e();
        AccountCameraEffectMgr.m29697V().m29731d();
        AccountCameraEffectMgr.m29697V().m29729c();
        AccountCameraEffectMgr.m29697V().m29740h0(0);
        Iterator<AccountMakeUpMenuView.MakeupCategory> it = this.f17445l.iterator();
        while (it.hasNext()) {
            it.next().all = 0.0f;
        }
        C21567yf c21567yf = this.f17442i;
        if (c21567yf != null) {
            c21567yf.m215489M(0);
            this.f17442i.notifyDataSetChanged();
        }
        if (NullChecker.m82486a(this.f17435b)) {
            this.f17435b.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m29902y() {
        this.f17440g = 2;
        m29885B(2);
        C4801a c4801a = this.f17441h;
        if (c4801a != null) {
            c4801a.m29836T(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m29903z(int i, int i2) {
        C21567yf c21567yf = this.f17442i;
        if (c21567yf != null) {
            c21567yf.m215487J(i);
            this.f17435b.smoothScrollToPosition(i2);
        }
    }

    public AccountBeautyMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyMakeupPageView(Context context) {
        this(context, null);
    }
}
