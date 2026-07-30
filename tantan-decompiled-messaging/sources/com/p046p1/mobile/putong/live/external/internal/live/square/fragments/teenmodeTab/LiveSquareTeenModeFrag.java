package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.d1q;
import p149l.d30;
import p149l.e30;
import p149l.g0u;
import p149l.g4u;
import p149l.hnc0;
import p149l.mss;
import p149l.s7m;
import p149l.t100;
import p149l.u3u;
import p149l.v3u;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareTeenModeFrag extends LiveSquareBaseListFrag implements s7m<g4u> {

    /* JADX INFO: renamed from: L */
    public g4u f45018L;

    /* JADX INFO: renamed from: M */
    public LiveBaseAdapter f45019M = new LiveBaseAdapter();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag$a */
    public class C12496a extends GridLayoutManager.AbstractC0553c {
        public C12496a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return Math.max(LiveSquareTeenModeFrag.this.f45019M.m67356K(i), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public void m69121C5() {
        if (NullChecker.m81303a(this.f45018L)) {
            this.f45018L.mo69117n();
        }
    }

    /* JADX INFO: renamed from: z5 */
    public static /* synthetic */ void m69125z5(Bundle bundle) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: B5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(g4u g4uVar) {
        this.f45018L = g4uVar;
        g4uVar.mo69101I2();
        if (this.loaded) {
            return;
        }
        g4uVar.m124421o3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: D5 */
    public final g0u m69127D5(u3u u3uVar, List<d1q<?>> list) {
        return new g0u(this.layoutColumnNum, u3uVar.m191619a(), !vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m69128E5(Integer num) {
        if (num.intValue() >= this.f45019M.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f45018L.m124422p3();
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m69129F5(BLiveTeenagerLive bLiveTeenagerLive, View view) {
        BLive bLiveNew_ = BLive.new_();
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveNew_.streamUrl = bLiveStreamUrlNew_;
        bLiveStreamUrlNew_.pullFlv = bLiveTeenagerLive.mediaUrl;
        this.f45018L.m124423q3(bLiveNew_, this.tabInfo.name, bLiveNew_.recommendInfo.category);
    }

    /* JADX INFO: renamed from: G5 */
    public void m69130G5() {
        m69043v5();
    }

    /* JADX INFO: renamed from: H5 */
    public void m69131H5() {
        LiveBaseAdapter liveBaseAdapter = this.f45019M;
        if (liveBaseAdapter == null) {
            return;
        }
        m70816h5(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: I5 */
    public void m69132I5() {
        this.f44998z.m223766k();
    }

    /* JADX INFO: renamed from: J5 */
    public void m69133J5(Throwable th) {
        m69042u5();
    }

    /* JADX INFO: renamed from: K5 */
    public void m69134K5(u3u u3uVar) {
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        for (final BLiveTeenagerLive bLiveTeenagerLive : u3uVar.f173650a) {
            v3u v3uVar = new v3u(bLiveTeenagerLive, this.layoutColumnNum);
            v3uVar.mo109662A(new View.OnClickListener() { // from class: l.t3u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f167655a.m69129F5(bLiveTeenagerLive, view);
                }
            });
            v3uVar.m109663B(pageId());
            arrayList.add(v3uVar);
        }
        boolean z = !vwb.m200296J(arrayList);
        m69041t5(z, z);
        arrayList.add(m69127D5(u3uVar, arrayList));
        int itemCount = this.f45019M.getItemCount();
        boolean zM191621c = u3uVar.m191621c();
        LiveBaseAdapter liveBaseAdapter = this.f45019M;
        if (!zM191621c) {
            liveBaseAdapter.m67372a0(arrayList, false);
        } else {
            liveBaseAdapter.m67373b0(arrayList);
            this.f45019M.notifyItemRangeChanged(itemCount - 1, (arrayList.size() - itemCount) + 1);
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        g4u g4uVar = new g4u(this, new mss(m70813Z4(), this));
        g4uVar.m220948S2(this.tabInfo);
        g4uVar.mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        mo57954w2(this.f44998z);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: a5 */
    public int mo69135a5() {
        return t100.m186890d(44.0f);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.q3u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareTeenModeFrag.m69125z5((Bundle) obj);
            }
        }, new d30() { // from class: l.r3u
            @Override // p149l.d30
            public final void call() {
                this.f157611a.m69121C5();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 2;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), this.layoutColumnNum);
        gridLayoutManager.m3326v(new C12496a());
        this.f44989C.setLayoutManager(gridLayoutManager);
        this.f45019M.m67369X(false);
        this.f45019M.m67375c0(new e30() { // from class: l.s3u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162195a.m69128E5((Integer) obj);
            }
        });
        this.f44989C.setAdapter(this.f45019M);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_teen_mode";
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        g4u g4uVar = this.f45018L;
        if (g4uVar != null) {
            g4uVar.m124421o3();
        }
    }
}
