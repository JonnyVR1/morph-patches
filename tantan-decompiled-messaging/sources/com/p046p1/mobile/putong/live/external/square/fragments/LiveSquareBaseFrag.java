package com.p046p1.mobile.putong.live.external.square.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p133rx.subjects.C22393b;
import p149l.cwf0;
import p149l.roj0;
import p149l.s2u;
import p149l.t100;
import p149l.v4u;
import p149l.v9j;
import p149l.vdt;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveSquareBaseFrag extends LiveVPagerBaseFrag {
    public static final String ARGS_IS_DEFAULT = "live_square_is_default_tab";
    public static final String ARGS_TAB_INFO = "live_square_tab_info";
    public static final String LIVE_IS_FROM_INTL_HOME = "live_is_from_intl_home";
    private v9j<LiveHomeEventBus> eventBusFunc;
    public BLiveSquareTab tabInfo;
    protected boolean isDefaultTab = false;
    protected volatile C22393b<roj0> endSubscribeSignal = C22393b.m221521b();
    protected boolean loaded = false;
    public int layoutColumnNum = 1;

    /* JADX INFO: renamed from: j5 */
    private void m70812j5(boolean z) {
        cwf0 cwf0Var = this.pageHelper;
        if (z) {
            v4u.m197063b(cwf0Var);
        } else {
            v4u.m197062a(cwf0Var);
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        m70812j5(z);
        if (z) {
            m70814e5();
        } else {
            mo70070f5();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        if (view != null && mo69050b5() && vdt.m198092b(1)) {
            view.setPadding(0, mo69135a5(), 0, 0);
            xdl0.m208376g0(view);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
    }

    /* JADX INFO: renamed from: Z4 */
    public LiveHomeEventBus m70813Z4() {
        v9j<LiveHomeEventBus> v9jVar = this.eventBusFunc;
        if (v9jVar != null) {
            return v9jVar.call();
        }
        Fragment fragmentM2557i0 = act().fragmentManager().m2557i0("live");
        return fragmentM2557i0 instanceof LiveSquareHomeFrag ? ((LiveSquareHomeFrag) fragmentM2557i0).mo68944N4() : new LiveHomeEventBus();
    }

    /* JADX INFO: renamed from: a5 */
    public int mo69135a5() {
        return act() instanceof LiveIndependentSettingAct ? t100.m186890d(92.0f) : t100.m186890d(44.0f);
    }

    /* JADX INFO: renamed from: b5 */
    public boolean mo69050b5() {
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean mo69051c5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tabInfo = (BLiveSquareTab) arguments.getSerializable(ARGS_TAB_INFO);
            this.isDefaultTab = arguments.getBoolean(ARGS_IS_DEFAULT, false);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        if (bLiveSquareTab != null) {
            this.layoutColumnNum = bLiveSquareTab.layoutColumn;
        }
        super.mo20583d4();
    }

    /* JADX INFO: renamed from: d5 */
    public boolean mo69052d5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e5 */
    public void m70814e5() {
    }

    /* JADX INFO: renamed from: f5 */
    public void mo70070f5() {
    }

    /* JADX INFO: renamed from: g5 */
    public void m70815g5(boolean z) {
        s2u.f162012e.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h5 */
    public void m70816h5(LiveBaseAdapter liveBaseAdapter) {
        int iM200293G = vwb.m200293G(liveBaseAdapter.m67355J(), new w9j() { // from class: l.syt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) instanceof g0u);
            }
        });
        if (iM200293G >= 0) {
            liveBaseAdapter.notifyItemChanged(iM200293G, 2);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public void m70817i5(v9j<LiveHomeEventBus> v9jVar) {
        this.eventBusFunc = v9jVar;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.endSubscribeSignal.onNext(roj0.f160388a);
    }
}
