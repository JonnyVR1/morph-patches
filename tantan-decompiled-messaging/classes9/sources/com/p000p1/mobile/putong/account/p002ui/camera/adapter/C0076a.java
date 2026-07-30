package com.p000p1.mobile.putong.account.p002ui.camera.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupDownloadItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.g30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xck0;
import p006l.c6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0076a extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f678c;

    /* JADX INFO: renamed from: e */
    public AccountMakeupPageAdapter.MakeupItem f680e;

    /* JADX INFO: renamed from: h */
    public int f683h;

    /* JADX INFO: renamed from: i */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f684i;

    /* JADX INFO: renamed from: j */
    public e30<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f685j;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f679d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f681f = -1;

    /* JADX INFO: renamed from: g */
    public int f682g = 0;

    public C0076a(int i) {
        this.f683h = i;
    }

    /* JADX INFO: renamed from: V */
    private void m722V(int i) {
        int i2 = this.f681f;
        this.f681f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f681f, 0);
    }

    private Act act() {
        return this.f678c;
    }

    /* JADX INFO: renamed from: C */
    public int m724C() {
        return this.f679d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m725D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f9425e, viewGroup, false);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m723A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f681f;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m961b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m962c(makeupItem, z, true);
        }
        accountMakeupDownloadItemView.f840a.setOnClickListener(new View.OnClickListener() { // from class: l.gg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13307a.m728K(makeupItem, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f679d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m728K(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f685j.call(new Pair(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m729L(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.j("网络不给力");
        }
        m732O(makeupItem);
        if (this.f682g == i && makeupItem.hasModelFile && NullChecker.a(this.f684i)) {
            if (i == this.f681f) {
                return;
            }
            this.f684i.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m734Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m730M(Pair pair) {
        m735R((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: O */
    public final void m732O(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m597V().f629j.onNext(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m731N(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.a(this.f679d) && NullChecker.a(makeupItem)) {
            for (int i = 0; i < this.f679d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f679d.get(i);
                if (NullChecker.b(makeupItem2) && TextUtils.equals(makeupItem2.f333id, makeupItem.f333id)) {
                    int i2 = makeupItem.state;
                    makeupItem2.state = i2;
                    if (i2 == 3) {
                        makeupItem2.hasModelFile = true;
                        makeupItem2.modelFilePath = makeupItem.modelFilePath;
                    }
                    notifyItemChanged(i, 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m734Q(AccountMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f681f;
        this.f681f = i;
        this.f680e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m735R(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f682g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m732O(makeupItem);
            act().duringCreated(SignUpAiAct.f344c.m22066B(makeupItem)).subscribe(mkd0.G(new e30() { // from class: l.hg
                public final void call(Object obj) {
                    this.f13867a.m729L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f684i;
        if (g30Var != null) {
            if (i == this.f681f) {
                return;
            } else {
                g30Var.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m734Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m736S(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f684i = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m737T(int i) {
        if (i > this.f679d.size()) {
            i = 0;
        }
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f684i;
        if (g30Var != null) {
            g30Var.a(this.f679d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m722V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m738U(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f678c = context;
        this.f679d.clear();
        this.f685j = xck0.a(300, new e30() { // from class: l.eg
            public final void call(Object obj) {
                this.f11131a.m730M((Pair) obj);
            }
        });
        if (NullChecker.a(list)) {
            this.f679d.addAll(list);
            notifyDataSetChanged();
        }
        c(act(), AccountCameraEffectMgr.m597V().f629j).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fg
            public final void call(Object obj) {
                this.f12708a.m731N((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
