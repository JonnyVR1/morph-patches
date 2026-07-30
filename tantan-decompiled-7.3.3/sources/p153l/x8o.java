package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class x8o {
    /* JADX INFO: renamed from: b */
    public static C22421c<String> m209747b(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live/campaignBanner")).m182288p().m182300c("schema", str).m182301d(), "fetchRealJumpUrl").map(new qcj() { // from class: l.w8o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.schema;
            }
        });
    }
}
