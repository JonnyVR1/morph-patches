package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.C4651b;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.C4652c;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p149l.C19321ps;
import p149l.g30;
import p149l.lsi0;
import p149l.n250;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupPageView f16864a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f16865b;

    /* JADX INFO: renamed from: c */
    public int f16866c;

    /* JADX INFO: renamed from: d */
    public C4651b f16867d;

    /* JADX INFO: renamed from: e */
    public C4652c f16868e;

    /* JADX INFO: renamed from: f */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f16869f;

    /* JADX INFO: renamed from: g */
    public List<AccountMakeUpMenuView.MakeupCategory> f16870g;

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f16871h;

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16866c = 2;
        this.f16870g = new ArrayList();
        this.f16871h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m29065d(View view) {
        C19321ps.m171094a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m29066e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m29067f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m29066e());
        linearLayoutManager.setOrientation(0);
        this.f16867d = new C4651b(i);
        this.f16868e = new C4652c(i);
        this.f16865b.setLayoutManager(linearLayoutManager);
        this.f16868e.m28865U(new g30() { // from class: l.ms
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f135432a.m29068g((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f16867d.m28846K(new g30() { // from class: l.ns
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f140232a.m29069h((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m29068g(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m81303a(this.f16869f)) {
            this.f16869f.mo36055a(makeupItem, num, bool);
        }
    }

    public AccountMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f16867d.m28842G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m29069h(AccountMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m81303a(this.f16869f)) {
            this.f16869f.mo36055a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m29070i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m29078q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m29071j(List<AccountMakeupPageAdapter.MakeupItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f16871h.clear();
        this.f16871h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m29072k(int i) {
        C4651b c4651b = this.f16867d;
        if (c4651b != null) {
            c4651b.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m29073l() {
        C4651b c4651b = this.f16867d;
        if (c4651b != null) {
            c4651b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29074m(int i, int i2, boolean z) {
        C4651b c4651b = this.f16867d;
        if (c4651b != null) {
            c4651b.m28847L(i);
            if (i2 >= 0) {
                this.f16865b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m29075n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f16865b;
        if (i == 3) {
            recyclerView.setAdapter(this.f16868e);
            this.f16868e.m28867W(m29066e(), this.f16871h);
        } else {
            recyclerView.setAdapter(this.f16867d);
            this.f16867d.m28845J(i2);
            this.f16867d.m28848M(m29066e(), this.f16871h, z);
            this.f16865b.scrollToPosition(i2);
        }
        AccountCameraEffectMgr.m28698V().m28724X().m28775j().m2983i(m29066e(), new n250() { // from class: l.os
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f145367a.m29070i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m29076o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m29074m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m29077p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29065d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m29077p(int i, int i2) {
        C4652c c4652c = this.f16868e;
        if (c4652c == null) {
            lsi0.m151580j("滤镜资源正在加载中...");
        } else {
            c4652c.m28866V(i);
            this.f16865b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m29078q(int i) {
        if (i == 0) {
            int iM28764w = AccountCameraEffectMgr.m28698V().m28764w();
            m29076o(iM28764w, iM28764w);
            return;
        }
        if (i == 1) {
            int iM28706A = AccountCameraEffectMgr.m28698V().m28706A();
            m29076o(iM28706A, iM28706A);
        } else if (i == 2) {
            int iM28714L = AccountCameraEffectMgr.m28698V().m28714L();
            m29076o(iM28714L, iM28714L);
        } else {
            if (i != 3) {
                return;
            }
            int iM28716O = AccountCameraEffectMgr.m28698V().m28716O();
            m29076o(iM28716O, iM28716O);
        }
    }

    public void setOnItemClicked(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f16869f = g30Var;
    }

    public AccountMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeupPageView(Context context) {
        this(context, null);
    }
}
