package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeConfirmDialog;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tt80 {
    /* JADX INFO: renamed from: a */
    public static void m9618a(PrivilegeConfirmDialog privilegeConfirmDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeConfirmDialog.a = viewGroup.getChildAt(0);
        privilegeConfirmDialog.b = viewGroup.getChildAt(1);
        privilegeConfirmDialog.c = viewGroup.getChildAt(2);
        privilegeConfirmDialog.d = viewGroup.getChildAt(3);
    }
}
