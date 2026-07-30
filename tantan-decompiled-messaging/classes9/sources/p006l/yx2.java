package p006l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ThirdPartyEmail;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yx2 extends ez2 {
    public yx2() {
        this.f11524a = "google";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m28447i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct context = accountSecureFunItem.getContext();
        context.V1().F0();
        zvf0.r("e_intl_account_add_google_btn", context.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m28449k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        accountSecureFunItem.getContext().V1().f1(m14933g(commonData) || m14930d(commonData), accountSecureFunItem.f4329a.getText().toString(), "google");
    }

    @Override // p006l.ez2
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m14932f(commonData)) {
            accountSecureFunItem.f4329a.setText(R.string.c1);
            ThirdPartyEmail thirdPartyEmail = commonData.thirdpartyEmail;
            if (thirdPartyEmail == null || TextUtils.isEmpty(thirdPartyEmail.googleEmail)) {
                accountSecureFunItem.f4330b.setText(R.string.T);
            } else {
                accountSecureFunItem.f4330b.setText(commonData.thirdpartyEmail.googleEmail);
            }
            xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.wx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f25450a.m28449k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f4329a.setText(R.string.b1);
            accountSecureFunItem.f4330b.setText("");
            xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.xx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yx2.m28447i(accountSecureFunItem, view);
                }
            });
        }
        xdl0.M(accountSecureFunItem.f4331c, false);
    }
}
