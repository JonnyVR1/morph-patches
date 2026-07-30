package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeConfirmDialog;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x190 {
    /* JADX INFO: renamed from: a */
    public static void m209014a(PrivilegeConfirmDialog privilegeConfirmDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeConfirmDialog._title = (VText) viewGroup.getChildAt(0);
        privilegeConfirmDialog._subtitle = (VText) viewGroup.getChildAt(1);
        privilegeConfirmDialog._get = (VText) viewGroup.getChildAt(2);
        privilegeConfirmDialog._dismiss = (VText) viewGroup.getChildAt(3);
    }
}
