package p006l;

import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.data.TTCSignInData;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Data;
import com.p1.mobile.account_core.reponse_data.Token;
import com.p1.mobile.putong.data.SignInData;
import l.e30;
import l.w9j;
import l.ww;
import l.x14;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class z0i0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m28538a(TTCSignInData tTCSignInData, AccountEnvelop accountEnvelop) {
        Data data;
        if (accountEnvelop == null || (data = accountEnvelop.data) == null || data.token == null) {
            ww.a("TanTanTokenApi/signin", tTCSignInData);
        }
    }

    /* JADX INFO: renamed from: c */
    public c<Token> m28540c(SignInData signInData) {
        final TTCSignInData tTCSignInData = new TTCSignInData();
        tTCSignInData.token = signInData.ttcToken;
        tTCSignInData.clientID = "100032";
        tTCSignInData.addExtraData("device", pk8.m21562M().toJson());
        C0001a.m105S0(tTCSignInData, true);
        return x14.b().d("/ttc/tokenSignin", tTCSignInData.toJson()).doOnNext(new e30() { // from class: l.x0i0
            public final void call(Object obj) {
                z0i0.m28538a(tTCSignInData, (AccountEnvelop) obj);
            }
        }).map(new w9j() { // from class: l.y0i0
            public final Object call(Object obj) {
                return ((AccountEnvelop) obj).data.token;
            }
        });
    }
}
