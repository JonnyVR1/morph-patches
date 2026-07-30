package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlPrivilegeCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cxo {
    /* JADX INFO: renamed from: a */
    public static void m6018a(IntlPrivilegeCard intlPrivilegeCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeCard.a = viewGroup.getChildAt(0);
        intlPrivilegeCard.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
