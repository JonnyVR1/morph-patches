package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.request_data.DeactivatedData;
import com.p1.mobile.account_core.request_data.DeleteAccountData;
import com.p1.mobile.account_core.request_data.VerifyPasswordData;
import com.p1.mobile.putong.data.AccountErrorResponse;
import l.roj0;
import l.vt60;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sv6 extends ax6 {

    /* JADX INFO: renamed from: R */
    public vt60 f21679R;

    public sv6(C0158c c0158c) {
        super(c0158c);
        this.f21679R = new vt60();
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ AccountErrorResponse m24209b3(AccountEnvelop accountEnvelop) {
        AccountErrorResponse accountErrorResponseNew_ = AccountErrorResponse.new_();
        accountErrorResponseNew_.code = 200;
        accountErrorResponseNew_.hasContract = "true".equals(accountEnvelop.extra.get("hasContract"));
        accountErrorResponseNew_.message = accountEnvelop.meta.message;
        return accountErrorResponseNew_;
    }

    /* JADX INFO: renamed from: c3 */
    public c<roj0> m24210c3(String str) {
        return this.f21679R.q(str).map(new w9j() { // from class: l.qv6
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public c<AccountErrorResponse> m24211d3(String str, String str2, String str3, String str4) {
        DeleteAccountData deleteAccountData = new DeleteAccountData();
        deleteAccountData.value = str4;
        ((DeactivatedData) deleteAccountData).reason = str2;
        if (!TextUtils.isEmpty(str)) {
            deleteAccountData.addExtraData("category", str);
        }
        if (!TextUtils.isEmpty(str3)) {
            deleteAccountData.addExtraData("content", str3);
        }
        return this.f21679R.r(deleteAccountData).map(new w9j() { // from class: l.rv6
            public final Object call(Object obj) {
                return sv6.m24209b3((AccountEnvelop) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e3 */
    public c<Boolean> m24212e3(String str) {
        VerifyPasswordData verifyPasswordData = new VerifyPasswordData();
        verifyPasswordData.setPassword(str);
        return this.f21679R.x(verifyPasswordData);
    }
}
