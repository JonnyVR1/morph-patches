package p006l;

import android.content.Intent;
import android.view.View;
import com.p000p1.mobile.putong.core.p004ui.account.view.AccountSecureFunItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.account.PasswordChangeAct;
import com.p1.mobile.putong.data.CommonData;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dsj0 extends ez2 {
    public dsj0() {
        this.f11524a = "update password";
    }

    @Override // p006l.ez2
    /* JADX INFO: renamed from: a */
    public void mo12347a(final AccountSecureFunItem accountSecureFunItem, CommonData commonData) {
        accountSecureFunItem.f4329a.setText(R.string.q3);
        accountSecureFunItem.f4330b.setText("");
        xdl0.E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.csj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountSecureFunItem accountSecureFunItem2 = accountSecureFunItem;
                accountSecureFunItem2.getContext().startActivity(new Intent(accountSecureFunItem2.getContext(), (Class<?>) PasswordChangeAct.class));
            }
        });
    }
}
