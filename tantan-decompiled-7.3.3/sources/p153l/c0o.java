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
import com.p051p1.mobile.putong.live.external.module.api.LiveAssertApi;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c0o extends dvs<f0o> {

    /* JADX INFO: renamed from: f */
    public boolean f79284f;

    /* JADX INFO: renamed from: g */
    public final wyd0 f79285g;

    /* JADX INFO: renamed from: h */
    public String f79286h;

    /* JADX INFO: renamed from: i */
    public boolean f79287i;

    /* JADX INFO: renamed from: j */
    public boolean f79288j;

    public c0o(ner nerVar, nus nusVar, VDraweeView vDraweeView, VText vText, View view) {
        super(nerVar, nusVar);
        this.f79284f = false;
        this.f79285g = new wyd0("intl_live_square_start_live_" + mbs.m157870o0(), "");
        f0o f0oVar = new f0o(vDraweeView, vText, view);
        this.viewModel = f0oVar;
        mo52715C(f0oVar);
    }

    /* JADX INFO: renamed from: a3 */
    private void m107447a3() {
        if (this.f79287i && this.f79288j && !this.f79284f) {
            m107460q3(mqr.m159591k() && !"p_audio_explore_recommend".equals((String) m160243N2(new evs())));
        } else {
            if (TextUtils.isEmpty(this.f79286h)) {
                return;
            }
            C4499d.m21895l().m21899k(this.f79286h);
            this.f79286h = null;
        }
    }

    /* JADX INFO: renamed from: b3 */
    private BLiveBubbleConfig m107448b3() {
        BLiveBubbleConfig bLiveBubbleConfig;
        BLiveMonetizationConfig bLiveMonetizationConfigM125960k = ((fk3) tbs.m190077m(itd0.f116820b)).m125960k();
        if (bLiveMonetizationConfigM125960k == null || (bLiveBubbleConfig = (BLiveBubbleConfig) jyb.m147529r(bLiveMonetizationConfigM125960k.bubbleConfigs, new qcj() { // from class: l.szn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, "StartLiveBubble"));
            }
        })) == null || !m107457m3(bLiveBubbleConfig) || jyb.m147479J(bLiveBubbleConfig.bubbleTextList) || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return null;
        }
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: c3 */
    private long[] m107449c3() {
        String str = this.f79285g.get();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public /* synthetic */ void m107450d3(BLiveSettings bLiveSettings) {
        m107461v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ void m107451e3(NetworkInfo networkInfo) {
        duringCreated(tbs.f172989b.m159274k()).subscribe(dhw.m115829h(new y20() { // from class: l.rzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165558a.m107450d3((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public /* synthetic */ void m107452f3(Boolean bool) {
        m107461v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ void m107453g3(Boolean bool) {
        ((f0o) this.viewModel).f96704d = bool.booleanValue();
        m107461v3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m107454h3(String str) {
        boolean z = y6u.m214511o(str) && !y6u.m214509m(str);
        m107467u3();
        ((f0o) this.viewModel).m123495d(z);
        if (z || TextUtils.isEmpty(this.f79286h)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f79286h);
        this.f79286h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public /* synthetic */ void m107455i3(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f79287i = !zBooleanValue;
        if (zBooleanValue) {
            return;
        }
        m107447a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public /* synthetic */ void m107456j3(String str) {
        this.f79284f = false;
    }

    /* JADX INFO: renamed from: m3 */
    private boolean m107457m3(BLiveBubbleConfig bLiveBubbleConfig) {
        long[] jArrM107449c3 = m107449c3();
        long j = jArrM107449c3[0];
        long j2 = jArrM107449c3[1];
        long j3 = jArrM107449c3[2];
        return mqr.m159591k() && ((jArrM107449c3[2] > ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 1 : (jArrM107449c3[2] == ((long) bLiveBubbleConfig.bubbleUserShowMaxCount) ? 0 : -1)) < 0 && ((pzi0.m174453n() > jArrM107449c3[0] ? 1 : (pzi0.m174453n() == jArrM107449c3[0] ? 0 : -1)) != 0 || (jArrM107449c3[1] > ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 1 : (jArrM107449c3[1] == ((long) bLiveBubbleConfig.bubbleEveryDayShowMaxCount) ? 0 : -1)) < 0)) && (((pzi0.m174454o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) > jArrM107449c3[3] ? 1 : ((pzi0.m174454o() - (bLiveBubbleConfig.bubbleTimeInterval * 1000)) == jArrM107449c3[3] ? 0 : -1)) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public void m107458o3(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        ((f0o) this.viewModel).m123496j(bLiveTapBarStartLiveConfig);
    }

    /* JADX INFO: renamed from: p3 */
    private void m107459p3() {
        long[] jArrM107449c3 = m107449c3();
        long jM174453n = pzi0.m174453n();
        long j = jArrM107449c3[0];
        wyd0 wyd0Var = this.f79285g;
        if (jM174453n != j) {
            wyd0Var.put(jM174453n + ":1:" + (jArrM107449c3[2] + 1) + ":" + pzi0.m174454o());
            return;
        }
        wyd0Var.put(jM174453n + ":" + (jArrM107449c3[1] + 1) + ":" + (jArrM107449c3[2] + 1) + ":" + pzi0.m174454o());
    }

    /* JADX INFO: renamed from: q3 */
    private void m107460q3(boolean z) {
        BLiveBubbleConfig bLiveBubbleConfigM107448b3;
        if (this.f79284f || !z || t4u.m189319h() || ppi0.m173207l().m173228x() || (bLiveBubbleConfigM107448b3 = m107448b3()) == null) {
            return;
        }
        this.f79284f = true;
        m107465s3();
        VText vText = new VText(getAct());
        int i = bnl0.f77544e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(bLiveBubbleConfigM107448b3.bubbleTextList.get(0));
        int i2 = qa00.f156323j;
        vText.setPadding(i2, qa00.m175859d(11.0f), i2, qa00.m175859d(11.0f));
        vText.setTextColor(Color.parseColor("#" + bLiveBubbleConfigM107448b3.bubbleTextColor));
        C4496a c4496aM21874q = new C4496a(getAct()).m21876s(vText).m21863e(true).m21869k(Color.parseColor("#" + bLiveBubbleConfigM107448b3.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfigM107448b3.bubbleEndColor)).m21854J(14.0f).m21860b(((long) bLiveBubbleConfigM107448b3.bubbleDisappear) * 1000).m21868j(new C4496a.c() { // from class: l.a0o
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f67733a.m107456j3(str);
            }
        }).m21862d(new C4496a.b() { // from class: l.b0o
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str) {
                this.f74282a.m107462k3(str);
            }
        }).m21874q(C4496a.f16399N | C4496a.f16401P);
        if (((f0o) this.viewModel).f96708h instanceof VText) {
            c4496aM21874q.m21881x(qa00.m175859d(6.0f));
            c4496aM21874q.m21872o(C4496a.f16401P, qa00.m175859d(9.0f));
        } else {
            c4496aM21874q.m21872o(C4496a.f16401P, qa00.m175859d(3.0f));
        }
        this.f79286h = C4499d.m21895l().m21907t(c4496aM21874q, ((f0o) this.viewModel).f96708h);
        m107459p3();
    }

    /* JADX INFO: renamed from: v3 */
    private void m107461v3() {
        String str = (String) m160243N2(new evs());
        ((f0o) this.viewModel).f96705e = mqr.m159591k();
        boolean z = mqr.m159591k() && !"p_audio_explore_recommend".equals(str);
        ((f0o) this.viewModel).m123498l(z);
        m107460q3(z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((f0o) this.viewModel).m123499r();
        duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.qzn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.tzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176786a.m107451e3((NetworkInfo) obj);
            }
        }));
        duringCreated(LiveAssertApi.getUserStartLiveObs()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.uzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181795a.m107452f3((Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m160238F2().LiveHomeStartLiveEvent.showRedDot().m199270g());
        final f0o f0oVar = (f0o) this.viewModel;
        Objects.requireNonNull(f0oVar);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.vzn
            @Override // p153l.y20
            public final void call(Object obj) {
                f0oVar.m123497k(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m160238F2().LiveHomeStartLiveEvent.startLiveSkinEvent().m199270g()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.wzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191810a.m107458o3((BLiveTapBarStartLiveConfig) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.xzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196902a.m107453g3((Boolean) obj);
            }
        }));
        duringCreated(m160238F2().LiveHomePageEvent.tabSelected().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.yzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202210a.m107454h3((String) obj);
            }
        }));
        duringCreated(t4u.m189320i()).subscribe(dhw.m115829h(new y20() { // from class: l.zzn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206726a.m107455i3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m107462k3(String str) {
        fwk.m127777h().m127779g(str);
        m107464r3();
    }

    /* JADX INFO: renamed from: n3 */
    public void m107463n3() {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126181i(false);
        if (mqr.m159587g()) {
            wtm.m207899e().m207904j(getAct());
        } else {
            n4u.m161600l(getAct(), AnchorStartData.ANCHOR_SOURCE_P_LIVE);
        }
    }

    /* JADX INFO: renamed from: r3 */
    public void m107464r3() {
        i4g0.m138520r("e_live_start_bubble", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: s3 */
    public void m107465s3() {
        i4g0.m138526x("e_live_start_bubble", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: t3 */
    public void m107466t3() {
        i4g0.m138520r("e_post_live", (String) m160243N2(new evs()));
    }

    /* JADX INFO: renamed from: u3 */
    public void m107467u3() {
        i4g0.m138526x("e_post_live", (String) m160243N2(new evs()));
    }
}
