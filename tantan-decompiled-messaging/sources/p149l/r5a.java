package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.OpenSDKInfo;
import com.p046p1.mobile.putong.data.OpenSdkCodeAuth;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class r5a extends ax6 {
    public r5a(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: e3 */
    public C22306c<OpenSdkCodeAuth> m177886e3(final String str, final String str2, final String str3, final String str4, final String str5) {
        return this.f72126Q.scheduled("getOpenSdkCodeAuth", 0, new v9j() { // from class: l.p5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.q5a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31321l1(str, str, str, str, str)).m185887f().m185883b();
                    }
                }, OpenSdkCodeAuth.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public C22306c<OpenSDKInfo> m177887f3(final String str, final String str2) {
        return CoreModule.f17545c.scheduled("getOpenSdkInfo", 0, new v9j() { // from class: l.n5a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.o5a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31325m1(str, str)).m185887f().m185883b();
                    }
                }, OpenSDKInfo.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        }, false);
    }
}
