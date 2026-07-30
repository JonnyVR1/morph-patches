package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeUndoView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class ak90 {
    /* JADX INFO: renamed from: a */
    public static void m98559a(PrivilegeUndoView privilegeUndoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUndoView.f35961a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUndoView.f35962b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUndoView.f35963c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUndoView.f35964d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUndoView.f35965e = (VImage) viewGroup.getChildAt(1);
    }
}
