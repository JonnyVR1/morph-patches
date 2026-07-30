package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.data.UpdateApiResult;
import p133rx.C22306c;
import p149l.cll;
import p149l.dyd;
import p149l.ka20;
import p149l.mr4;
import p149l.v9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4741g0 extends C4728a {

    /* JADX INFO: renamed from: Q */
    public static String f20002Q;

    /* JADX INFO: renamed from: a3 */
    public C22306c<UpdateApiResult> m33225a3() {
        cll.C16188a c16188aM107524p = cll.m107501r(C4728a.f19502h + "/android/version").m107524p();
        String str = f20002Q;
        if (str == null) {
            str = "7.2.7";
        }
        final cll.C16188a c16188aM107536c = c16188aM107524p.m107536c("appversion", str).m107536c("deviceid", dyd.m114055a()).m107536c("affiliate", mr4.f135329a);
        if (CoreModule.m29931H().signedIn_()) {
            c16188aM107536c = c16188aM107536c.m107536c(UserId.TYPE, CoreModule.m29931H().userId());
        }
        return now("update", new ka20(new v9j() { // from class: l.npj0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.basic().m185900s(c16188aM107536c.m107537d()).m185883b();
            }
        }, UpdateApiResult.JSON_ADAPTER).compose(C4728a.m31252T2()), false);
    }
}
