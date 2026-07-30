package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.core.ui.account.PasswordVerificationAct;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.VerifyReason;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class az2 extends ez2 {
    public az2() {
        this.f11524a = "phoneNumber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m12346j(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        CoreModule.f1534c.f3616a0.f19369U.put(Boolean.TRUE);
        xdl0.M(accountSecureFunItem.f4331c, false);
        boolean zM14933g = m14933g(commonData);
        boolean zM14930d = m14930d(commonData);
        NewAccountSecureAct context = accountSecureFunItem.getContext();
        if (zM14933g && zM14930d) {
            context.V1().f1(true, accountSecureFunItem.f4329a.getText().toString(), "mobile");
        } else if (zM14933g) {
            context.startActivity(new Intent((Context) context, (Class<?>) PasswordVerificationAct.class));
        } else {
            accountSecureFunItem.getContext().startActivity(CoreModule.m1850H().mo56Qa(accountSecureFunItem.getContext(), VerifyReason.get("bind_mobile"), "bind_or_change_phone"));
            zvf0.r("e_intl_account_add_phone_btn", view.getContext().pageId());
        }
    }

    @Override // p006l.ez2
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        String strM14929c = m14929c(commonData);
        if (TextUtils.isEmpty(strM14929c)) {
            accountSecureFunItem.f4330b.setText(m14928b());
        } else {
            accountSecureFunItem.f4330b.setText(strM14929c);
        }
        xdl0.M(accountSecureFunItem.f4331c, false);
        boolean zIsEmpty = TextUtils.isEmpty(accountSecureFunItem.f4330b.getText());
        VText_Medium vText_Medium = accountSecureFunItem.f4329a;
        if (zIsEmpty) {
            vText_Medium.setText(R.string.J1);
        } else {
            vText_Medium.setText(R.string.z1);
        }
        if (TextUtils.isEmpty(strM14929c) && !((Boolean) CoreModule.f1534c.f3616a0.f19369U.get()).booleanValue()) {
            xdl0.M(accountSecureFunItem.f4331c, true);
        }
        xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.zy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29029a.m12346j(accountSecureFunItem, commonData, view);
            }
        });
    }
}
