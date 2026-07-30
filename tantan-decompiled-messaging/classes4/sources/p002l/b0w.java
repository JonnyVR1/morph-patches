package p002l;

import com.p1.mobile.putong.data.Connector;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.mqi0;
import l.mt0;
import l.roj0;
import l.upv;
import l.w9j;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b0w {
    /* JADX INFO: renamed from: c */
    public static c<Connector> m10143c(String str, String str2, String str3, String str4, String str5, String str6) {
        return upv.h(LiveApiBuilder.u(ytr.b("/live-metadata"), new mt0[]{mt0.a("roomId", str), mt0.a("sessionId", str2), mt0.a("liveId", str3), mt0.a("enterSource", str4), mt0.a("roomType", str5), mt0.a("liveMode", str6)}), "anchorVerification").map(new w9j() { // from class: l.zzv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.connector;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static c<roj0> m10144d(t1w t1wVar) {
        return upv.h(LiveApiBuilder.u(ytr.b("/live-reconnect-report"), new mt0[]{mt0.a("roomId", t1wVar.f19366a), mt0.a("sessionId", t1wVar.f19369d), mt0.a("liveId", t1wVar.f19370e), mt0.a("linkState", String.valueOf(t1wVar.f19374i)), mt0.a("roomType", t1wVar.f19372g), mt0.a("liveMode", t1wVar.f19368c), mt0.a("firstLinkTime", String.valueOf(t1wVar.f19375j)), mt0.a("interruptLinkTime", String.valueOf(t1wVar.f19377l)), mt0.a("currentTime", String.valueOf(mqi0.o())), mt0.a("ipHost", t1wVar.f19379n), mt0.a("netType", ConnectivityReceiver.d()), mt0.a("interruptLinkReason", t1wVar.f19381p), mt0.a("retryCount", String.valueOf(t1wVar.f19380o))}), "reportReconnect").map(new w9j() { // from class: l.a0w
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }
}
