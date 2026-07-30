package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Data;
import com.p051p1.mobile.account_core.reponse_data.Token;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.data.TTCSignInData;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class h9i0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m134071a(TTCSignInData tTCSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            C19682qw.m178399a("TanTanTokenApi/signin", tTCSignInData);
        }
    }

    /* JADX INFO: renamed from: c */
    public C22421c<Token> m134073c(SignInData signInData) {
        final TTCSignInData tTCSignInData = new TTCSignInData();
        tTCSignInData.token = signInData.ttcToken;
        tTCSignInData.clientID = "100032";
        tTCSignInData.addExtraData(Device.TYPE, tl8.m191616M().toJson());
        C4726a.m29209S0(tTCSignInData, true);
        return w24.m204501b().m204504d("/ttc/tokenSignin", tTCSignInData.toJson()).doOnNext(new y20() { // from class: l.f9i0
            @Override // p153l.y20
            public final void call(Object obj) {
                h9i0.m134071a(tTCSignInData, (AccountEnvelop) obj);
            }
        }).map(new qcj() { // from class: l.g9i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
