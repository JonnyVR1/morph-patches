package com.p051p1.mobile.putong.account.p055ui.camera.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupDownloadItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.dmk0;
import p153l.fo0;
import p153l.hec0;
import p153l.jic0;
import p153l.o1j0;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4801a extends jic0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f17408c;

    /* JADX INFO: renamed from: e */
    public AccountMakeupPageAdapter.MakeupItem f17410e;

    /* JADX INFO: renamed from: h */
    public int f17413h;

    /* JADX INFO: renamed from: i */
    public a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f17414i;

    /* JADX INFO: renamed from: j */
    public y20<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f17415j;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f17409d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f17411f = -1;

    /* JADX INFO: renamed from: g */
    public int f17412g = 0;

    public C4801a(int i) {
        this.f17413h = i;
    }

    /* JADX INFO: renamed from: V */
    private void m29821V(int i) {
        int i2 = this.f17411f;
        this.f17411f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f17411f, 0);
    }

    private Act act() {
        return (Act) this.f17408c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f17409d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(hec0.f109107e, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f17411f;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m30054b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m30055c(makeupItem, z, true);
        }
        accountMakeupDownloadItemView.f17570a.setOnClickListener(new View.OnClickListener() { // from class: l.bg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76556a.m29827K(makeupItem, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f17409d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m29827K(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f17415j.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m29828L(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m82486a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            o1j0.m165636j("网络不给力");
        }
        m29831O(makeupItem);
        if (this.f17412g == i && makeupItem.hasModelFile && NullChecker.m82486a(this.f17414i)) {
            if (i == this.f17411f) {
                return;
            }
            this.f17414i.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m29833Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m29829M(Pair pair) {
        m29834R((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: O */
    public final void m29831O(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m29697V().f17359j.m137019l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m29830N(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m82486a(this.f17409d) && NullChecker.m82486a(makeupItem)) {
            for (int i = 0; i < this.f17409d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f17409d.get(i);
                if (NullChecker.m82487b(makeupItem2) && TextUtils.equals(makeupItem2.f17063id, makeupItem.f17063id)) {
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
    public void m29833Q(AccountMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f17411f;
        this.f17411f = i;
        this.f17410e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m29834R(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f17412g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m29831O(makeupItem);
            act().duringCreated(SignUpAiAct.f17074c.m154175B(makeupItem)).subscribe(psd0.m173596G(new y20() { // from class: l.cg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81611a.m29828L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f17414i;
        if (a30Var != null) {
            if (i == this.f17411f) {
                return;
            } else {
                a30Var.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m29833Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m29835S(a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f17414i = a30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m29836T(int i) {
        if (i > this.f17409d.size()) {
            i = 0;
        }
        a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f17414i;
        if (a30Var != null) {
            a30Var.mo37058a(this.f17409d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m29821V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m29837U(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f17408c = context;
        this.f17409d.clear();
        this.f17415j = dmk0.m116962a(300, new y20() { // from class: l.zf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204098a.m29829M((Pair) obj);
            }
        });
        if (NullChecker.m82486a(list)) {
            this.f17409d.addAll(list);
            notifyDataSetChanged();
        }
        mo68557c(act(), AccountCameraEffectMgr.m29697V().f17359j).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ag
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71075a.m29830N((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
