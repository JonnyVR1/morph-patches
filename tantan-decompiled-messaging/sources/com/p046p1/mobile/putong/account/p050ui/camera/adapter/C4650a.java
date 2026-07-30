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
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupDownloadItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p149l.c6c0;
import p149l.dac0;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.xck0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4650a extends dac0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f16689c;

    /* JADX INFO: renamed from: e */
    public AccountMakeupPageAdapter.MakeupItem f16691e;

    /* JADX INFO: renamed from: h */
    public int f16694h;

    /* JADX INFO: renamed from: i */
    public g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f16695i;

    /* JADX INFO: renamed from: j */
    public e30<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f16696j;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f16690d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f16692f = -1;

    /* JADX INFO: renamed from: g */
    public int f16693g = 0;

    public C4650a(int i) {
        this.f16694h = i;
    }

    /* JADX INFO: renamed from: V */
    private void m28822V(int i) {
        int i2 = this.f16692f;
        this.f16692f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f16692f, 0);
    }

    private Act act() {
        return (Act) this.f16689c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f16690d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(c6c0.f79495e, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f16692f;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m29055b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m29056c(makeupItem, z, true);
        }
        accountMakeupDownloadItemView.f16851a.setOnClickListener(new View.OnClickListener() { // from class: l.gg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f102442a.m28828K(makeupItem, i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f16690d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m28828K(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f16696j.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m28829L(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m81303a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.m151580j("网络不给力");
        }
        m28832O(makeupItem);
        if (this.f16693g == i && makeupItem.hasModelFile && NullChecker.m81303a(this.f16695i)) {
            if (i == this.f16692f) {
                return;
            }
            this.f16695i.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m28834Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m28830M(Pair pair) {
        m28835R((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: O */
    public final void m28832O(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m28698V().f16640j.m132487l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m28831N(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m81303a(this.f16690d) && NullChecker.m81303a(makeupItem)) {
            for (int i = 0; i < this.f16690d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f16690d.get(i);
                if (NullChecker.m81304b(makeupItem2) && TextUtils.equals(makeupItem2.f16344id, makeupItem.f16344id)) {
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
    public void m28834Q(AccountMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f16692f;
        this.f16692f = i;
        this.f16691e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m28835R(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f16693g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m28832O(makeupItem);
            act().duringCreated(SignUpAiAct.f16355c.m174482B(makeupItem)).subscribe(mkd0.m154955G(new e30() { // from class: l.hg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107538a.m28829L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f16695i;
        if (g30Var != null) {
            if (i == this.f16692f) {
                return;
            } else {
                g30Var.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m28834Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m28836S(g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f16695i = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m28837T(int i) {
        if (i > this.f16690d.size()) {
            i = 0;
        }
        g30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f16695i;
        if (g30Var != null) {
            g30Var.mo36055a(this.f16690d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m28822V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m28838U(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f16689c = context;
        this.f16690d.clear();
        this.f16696j = xck0.m208120a(300, new e30() { // from class: l.eg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90879a.m28830M((Pair) obj);
            }
        });
        if (NullChecker.m81303a(list)) {
            this.f16690d.addAll(list);
            notifyDataSetChanged();
        }
        mo67374c(act(), AccountCameraEffectMgr.m28698V().f16640j).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97323a.m28831N((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
