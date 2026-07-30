package com.p046p1.mobile.putong.account.p050ui.camera.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.C4652c;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupDownloadItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p149l.c6c0;
import p149l.dac0;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.xck0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4652c extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f16703c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f16704d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f16705e = -1;

    /* JADX INFO: renamed from: f */
    public int f16706f = 0;

    /* JADX INFO: renamed from: g */
    public int f16707g;

    /* JADX INFO: renamed from: h */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f16708h;

    /* JADX INFO: renamed from: i */
    public e30<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f16709i;

    public C4652c(int i) {
        this.f16707g = i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m28850F(Throwable th) {
        Objects.toString(th);
        lsi0.m151595y("网络错误");
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m28851G(Throwable th) {
        Objects.toString(th);
        lsi0.m151595y("网络错误");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m28855O(Pair pair) {
        m28858T((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: Q */
    private void m28857Q(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m28698V().f16640j.m132487l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m28858T(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f16706f = i;
        if (makeupItem.hasModelFile || makeupItem.isNone()) {
            if (NullChecker.m81303a(this.f16708h)) {
                if (i == this.f16705e) {
                    return;
                } else {
                    this.f16708h.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
                }
            }
            m28864S(i);
            return;
        }
        if (makeupItem.state == 2) {
            return;
        }
        makeupItem.state = 2;
        m28857Q(makeupItem);
        act().duringCreated(SignUpAiAct.f16355c.m174482B(makeupItem)).subscribe(mkd0.m154956H(new e30() { // from class: l.oy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146264a.m28862N(makeupItem, i, (File) obj);
            }
        }, new e30() { // from class: l.py
            @Override // p149l.e30
            public final void call(Object obj) {
                C4652c.m28850F((Throwable) obj);
            }
        }));
    }

    private Act act() {
        return (Act) this.f16703c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f16704d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f79495e, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f16705e;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m29055b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m29056c(makeupItem, z, false);
        }
        accountMakeupDownloadItemView.f16851a.setOnClickListener(new View.OnClickListener() { // from class: l.ky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f125236a.m28861M(makeupItem, i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f16704d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m28861M(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f16709i.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m28862N(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m81303a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.m151580j("网络不给力");
        }
        m28857Q(makeupItem);
        if (this.f16706f == i && makeupItem.hasModelFile && NullChecker.m81303a(this.f16708h)) {
            if (i == this.f16705e) {
                return;
            }
            this.f16708h.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m28864S(i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m28856P(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m81303a(this.f16704d) && NullChecker.m81303a(makeupItem)) {
            for (int i = 0; i < this.f16704d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f16704d.get(i);
                if (NullChecker.m81304b(makeupItem2) && TextUtils.equals(makeupItem2.f16344id, makeupItem.f16344id)) {
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
    public void m28864S(int i) {
        int i2 = this.f16705e;
        this.f16705e = i;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: U */
    public void m28865U(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f16708h = g30Var;
    }

    /* JADX INFO: renamed from: V */
    public void m28866V(int i) {
        if (i >= this.f16704d.size()) {
            i = 0;
        }
        if (NullChecker.m81303a(this.f16708h)) {
            this.f16708h.mo36055a(this.f16704d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m28864S(i);
    }

    /* JADX INFO: renamed from: W */
    public void m28867W(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f16703c = context;
        this.f16704d.clear();
        this.f16709i = xck0.m208120a(300, new e30() { // from class: l.ly
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130482a.m28855O((Pair) obj);
            }
        });
        if (NullChecker.m81303a(list)) {
            this.f16704d.addAll(list);
            notifyDataSetChanged();
        }
        mo67374c(act(), AccountCameraEffectMgr.m28698V().f16640j).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.my
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136238a.m28856P((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }, new e30() { // from class: l.ny
            @Override // p149l.e30
            public final void call(Object obj) {
                C4652c.m28851G((Throwable) obj);
            }
        }));
    }
}
