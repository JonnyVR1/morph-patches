package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeUndoView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class wb90 {
    /* JADX INFO: renamed from: a */
    public static void m202533a(PrivilegeUndoView privilegeUndoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUndoView.f35113a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUndoView.f35114b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUndoView.f35115c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUndoView.f35116d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUndoView.f35117e = (VImage) viewGroup.getChildAt(1);
    }
}
