package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class hy2 extends tz2 {
    public hy2() {
        this.f176736a = "email";
    }

    @Override // p153l.tz2
    /* JADX INFO: renamed from: a */
    public void mo114641a(final AccountSecureFunItem accountSecureFunItem, final CommonData commonData) {
        if (m193637d(commonData)) {
            CoreModule.m30929H().mo29170ql("");
            accountSecureFunItem.f29110a.setText(R$string.f28797w1);
            accountSecureFunItem.f29111b.setText(commonData.email);
            bnl0.m105524M(accountSecureFunItem.f29112c, false);
        } else {
            accountSecureFunItem.f29110a.setText(R$string.f28565G1);
            accountSecureFunItem.f29111b.setText("");
            bnl0.m105524M(accountSecureFunItem.f29112c, !TextUtils.isEmpty(CoreModule.m30929H().mo29152G6()));
        }
        bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.gy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107025a.m137705j(commonData, accountSecureFunItem, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m137705j(CommonData commonData, AccountSecureFunItem accountSecureFunItem, View view) {
        boolean zM193640g = m193640g(commonData);
        boolean zM193637d = m193637d(commonData);
        NewAccountSecureAct newAccountSecureAct = (NewAccountSecureAct) accountSecureFunItem.getContext();
        if (zM193640g && zM193637d) {
            newAccountSecureAct.m45377X1().m177063f1(true, accountSecureFunItem.f29110a.getText().toString(), "email");
            return;
        }
        CoreModule.m30929H().mo29166ji((Act) accountSecureFunItem.getContext(), false, "bind_or_change_email", commonData.email);
        if (zM193637d) {
            return;
        }
        i4g0.m138520r("e_intl_account_add_email_btn", newAccountSecureAct.pageId());
    }
}
