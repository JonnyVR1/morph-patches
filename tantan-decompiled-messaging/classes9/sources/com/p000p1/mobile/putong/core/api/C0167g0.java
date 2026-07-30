package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.UpdateApiResult;
import l.cll;
import l.dyd;
import l.v9j;
import p006l.ka20;
import p006l.mr4;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.g0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0167g0 extends C0154a {

    /* JADX INFO: renamed from: Q */
    public static String f3991Q;

    /* JADX INFO: renamed from: a3 */
    public c<UpdateApiResult> m5155a3() {
        cll.a aVarP = cll.r(C0154a.f3491h + "/android/version").p();
        String str = f3991Q;
        if (str == null) {
            str = "7.2.7";
        }
        final cll.a aVarC = aVarP.c("appversion", str).c("deviceid", dyd.a()).c("affiliate", mr4.f17192a);
        if (CoreModule.m1850H().signedIn_()) {
            aVarC = aVarC.c("userid", CoreModule.m1850H().userId());
        }
        return now("update", new ka20(new v9j() { // from class: l.npj0
            public final Object call() {
                return qib0.f19784H.basic().s(aVarC.d()).b();
            }
        }, UpdateApiResult.JSON_ADAPTER).compose(C0154a.m3182T2()), false);
    }
}
