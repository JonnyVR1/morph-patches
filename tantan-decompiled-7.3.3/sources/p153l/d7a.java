package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.OpenSDKInfo;
import com.p051p1.mobile.putong.data.OpenSdkCodeAuth;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class d7a extends dy6 {
    public d7a(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: e3 */
    public C22421c<OpenSdkCodeAuth> m114714e3(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f91137Q.scheduled("getOpenSdkCodeAuth", 0, new pcj() { // from class: l.b7a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.c7a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32324l1(str, str, str, str, str)).m209032f().m209028b();
                    }
                }, OpenSdkCodeAuth.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public C22421c<OpenSDKInfo> m114715f3(final String str, final String str2) {
        return CoreModule.f18264c.scheduled("getOpenSdkInfo", 0, new pcj() { // from class: l.z6a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.a7a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32328m1(str, str)).m209032f().m209028b();
                    }
                }, OpenSDKInfo.JSON_ADAPTER).compose(psd0.m173592C());
            }
        }, false);
    }
}
