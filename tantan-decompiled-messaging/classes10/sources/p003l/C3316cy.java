package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.account.view.AccountSecureFunItem;

/* JADX INFO: renamed from: l.cy */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3316cy {
    /* JADX INFO: renamed from: a */
    public static void m6019a(AccountSecureFunItem accountSecureFunItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountSecureFunItem.a = viewGroup.getChildAt(0);
        accountSecureFunItem.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountSecureFunItem.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
