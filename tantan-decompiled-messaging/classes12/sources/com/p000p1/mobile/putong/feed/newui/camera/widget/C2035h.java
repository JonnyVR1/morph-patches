package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.C2035h;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
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
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.h */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2035h extends dac0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f1355c;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f1356d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f1357e = -1;

    /* JADX INFO: renamed from: f */
    public int f1358f = 0;

    /* JADX INFO: renamed from: g */
    public int f1359g;

    /* JADX INFO: renamed from: h */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f1360h;

    /* JADX INFO: renamed from: i */
    public e30<Pair<FeedMakeupPageAdapter.MakeupItem, Integer>> f1361i;

    public C2035h(int i) {
        this.f1359g = i;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m2786G(Throwable th) {
        Objects.toString(th);
        lsi0.y("网络错误");
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m2789J(Throwable th) {
        Objects.toString(th);
        lsi0.y("网络错误");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m2790O(Pair pair) {
        m2793T((FeedMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: Q */
    private void m2792Q(FeedMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            CameraEffectMgr.m2289V().f968j.onNext(makeupItem);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m2793T(final FeedMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f1358f = i;
        if (makeupItem.hasModelFile || makeupItem.isNone()) {
            if (NullChecker.a(this.f1360h)) {
                if (i == this.f1357e) {
                    return;
                } else {
                    this.f1360h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
                }
            }
            m2802S(i);
            return;
        }
        if (makeupItem.state == 2) {
            return;
        }
        makeupItem.state = 2;
        m2792Q(makeupItem);
        act().duringCreated(FeedModule.f314b.m1441a2(makeupItem)).subscribe(mkd0.H(new e30() { // from class: l.o2g0
            public final void call(Object obj) {
                this.f10984a.m2800N(makeupItem, i, (File) obj);
            }
        }, new e30() { // from class: l.p2g0
            public final void call(Object obj) {
                C2035h.m2789J((Throwable) obj);
            }
        }));
    }

    private Act act() {
        return this.f1355c;
    }

    /* JADX INFO: renamed from: C */
    public int m2795C() {
        return this.f1356d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m2796D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f11129T, viewGroup, false);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m2794A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        MakeupDownloadItemView makeupDownloadItemView = (MakeupDownloadItemView) view;
        boolean z = i2 == this.f1357e;
        if (makeupItem.isNone()) {
            makeupDownloadItemView.m2631b(makeupItem, z);
        } else {
            makeupDownloadItemView.m2632c(makeupItem, z, false);
        }
        makeupDownloadItemView.f1225a.setOnClickListener(new View.OnClickListener() { // from class: l.n2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10629a.m2799M(makeupItem, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f1356d.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2799M(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f1361i.call(new Pair(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m2800N(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.h(R$string.f592q1);
        }
        m2792Q(makeupItem);
        if (this.f1358f == i && makeupItem.hasModelFile && NullChecker.a(this.f1360h)) {
            if (i == this.f1357e) {
                return;
            }
            this.f1360h.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m2802S(i);
        }
        notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m2791P(@Nullable FeedMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.a(this.f1356d) && NullChecker.a(makeupItem)) {
            for (int i = 0; i < this.f1356d.size(); i++) {
                FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f1356d.get(i);
                if (NullChecker.b(makeupItem2) && TextUtils.equals(makeupItem2.f680id, makeupItem.f680id)) {
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
    public void m2802S(int i) {
        int i2 = this.f1357e;
        this.f1357e = i;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: U */
    public void m2803U(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f1360h = g30Var;
    }

    /* JADX INFO: renamed from: V */
    public void m2804V(int i) {
        if (i >= this.f1356d.size()) {
            i = 0;
        }
        if (NullChecker.a(this.f1360h)) {
            this.f1360h.a(this.f1356d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m2802S(i);
    }

    /* JADX INFO: renamed from: W */
    public void m2805W(Context context, List<FeedMakeupPageAdapter.MakeupItem> list) {
        this.f1355c = context;
        this.f1356d.clear();
        this.f1361i = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.k2g0
            public final void call(Object obj) {
                this.f9577a.m2790O((Pair) obj);
            }
        });
        if (NullChecker.a(list)) {
            this.f1356d.addAll(list);
            notifyDataSetChanged();
        }
        c(act(), CameraEffectMgr.m2289V().f968j).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.l2g0
            public final void call(Object obj) {
                this.f9851a.m2791P((FeedMakeupPageAdapter.MakeupItem) obj);
            }
        }, new e30() { // from class: l.m2g0
            public final void call(Object obj) {
                C2035h.m2786G((Throwable) obj);
            }
        }));
    }
}
