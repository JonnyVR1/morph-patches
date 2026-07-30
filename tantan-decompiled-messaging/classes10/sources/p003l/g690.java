package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeODiamondCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g690 {
    /* JADX INFO: renamed from: a */
    public static void m6604a(PrivilegeODiamondCard privilegeODiamondCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeODiamondCard.d = viewGroup.getChildAt(0);
        privilegeODiamondCard.e = viewGroup.getChildAt(1);
        privilegeODiamondCard.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeODiamondCard.g = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeODiamondCard.h = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
