package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class u3v extends jq2<LiveVoiceEntryView> {

    /* JADX INFO: renamed from: a */
    public c4g0 f173654a;

    /* JADX INFO: renamed from: b */
    public iyu f173655b;

    /* JADX INFO: renamed from: c */
    public c4g0 f173656c;

    public u3v(mcr mcrVar) {
        super(mcrVar);
        this.f173654a = null;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m191625e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m191626f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m191627g0(Throwable th) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m191635o0();
        mkd0.m154992z(this.f173656c);
        gld0<hl3> gld0Var = gld0.f103313c;
        this.f173656c = duringCreated(((hl3) s9s.m182763m(gld0Var)).m131634h()).throttleLast(500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.l3v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveCounter) obj).activity;
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.m3v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131185a.m191636p0((BLiveActivityCounter) obj);
            }
        }, new e30() { // from class: l.n3v
            @Override // p149l.e30
            public final void call(Object obj) {
                u3v.m191627g0((Throwable) obj);
            }
        }));
        duringCreated(((hl3) s9s.m182763m(gld0Var)).m131633g()).subscribe(ffw.m121194e(new e30() { // from class: l.o3v
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
            }
        }, new e30() { // from class: l.p3v
            @Override // p149l.e30
            public final void call(Object obj) {
                u3v.m191626f0((Throwable) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.q3v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152518a.m191637q0((Boolean) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
        mkd0.m154992z(this.f173654a);
        mkd0.m154992z(this.f173656c);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m191634n0() {
        return !pgi0.m168730l().m168751x() && s9s.f163228b.m195968v7();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m191635o0() {
        ((LiveVoiceEntryView) this.viewModel).setLiveVoiceEntryViewVis(m191634n0());
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m191636p0(BLiveActivityCounter bLiveActivityCounter) {
        m191641u0(bLiveActivityCounter.momentUnReadCon, bLiveActivityCounter.momentRedDotType, false);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m191637q0(Boolean bool) {
        m191635o0();
        m191640t0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m191638r0(boolean z, iyu iyuVar) {
        ((LiveVoiceEntryView) this.viewModel).m71119E(iyuVar);
        m191643y0(iyuVar, z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m191639s0() {
        ((LiveVoiceEntryView) this.viewModel).m71116A();
    }

    /* JADX INFO: renamed from: t0 */
    public void m191640t0() {
        BLiveCounter bLiveCounterM221515e;
        BLiveActivityCounter bLiveActivityCounter;
        if (!m191634n0() || (bLiveCounterM221515e = ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().m221515e()) == null || (bLiveActivityCounter = bLiveCounterM221515e.activity) == null) {
            return;
        }
        m191641u0(bLiveActivityCounter.momentUnReadCon, bLiveActivityCounter.momentRedDotType, true);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m191641u0(final int i, final String str, final boolean z) {
        if (m191634n0()) {
            mkd0.m154992z(this.f173654a);
            this.f173654a = duringCreated(VoiceCenterApiProvider.getVoiceNoticeLivingList()).map(new w9j() { // from class: l.r3v
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return new iyu(i, str, (BLiveVoiceLiveActivityMoment) obj).m139012a();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.s3v
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162196a.m191638r0(z, (iyu) obj);
                }
            }, new e30() { // from class: l.t3v
                @Override // p149l.e30
                public final void call(Object obj) {
                    u3v.m191625e0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m191642x0() {
        VoiceCenterApiProvider.postVoiceActivitiesToZero();
    }

    /* JADX INFO: renamed from: y0 */
    public void m191643y0(iyu iyuVar, boolean z) {
        iyu iyuVar2;
        if (iyuVar == null) {
            return;
        }
        if (z || (iyuVar2 = this.f173655b) == null || !iyuVar.equals(iyuVar2)) {
            amo0.m97569f(iyuVar, false, false, false);
            this.f173655b = iyuVar;
        }
    }
}
