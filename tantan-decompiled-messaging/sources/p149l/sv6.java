package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.request_data.DeleteAccountData;
import com.p046p1.mobile.account_core.request_data.VerifyPasswordData;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class sv6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public vt60 f166541R;

    public sv6(C4732c c4732c) {
        super(c4732c);
        this.f166541R = new vt60();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ AccountErrorResponse m186046b3(AccountEnvelop accountEnvelop) {
        AccountErrorResponse accountErrorResponseNew_ = AccountErrorResponse.new_();
        accountErrorResponseNew_.code = 200;
        accountErrorResponseNew_.hasContract = "true".equals(accountEnvelop.extra.get("hasContract"));
        accountErrorResponseNew_.message = accountEnvelop.meta.message;
        return accountErrorResponseNew_;
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<roj0> m186047c3(String str) {
        return this.f166541R.m219238q(str).map(new w9j() { // from class: l.qv6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public C22306c<AccountErrorResponse> m186048d3(String str, String str2, String str3, String str4) {
        DeleteAccountData deleteAccountData = new DeleteAccountData();
        deleteAccountData.value = str4;
        deleteAccountData.reason = str2;
        if (!TextUtils.isEmpty(str)) {
            deleteAccountData.addExtraData("category", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            deleteAccountData.addExtraData("content", str3);
        }
        return this.f166541R.m219239r(deleteAccountData).map(new w9j() { // from class: l.rv6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sv6.m186046b3((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public C22306c<Boolean> m186049e3(String str) {
        VerifyPasswordData verifyPasswordData = new VerifyPasswordData();
        verifyPasswordData.setPassword(str);
        return this.f166541R.m219245x(verifyPasswordData);
    }
}
