package p149l;

import android.content.Intent;
import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordChangeAct;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;

/* JADX INFO: loaded from: classes9.dex */
public class dsj0 extends ez2 {
    public dsj0() {
        this.f93839a = "update password";
    }

    @Override // p149l.ez2
    /* JADX INFO: renamed from: a */
    public void mo99615a(final AccountSecureFunItem accountSecureFunItem, CommonData commonData) {
        accountSecureFunItem.f28262a.setText(R$string.f27915q3);
        accountSecureFunItem.f28263b.setText("");
        xdl0.m208329E0(accountSecureFunItem, new View.OnClickListener() { // from class: l.csj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountSecureFunItem accountSecureFunItem2 = accountSecureFunItem;
                accountSecureFunItem2.getContext().startActivity(new Intent(accountSecureFunItem2.getContext(), (Class<?>) PasswordChangeAct.class));
            }
        });
    }
}
