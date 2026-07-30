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
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p153l.a30;
import p153l.dmk0;
import p153l.fo0;
import p153l.jic0;
import p153l.o1j0;
import p153l.psd0;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11348b extends jic0<FeedMakeupPageAdapter.MakeupItem> {

    /* JADX INFO: renamed from: c */
    public Context f40696c;

    /* JADX INFO: renamed from: e */
    public FeedMakeupPageAdapter.MakeupItem f40698e;

    /* JADX INFO: renamed from: h */
    public int f40701h;

    /* JADX INFO: renamed from: i */
    public a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f40702i;

    /* JADX INFO: renamed from: j */
    public y20<Pair<FeedMakeupPageAdapter.MakeupItem, Integer>> f40703j;

    /* JADX INFO: renamed from: d */
    public List<FeedMakeupPageAdapter.MakeupItem> f40697d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f40699f = -1;

    /* JADX INFO: renamed from: g */
    public int f40700g = 0;

    public C11348b(int i) {
        this.f40701h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m62936M(Pair pair) {
        m62946R((FeedMakeupPageAdapter.MakeupItem) pair.first, ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: V */
    private void m62937V(int i) {
        int i2 = this.f40699f;
        this.f40699f = i;
        notifyItemChanged(i2, 0);
        notifyItemChanged(this.f40699f, 0);
    }

    private Act act() {
        return (Act) this.f40696c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40697d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return act().inflater().inflate(tec0.f173579T, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final FeedMakeupPageAdapter.MakeupItem makeupItem, int i, final int i2) {
        MakeupDownloadItemView makeupDownloadItemView = (MakeupDownloadItemView) view;
        boolean z = i2 == this.f40699f;
        if (makeupItem.isNone()) {
            makeupDownloadItemView.m62863b(makeupItem, z);
        } else {
            makeupDownloadItemView.m62864c(makeupItem, z, true);
        }
        makeupDownloadItemView.f40612a.setOnClickListener(new View.OnClickListener() { // from class: l.tv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f176237a.m62940K(makeupItem, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public FeedMakeupPageAdapter.MakeupItem getItem(int i) {
        return this.f40697d.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m62940K(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, View view) {
        this.f40703j.call(new Pair<>(makeupItem, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m62941L(FeedMakeupPageAdapter.MakeupItem makeupItem, int i, File file) {
        if (NullChecker.m82486a(file)) {
            makeupItem.state = 3;
            makeupItem.hasModelFile = true;
            makeupItem.modelFilePath = file.getAbsolutePath();
        } else {
            makeupItem.state = 4;
            o1j0.m165634h(R$string.f39979q1);
        }
        m62943O(makeupItem);
        if (this.f40700g == i && makeupItem.hasModelFile && NullChecker.m82486a(this.f40702i)) {
            if (i == this.f40699f) {
                return;
            }
            this.f40702i.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            m62945Q(makeupItem, i);
        }
        notifyItemChanged(i, 0);
    }

    /* JADX INFO: renamed from: O */
    public final void m62943O(FeedMakeupPageAdapter.MakeupItem makeupItem) {
        int i = makeupItem.state;
        if (i == 2 || i == 3 || i == 4) {
            CameraEffectMgr.m62524V().f40355j.m137019l(makeupItem);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m62942N(@Nullable FeedMakeupPageAdapter.MakeupItem makeupItem) {
        if (NullChecker.m82486a(this.f40697d) && NullChecker.m82486a(makeupItem)) {
            for (int i = 0; i < this.f40697d.size(); i++) {
                FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f40697d.get(i);
                if (NullChecker.m82487b(makeupItem2) && TextUtils.equals(makeupItem2.f40067id, makeupItem.f40067id)) {
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
    public void m62945Q(FeedMakeupPageAdapter.MakeupItem makeupItem, int i) {
        int i2 = this.f40699f;
        this.f40699f = i;
        this.f40698e = makeupItem;
        notifyItemChanged(i);
        notifyItemChanged(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m62946R(final FeedMakeupPageAdapter.MakeupItem makeupItem, final int i) {
        this.f40700g = i;
        if (!makeupItem.hasModelFile && !makeupItem.isNone()) {
            if (makeupItem.state == 2) {
                return;
            }
            makeupItem.state = 2;
            m62943O(makeupItem);
            act().duringCreated(FeedModule.f39701b.m61699a2(makeupItem)).subscribe(psd0.m173596G(new y20() { // from class: l.wv2
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190903a.m62941L(makeupItem, i, (File) obj);
                }
            }));
            return;
        }
        a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f40702i;
        if (a30Var != null) {
            if (i == this.f40699f) {
                return;
            } else {
                a30Var.mo37058a(makeupItem, Integer.valueOf(i), Boolean.TRUE);
            }
        }
        m62945Q(makeupItem, i);
    }

    /* JADX INFO: renamed from: S */
    public void m62947S(a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f40702i = a30Var;
    }

    /* JADX INFO: renamed from: T */
    public void m62948T(int i) {
        if (i >= this.f40697d.size()) {
            i = 0;
        }
        a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var = this.f40702i;
        if (a30Var != null) {
            a30Var.mo37058a(this.f40697d.get(i), Integer.valueOf(i), Boolean.FALSE);
        }
        m62937V(i);
    }

    /* JADX INFO: renamed from: U */
    public void m62949U(Context context, List<FeedMakeupPageAdapter.MakeupItem> list) {
        this.f40696c = context;
        this.f40697d.clear();
        this.f40703j = dmk0.m116962a(300, new y20() { // from class: l.uv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181108a.m62936M((Pair) obj);
            }
        });
        if (NullChecker.m82486a(list)) {
            this.f40697d.addAll(list);
            notifyDataSetChanged();
        }
        mo68557c(act(), CameraEffectMgr.m62524V().f40355j).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.vv2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185884a.m62942N((FeedMakeupPageAdapter.MakeupItem) obj);
            }
        }));
    }
}
