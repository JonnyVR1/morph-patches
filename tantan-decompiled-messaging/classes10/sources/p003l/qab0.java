package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.privilege.PurchaseTrialSeePrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qab0 {
    /* JADX INFO: renamed from: a */
    public static void m8949a(PurchaseTrialSeePrivilegeView purchaseTrialSeePrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        purchaseTrialSeePrivilegeView.a = viewGroup.getChildAt(0);
        purchaseTrialSeePrivilegeView.b = viewGroup.getChildAt(1);
        purchaseTrialSeePrivilegeView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        purchaseTrialSeePrivilegeView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        purchaseTrialSeePrivilegeView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
