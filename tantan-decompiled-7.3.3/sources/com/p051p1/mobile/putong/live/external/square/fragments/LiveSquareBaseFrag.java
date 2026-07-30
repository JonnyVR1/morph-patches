package com.p051p1.mobile.putong.live.external.square.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p137rx.subjects.C22508b;
import p153l.bnl0;
import p153l.jyb;
import p153l.l4g0;
import p153l.pcj;
import p153l.qa00;
import p153l.qcj;
import p153l.t4u;
import p153l.uxj0;
import p153l.w6u;
import p153l.wft;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LiveSquareBaseFrag extends LiveVPagerBaseFrag {
    public static final String ARGS_IS_DEFAULT = "live_square_is_default_tab";
    public static final String ARGS_TAB_INFO = "live_square_tab_info";
    public static final String LIVE_IS_FROM_INTL_HOME = "live_is_from_intl_home";
    private pcj<LiveHomeEventBus> eventBusFunc;
    public BLiveSquareTab tabInfo;
    protected boolean isDefaultTab = false;
    protected volatile C22508b<uxj0> endSubscribeSignal = C22508b.m222767b();
    protected boolean loaded = false;
    public int layoutColumnNum = 1;

    /* JADX INFO: renamed from: j5 */
    private void m71995j5(boolean z) {
        l4g0 l4g0Var = this.pageHelper;
        if (z) {
            w6u.m205197b(l4g0Var);
        } else {
            w6u.m205196a(l4g0Var);
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        m71995j5(z);
        if (z) {
            m71997e5();
        } else {
            mo71253f5();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        if (view != null && mo70233b5() && wft.m206159b(1)) {
            view.setPadding(0, mo70318a5(), 0, 0);
            bnl0.m105556g0(view);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
    }

    /* JADX INFO: renamed from: Z4 */
    public LiveHomeEventBus m71996Z4() {
        pcj<LiveHomeEventBus> pcjVar = this.eventBusFunc;
        if (pcjVar != null) {
            return pcjVar.call();
        }
        Fragment fragmentM2558i0 = act().fragmentManager().m2558i0("live");
        return fragmentM2558i0 instanceof LiveSquareHomeFrag ? ((LiveSquareHomeFrag) fragmentM2558i0).mo70127N4() : new LiveHomeEventBus();
    }

    /* JADX INFO: renamed from: a5 */
    public int mo70318a5() {
        return act() instanceof LiveIndependentSettingAct ? qa00.m175859d(92.0f) : qa00.m175859d(44.0f);
    }

    /* JADX INFO: renamed from: b5 */
    public boolean mo70233b5() {
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean mo70234c5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tabInfo = (BLiveSquareTab) arguments.getSerializable(ARGS_TAB_INFO);
            this.isDefaultTab = arguments.getBoolean(ARGS_IS_DEFAULT, false);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        if (bLiveSquareTab != null) {
            this.layoutColumnNum = bLiveSquareTab.layoutColumn;
        }
        super.mo21582d4();
    }

    /* JADX INFO: renamed from: d5 */
    public boolean mo70235d5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e5 */
    public void m71997e5() {
    }

    /* JADX INFO: renamed from: f5 */
    public void mo71253f5() {
    }

    /* JADX INFO: renamed from: g5 */
    public void m71998g5(boolean z) {
        t4u.f172135e.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h5 */
    public void m71999h5(LiveBaseAdapter liveBaseAdapter) {
        int iM147476G = jyb.m147476G(liveBaseAdapter.m68538J(), new qcj() { // from class: l.t0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) instanceof h2u);
            }
        });
        if (iM147476G >= 0) {
            liveBaseAdapter.notifyItemChanged(iM147476G, 2);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public void m72000i5(pcj<LiveHomeEventBus> pcjVar) {
        this.eventBusFunc = pcjVar;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.endSubscribeSignal.onNext(uxj0.f181467a);
    }
}
