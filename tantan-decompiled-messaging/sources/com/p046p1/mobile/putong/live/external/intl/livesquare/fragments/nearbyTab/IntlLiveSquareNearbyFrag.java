package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import com.p046p1.mobile.putong.live.external.intl.livesquare.api.IntlNearbyLiveListPlug;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p149l.d30;
import p149l.e30;
import p149l.h5o;
import p149l.hnc0;
import p149l.iyt;
import p149l.j3o;
import p149l.lor;
import p149l.lsi0;
import p149l.mss;
import p149l.pzn;
import p149l.q5o;
import p149l.s2u;
import p149l.s7m;
import p149l.s9s;
import p149l.sgj;
import p149l.vwb;
import p149l.w9j;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
public final class IntlLiveSquareNearbyFrag extends IntlLiveSquareBaseListFrag implements s7m<h5o> {

    /* JADX INFO: renamed from: M */
    public h5o f45680M;

    /* JADX INFO: renamed from: N */
    public IntlNearbyLiveListPlug f45681N;

    /* JADX INFO: renamed from: P */
    public boolean f45683P;

    /* JADX INFO: renamed from: L */
    public final String f45679L = IntlLiveSquareNearbyFrag.class.getSimpleName();

    /* JADX INFO: renamed from: O */
    public iyt f45682O = iyt.m138989H0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.nearbyTab.IntlLiveSquareNearbyFrag$a */
    public class C12545a extends GridLayoutManager.AbstractC0553c {
        public C12545a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return IntlLiveSquareNearbyFrag.this.f45682O.m67356K(i);
        }
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m70144A5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E5 */
    public void m70147E5() {
        if (NullChecker.m81303a(this.f45680M)) {
            this.f45680M.mo69117n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public /* synthetic */ void m70148G5(Integer num) {
        if (num.intValue() >= this.f45682O.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f45681N.loadMore();
        }
    }

    /* JADX INFO: renamed from: L5 */
    private void m70149L5() {
        if (this.f45681N != null) {
            this.f45582z.m223769n();
            this.f45681N.getData();
        }
    }

    /* JADX INFO: renamed from: N5 */
    private void m70150N5() {
        iyt iytVar = this.f45682O;
        if (iytVar == null) {
            return;
        }
        iytVar.notifyItemRangeChanged(0, iytVar.getItemCount());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: D5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(final h5o h5oVar) {
        this.f45680M = h5oVar;
        h5oVar.mo69101I2();
        h5oVar.m129424i3();
        IntlNearbyLiveListPlug intlNearbyLiveListPlug = new IntlNearbyLiveListPlug(this);
        this.f45681N = intlNearbyLiveListPlug;
        intlNearbyLiveListPlug.observe(new Function1() { // from class: l.i5o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f111626a.m70156F5(h5oVar, (IntlModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Unit m70156F5(h5o h5oVar, IntlModelData intlModelData) {
        if (!intlModelData.isError()) {
            if (!intlModelData.isSuccess()) {
                return null;
            }
            h5oVar.m129423h3(this.f45681N.getLiveInfo());
            m70158I5();
            return null;
        }
        m70007v5();
        if (this.f45681N.getLiveInfo() != null && !vwb.m200296J(this.f45681N.getLiveInfo().f169071a)) {
            m70160K5();
            return null;
        }
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44878P));
        m70159J5(intlModelData.getThrowable());
        return null;
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m70157H5(q5o q5oVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        this.f45683P = true;
        q5oVar.mo213152Q();
        this.f45680M.mo144086R2(bLiveSuggestLive, this.tabInfo.name, bLiveSuggestLive.recommendInfo.category, null);
    }

    /* JADX INFO: renamed from: I5 */
    public void m70158I5() {
        m70007v5();
        this.f45682O.m191777k0();
        this.f45682O.m139005I0();
    }

    /* JADX INFO: renamed from: J5 */
    public void m70159J5(Throwable th) {
        m70006u5();
    }

    /* JADX INFO: renamed from: K5 */
    public void m70160K5() {
        iyt iytVar = this.f45682O;
        if (iytVar == null) {
            return;
        }
        pzn.m172242d(iytVar);
    }

    /* JADX INFO: renamed from: M5 */
    public void m70161M5(z6o z6oVar) {
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            m70159J5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < z6oVar.f169071a.size()) {
            final BLiveSuggestLive bLiveSuggestLive = z6oVar.f169071a.get(i);
            BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
            if (bLiveSuggestLabel == null) {
                bLiveSuggestLabel = null;
            }
            int i2 = i + 1;
            final q5o q5oVar = new q5o(bLiveSuggestLive, bLiveSettingsM195583A3, this.layoutColumnNum, bLiveSuggestLabel, i2);
            q5oVar.m109663B("p_live_nearby");
            arrayList.add(q5oVar);
            q5oVar.mo109662A(new View.OnClickListener() { // from class: l.n5o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137223a.m70157H5(q5oVar, bLiveSuggestLive, view);
                }
            });
            i = i2;
        }
        arrayList.add(new j3o(this.layoutColumnNum, z6oVar.m187673t()));
        boolean z = !vwb.m200296J(arrayList);
        m70005t5(z, z);
        this.f45682O.m67371Z(arrayList);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (z) {
            if (lor.m150803h()) {
                sgj.m184098k();
            }
            if (this.f45683P) {
                this.f45683P = false;
                m70815g5(false);
            }
            if (this.loaded) {
                if (j > ((long) this.f45680M.m144084P2()) * 1000) {
                    m70149L5();
                    m70815g5(false);
                }
                this.f45682O.m139005I0();
                m70150N5();
            } else {
                m70149L5();
            }
            if (lor.m150803h()) {
                sgj.m184098k();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        h5o h5oVar = new h5o(this, new mss(m70813Z4(), this));
        h5oVar.m144088T2(this.tabInfo);
        h5oVar.mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        if (this.f45680M != null) {
            m70149L5();
            m70815g5(true);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        getArguments();
        creates(new e30() { // from class: l.l5o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareNearbyFrag.m70144A5((Bundle) obj);
            }
        }, new d30() { // from class: l.m5o
            @Override // p149l.d30
            public final void call() {
                this.f131409a.m70147E5();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: f5 */
    public void mo70070f5() {
        super.mo70070f5();
        this.f45682O.m139007K0();
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 3;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), this.layoutColumnNum);
        gridLayoutManager.m3326v(new C12545a());
        this.f45573C.setLayoutManager(gridLayoutManager);
        this.f45682O.m67369X(false);
        this.f45682O.m191780n0(this, LiveTeenDialogAct.f46216g);
        this.f45682O.m139000C0(this, true);
        this.f45682O.m67375c0(new e30() { // from class: l.j5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116336a.m70148G5((Integer) obj);
            }
        });
        if (lor.m150807l()) {
            this.f45682O.m138998A0(s2u.m182077i().asObservable().map(new w9j() { // from class: l.k5o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), this, "LiveSquareHomeFrag");
        }
        this.f45573C.setAdapter(this.f45682O);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_nearby";
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m70149L5();
        m70815g5(true);
    }
}
