package com.p051p1.mobile.putong.live.external.intl.module.api;

import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fk3;
import p153l.itd0;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.tbs;
import p153l.y20;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveCounterApi {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m71398d(boolean z, BLiveCounter bLiveCounter) {
        bLiveCounter.ignoredByLiveActivitiesModule = z;
        ((fk3) tbs.m190077m(itd0.f116820b)).m125954e(bLiveCounter);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveCounter m71399e(BLiveEnvelope bLiveEnvelope) {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125954e(bLiveEnvelope.liveCounters);
        return bLiveEnvelope.liveCounters;
    }

    public static C22421c<BLiveCounter> patchReddot(String str) {
        return LiveExternalApi.buildLivePostNetReqObs(rnl.m182263l(zvr.m221802b("/live-counters")).m182288p().m182300c("intent", str).m182301d(), "patchReddot" + str, "").map(new qcj() { // from class: l.cwn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveCounterApi.m71399e((BLiveEnvelope) obj);
            }
        });
    }

    public static void refreshLiveCounter(final boolean z) {
        LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live-counters")), "refreshLiveCounter").map(new qcj() { // from class: l.yvn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.zvn
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveCounterApi.m71398d(z, (BLiveCounter) obj);
            }
        }, new y20() { // from class: l.awn
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).m125954e(BLiveCounter.new_());
            }
        }));
    }

    public static C22421c<BLiveCounter> requestLiveCounter() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/live-counters"), new st0[0]), "requestLiveCounter").map(new qcj() { // from class: l.bwn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void refreshLiveCounter() {
        refreshLiveCounter(false);
    }
}
