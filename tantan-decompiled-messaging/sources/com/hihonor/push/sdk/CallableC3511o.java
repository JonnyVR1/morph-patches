package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.entity.BooleanResult;
import com.hihonor.push.sdk.common.data.UpMsgType;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.hihonor.push.sdk.o */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3511o implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3519s f11902a;

    public CallableC3511o(C3519s c3519s) {
        this.f11902a = c3519s;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        this.f11902a.f11916b.getClass();
        try {
            C3482c1 c3482c1 = new C3482c1(UpMsgType.QUERY_PUSH_STATUS, null);
            c3482c1.f11871e = C3477b.m17486a();
            return Boolean.valueOf(((BooleanResult) C3477b.m17490a(C3533z.f11948c.m17530a(c3482c1))).getStatus());
        } catch (Exception e) {
            throw C3477b.m17489a(e);
        }
    }
}
