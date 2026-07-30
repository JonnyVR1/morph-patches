package p149l;

import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class b0w {
    /* JADX INFO: renamed from: c */
    public static C22306c<Connector> m99791c(String str, String str2, String str3, String str4, String str5, String str6) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/live-metadata"), mt0.m156174a("roomId", str), mt0.m156174a("sessionId", str2), mt0.m156174a("liveId", str3), mt0.m156174a("enterSource", str4), mt0.m156174a("roomType", str5), mt0.m156174a("liveMode", str6)), "anchorVerification").map(new w9j() { // from class: l.zzv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.connector;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<roj0> m99792d(t1w t1wVar) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/live-reconnect-report"), mt0.m156174a("roomId", t1wVar.f167374a), mt0.m156174a("sessionId", t1wVar.f167377d), mt0.m156174a("liveId", t1wVar.f167378e), mt0.m156174a("linkState", String.valueOf(t1wVar.f167382i)), mt0.m156174a("roomType", t1wVar.f167380g), mt0.m156174a("liveMode", t1wVar.f167376c), mt0.m156174a("firstLinkTime", String.valueOf(t1wVar.f167383j)), mt0.m156174a("interruptLinkTime", String.valueOf(t1wVar.f167385l)), mt0.m156174a("currentTime", String.valueOf(mqi0.m155944o())), mt0.m156174a("ipHost", t1wVar.f167387n), mt0.m156174a("netType", ConnectivityReceiver.m81281d()), mt0.m156174a("interruptLinkReason", t1wVar.f167389p), mt0.m156174a("retryCount", String.valueOf(t1wVar.f167388o))), "reportReconnect").map(new w9j() { // from class: l.a0w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
