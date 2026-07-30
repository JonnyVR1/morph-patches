package com.hihonor.push.sdk;

import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.common.data.UpMsgType;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3634a0 {
    /* JADX INFO: renamed from: a */
    public Void m18556a(boolean z) throws ApiException {
        try {
            C3654g1 c3654g1 = new C3654g1(z ? UpMsgType.TURN_ON_PUSH : UpMsgType.TURN_OFF_PUSH, null);
            c3654g1.f12612e = C3636b.m18563a();
            C3636b.m18567a(C3692z.f12689c.m18607a(c3654g1));
            return null;
        } catch (Exception e) {
            throw C3636b.m18566a(e);
        }
    }
}
