package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeUndoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wb90 {
    /* JADX INFO: renamed from: a */
    public static void m10465a(PrivilegeUndoView privilegeUndoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUndoView.a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUndoView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUndoView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUndoView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUndoView.e = viewGroup.getChildAt(1);
    }
}
