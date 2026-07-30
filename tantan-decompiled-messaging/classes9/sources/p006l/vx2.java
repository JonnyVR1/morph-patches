package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.data.CommonData;
import l.ge20;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vx2 extends ez2 {
    public vx2() {
        this.f11524a = "facebook";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25957i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct context = accountSecureFunItem.getContext();
        context.V1().E0();
        zvf0.r("e_intl_account_add_facebook_btn", context.pageId());
    }

    @Override // p006l.ez2
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m14931e(commonData)) {
            accountSecureFunItem.f4329a.setText(R.string.x1);
            accountSecureFunItem.f4330b.setText(R.string.T);
            xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.tx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22314a.m25959k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f4329a.setText(R.string.H1);
            accountSecureFunItem.f4330b.setText("");
            xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.ux2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vx2.m25957i(accountSecureFunItem, view);
                }
            });
        }
        xdl0.M(accountSecureFunItem.f4331c, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m25959k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        boolean z;
        ge20 ge20VarV1 = accountSecureFunItem.getContext().V1();
        if (!m14933g(commonData) && !m14930d(commonData)) {
            z = m14934h(commonData, false);
        }
        ge20VarV1.f1(z, accountSecureFunItem.f4329a.getText().toString(), "facebook");
    }
}
