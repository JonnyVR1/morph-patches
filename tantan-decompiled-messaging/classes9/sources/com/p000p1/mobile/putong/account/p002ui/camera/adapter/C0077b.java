package com.p000p1.mobile.putong.account.p002ui.camera.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.g30;
import p006l.c6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0077b extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f686c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f687d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f688e = 0;

    /* JADX INFO: renamed from: f */
    public int f689f;

    /* JADX INFO: renamed from: g */
    public boolean f690g;

    /* JADX INFO: renamed from: h */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f691h;

    public C0077b(int i) {
        this.f689f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m740N(int i) {
        int i2 = this.f688e;
        this.f688e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f688e, 0);
    }

    private Act act() {
        return this.f686c;
    }

    /* JADX INFO: renamed from: C */
    public int m742C() {
        return this.f687d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m743D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f9427f, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m741A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        boolean z = i2 == this.f688e;
        if (makeupItem.isNone()) {
            accountMakeupItemView.m965c(makeupItem, z);
        } else {
            int i3 = this.f689f;
            boolean z2 = this.f690g;
            if (i3 == 1) {
                accountMakeupItemView.m967e(makeupItem, z, z2);
            } else {
                accountMakeupItemView.m966d(makeupItem, z, z2);
            }
        }
        accountMakeupItemView.f847a.setOnClickListener(new View.OnClickListener() { // from class: l.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8460a.m747I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public AccountMakeupPageAdapter.MakeupItem m745G() {
        int i = this.f688e;
        if (i < 0 || i > this.f687d.size()) {
            return AccountMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f687d.size();
        int i2 = this.f688e;
        return size > i2 ? this.f687d.get(i2) : AccountMakeupPageAdapter.MakeupItem.none();
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f687d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m747I(int i, AccountMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f688e && NullChecker.a(this.f691h)) {
            m740N(i);
            this.f691h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m748J(int i) {
        this.f688e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m749K(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f691h = g30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m750L(int i) {
        int i2;
        if (i >= this.f687d.size()) {
            i = 0;
        }
        m740N(i);
        if (!NullChecker.a(this.f691h) || (i2 = this.f688e) < 0) {
            return;
        }
        this.f691h.a(this.f687d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m751M(Context context, List<AccountMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f690g = z;
        this.f686c = context;
        this.f687d.clear();
        if (NullChecker.a(list)) {
            this.f687d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
