package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeUnLimitLikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vb90 {
    /* JADX INFO: renamed from: a */
    public static void m10208a(PrivilegeUnLimitLikeView privilegeUnLimitLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUnLimitLikeView.a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUnLimitLikeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUnLimitLikeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUnLimitLikeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUnLimitLikeView.e = viewGroup.getChildAt(1);
    }
}
