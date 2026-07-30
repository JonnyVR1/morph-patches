package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeUnLimitLikeView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class vb90 {
    /* JADX INFO: renamed from: a */
    public static void m197706a(PrivilegeUnLimitLikeView privilegeUnLimitLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUnLimitLikeView.f35108a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUnLimitLikeView.f35109b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUnLimitLikeView.f35110c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUnLimitLikeView.f35111d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUnLimitLikeView.f35112e = (VImage) viewGroup.getChildAt(1);
    }
}
