package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeConfirmDialog;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tt80 {
    /* JADX INFO: renamed from: a */
    public static void m190599a(PrivilegeConfirmDialog privilegeConfirmDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeConfirmDialog._title = (VText) viewGroup.getChildAt(0);
        privilegeConfirmDialog._subtitle = (VText) viewGroup.getChildAt(1);
        privilegeConfirmDialog._get = (VText) viewGroup.getChildAt(2);
        privilegeConfirmDialog._dismiss = (VText) viewGroup.getChildAt(3);
    }
}
