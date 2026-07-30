package p153l;

import android.graphics.Color;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveTapBarStartLiveConfig;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class oys extends dvs<rys> implements sm50 {

    /* JADX INFO: renamed from: f */
    public final LiveSquareTopButtonLiveView f149819f;

    /* JADX INFO: renamed from: g */
    public boolean f149820g;

    /* JADX INFO: renamed from: h */
    public final wyd0 f149821h;

    /* JADX INFO: renamed from: i */
    public String f149822i;

    /* JADX INFO: renamed from: j */
    public boolean f149823j;

    public oys(ner nerVar, nus nusVar, LiveSquareTopButtonLiveView liveSquareTopButtonLiveView) {
        super(nerVar, nusVar);
        this.f149820g = false;
        this.f149821h = new wyd0("live_square_start_live_" + mbs.m157870o0(), "");
        this.f149819f = liveSquareTopButtonLiveView;
        rys rysVar = new rys(liveSquareTopButtonLiveView);
        this.viewModel = rysVar;
        mo52715C(rysVar);
        m153103z2(new zus(nerVar, nusVar, liveSquareTopButtonLiveView.f45879a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m169888f3(Boolean bool) {
        ((rys) this.viewModel).f165460d = bool.booleanValue();
        m169890u3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m169889g3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f149823j = !zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        m169891Z2();
    }

    /* JADX INFO: renamed from: u3 */
    private void m169890u3() {
        String str = (String) m160243N2(new evs());
        ((rys) this.viewModel).f165461e = mqr.m159591k();
        boolean z = mqr.m159591k() && !"p_audio_explore_recommend".equals(str);
        ((rys) this.viewModel).m183648l(z);
        m169904p3(z);
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: S */
    public void mo147413S(boolean z, String str) {
        m169908t3();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((rys) v2).m183643d(z);
        }
        if (!z && !TextUtils.isEmpty(this.f149822i)) {
            C4499d.m21895l().m21899k(this.f149822i);
            this.f149822i = null;
        }
        m169903o3("square-curated".equals(str));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((rys) this.viewModel).m183649r();
        duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.cys
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.fys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101419a.m169895d3((NetworkInfo) obj);
            }
        }));
        duringCreated(LiveAssertApi.getUserStartLiveObs()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.gys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107106a.m169896e3((Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m160238F2().LiveHomeStartLiveEvent.showRedDot().m199270g());
        final rys rysVar = (rys) this.viewModel;
        Objects.requireNonNull(rysVar);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.hys
            @Override // p153l.y20
            public final void call(Object obj) {
                rysVar.m183647k(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m160238F2().LiveHomeStartLiveEvent.startLiveSkinEvent().m199270g()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.iys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117631a.m169901m3((BLiveTapBarStartLiveConfig) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.jys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123196a.m169888f3((Boolean) obj);
            }
        }));
        duringCreated(t4u.m189320i()).subscribe(dhw.m115829h(new y20() { // from class: l.kys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129342a.m169889g3((Boolean) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomeMenuEvent.isLiveVideoStyle().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134131a.m169903o3(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m169891Z2() {
        if (this.f149823j && !this.f149820g) {
            m169904p3(mqr.m159591k() && !"p_audio_explore_recommend".equals((String) m160243N2(new evs())));
        } else {
            if (TextUtils.isEmpty(this.f149822i)) {
                return;
            }
            C4499d.m21895l().m21899k(this.f149822i);
            this.f149822i = null;
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final BLiveBubbleConfig m169892a3() {
        BLiveBubbleConfig bLiveBubbleConfig;
        BLiveMonetizationConfig bLiveMonetizationConfigM125960k = ((fk3) tbs.m190077m(itd0.f116820b)).m125960k();
        if (bLiveMonetizationConfigM125960k == null || (bLiveBubbleConfig = (BLiveBubbleConfig) jyb.m147529r(bLiveMonetizationConfigM125960k.bubbleConfigs, new qcj() { // from class: l.eys
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, "StartLiveBubble"));
            }
        })) == null || !m169899j3(bLiveBubbleConfig) || jyb.m147479J(bLiveBubbleConfig.bubbleTextList) || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return null;
        }
        return bLiveBubbleConfig;
    }

    @Override // p153l.sm50
    /* JADX INFO: renamed from: b2 */
    public boolean mo147415b2(String str) {
        return y6u.m214510n(str);
    }

    /* JADX INFO: renamed from: b3 */
    public final long[] m169893b3() {
        String str = this.f149821h.get();
        if (TextUtils.isEmpty(str)) {
            return new long[]{0, 0, 0, 0};
        }
        try {
            String[] strArrSplit = str.split(":");
            return new long[]{Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1]), Long.parseLong(strArrSplit[2]), Long.parseLong(strArrSplit[3])};
        } catch (Exception unused) {
            return new long[]{0, 0, 0, 0};
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m169894c3(BLiveSettings bLiveSettings) {
        m169890u3();
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m169895d3(NetworkInfo networkInfo) {
        duringCreated(tbs.f172989b.m159274k()).subscribe(dhw.m115829h(new y20() { // from class: l.mys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139432a.m169894c3((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m169896e3(Boolean bool) {
        m169890u3();
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m169897h3(String str) {
        this.f149820g = false;
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m169898i3(String str) {
        fwk.m127777h().m127779g(str);
        m169905q3();
    }

    /* JADX INFO: renamed from: j3 */
    public final boolean m169899j3(BLiveBubbleConfig bLiveBubbleConfig) {
        long[] jArrM169893b3 = m169893b3();
        long j = jArrM169893b3[0];
        long j2 = jArrM169893b3[1];
        long j3 = jArrM169893b3[2];
        return mqr.m159591k() && ((jArrM169893b3[2] > ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 1 : (jArrM169893b3[2] == ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 0 : -1)) < 0 && ((pzi0.m174453n() > jArrM169893b3[0] ? 1 : (pzi0.m174453n() == jArrM169893b3[0] ? 0 : -1)) != 0 || (jArrM169893b3[1] > ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 1 : (jArrM169893b3[1] == ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 0 : -1)) < 0)) && (((pzi0.m174454o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) > jArrM169893b3[3] ? 1 : ((pzi0.m174454o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) == jArrM169893b3[3] ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: k3 */
    public void m169900k3(View view) {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126181i(false);
        n4u.m161600l(getAct(), AnchorStartData.ANCHOR_SOURCE_P_LIVE);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m169901m3(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        ((rys) this.viewModel).m183646j(bLiveTapBarStartLiveConfig);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m169902n3() {
        long[] jArrM169893b3 = m169893b3();
        long jM174453n = pzi0.m174453n();
        long j = jArrM169893b3[0];
        wyd0 wyd0Var = this.f149821h;
        if (jM174453n != j) {
            wyd0Var.put(jM174453n + ":1:" + (jArrM169893b3[2] + 1) + ":" + pzi0.m174454o());
            return;
        }
        wyd0Var.put(jM174453n + ":" + (jArrM169893b3[1] + 1) + ":" + (jArrM169893b3[2] + 1) + ":" + pzi0.m174454o());
    }

    /* JADX INFO: renamed from: o3 */
    public void m169903o3(boolean z) {
        if (!mbs.m157853g().mo31745a().mo192257w()) {
            LiveSquareTopButtonLiveView liveSquareTopButtonLiveView = this.f149819f;
            if (z) {
                liveSquareTopButtonLiveView.f45879a.setActualImageResource(nbc0.f141176l0);
                this.f149819f.f45880b.setActualImageResource(nbc0.f141095D0);
                return;
            } else {
                liveSquareTopButtonLiveView.f45879a.setActualImageResource(nbc0.f141173k0);
                this.f149819f.f45880b.setActualImageResource(nbc0.f141092C0);
                return;
            }
        }
        bnl0.m105552e0(this.f149819f, qa00.m175859d(4.0f));
        bnl0.m105539W(this.f149819f.f45879a, qa00.m175859d(4.0f));
        LiveSquareTopButtonLiveView liveSquareTopButtonLiveView2 = this.f149819f;
        if (z) {
            liveSquareTopButtonLiveView2.f45879a.setImageResource(mbs.m157855h() ? nbc0.f141170j0 : nbc0.f141167i0);
            this.f149819f.f45880b.setImageResource(mbs.m157855h() ? nbc0.f141140Z : nbc0.f141138Y);
        } else {
            liveSquareTopButtonLiveView2.f45879a.setImageResource(mbs.m157855h() ? nbc0.f141164h0 : nbc0.f141161g0);
            this.f149819f.f45880b.setImageResource(mbs.m157855h() ? nbc0.f141136X : nbc0.f141134W);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m169904p3(boolean z) {
        BLiveBubbleConfig bLiveBubbleConfigM169892a3;
        if (this.f149820g || !z || t4u.m189319h() || ppi0.m173207l().m173228x() || (bLiveBubbleConfigM169892a3 = m169892a3()) == null) {
            return;
        }
        this.f149820g = true;
        m169906r3();
        VText vText = new VText(getAct());
        int i = bnl0.f77544e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(bLiveBubbleConfigM169892a3.bubbleTextList.get(0));
        int i2 = qa00.f156323j;
        vText.setPadding(i2, qa00.m175859d(11.0f), i2, qa00.m175859d(11.0f));
        vText.setTextColor(Color.parseColor("#" + bLiveBubbleConfigM169892a3.bubbleTextColor));
        C4496a c4496aM21874q = new C4496a(getAct()).m21876s(vText).m21863e(true).m21869k(Color.parseColor("#" + bLiveBubbleConfigM169892a3.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfigM169892a3.bubbleEndColor)).m21854J(14.0f).m21860b(((long) bLiveBubbleConfigM169892a3.bubbleDisappear) * 1000).m21868j(new C4496a.c() { // from class: l.nys
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f144354a.m169897h3(str);
            }
        }).m21862d(new C4496a.b() { // from class: l.dys
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str) {
                this.f91284a.m169898i3(str);
            }
        }).m21874q(C4496a.f16399N | C4496a.f16401P);
        if (((rys) this.viewModel).f165464h instanceof VText) {
            c4496aM21874q.m21881x(qa00.m175859d(6.0f));
            c4496aM21874q.m21872o(C4496a.f16401P, qa00.m175859d(9.0f));
        } else {
            c4496aM21874q.m21872o(C4496a.f16401P, qa00.m175859d(3.0f));
        }
        this.f149822i = C4499d.m21895l().m21907t(c4496aM21874q, ((rys) this.viewModel).f165464h);
        m169902n3();
    }

    /* JADX INFO: renamed from: q3 */
    public void m169905q3() {
        i4g0.m138520r("e_live_start_bubble", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: r3 */
    public void m169906r3() {
        i4g0.m138526x("e_live_start_bubble", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m169907s3() {
        i4g0.m138520r("e_post_live", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: t3 */
    public void m169908t3() {
        i4g0.m138526x("e_post_live", (String) m160243N2(new evs()));
    }
}
