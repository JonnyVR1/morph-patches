package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PurchaseTrialSeePrivilegeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qab0 {
    /* JADX INFO: renamed from: a */
    public static void m173717a(PurchaseTrialSeePrivilegeView purchaseTrialSeePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseTrialSeePrivilegeView._promotion_title = (VText) viewGroup.getChildAt(0);
        purchaseTrialSeePrivilegeView._promotion_tip = (VText) viewGroup.getChildAt(1);
        purchaseTrialSeePrivilegeView._privilege_1 = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        purchaseTrialSeePrivilegeView._privilege_2 = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        purchaseTrialSeePrivilegeView._privilege_3 = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
