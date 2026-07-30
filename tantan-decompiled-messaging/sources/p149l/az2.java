package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordVerificationAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Mobile;
import com.p046p1.mobile.putong.data.VerifyReason;

/* JADX INFO: loaded from: classes9.dex */
public class az2 extends ez2 {
    public az2() {
        this.f93839a = "phoneNumber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m99614j(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        CoreModule.f17545c.f19627a0.f151420U.put(Boolean.TRUE);
        xdl0.m208344M(accountSecureFunItem.f28264c, false);
        boolean zM118824g = m118824g(commonData);
        boolean zM118821d = m118821d(commonData);
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        if (zM118824g && zM118821d) {
            newAccountSecureAct.m44194V1().m125654f1(true, accountSecureFunItem.f28262a.getText().toString(), Mobile.TYPE);
        } else if (zM118824g) {
            newAccountSecureAct.startActivity(new Intent(newAccountSecureAct, (Class<?>) PasswordVerificationAct.class));
        } else {
            accountSecureFunItem.getContext().startActivity(CoreModule.m29931H().mo28161Qa(accountSecureFunItem.getContext(), VerifyReason.get(VerifyReason.bind_mobile), "bind_or_change_phone"));
            zvf0.m220396r("e_intl_account_add_phone_btn", ((Act) view.getContext()).pageId());
        }
    }

    @Override // p149l.ez2
    /* JADX INFO: renamed from: a */
    public void mo99615a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        String strM118820c = m118820c(commonData);
        if (TextUtils.isEmpty(strM118820c)) {
            accountSecureFunItem.f28263b.setText(m118819b());
        } else {
            accountSecureFunItem.f28263b.setText(strM118820c);
        }
        xdl0.m208344M(accountSecureFunItem.f28264c, false);
        boolean zIsEmpty = TextUtils.isEmpty(accountSecureFunItem.f28263b.getText());
        VText_Medium vText_Medium = accountSecureFunItem.f28262a;
        if (zIsEmpty) {
            vText_Medium.setText(R$string.f27732J1);
        } else {
            vText_Medium.setText(R$string.f27967z1);
        }
        if (TextUtils.isEmpty(strM118820c) && !CoreModule.f17545c.f19627a0.f151420U.get().booleanValue()) {
            xdl0.m208344M(accountSecureFunItem.f28264c, true);
        }
        xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.zy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205598a.m99614j(accountSecureFunItem, commonData, view);
            }
        });
    }
}
