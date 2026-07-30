package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class vx2 extends ez2 {
    public vx2() {
        this.f93839a = "facebook";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m200478i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        newAccountSecureAct.m44194V1().m125635E0();
        zvf0.m220396r("e_intl_account_add_facebook_btn", newAccountSecureAct.pageId());
    }

    @Override // p149l.ez2
    /* JADX INFO: renamed from: a */
    public void mo99615a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m118822e(commonData)) {
            accountSecureFunItem.f28262a.setText(R$string.f27955x1);
            accountSecureFunItem.f28263b.setText(R$string.f27780T);
            xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.tx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172471a.m200480k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f28262a.setText(R$string.f27722H1);
            accountSecureFunItem.f28263b.setText("");
            xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.ux2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vx2.m200478i(accountSecureFunItem, view);
                }
            });
        }
        xdl0.m208344M(accountSecureFunItem.f28264c, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m200480k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        boolean z;
        ge20 ge20VarM44194V1 = ((NewAccountSecureAct) accountSecureFunItem.getContext()).m44194V1();
        if (!m118824g(commonData) && !m118821d(commonData)) {
            z = m118825h(commonData, false);
        }
        ge20VarM44194V1.m125654f1(z, accountSecureFunItem.f28262a.getText().toString(), "facebook");
    }
}
