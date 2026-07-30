package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeODiamondService;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j690 {
    /* JADX INFO: renamed from: a */
    public static void m7373a(PrivilegeODiamondService privilegeODiamondService, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeODiamondService.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeODiamondService.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
