package p006l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.data.CommonData;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sx2 extends ez2 {
    public sx2() {
        this.f11524a = "email";
    }

    @Override // p006l.ez2
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m14930d(commonData)) {
            CoreModule.m1850H().mo66ql("");
            accountSecureFunItem.f4329a.setText(R.string.w1);
            accountSecureFunItem.f4330b.setText(commonData.email);
            xdl0.M(accountSecureFunItem.f4331c, false);
        } else {
            accountSecureFunItem.f4329a.setText(R.string.G1);
            accountSecureFunItem.f4330b.setText("");
            xdl0.M(accountSecureFunItem.f4331c, !TextUtils.isEmpty(CoreModule.m1850H().mo48G6()));
        }
        xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.rx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20834a.m24383j(commonData, accountSecureFunItem, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m24383j(CommonData commonData, AccountSecureFunItem accountSecureFunItem, View view) {
        boolean zM14933g = m14933g(commonData);
        boolean zM14930d = m14930d(commonData);
        NewAccountSecureAct context = accountSecureFunItem.getContext();
        if (zM14933g && zM14930d) {
            context.V1().f1(true, accountSecureFunItem.f4329a.getText().toString(), "email");
            return;
        }
        CoreModule.m1850H().mo62ji(accountSecureFunItem.getContext(), false, "bind_or_change_email", commonData.email);
        if (zM14930d) {
            return;
        }
        zvf0.r("e_intl_account_add_email_btn", context.pageId());
    }
}
