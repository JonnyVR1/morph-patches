package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.C11354h;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p153l.a30;
import p153l.dmk0;
import p153l.fo0;
import p153l.jic0;
import p153l.o1j0;
import p153l.psd0;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.h */
/* JADX INFO: loaded from: classes13.dex */
public class C11354h extends jic0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f40742c;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f40743d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f40744e = -1;

    /* JADX INFO: renamed from: f */
    public int f40745f = 0;

    /* JADX INFO: renamed from: g */
    public int f40746g;

    /* JADX INFO: renamed from: h */
    public a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f40747h;

    /* JADX INFO: renamed from: i */
    public y20<Pair<FeedMakeupPageAdapter.MakeupItem, Integer>> f40748i;

    public C11354h(int i) {
        this.f40746g = i;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m63005G(Throwable th) {
        Objects.toString(th);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m63008J(Throwable th) {
        Objects.toString(th);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m63009O(Pair pair) {
        m63012T((FeedMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: Q */
    private void m63011Q(FeedMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            CameraEffectMgr.m62524V().f40355j.m137019l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m63012T(final FeedMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f40745f = i;
        if (makeupItem.hasModelFile || makeupItem.isNone()) {
            if (NullChecker.m82486a(this.f40747h)) {
                if (i == this.f40744e) {
                    return;
                } else {
                    this.f40747h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
                }
            }
            m63018S(i);
            return;
        }
        if (makeupItem.state == 2) {
            return;
        }
        makeupItem.state = 2;
        m63011Q(makeupItem);
        act().duringCreated(FeedModule.f39701b.m61699a2(makeupItem)).subscribe(psd0.m173597H(new y20() { // from class: l.vag0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183090a.m63016N(makeupItem, i, (File) obj);
            }
        }, new y20() { // from class: l.wag0
            @Override // p153l.y20
            public final void call(Object obj) {
                C11354h.m63008J((Throwable) obj);
            }
        }));
    }

    private Act act() {
        return (Act) this.f40742c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40743d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(tec0.f173579T, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        MakeupDownloadItemView makeupDownloadItemView = (MakeupDownloadItemView) view;
        boolean z = i2 == this.f40744e;
        if (makeupItem.isNone()) {
            makeupDownloadItemView.m62863b(makeupItem, z);
        } else {
            makeupDownloadItemView.m62864c(makeupItem, z, false);
        }
        makeupDownloadItemView.f40612a.setOnClickListener(new View.OnClickListener() { // from class: l.uag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f178206a.m63015M(makeupItem, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f40743d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m63015M(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f40748i.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m63016N(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m82486a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            o1j0.m165634h(R$string.f39979q1);
        }
        m63011Q(makeupItem);
        if (this.f40745f == i && makeupItem.hasModelFile && NullChecker.m82486a(this.f40747h)) {
            if (i == this.f40744e) {
                return;
            }
            this.f40747h.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m63018S(i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m63010P(@Nullable FeedMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m82486a(this.f40743d) && NullChecker.m82486a(makeupItem)) {
            for (int i = 0; i < this.f40743d.size(); i++) {
                FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f40743d.get(i);
                if (NullChecker.m82487b(makeupItem2) && TextUtils.equals(makeupItem2.f40067id, makeupItem.f40067id)) {
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
    public void m63018S(int i) {
        int i2 = this.f40744e;
        this.f40744e = i;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: U */
    public void m63019U(a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f40747h = a30Var;
    }

    /* JADX INFO: renamed from: V */
    public void m63020V(int i) {
        if (i >= this.f40743d.size()) {
            i = 0;
        }
        if (NullChecker.m82486a(this.f40747h)) {
            this.f40747h.mo37058a(this.f40743d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m63018S(i);
    }

    /* JADX INFO: renamed from: W */
    public void m63021W(Context context, List<FeedMakeupPageAdapter.MakeupItem> list) {
        this.f40742c = context;
        this.f40743d.clear();
        this.f40748i = dmk0.m116962a(300, new y20() { // from class: l.rag0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161931a.m63009O((Pair) obj);
            }
        });
        if (NullChecker.m82486a(list)) {
            this.f40743d.addAll(list);
            notifyDataSetChanged();
        }
        mo68557c(act(), CameraEffectMgr.m62524V().f40355j).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.sag0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167044a.m63010P((FeedMakeupPageAdapter.MakeupItem) obj);
            }
        }, new y20() { // from class: l.tag0
            @Override // p153l.y20
            public final void call(Object obj) {
                C11354h.m63005G((Throwable) obj);
            }
        }));
    }
}
