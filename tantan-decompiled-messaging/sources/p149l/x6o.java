package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class x6o {
    /* JADX INFO: renamed from: b */
    public static C22306c<String> m207190b(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live/campaignBanner")).m107524p().m107536c("schema", str).m107537d(), "fetchRealJumpUrl").map(new w9j() { // from class: l.w6o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.schema;
            }
        });
    }
}
