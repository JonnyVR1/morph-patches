package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.request_data.DeleteAccountData;
import com.p051p1.mobile.account_core.request_data.VerifyPasswordData;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class vw6 extends dy6 {

    /* JADX INFO: renamed from: R */
    public b270 f186066R;

    public vw6(C4883c c4883c) {
        super(c4883c);
        this.f186066R = new b270();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ AccountErrorResponse m203068b3(AccountEnvelop accountEnvelop) {
        AccountErrorResponse accountErrorResponseNew_ = AccountErrorResponse.new_();
        accountErrorResponseNew_.code = 200;
        accountErrorResponseNew_.hasContract = "true".equals(accountEnvelop.extra.get("hasContract"));
        accountErrorResponseNew_.message = accountEnvelop.meta.message;
        return accountErrorResponseNew_;
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<uxj0> m203069c3(String str) {
        return this.f186066R.m111443q(str).map(new qcj() { // from class: l.tw6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<AccountErrorResponse> m203070d3(String str, String str2, String str3, String str4) {
        DeleteAccountData deleteAccountData = new DeleteAccountData();
        deleteAccountData.value = str4;
        deleteAccountData.reason = str2;
        if (!TextUtils.isEmpty(str)) {
            deleteAccountData.addExtraData("category", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            deleteAccountData.addExtraData("content", str3);
        }
        return this.f186066R.m111444r(deleteAccountData).map(new qcj() { // from class: l.uw6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vw6.m203068b3((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public C22421c<Boolean> m203071e3(String str) {
        VerifyPasswordData verifyPasswordData = new VerifyPasswordData();
        verifyPasswordData.setPassword(str);
        return this.f186066R.m111450x(verifyPasswordData);
    }
}
