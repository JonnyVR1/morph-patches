package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.xck0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11185b extends dac0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f39848c;

    /* JADX INFO: renamed from: e */
    public FeedMakeupPageAdapter.MakeupItem f39850e;

    /* JADX INFO: renamed from: h */
    public int f39853h;

    /* JADX INFO: renamed from: i */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f39854i;

    /* JADX INFO: renamed from: j */
    public e30<Pair<FeedMakeupPageAdapter.MakeupItem, Integer>> f39855j;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f39849d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f39851f = -1;

    /* JADX INFO: renamed from: g */
    public int f39852g = 0;

    public C11185b(int i) {
        this.f39853h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m61753M(Pair pair) {
        m61763R((FeedMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: V */
    private void m61754V(int i) {
        int i2 = this.f39851f;
        this.f39851f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f39851f, 0);
    }

    private Act act() {
        return (Act) this.f39848c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39849d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(o6c0.f142110T, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        MakeupDownloadItemView makeupDownloadItemView = (MakeupDownloadItemView) view;
        boolean z = i2 == this.f39851f;
        if (makeupItem.isNone()) {
            makeupDownloadItemView.m61679b(makeupItem, z);
        } else {
            makeupDownloadItemView.m61680c(makeupItem, z, true);
        }
        makeupDownloadItemView.f39764a.setOnClickListener(new View.OnClickListener() { // from class: l.dv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88027a.m61757K(makeupItem, i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f39849d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m61757K(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f39855j.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m61758L(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m81303a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            lsi0.m151578h(R$string.f39131q1);
        }
        m61760O(makeupItem);
        if (this.f39852g == i && makeupItem.hasModelFile && NullChecker.m81303a(this.f39854i)) {
            if (i == this.f39851f) {
                return;
            }
            this.f39854i.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m61762Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: O */
    public final void m61760O(FeedMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            CameraEffectMgr.m61340V().f39507j.m132487l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m61759N(@Nullable FeedMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m81303a(this.f39849d) && NullChecker.m81303a(makeupItem)) {
            for (int i = 0; i < this.f39849d.size(); i++) {
                FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f39849d.get(i);
                if (NullChecker.m81304b(makeupItem2) && TextUtils.equals(makeupItem2.f39219id, makeupItem.f39219id)) {
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
    public void m61762Q(FeedMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f39851f;
        this.f39851f = i;
        this.f39850e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m61763R(final FeedMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f39852g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m61760O(makeupItem);
            act().duringCreated(FeedModule.f38853b.m60515a2(makeupItem)).subscribe(mkd0.m154955G(new e30() { // from class: l.gv2
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104519a.m61758L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f39854i;
        if (g30Var != null) {
            if (i == this.f39851f) {
                return;
            } else {
                g30Var.mo36055a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m61762Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m61764S(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f39854i = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m61765T(int i) {
        if (i >= this.f39849d.size()) {
            i = 0;
        }
        g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var = this.f39854i;
        if (g30Var != null) {
            g30Var.mo36055a(this.f39849d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m61754V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m61766U(Context context, List<FeedMakeupPageAdapter.MakeupItem> list) {
        this.f39848c = context;
        this.f39849d.clear();
        this.f39855j = xck0.m208120a(300, new e30() { // from class: l.ev2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93305a.m61753M((Pair) obj);
            }
        });
        if (NullChecker.m81303a(list)) {
            this.f39849d.addAll(list);
            notifyDataSetChanged();
        }
        mo67374c(act(), CameraEffectMgr.m61340V().f39507j).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fv2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99382a.m61759N((FeedMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
