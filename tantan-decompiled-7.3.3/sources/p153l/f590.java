package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f590 {
    /* JADX INFO: renamed from: a */
    public static void m124117a(PrivilegeDescListSvipContainerItem privilegeDescListSvipContainerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSvipContainerItem.f38548a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSvipContainerItem.f38549b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSvipContainerItem.f38550c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSvipContainerItem.f38551d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSvipContainerItem.f38552e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSvipContainerItem.f38553f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListSvipContainerItem.f38554g = viewGroup.getChildAt(2);
    }
}
