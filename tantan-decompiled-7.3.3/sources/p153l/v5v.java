package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class v5v extends ar2<LiveVoiceEntryView> {

    /* JADX INFO: renamed from: a */
    public kcg0 f182572a;

    /* JADX INFO: renamed from: b */
    public j0v f182573b;

    /* JADX INFO: renamed from: c */
    public kcg0 f182574c;

    public v5v(ner nerVar) {
        super(nerVar);
        this.f182572a = null;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m199926e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m199927f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m199928g0(Throwable th) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m199936o0();
        psd0.m173633z(this.f182574c);
        itd0<gm3> itd0Var = itd0.f116821c;
        this.f182574c = duringCreated(((gm3) tbs.m190077m(itd0Var)).m130733h()).throttleLast(500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.m5v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveCounter) obj).activity;
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.n5v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140397a.m199937p0((BLiveActivityCounter) obj);
            }
        }, new y20() { // from class: l.o5v
            @Override // p153l.y20
            public final void call(Object obj) {
                v5v.m199928g0((Throwable) obj);
            }
        }));
        duringCreated(((gm3) tbs.m190077m(itd0Var)).m130732g()).subscribe(dhw.m115826e(new y20() { // from class: l.p5v
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
            }
        }, new y20() { // from class: l.q5v
            @Override // p153l.y20
            public final void call(Object obj) {
                v5v.m199927f0((Throwable) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.r5v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161408a.m199938q0((Boolean) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
        psd0.m173633z(this.f182572a);
        psd0.m173633z(this.f182574c);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m199935n0() {
        return !ppi0.m173207l().m173228x() && tbs.f172989b.m203755v7();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m199936o0() {
        ((LiveVoiceEntryView) this.viewModel).setLiveVoiceEntryViewVis(m199935n0());
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m199937p0(BLiveActivityCounter bLiveActivityCounter) {
        m199942u0(bLiveActivityCounter.momentUnReadCon, bLiveActivityCounter.momentRedDotType, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m199938q0(Boolean bool) {
        m199936o0();
        m199941t0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m199939r0(boolean z, j0v j0vVar) {
        ((LiveVoiceEntryView) this.viewModel).m72302E(j0vVar);
        m199944y0(j0vVar, z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m199940s0() {
        ((LiveVoiceEntryView) this.viewModel).m72299A();
    }

    /* JADX INFO: renamed from: t0 */
    public void m199941t0() {
        BLiveCounter bLiveCounterM222761e;
        BLiveActivityCounter bLiveActivityCounter;
        if (!m199935n0() || (bLiveCounterM222761e = ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().m222761e()) == null || (bLiveActivityCounter = bLiveCounterM222761e.activity) == null) {
            return;
        }
        m199942u0(bLiveActivityCounter.momentUnReadCon, bLiveActivityCounter.momentRedDotType, true);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m199942u0(final int i, final String str, final boolean z) {
        if (m199935n0()) {
            psd0.m173633z(this.f182572a);
            this.f182572a = duringCreated(VoiceCenterApiProvider.getVoiceNoticeLivingList()).map(new qcj() { // from class: l.s5v
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return new j0v(i, str, (BLiveVoiceLiveActivityMoment) obj).m143027a();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.t5v
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172233a.m199939r0(z, (j0v) obj);
                }
            }, new y20() { // from class: l.u5v
                @Override // p153l.y20
                public final void call(Object obj) {
                    v5v.m199926e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m199943x0() {
        VoiceCenterApiProvider.postVoiceActivitiesToZero();
    }

    /* JADX INFO: renamed from: y0 */
    public void m199944y0(j0v j0vVar, boolean z) {
        j0v j0vVar2;
        if (j0vVar == null) {
            return;
        }
        if (z || (j0vVar2 = this.f182573b) == null || !j0vVar.equals(j0vVar2)) {
            evo0.m122808f(j0vVar, false, false, false);
            this.f182573b = j0vVar;
        }
    }
}
