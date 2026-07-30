package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.C0077b;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.C0078c;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.g30;
import l.lsi0;
import l.n250;
import l.vwb;
import p006l.C1145ps;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupPageView f853a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f854b;

    /* JADX INFO: renamed from: c */
    public int f855c;

    /* JADX INFO: renamed from: d */
    public C0077b f856d;

    /* JADX INFO: renamed from: e */
    public C0078c f857e;

    /* JADX INFO: renamed from: f */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f858f;

    /* JADX INFO: renamed from: g */
    public List<AccountMakeUpMenuView.MakeupCategory> f859g;

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f860h;

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f855c = 2;
        this.f859g = new ArrayList();
        this.f860h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m971d(View view) {
        C1145ps.m21658a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m972e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m973f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m972e());
        linearLayoutManager.setOrientation(0);
        this.f856d = new C0077b(i);
        this.f857e = new C0078c(i);
        this.f854b.setLayoutManager(linearLayoutManager);
        this.f857e.m771U(new g30() { // from class: l.ms
            /* JADX INFO: renamed from: a */
            public final void m19504a(Object obj, Object obj2, Object obj3) {
                this.f17215a.m974g((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f856d.m749K(new g30() { // from class: l.ns
            /* JADX INFO: renamed from: a */
            public final void m20198a(Object obj, Object obj2, Object obj3) {
                this.f17828a.m975h((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m974g(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.a(this.f858f)) {
            this.f858f.a(makeupItem, num, bool);
        }
    }

    public AccountMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f856d.m745G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m975h(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.a(this.f858f)) {
            this.f858f.a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m976i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m984q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m977j(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f860h.clear();
        this.f860h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m978k(int i) {
        C0077b c0077b = this.f856d;
        if (c0077b != null) {
            c0077b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m979l() {
        C0077b c0077b = this.f856d;
        if (c0077b != null) {
            c0077b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m980m(int i, int i2, boolean z) {
        C0077b c0077b = this.f856d;
        if (c0077b != null) {
            c0077b.m750L(i);
            if (i2 >= 0) {
                this.f854b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m981n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f854b;
        if (i == 3) {
            recyclerView.setAdapter(this.f857e);
            this.f857e.m773W(m972e(), this.f860h);
        } else {
            recyclerView.setAdapter(this.f856d);
            this.f856d.m748J(i2);
            this.f856d.m751M(m972e(), this.f860h, z);
            this.f854b.scrollToPosition(i2);
        }
        AccountCameraEffectMgr.m597V().m623X().m674j().i(m972e(), new n250() { // from class: l.os
            public final void onChanged(Object obj) {
                this.f18354a.m976i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m982o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m980m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m983p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m971d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m983p(int i, int i2) {
        C0078c c0078c = this.f857e;
        if (c0078c == null) {
            lsi0.j("滤镜资源正在加载中...");
        } else {
            c0078c.m772V(i);
            this.f854b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m984q(int i) {
        if (i == 0) {
            int iM663w = AccountCameraEffectMgr.m597V().m663w();
            m982o(iM663w, iM663w);
            return;
        }
        if (i == 1) {
            int iM605A = AccountCameraEffectMgr.m597V().m605A();
            m982o(iM605A, iM605A);
        } else if (i == 2) {
            int iM613L = AccountCameraEffectMgr.m597V().m613L();
            m982o(iM613L, iM613L);
        } else {
            if (i != 3) {
                return;
            }
            int iM615O = AccountCameraEffectMgr.m597V().m615O();
            m982o(iM615O, iM615O);
        }
    }

    public void setOnItemClicked(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f858f = g30Var;
    }

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupPageView(Context context) {
        this(context, null);
    }
}
