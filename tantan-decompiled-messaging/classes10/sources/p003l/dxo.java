package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.IntlPrivilegeCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dxo {
    /* JADX INFO: renamed from: a */
    public static void m6219a(IntlPrivilegeCard intlPrivilegeCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeCard.a = (LinearLayout) viewGroup.getChildAt(0);
        intlPrivilegeCard.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeCard.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlPrivilegeCard.d = viewGroup.getChildAt(1);
        intlPrivilegeCard.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlPrivilegeCard.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
