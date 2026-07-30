package com.p051p1.mobile.putong.account.p055ui.camera.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.hec0;
import p153l.jic0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4802b extends jic0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f17416c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f17417d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f17418e = 0;

    /* JADX INFO: renamed from: f */
    public int f17419f;

    /* JADX INFO: renamed from: g */
    public boolean f17420g;

    /* JADX INFO: renamed from: h */
    public a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f17421h;

    public C4802b(int i) {
        this.f17419f = i;
    }

    /* JADX INFO: renamed from: N */
    private void m29839N(int i) {
        int i2 = this.f17418e;
        this.f17418e = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f17418e, 0);
    }

    private Act act() {
        return (Act) this.f17416c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f17417d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(hec0.f109109f, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupItemView accountMakeupItemView = (AccountMakeupItemView) view;
        boolean z = i2 == this.f17418e;
        if (makeupItem.isNone()) {
            accountMakeupItemView.m30058c(makeupItem, z);
        } else {
            int i3 = this.f17419f;
            boolean z2 = this.f17420g;
            if (i3 == 1) {
                accountMakeupItemView.m30060e(makeupItem, z, z2);
            } else {
                accountMakeupItemView.m30059d(makeupItem, z, z2);
            }
        }
        accountMakeupItemView.f17577a.setOnClickListener(new View.OnClickListener() { // from class: l.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180548a.m29843I(i2, makeupItem, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public AccountMakeupPageAdapter.MakeupItem m29841G() {
        int i = this.f17418e;
        if (i < 0 || i > this.f17417d.size()) {
            return AccountMakeupPageAdapter.MakeupItem.none();
        }
        int size = this.f17417d.size();
        int i2 = this.f17418e;
        return size > i2 ? this.f17417d.get(i2) : AccountMakeupPageAdapter.MakeupItem.none();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f17417d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m29843I(int i, AccountMakeupPageAdapter.MakeupItem makeupItem, View view) {
        if (i != this.f17418e && NullChecker.m82486a(this.f17421h)) {
            m29839N(i);
            this.f17421h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m29844J(int i) {
        this.f17418e = i;
    }

    /* JADX INFO: renamed from: K */
    public void m29845K(a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f17421h = a30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m29846L(int i) {
        int i2;
        if (i >= this.f17417d.size()) {
            i = 0;
        }
        m29839N(i);
        if (!NullChecker.m82486a(this.f17421h) || (i2 = this.f17418e) < 0) {
            return;
        }
        this.f17421h.mo37058a(this.f17417d.get(i2), Integer.valueOf(i), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public void m29847M(Context context, List<AccountMakeupPageAdapter.MakeupItem> list, boolean z) {
        this.f17420g = z;
        this.f17416c = context;
        this.f17417d.clear();
        if (NullChecker.m82486a(list)) {
            this.f17417d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
