package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.data.UpdateApiResult;
import p137rx.C22421c;
import p153l.ls4;
import p153l.pcj;
import p153l.qzd;
import p153l.rnl;
import p153l.si20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4892g0 extends C4879a {

    /* JADX INFO: renamed from: Q */
    public static String f20744Q;

    /* JADX INFO: renamed from: a3 */
    public C22421c<UpdateApiResult> m34228a3() {
        rnl.C19886a c19886aM182288p = rnl.m182265r(C4879a.f20244h + "/android/version").m182288p();
        String str = f20744Q;
        if (str == null) {
            str = "7.3.3";
        }
        final rnl.C19886a c19886aM182300c = c19886aM182288p.m182300c("appversion", str).m182300c("deviceid", qzd.m178768a()).m182300c("affiliate", ls4.f133389a);
        if (CoreModule.m30929H().signedIn_()) {
            c19886aM182300c = c19886aM182300c.m182300c(UserId.TYPE, CoreModule.m30929H().userId());
        }
        return now("update", new si20(new pcj() { // from class: l.ryj0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.basic().m209045s(c19886aM182300c.m182301d()).m209028b();
            }
        }, UpdateApiResult.JSON_ADAPTER).compose(C4879a.m32255T2()), false);
    }
}
