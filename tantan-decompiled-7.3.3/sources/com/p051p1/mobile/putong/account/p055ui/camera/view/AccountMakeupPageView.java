package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.C4802b;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.C4803c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p153l.C18021js;
import p153l.a30;
import p153l.cb50;
import p153l.jyb;
import p153l.o1j0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupPageView f17583a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f17584b;

    /* JADX INFO: renamed from: c */
    public int f17585c;

    /* JADX INFO: renamed from: d */
    public C4802b f17586d;

    /* JADX INFO: renamed from: e */
    public C4803c f17587e;

    /* JADX INFO: renamed from: f */
    public a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f17588f;

    /* JADX INFO: renamed from: g */
    public List<AccountMakeUpMenuView.MakeupCategory> f17589g;

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f17590h;

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17585c = 2;
        this.f17589g = new ArrayList();
        this.f17590h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m30064d(View view) {
        C18021js.m146832a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m30065e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m30066f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m30065e());
        linearLayoutManager.setOrientation(0);
        this.f17586d = new C4802b(i);
        this.f17587e = new C4803c(i);
        this.f17584b.setLayoutManager(linearLayoutManager);
        this.f17587e.m29864U(new a30() { // from class: l.gs
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f106215a.m30067g((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f17586d.m29845K(new a30() { // from class: l.hs
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f111397a.m30068h((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m30067g(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m82486a(this.f17588f)) {
            this.f17588f.mo37058a(makeupItem, num, bool);
        }
    }

    public AccountMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f17586d.m29841G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m30068h(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m82486a(this.f17588f)) {
            this.f17588f.mo37058a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m30069i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m30077q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m30070j(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f17590h.clear();
        this.f17590h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m30071k(int i) {
        C4802b c4802b = this.f17586d;
        if (c4802b != null) {
            c4802b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m30072l() {
        C4802b c4802b = this.f17586d;
        if (c4802b != null) {
            c4802b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m30073m(int i, int i2, boolean z) {
        C4802b c4802b = this.f17586d;
        if (c4802b != null) {
            c4802b.m29846L(i);
            if (i2 >= 0) {
                this.f17584b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m30074n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f17584b;
        if (i == 3) {
            recyclerView.setAdapter(this.f17587e);
            this.f17587e.m29866W(m30065e(), this.f17590h);
        } else {
            recyclerView.setAdapter(this.f17586d);
            this.f17586d.m29844J(i2);
            this.f17586d.m29847M(m30065e(), this.f17590h, z);
            this.f17584b.scrollToPosition(i2);
        }
        AccountCameraEffectMgr.m29697V().m29723X().m29774j().m2984i(m30065e(), new cb50() { // from class: l.is
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f116615a.m30069i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m30075o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m30073m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m30076p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30064d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m30076p(int i, int i2) {
        C4803c c4803c = this.f17587e;
        if (c4803c == null) {
            o1j0.m165636j("滤镜资源正在加载中...");
        } else {
            c4803c.m29865V(i);
            this.f17584b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m30077q(int i) {
        if (i == 0) {
            int iM29763w = AccountCameraEffectMgr.m29697V().m29763w();
            m30075o(iM29763w, iM29763w);
            return;
        }
        if (i == 1) {
            int iM29705A = AccountCameraEffectMgr.m29697V().m29705A();
            m30075o(iM29705A, iM29705A);
        } else if (i == 2) {
            int iM29713L = AccountCameraEffectMgr.m29697V().m29713L();
            m30075o(iM29713L, iM29713L);
        } else {
            if (i != 3) {
                return;
            }
            int iM29715O = AccountCameraEffectMgr.m29697V().m29715O();
            m30075o(iM29715O, iM29715O);
        }
    }

    public void setOnItemClicked(a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f17588f = a30Var;
    }

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupPageView(Context context) {
        this(context, null);
    }
}
