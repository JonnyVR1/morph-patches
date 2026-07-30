package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ThirdPartyEmail;

/* JADX INFO: loaded from: classes9.dex */
public class ny2 extends tz2 {
    public ny2() {
        this.f176736a = "google";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m165306i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        newAccountSecureAct.m45377X1().m177045F0();
        i4g0.m138520r("e_intl_account_add_google_btn", newAccountSecureAct.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m165308k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        ((NewAccountSecureAct) accountSecureFunItem.getContext()).m45377X1().m177063f1(m193640g(commonData) || m193637d(commonData), accountSecureFunItem.f29110a.getText().toString(), "google");
    }

    @Override // p153l.tz2
    /* JADX INFO: renamed from: a */
    public void mo114641a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m193639f(commonData)) {
            accountSecureFunItem.f29110a.setText(R$string.f28677c1);
            ThirdPartyEmail thirdPartyEmail = commonData.thirdpartyEmail;
            if (thirdPartyEmail == null || TextUtils.isEmpty(thirdPartyEmail.googleEmail)) {
                accountSecureFunItem.f29111b.setText(R$string.f28628T);
            } else {
                accountSecureFunItem.f29111b.setText(commonData.thirdpartyEmail.googleEmail);
            }
            bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.ly2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134025a.m165308k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f29110a.setText(R$string.f28671b1);
            accountSecureFunItem.f29111b.setText("");
            bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.my2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ny2.m165306i(accountSecureFunItem, view);
                }
            });
        }
        bnl0.m105524M(accountSecureFunItem.f29112c, false);
    }
}
