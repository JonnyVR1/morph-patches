package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class ky2 extends tz2 {
    public ky2() {
        this.f176736a = "facebook";
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m151940i(AccountSecureFunItem accountSecureFunItem, View view) {
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        newAccountSecureAct.m45377X1().m177044E0();
        i4g0.m138520r("e_intl_account_add_facebook_btn", newAccountSecureAct.pageId());
    }

    @Override // p153l.tz2
    /* JADX INFO: renamed from: a */
    public void mo114641a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m193638e(commonData)) {
            accountSecureFunItem.f29110a.setText(R$string.f28803x1);
            accountSecureFunItem.f29111b.setText(R$string.f28628T);
            bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.iy2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117493a.m151942k(accountSecureFunItem, commonData, view);
                }
            });
        } else {
            accountSecureFunItem.f29110a.setText(R$string.f28570H1);
            accountSecureFunItem.f29111b.setText("");
            bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.jy2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ky2.m151940i(accountSecureFunItem, view);
                }
            });
        }
        bnl0.m105524M(accountSecureFunItem.f29112c, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m151942k(AccountSecureFunItem accountSecureFunItem, CommonData commonData, View view) {
        boolean z;
        qm20 qm20VarM45377X1 = ((NewAccountSecureAct) accountSecureFunItem.getContext()).m45377X1();
        if (!m193640g(commonData) && !m193637d(commonData)) {
            z = m193641h(commonData, false);
        }
        qm20VarM45377X1.m177063f1(z, accountSecureFunItem.f29110a.getText().toString(), "facebook");
    }
}
