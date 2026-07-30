package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlNearbyLiveListPlug;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p153l.h7o;
import p153l.iam;
import p153l.j0u;
import p153l.j5o;
import p153l.jyb;
import p153l.mjj;
import p153l.mqr;
import p153l.mvc0;
import p153l.nus;
import p153l.o1j0;
import p153l.p1o;
import p153l.q7o;
import p153l.qcj;
import p153l.t4u;
import p153l.tbs;
import p153l.x20;
import p153l.y20;
import p153l.z8o;

/* JADX INFO: loaded from: classes9.dex */
public final class IntlLiveSquareNearbyFrag extends IntlLiveSquareBaseListFrag implements iam<h7o> {

    /* JADX INFO: renamed from: M */
    public h7o f46528M;

    /* JADX INFO: renamed from: N */
    public IntlNearbyLiveListPlug f46529N;

    /* JADX INFO: renamed from: P */
    public boolean f46531P;

    /* JADX INFO: renamed from: L */
    public final String f46527L = IntlLiveSquareNearbyFrag.class.getSimpleName();

    /* JADX INFO: renamed from: O */
    public j0u f46530O = j0u.m143007H0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag$a */
    public class C12708a extends GridLayoutManager.AbstractC0554c {
        public C12708a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return IntlLiveSquareNearbyFrag.this.f46530O.m68539K(i);
        }
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m71327A5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E5 */
    public void m71330E5() {
        if (NullChecker.m82486a(this.f46528M)) {
            this.f46528M.mo70300n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public /* synthetic */ void m71331G5(Integer num) {
        if (num.intValue() >= this.f46530O.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f46529N.loadMore();
        }
    }

    /* JADX INFO: renamed from: L5 */
    private void m71332L5() {
        if (this.f46529N != null) {
            this.f46430z.m225015n();
            this.f46529N.getData();
        }
    }

    /* JADX INFO: renamed from: N5 */
    private void m71333N5() {
        j0u j0uVar = this.f46530O;
        if (j0uVar == null) {
            return;
        }
        j0uVar.notifyItemRangeChanged(0, j0uVar.getItemCount());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: D5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(final h7o h7oVar) {
        this.f46528M = h7oVar;
        h7oVar.mo70284I2();
        h7oVar.m133820i3();
        IntlNearbyLiveListPlug intlNearbyLiveListPlug = new IntlNearbyLiveListPlug(this);
        this.f46529N = intlNearbyLiveListPlug;
        intlNearbyLiveListPlug.observe(new Function1() { // from class: l.i7o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f113278a.m71339F5(h7oVar, (IntlModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Unit m71339F5(h7o h7oVar, IntlModelData intlModelData) {
        if (!intlModelData.isError()) {
            if (!intlModelData.isSuccess()) {
                return null;
            }
            h7oVar.m133819h3(this.f46529N.getLiveInfo());
            m71341I5();
            return null;
        }
        m71190v5();
        if (this.f46529N.getLiveInfo() != null && !jyb.m147479J(this.f46529N.getLiveInfo().f178357a)) {
            m71343K5();
            return null;
        }
        o1j0.m165651y(tbs.f172988a.getString(R$string.f45726P));
        m71342J5(intlModelData.getThrowable());
        return null;
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m71340H5(q7o q7oVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        this.f46531P = true;
        q7oVar.mo214755Q();
        this.f46528M.mo147982R2(bLiveSuggestLive, this.tabInfo.name, bLiveSuggestLive.recommendInfo.category, null);
    }

    /* JADX INFO: renamed from: I5 */
    public void m71341I5() {
        m71190v5();
        this.f46530O.m200145k0();
        this.f46530O.m143023I0();
    }

    /* JADX INFO: renamed from: J5 */
    public void m71342J5(Throwable th) {
        m71189u5();
    }

    /* JADX INFO: renamed from: K5 */
    public void m71343K5() {
        j0u j0uVar = this.f46530O;
        if (j0uVar == null) {
            return;
        }
        p1o.m170253d(j0uVar);
    }

    /* JADX INFO: renamed from: M5 */
    public void m71344M5(z8o z8oVar) {
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            m71342J5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < z8oVar.f178357a.size()) {
            final BLiveSuggestLive bLiveSuggestLive = z8oVar.f178357a.get(i);
            BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
            if (bLiveSuggestLabel == null) {
                bLiveSuggestLabel = null;
            }
            int i2 = i + 1;
            final q7o q7oVar = new q7o(bLiveSuggestLive, bLiveSettingsM203370A3, this.layoutColumnNum, bLiveSuggestLabel, i2);
            q7oVar.m113882B("p_live_nearby");
            arrayList.add(q7oVar);
            q7oVar.mo113881A(new View.OnClickListener() { // from class: l.n7o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140615a.m71340H5(q7oVar, bLiveSuggestLive, view);
                }
            });
            i = i2;
        }
        arrayList.add(new j5o(this.layoutColumnNum, z8oVar.m195327t()));
        boolean z = !jyb.m147479J(arrayList);
        m71188t5(z, z);
        this.f46530O.m68554Z(arrayList);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (z) {
            if (mqr.m159588h()) {
                mjj.m158582k();
            }
            if (this.f46531P) {
                this.f46531P = false;
                m71998g5(false);
            }
            if (this.loaded) {
                if (j > ((long) this.f46528M.m147980P2()) * 1000) {
                    m71332L5();
                    m71998g5(false);
                }
                this.f46530O.m143023I0();
                m71333N5();
            } else {
                m71332L5();
            }
            if (mqr.m159588h()) {
                mjj.m158582k();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        h7o h7oVar = new h7o(this, new nus(m71996Z4(), this));
        h7oVar.m147984T2(this.tabInfo);
        h7oVar.mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        if (this.f46528M != null) {
            m71332L5();
            m71998g5(true);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        getArguments();
        creates(new y20() { // from class: l.l7o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareNearbyFrag.m71327A5((Bundle) obj);
            }
        }, new x20() { // from class: l.m7o
            @Override // p153l.x20
            public final void call() {
                this.f135093a.m71330E5();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: f5 */
    public void mo71253f5() {
        super.mo71253f5();
        this.f46530O.m143025K0();
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 3;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), this.layoutColumnNum);
        gridLayoutManager.m3327v(new C12708a());
        this.f46421C.setLayoutManager(gridLayoutManager);
        this.f46530O.m68552X(false);
        this.f46530O.m200148n0(this, LiveTeenDialogAct.f47064g);
        this.f46530O.m143018C0(this, true);
        this.f46530O.m68558c0(new y20() { // from class: l.j7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118699a.m71331G5((Integer) obj);
            }
        });
        if (mqr.m159592l()) {
            this.f46530O.m143016A0(t4u.m189320i().asObservable().map(new qcj() { // from class: l.k7o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), this, "LiveSquareHomeFrag");
        }
        this.f46421C.setAdapter(this.f46530O);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_nearby";
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m71332L5();
        m71998g5(true);
    }
}
