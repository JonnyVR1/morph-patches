package p153l;

import android.content.Intent;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordChangeAct;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountSecureFunItem;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class h1k0 extends tz2 {
    public h1k0() {
        this.f176736a = "update password";
    }

    @Override // p153l.tz2
    /* JADX INFO: renamed from: a */
    public void mo114641a(final AccountSecureFunItem accountSecureFunItem, CommonData commonData) {
        accountSecureFunItem.f29110a.setText(R$string.f28763q3);
        accountSecureFunItem.f29111b.setText("");
        bnl0.m105509E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.g1k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountSecureFunItem accountSecureFunItem2 = accountSecureFunItem;
                accountSecureFunItem2.getContext().startActivity(new Intent(accountSecureFunItem2.getContext(), (Class<?>) PasswordChangeAct.class));
            }
        });
    }
}
