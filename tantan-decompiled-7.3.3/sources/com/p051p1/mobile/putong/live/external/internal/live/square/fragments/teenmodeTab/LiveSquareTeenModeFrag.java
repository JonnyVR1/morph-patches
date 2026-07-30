package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.d3q;
import p153l.h2u;
import p153l.h6u;
import p153l.iam;
import p153l.jyb;
import p153l.mvc0;
import p153l.nus;
import p153l.qa00;
import p153l.v5u;
import p153l.w5u;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareTeenModeFrag extends LiveSquareBaseListFrag implements iam<h6u> {

    /* JADX INFO: renamed from: L */
    public h6u f45866L;

    /* JADX INFO: renamed from: M */
    public LiveBaseAdapter f45867M = new LiveBaseAdapter();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.teenmodeTab.LiveSquareTeenModeFrag$a */
    public class C12659a extends GridLayoutManager.AbstractC0554c {
        public C12659a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return Math.max(LiveSquareTeenModeFrag.this.f45867M.m68539K(i), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public void m70304C5() {
        if (NullChecker.m82486a(this.f45866L)) {
            this.f45866L.mo70300n();
        }
    }

    /* JADX INFO: renamed from: z5 */
    public static /* synthetic */ void m70308z5(Bundle bundle) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: B5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h6u h6uVar) {
        this.f45866L = h6uVar;
        h6uVar.mo70284I2();
        if (this.loaded) {
            return;
        }
        h6uVar.m133731o3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: D5 */
    public final h2u m70310D5(v5u v5uVar, List<d3q<?>> list) {
        return new h2u(this.layoutColumnNum, v5uVar.m199919a(), !jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m70311E5(Integer num) {
        if (num.intValue() >= this.f45867M.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f45866L.m133732p3();
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m70312F5(BLiveTeenagerLive bLiveTeenagerLive, View view) {
        BLive bLiveNew_ = BLive.new_();
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveNew_.streamUrl = bLiveStreamUrlNew_;
        bLiveStreamUrlNew_.pullFlv = bLiveTeenagerLive.mediaUrl;
        this.f45866L.m133733q3(bLiveNew_, this.tabInfo.name, bLiveNew_.recommendInfo.category);
    }

    /* JADX INFO: renamed from: G5 */
    public void m70313G5() {
        m70226v5();
    }

    /* JADX INFO: renamed from: H5 */
    public void m70314H5() {
        LiveBaseAdapter liveBaseAdapter = this.f45867M;
        if (liveBaseAdapter == null) {
            return;
        }
        m71999h5(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: I5 */
    public void m70315I5() {
        this.f45846z.m225012k();
    }

    /* JADX INFO: renamed from: J5 */
    public void m70316J5(Throwable th) {
        m70225u5();
    }

    /* JADX INFO: renamed from: K5 */
    public void m70317K5(v5u v5uVar) {
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        for (final BLiveTeenagerLive bLiveTeenagerLive : v5uVar.f182568a) {
            w5u w5uVar = new w5u(bLiveTeenagerLive, this.layoutColumnNum);
            w5uVar.mo113881A(new View.OnClickListener() { // from class: l.u5u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177673a.m70312F5(bLiveTeenagerLive, view);
                }
            });
            w5uVar.m113882B(pageId());
            arrayList.add(w5uVar);
        }
        boolean z = !jyb.m147479J(arrayList);
        m70224t5(z, z);
        arrayList.add(m70310D5(v5uVar, arrayList));
        int itemCount = this.f45867M.getItemCount();
        boolean zM199921c = v5uVar.m199921c();
        LiveBaseAdapter liveBaseAdapter = this.f45867M;
        if (!zM199921c) {
            liveBaseAdapter.m68555a0(arrayList, false);
        } else {
            liveBaseAdapter.m68556b0(arrayList);
            this.f45867M.notifyItemRangeChanged(itemCount - 1, (arrayList.size() - itemCount) + 1);
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        h6u h6uVar = new h6u(this, new nus(m71996Z4(), this));
        h6uVar.m95556S2(this.tabInfo);
        h6uVar.mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        mo59137w2(this.f45846z);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: a5 */
    public int mo70318a5() {
        return qa00.m175859d(44.0f);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.r5u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareTeenModeFrag.m70308z5((Bundle) obj);
            }
        }, new x20() { // from class: l.s5u
            @Override // p153l.x20
            public final void call() {
                this.f166508a.m70304C5();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 2;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), this.layoutColumnNum);
        gridLayoutManager.m3327v(new C12659a());
        this.f45837C.setLayoutManager(gridLayoutManager);
        this.f45867M.m68552X(false);
        this.f45867M.m68558c0(new y20() { // from class: l.t5u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172230a.m70311E5((Integer) obj);
            }
        });
        this.f45837C.setAdapter(this.f45867M);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_teen_mode";
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.LiveSquareBaseListFrag, p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        h6u h6uVar = this.f45866L;
        if (h6uVar != null) {
            h6uVar.m133731o3();
        }
    }
}
