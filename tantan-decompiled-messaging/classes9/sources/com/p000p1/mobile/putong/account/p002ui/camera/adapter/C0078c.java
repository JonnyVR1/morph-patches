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
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.C0078c;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupDownloadItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.dac0;
import l.e30;
import l.g30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.xck0;
import p006l.c6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0078c extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f692c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f693d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f694e = -1;

    /* JADX INFO: renamed from: f */
    public int f695f = 0;

    /* JADX INFO: renamed from: g */
    public int f696g;

    /* JADX INFO: renamed from: h */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f697h;

    /* JADX INFO: renamed from: i */
    public e30<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f698i;

    public C0078c(int i) {
        this.f696g = i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m753F(Throwable th) {
        Objects.toString(th);
        lsi0.y("网络错误");
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m754G(Throwable th) {
        Objects.toString(th);
        lsi0.y("网络错误");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m758O(Pair pair) {
        m761T((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: Q */
    private void m760Q(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m597V().f629j.onNext(makeupItem);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m761T(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f695f = i;
        if (makeupItem.hasModelFile || makeupItem.isNone()) {
            if (NullChecker.a(this.f697h)) {
                if (i == this.f694e) {
                    return;
                } else {
                    this.f697h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
                }
            }
            m770S(i);
            return;
        }
        if (makeupItem.state == 2) {
            return;
        }
        makeupItem.state = 2;
        m760Q(makeupItem);
        act().duringCreated(SignUpAiAct.f344c.m22066B(makeupItem)).subscribe(mkd0.H(new e30() { // from class: l.oy
            public final void call(Object obj) {
                this.f18483a.m768N(makeupItem, i, (File) obj);
            }
        }, new e30() { // from class: l.py
            public final void call(Object obj) {
                C0078c.m753F((Throwable) obj);
            }
        }));
    }

    private Act act() {
        return this.f692c;
    }

    /* JADX INFO: renamed from: C */
    public int m763C() {
        return this.f693d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m764D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f9425e, viewGroup, false);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m762A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f694e;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m961b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m962c(makeupItem, z, false);
        }
        accountMakeupDownloadItemView.f840a.setOnClickListener(new View.OnClickListener() { // from class: l.ky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f16071a.m767M(makeupItem, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f693d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m767M(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f698i.call(new Pair(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m768N(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.j("网络不给力");
        }
        m760Q(makeupItem);
        if (this.f695f == i && makeupItem.hasModelFile && NullChecker.a(this.f697h)) {
            if (i == this.f694e) {
                return;
            }
            this.f697h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m770S(i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m759P(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.a(this.f693d) && NullChecker.a(makeupItem)) {
            for (int i = 0; i < this.f693d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f693d.get(i);
                if (NullChecker.b(makeupItem2) && TextUtils.equals(makeupItem2.f333id, makeupItem.f333id)) {
                    int i2 = makeupItem.state;
                    makeupItem2.state = i2;
                    if (i2 == 3) {
                        makeupItem2.hasModelFile = true;
                        makeupItem2.modelFilePath = makeupItem.modelFilePath;
                    }
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public void m770S(int i) {
        int i2 = this.f694e;
        this.f694e = i;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: U */
    public void m771U(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f697h = g30Var;
    }

    /* JADX INFO: renamed from: V */
    public void m772V(int i) {
        if (i >= this.f693d.size()) {
            i = 0;
        }
        if (NullChecker.a(this.f697h)) {
            this.f697h.a(this.f693d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m770S(i);
    }

    /* JADX INFO: renamed from: W */
    public void m773W(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f692c = context;
        this.f693d.clear();
        this.f698i = xck0.a(300, new e30() { // from class: l.ly
            public final void call(Object obj) {
                this.f16706a.m758O((Pair) obj);
            }
        });
        if (NullChecker.a(list)) {
            this.f693d.addAll(list);
            notifyDataSetChanged();
        }
        c(act(), AccountCameraEffectMgr.m597V().f629j).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.my
            public final void call(Object obj) {
                this.f17362a.m759P((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }, new e30() { // from class: l.ny
            public final void call(Object obj) {
                C0078c.m754G((Throwable) obj);
            }
        }));
    }
}
