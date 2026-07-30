package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.entity.BooleanResult;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.o */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3670o implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3678s f12643a;

    public CallableC3670o(C3678s c3678s) {
        this.f12643a = c3678s;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        this.f12643a.f12657b.getClass();
        try {
            C3641c1 c3641c1 = new C3641c1(UpMsgType.QUERY_PUSH_STATUS, null);
            c3641c1.f12612e = C3636b.m18563a();
            return Boolean.valueOf(((BooleanResult) C3636b.m18567a(C3692z.f12689c.m18607a(c3641c1))).getStatus());
        } catch (Exception e) {
            throw C3636b.m18566a(e);
        }
    }
}
