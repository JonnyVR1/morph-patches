package com.hihonor.push.sdk;

import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.common.data.UpMsgType;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a0 */
/* JADX INFO: loaded from: classes7.dex */
public class C3475a0 {
    /* JADX INFO: renamed from: a */
    public Void m17479a(boolean z) throws ApiException {
        try {
            C3495g1 c3495g1 = new C3495g1(z ? UpMsgType.TURN_ON_PUSH : UpMsgType.TURN_OFF_PUSH, null);
            c3495g1.f11871e = C3477b.m17486a();
            C3477b.m17490a(C3533z.f11948c.m17530a(c3495g1));
            return null;
        } catch (Exception e) {
            throw C3477b.m17489a(e);
        }
    }
}
