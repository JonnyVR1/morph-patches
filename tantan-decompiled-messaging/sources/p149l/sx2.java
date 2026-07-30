package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class sx2 extends ez2 {
    public sx2() {
        this.f93839a = "email";
    }

    @Override // p149l.ez2
    /* JADX INFO: renamed from: a */
    public void mo99615a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m118821d(commonData)) {
            CoreModule.m29931H().mo28171ql("");
            accountSecureFunItem.f28262a.setText(R$string.f27949w1);
            accountSecureFunItem.f28263b.setText(commonData.email);
            xdl0.m208344M(accountSecureFunItem.f28264c, false);
        } else {
            accountSecureFunItem.f28262a.setText(R$string.f27717G1);
            accountSecureFunItem.f28263b.setText("");
            xdl0.m208344M(accountSecureFunItem.f28264c, !TextUtils.isEmpty(CoreModule.m29931H().mo28153G6()));
        }
        xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.rx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161391a.m186397j(commonData, accountSecureFunItem, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m186397j(CommonData commonData, AccountSecureFunItem accountSecureFunItem, View view) {
        boolean zM118824g = m118824g(commonData);
        boolean zM118821d = m118821d(commonData);
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        if (zM118824g && zM118821d) {
            newAccountSecureAct.m44194V1().m125654f1(true, accountSecureFunItem.f28262a.getText().toString(), "email");
            return;
        }
        CoreModule.m29931H().mo28167ji((Act) accountSecureFunItem.getContext(), false, "bind_or_change_email", commonData.email);
        if (zM118821d) {
            return;
        }
        zvf0.m220396r("e_intl_account_add_email_btn", newAccountSecureAct.pageId());
    }
}
