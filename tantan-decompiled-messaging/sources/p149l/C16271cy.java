package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.account.view.AccountSecureFunItem;

/* JADX INFO: renamed from: l.cy */
/* JADX INFO: loaded from: classes10.dex */
public class C16271cy {
    /* JADX INFO: renamed from: a */
    public static void m109121a(AccountSecureFunItem accountSecureFunItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        accountSecureFunItem.f28262a = (VText_Medium) viewGroup.getChildAt(0);
        accountSecureFunItem.f28263b = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        accountSecureFunItem.f28264c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
