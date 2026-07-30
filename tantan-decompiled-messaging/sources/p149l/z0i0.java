package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Data;
import com.p046p1.mobile.account_core.reponse_data.Token;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.data.TTCSignInData;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class z0i0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216751a(TTCSignInData tTCSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C20975ww.m205790a("TanTanTokenApi/signin", tTCSignInData);
        }
    }

    /* JADX INFO: renamed from: c */
    public C22306c<Token> m216753c(SignInData signInData) {
        final TTCSignInData tTCSignInData = new TTCSignInData();
        tTCSignInData.token = signInData.ttcToken;
        tTCSignInData.clientID = "100032";
        tTCSignInData.addExtraData(Device.TYPE, pk8.m169980M().toJson());
        C4575a.m28210S0(tTCSignInData, true);
        return x14.m206656b().m206659d("/ttc/tokenSignin", tTCSignInData.toJson()).doOnNext(new e30() { // from class: l.x0i0
            @Override // p149l.e30
            public final void call(Object obj) {
                z0i0.m216751a(tTCSignInData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.y0i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
