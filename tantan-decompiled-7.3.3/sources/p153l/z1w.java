package p153l;

import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class z1w {
    /* JADX INFO: renamed from: c */
    public static C22421c<Connector> m218382c(String str, String str2, String str3, String str4, String str5, String str6) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/live-metadata"), st0.m187803a("roomId", str), st0.m187803a("sessionId", str2), st0.m187803a("liveId", str3), st0.m187803a("enterSource", str4), st0.m187803a("roomType", str5), st0.m187803a("liveMode", str6)), "anchorVerification").map(new qcj() { // from class: l.x1w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.connector;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<uxj0> m218383d(r3w r3wVar) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/live-reconnect-report"), st0.m187803a("roomId", r3wVar.f161086a), st0.m187803a("sessionId", r3wVar.f161089d), st0.m187803a("liveId", r3wVar.f161090e), st0.m187803a("linkState", String.valueOf(r3wVar.f161094i)), st0.m187803a("roomType", r3wVar.f161092g), st0.m187803a("liveMode", r3wVar.f161088c), st0.m187803a("firstLinkTime", String.valueOf(r3wVar.f161095j)), st0.m187803a("interruptLinkTime", String.valueOf(r3wVar.f161097l)), st0.m187803a("currentTime", String.valueOf(pzi0.m174454o())), st0.m187803a("ipHost", r3wVar.f161099n), st0.m187803a("netType", ConnectivityReceiver.m82464d()), st0.m187803a("interruptLinkReason", r3wVar.f161101p), st0.m187803a("retryCount", String.valueOf(r3wVar.f161100o))), "reportReconnect").map(new qcj() { // from class: l.y1w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
