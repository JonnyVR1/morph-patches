package com.p046p1.mobile.putong.live.external.intl.module.api;

import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p133rx.C22306c;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.gld0;
import p149l.mt0;
import p149l.nj3;
import p149l.s9s;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveCounterApi {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m70215d(boolean z, BLiveCounter bLiveCounter) {
        bLiveCounter.ignoredByLiveActivitiesModule = z;
        ((nj3) s9s.m182763m(gld0.f103312b)).m159623e(bLiveCounter);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveCounter m70216e(BLiveEnvelope bLiveEnvelope) {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159623e(bLiveEnvelope.liveCounters);
        return bLiveEnvelope.liveCounters;
    }

    public static C22306c<BLiveCounter> patchReddot(String str) {
        return LiveExternalApi.buildLivePostNetReqObs(cll.m107499l(ytr.m216073b("/live-counters")).m107524p().m107536c("intent", str).m107537d(), "patchReddot" + str, "").map(new w9j() { // from class: l.cun
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveCounterApi.m70216e((BLiveEnvelope) obj);
            }
        });
    }

    public static void refreshLiveCounter(final boolean z) {
        LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live-counters")), "refreshLiveCounter").map(new w9j() { // from class: l.ytn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ztn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveCounterApi.m70215d(z, (BLiveCounter) obj);
            }
        }, new e30() { // from class: l.aun
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).m159623e(BLiveCounter.new_());
            }
        }));
    }

    public static C22306c<BLiveCounter> requestLiveCounter() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/live-counters"), new mt0[0]), "requestLiveCounter").map(new w9j() { // from class: l.bun
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void refreshLiveCounter() {
        refreshLiveCounter(false);
    }
}
