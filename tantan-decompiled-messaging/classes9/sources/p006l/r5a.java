package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.data.OpenSDKInfo;
import com.p1.mobile.putong.data.OpenSdkCodeAuth;
import l.mkd0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r5a extends ax6 {
    public r5a(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: e3 */
    public c<OpenSdkCodeAuth> m22652e3(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f8580Q.scheduled("getOpenSdkCodeAuth", 0, new v9j() { // from class: l.p5a
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.q5a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3251l1(str, str, str, str, str)).f().b();
                    }
                }, OpenSdkCodeAuth.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public c<OpenSDKInfo> m22653f3(final String str, final String str2) {
        return CoreModule.f1534c.scheduled("getOpenSdkInfo", 0, new v9j() { // from class: l.n5a
            public final Object call() {
                return new ka20(new v9j() { // from class: l.o5a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3255m1(str, str)).f().b();
                    }
                }, OpenSDKInfo.JSON_ADAPTER).compose(mkd0.C());
            }
        }, false);
    }
}
