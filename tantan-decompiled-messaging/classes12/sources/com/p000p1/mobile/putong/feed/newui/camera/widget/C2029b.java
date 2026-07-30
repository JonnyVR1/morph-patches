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
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
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
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2029b extends dac0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f1309c;

    /* JADX INFO: renamed from: e */
    public FeedMakeupPageAdapter.MakeupItem f1311e;

    /* JADX INFO: renamed from: h */
    public int f1314h;

    /* JADX INFO: renamed from: i */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f1315i;

    /* JADX INFO: renamed from: j */
    public e30<Pair<FeedMakeupPageAdapter.MakeupItem, Integer>> f1316j;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f1310d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f1312f = -1;

    /* JADX INFO: renamed from: g */
    public int f1313g = 0;

    public C2029b(int i) {
        this.f1314h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m2708M(Pair pair) {
        m2721R((FeedMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: V */
    private void m2709V(int i) {
        int i2 = this.f1312f;
        this.f1312f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f1312f, 0);
    }

    private Act act() {
        return this.f1309c;
    }

    /* JADX INFO: renamed from: C */
    public int m2711C() {
        return this.f1310d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m2712D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f11129T, viewGroup, false);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m2710A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        MakeupDownloadItemView makeupDownloadItemView = (MakeupDownloadItemView) view;
        boolean z = i2 == this.f1312f;
        if (makeupItem.isNone()) {
            makeupDownloadItemView.m2631b(makeupItem, z);
        } else {
            makeupDownloadItemView.m2632c(makeupItem, z, true);
        }
        makeupDownloadItemView.f1225a.setOnClickListener(new View.OnClickListener() { // from class: l.dv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7067a.m2715K(makeupItem, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f1310d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2715K(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f1316j.call(new Pair(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2716L(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.h(R$string.f592q1);
        }
        m2718O(makeupItem);
        if (this.f1313g == i && makeupItem.hasModelFile && NullChecker.a(this.f1315i)) {
            if (i == this.f1312f) {
                return;
            }
            this.f1315i.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m2720Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: O */
    public final void m2718O(FeedMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            CameraEffectMgr.m2289V().f968j.onNext(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m2717N(@Nullable FeedMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.a(this.f1310d) && NullChecker.a(makeupItem)) {
            for (int i = 0; i < this.f1310d.size(); i++) {
                FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f1310d.get(i);
                if (NullChecker.b(makeupItem2) && TextUtils.equals(makeupItem2.f680id, makeupItem.f680id)) {
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
    public void m2720Q(FeedMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f1312f;
        this.f1312f = i;
        this.f1311e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m2721R(final FeedMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f1313g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m2718O(makeupItem);
            act().duringCreated(FeedModule.f314b.m1441a2(makeupItem)).subscribe(mkd0.G(new e30() { // from class: l.gv2
                public final void call(Object obj) {
                    this.f8522a.m2716L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f1315i;
        if (g30Var != null) {
            if (i == this.f1312f) {
                return;
            } else {
                g30Var.a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m2720Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m2722S(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f1315i = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m2723T(int i) {
        if (i >= this.f1310d.size()) {
            i = 0;
        }
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f1315i;
        if (g30Var != null) {
            g30Var.a(this.f1310d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m2709V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m2724U(Context context, List<FeedMakeupPageAdapter.MakeupItem> list) {
        this.f1309c = context;
        this.f1310d.clear();
        this.f1316j = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.ev2
            public final void call(Object obj) {
                this.f7481a.m2708M((Pair) obj);
            }
        });
        if (NullChecker.a(list)) {
            this.f1310d.addAll(list);
            notifyDataSetChanged();
        }
        c(act(), CameraEffectMgr.m2289V().f968j).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fv2
            public final void call(Object obj) {
                this.f8254a.m2717N((FeedMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
