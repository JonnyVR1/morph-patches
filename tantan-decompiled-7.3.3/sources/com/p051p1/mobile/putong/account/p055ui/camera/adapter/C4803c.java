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
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.C4803c;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupDownloadItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p153l.a30;
import p153l.dmk0;
import p153l.fo0;
import p153l.hec0;
import p153l.jic0;
import p153l.o1j0;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.c */
/* JADX INFO: loaded from: classes9.dex */
public class C4803c extends jic0<AccountMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f17422c;

    /* JADX INFO: renamed from: d */
    public List<AccountMakeupPageAdapter.MakeupItem> f17423d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f17424e = -1;

    /* JADX INFO: renamed from: f */
    public int f17425f = 0;

    /* JADX INFO: renamed from: g */
    public int f17426g;

    /* JADX INFO: renamed from: h */
    public a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> f17427h;

    /* JADX INFO: renamed from: i */
    public y20<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f17428i;

    public C4803c(int i) {
        this.f17426g = i;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m29849F(Throwable th) {
        Objects.toString(th);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m29850G(Throwable th) {
        Objects.toString(th);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m29854O(Pair pair) {
        m29857T((AccountMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: Q */
    private void m29856Q(AccountMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            AccountCameraEffectMgr.m29697V().f17359j.m137019l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m29857T(final AccountMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f17425f = i;
        if (makeupItem.hasModelFile || makeupItem.isNone()) {
            if (NullChecker.m82486a(this.f17427h)) {
                if (i == this.f17424e) {
                    return;
                } else {
                    this.f17427h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
                }
            }
            m29863S(i);
            return;
        }
        if (makeupItem.state == 2) {
            return;
        }
        makeupItem.state = 2;
        m29856Q(makeupItem);
        act().duringCreated(SignUpAiAct.f17074c.m154175B(makeupItem)).subscribe(psd0.m173597H(new y20() { // from class: l.iy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117486a.m29861N(makeupItem, i, (File) obj);
            }
        }, new y20() { // from class: l.jy
            @Override // p153l.y20
            public final void call(Object obj) {
                C4803c.m29849F((Throwable) obj);
            }
        }));
    }

    private Act act() {
        return (Act) this.f17422c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f17423d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(hec0.f109107e, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final AccountMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        AccountMakeupDownloadItemView accountMakeupDownloadItemView = (AccountMakeupDownloadItemView) view;
        boolean z = i2 == this.f17424e;
        if (makeupItem.isNone()) {
            accountMakeupDownloadItemView.m30054b(makeupItem, z);
        } else {
            accountMakeupDownloadItemView.m30055c(makeupItem, z, false);
        }
        accountMakeupDownloadItemView.f17570a.setOnClickListener(new View.OnClickListener() { // from class: l.ey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96363a.m29860M(makeupItem, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public AccountMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f17423d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m29860M(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f17428i.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m29861N(AccountMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m82486a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            o1j0.m165636j("网络不给力");
        }
        m29856Q(makeupItem);
        if (this.f17425f == i && makeupItem.hasModelFile && NullChecker.m82486a(this.f17427h)) {
            if (i == this.f17424e) {
                return;
            }
            this.f17427h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m29863S(i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m29855P(@Nullable AccountMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m82486a(this.f17423d) && NullChecker.m82486a(makeupItem)) {
            for (int i = 0; i < this.f17423d.size(); i++) {
                AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f17423d.get(i);
                if (NullChecker.m82487b(makeupItem2) && TextUtils.equals(makeupItem2.f17063id, makeupItem.f17063id)) {
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
    public void m29863S(int i) {
        int i2 = this.f17424e;
        this.f17424e = i;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: U */
    public void m29864U(a30<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f17427h = a30Var;
    }

    /* JADX INFO: renamed from: V */
    public void m29865V(int i) {
        if (i >= this.f17423d.size()) {
            i = 0;
        }
        if (NullChecker.m82486a(this.f17427h)) {
            this.f17427h.mo37058a(this.f17423d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m29863S(i);
    }

    /* JADX INFO: renamed from: W */
    public void m29866W(Context context, List<AccountMakeupPageAdapter.MakeupItem> list) {
        this.f17422c = context;
        this.f17423d.clear();
        this.f17428i = dmk0.m116962a(300, new y20() { // from class: l.fy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101333a.m29854O((Pair) obj);
            }
        });
        if (NullChecker.m82486a(list)) {
            this.f17423d.addAll(list);
            notifyDataSetChanged();
        }
        mo68557c(act(), AccountCameraEffectMgr.m29697V().f17359j).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.gy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107019a.m29855P((AccountMakeupPageAdapter.MakeupItem) obj);
            }
        }, new y20() { // from class: l.hy
            @Override // p153l.y20
            public final void call(Object obj) {
                C4803c.m29850G((Throwable) obj);
            }
        }));
    }
}
