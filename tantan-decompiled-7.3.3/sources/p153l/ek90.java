package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeVIPBadgeView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class ek90 {
    /* JADX INFO: renamed from: a */
    public static void m121034a(PrivilegeVIPBadgeView privilegeVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeVIPBadgeView.f35968a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeVIPBadgeView.f35969b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeVIPBadgeView.f35970c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeVIPBadgeView.f35971d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
