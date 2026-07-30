package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordVerificationAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.data.VerifyReason;

/* JADX INFO: loaded from: classes9.dex */
public class pz2 extends tz2 {
    public pz2() {
        this.f176736a = "phoneNumber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m174326j(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        CoreModule.f18264c.f20369a0.f170922U.put(Boolean.TRUE);
        bnl0.m105524M(accountSecureFunItem.f29112c, false);
        boolean zM193640g = m193640g(commonData);
        boolean zM193637d = m193637d(commonData);
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        if (zM193640g && zM193637d) {
            newAccountSecureAct.m45377X1().m177063f1(true, accountSecureFunItem.f29110a.getText().toString(), Mobile.TYPE);
        } else if (zM193640g) {
            newAccountSecureAct.startActivity(new Intent(newAccountSecureAct, (Class<?>) PasswordVerificationAct.class));
        } else {
            accountSecureFunItem.getContext().startActivity(CoreModule.m30929H().mo29160Qa(accountSecureFunItem.getContext(), VerifyReason.get(VerifyReason.bind_mobile), "bind_or_change_phone"));
            i4g0.m138520r("e_intl_account_add_phone_btn", ((Act) view.getContext()).pageId());
        }
    }

    @Override // p153l.tz2
    /* JADX INFO: renamed from: a */
    public void mo114641a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        String strM193636c = m193636c(commonData);
        if (TextUtils.isEmpty(strM193636c)) {
            accountSecureFunItem.f29111b.setText(m193635b());
        } else {
            accountSecureFunItem.f29111b.setText(strM193636c);
        }
        bnl0.m105524M(accountSecureFunItem.f29112c, false);
        boolean zIsEmpty = TextUtils.isEmpty(accountSecureFunItem.f29111b.getText());
        VText_Medium vText_Medium = accountSecureFunItem.f29110a;
        if (zIsEmpty) {
            vText_Medium.setText(R$string.f28580J1);
        } else {
            vText_Medium.setText(R$string.f28815z1);
        }
        if (TextUtils.isEmpty(strM193636c) && !CoreModule.f18264c.f20369a0.f170922U.get().booleanValue()) {
            bnl0.m105524M(accountSecureFunItem.f29112c, true);
        }
        bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.oz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149838a.m174326j(accountSecureFunItem, commonData, view);
            }
        });
    }
}
