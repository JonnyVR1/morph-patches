package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ThirdPartyEmail;

/* JADX INFO: loaded from: classes9.dex */
public class yx2 extends ez2 {
    public yx2() {
        this.f93839a = "google";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m216426i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        newAccountSecureAct.m44194V1().m125636F0();
        zvf0.m220396r("e_intl_account_add_google_btn", newAccountSecureAct.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m216428k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        ((NewAccountSecureAct) accountSecureFunItem.getContext()).m44194V1().m125654f1(m118824g(commonData) || m118821d(commonData), accountSecureFunItem.f28262a.getText().toString(), "google");
    }

    @Override // p149l.ez2
    /* JADX INFO: renamed from: a */
    public void mo99615a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m118823f(commonData)) {
            accountSecureFunItem.f28262a.setText(R$string.f27829c1);
            ThirdPartyEmail thirdPartyEmail = commonData.thirdpartyEmail;
            if (thirdPartyEmail == null || TextUtils.isEmpty(thirdPartyEmail.googleEmail)) {
                accountSecureFunItem.f28263b.setText(R$string.f27780T);
            } else {
                accountSecureFunItem.f28263b.setText(commonData.thirdpartyEmail.googleEmail);
            }
            xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.wx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188424a.m216428k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f28262a.setText(R$string.f27823b1);
            accountSecureFunItem.f28263b.setText("");
            xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.xx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yx2.m216426i(accountSecureFunItem, view);
                }
            });
        }
        xdl0.m208344M(accountSecureFunItem.f28264c, false);
    }
}
