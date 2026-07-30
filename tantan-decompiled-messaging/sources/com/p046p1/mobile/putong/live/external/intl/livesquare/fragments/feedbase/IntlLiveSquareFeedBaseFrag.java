package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12546a;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.e30;
import p149l.hnc0;
import p149l.iyt;
import p149l.j3o;
import p149l.k2o;
import p149l.l9s;
import p149l.lor;
import p149l.m2o;
import p149l.pgi0;
import p149l.pzn;
import p149l.s2u;
import p149l.s7m;
import p149l.s9s;
import p149l.sgj;
import p149l.t100;
import p149l.w9j;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IntlLiveSquareFeedBaseFrag<P extends k2o> extends IntlLiveSquareBaseListFrag implements C12546a.a, s7m<P> {

    /* JADX INFO: renamed from: M */
    public BLiveSettings f45627M;

    /* JADX INFO: renamed from: O */
    public P f45629O;

    /* JADX INFO: renamed from: P */
    public boolean f45630P;

    /* JADX INFO: renamed from: L */
    public m2o f45626L = new m2o(this);

    /* JADX INFO: renamed from: N */
    public final iyt f45628N = iyt.m138989H0();

    /* JADX INFO: renamed from: Q */
    public boolean f45631Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f45632R = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public void m70053C5() {
        if (NullChecker.m81303a(this.f45629O)) {
            this.f45629O.mo69117n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F5 */
    public /* synthetic */ void m70054F5(Integer num) {
        if (num.intValue() >= this.f45628N.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f45629O.m144336h3(this.f45632R);
        }
    }

    /* JADX INFO: renamed from: H5 */
    private void m70055H5(boolean z) {
        this.f45629O.m144335g3();
        m70815g5(z);
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m70056w5(Bundle bundle) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: B5 */
    public void mo21065i1(P p) {
        this.f45629O = p;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        p.m144088T2(this.tabInfo);
        p.mo69101I2();
        if (this.f45631Q) {
            return;
        }
        p.m144337i3();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D5 */
    public BLiveSettings m70061D5() {
        if (this.f45627M == null) {
            this.f45627M = s9s.f163228b.m195583A3();
        }
        return this.f45627M;
    }

    /* JADX INFO: renamed from: E5 */
    public j3o m70062E5(z6o z6oVar, boolean z) {
        return new j3o(this.layoutColumnNum, z6oVar.m187673t(), z);
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m70063G5(Object obj) {
        l9s.m149057T(act(), Uri.parse((String) obj));
    }

    /* JADX INFO: renamed from: I5 */
    public void m70064I5() {
        if (this.f45628N.getItemCount() > 0) {
            this.f45573C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m70065J5() {
        m70007v5();
        this.f45628N.m191777k0();
        this.f45628N.m139005I0();
    }

    /* JADX INFO: renamed from: K5 */
    public void m70066K5() {
        pzn.m172242d(this.f45628N);
    }

    /* JADX INFO: renamed from: L5 */
    public void m70067L5() {
        this.f45582z.m223769n();
    }

    /* JADX INFO: renamed from: M5 */
    public void m70068M5(Throwable th) {
        m70006u5();
    }

    /* JADX INFO: renamed from: N5 */
    public final void m70069N5() {
        if (this.f45628N.getItemCount() <= 0) {
            return;
        }
        iyt iytVar = this.f45628N;
        iytVar.notifyItemRangeChanged(0, iytVar.getItemCount());
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (z) {
            if (i == 8 && this.f45630P) {
                this.f45630P = false;
                m70815g5(false);
            }
            boolean z2 = this.loaded;
            P p = this.f45629O;
            if (z2) {
                if (j > ((long) p.m144084P2()) * 1000) {
                    m70055H5(false);
                }
                this.f45628N.m139005I0();
                m70069N5();
            } else {
                p.m144335g3();
            }
            if (lor.m150803h()) {
                sgj.m184099l();
            }
            pgi0.m168730l().m168734f();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        if (this.f45629O != null) {
            m70055H5(true);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.b2o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareFeedBaseFrag.m70056w5((Bundle) obj);
            }
        }, new d30() { // from class: l.c2o
            @Override // p149l.d30
            public final void call() {
                this.f78374a.m70053C5();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: f5 */
    public void mo70070f5() {
        super.mo70070f5();
        this.f45628N.m139007K0();
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((FrameLayout.LayoutParams) this.f45582z.getLayoutParams()).topMargin = t100.f167254c;
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 2;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.f45573C.setLayoutManager(staggeredGridLayoutManager);
        staggeredGridLayoutManager.m3513U(2);
        this.f45573C.setItemAnimator(null);
        this.f45628N.m67369X(false);
        this.f45628N.m191780n0(this, LiveTeenDialogAct.f46216g);
        this.f45628N.m139000C0(this, true);
        this.f45628N.m67375c0(new e30() { // from class: l.d2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83419a.m70054F5((Integer) obj);
            }
        });
        if (lor.m150807l()) {
            this.f45628N.m138998A0(s2u.m182077i().asObservable().map(new w9j() { // from class: l.e2o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), this, "LiveSquareHomeFrag");
        }
        this.f45573C.setAdapter(this.f45628N);
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12546a.a
    /* JADX INFO: renamed from: t3 */
    public void mo70071t3(LiveBannerTabBean liveBannerTabBean) {
        String str = liveBannerTabBean.jumpUrl;
        if (TextUtils.isEmpty(str) || !str.contains("tantanapp://liveBannerCustom")) {
            l9s.m149057T(act(), Uri.parse(str));
        } else {
            this.f45629O.m144328Z2(str, new e30() { // from class: l.f2o
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94225a.m70063G5(obj);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m70055H5(true);
    }
}
