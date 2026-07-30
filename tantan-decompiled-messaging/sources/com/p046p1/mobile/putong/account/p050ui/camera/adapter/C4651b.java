package com.p046p1.mobile.putong.account.p050ui.camera.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.c6c0;
import p149l.dac0;
import p149l.g30;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4651b extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f16697c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f16698d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f16699e = 0;

    /* JADX INFO: renamed from: f */
    public int f16700f;

    /* JADX INFO: renamed from: g */
    public boolean f16701g;

    /* JADX INFO: renamed from: h */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f16702h;

    public C4651b(int i) {
        this.f16700f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m28840N(int i) {
        int i2 = this.f16699e;
        this.f16699e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f16699e, 0);
    }

    private Act act() {
        return (Act) this.f16697c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f16698d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f79497f, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        boolean z = i2 == this.f16699e;
        if (makeupItem.isNone()) {
            accountMakeupItemView.m29059c(makeupItem, z);
        } else {
            int i3 = this.f16700f;
            boolean z2 = this.f16701g;
            if (i3 == 1) {
                accountMakeupItemView.m29061e(makeupItem, z, z2);
            } else {
                accountMakeupItemView.m29060d(makeupItem, z, z2);
            }
        }
        accountMakeupItemView.f16858a.setOnClickListener(new View.OnClickListener() { // from class: l.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f71372a.m28844I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public AccountMakeupPageAdapter.MakeupItem m28842G() {
        int i = this.f16699e;
        if (i < 0 || i > this.f16698d.size()) {
            return AccountMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f16698d.size();
        int i2 = this.f16699e;
        return size > i2 ? this.f16698d.get(i2) : AccountMakeupPageAdapter.MakeupItem.none();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f16698d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m28844I(int i, AccountMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f16699e && NullChecker.m81303a(this.f16702h)) {
            m28840N(i);
            this.f16702h.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m28845J(int i) {
        this.f16699e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m28846K(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f16702h = g30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m28847L(int i) {
        int i2;
        if (i >= this.f16698d.size()) {
            i = 0;
        }
        m28840N(i);
        if (!NullChecker.m81303a(this.f16702h) || (i2 = this.f16699e) < 0) {
            return;
        }
        this.f16702h.mo36055a(this.f16698d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m28848M(Context context, List<AccountMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f16701g = z;
        this.f16697c = context;
        this.f16698d.clear();
        if (NullChecker.m81303a(list)) {
            this.f16698d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
