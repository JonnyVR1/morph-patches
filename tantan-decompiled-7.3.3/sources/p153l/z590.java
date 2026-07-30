package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z590 {
    /* JADX INFO: renamed from: a */
    public static void m218632a(PrivilegeDescListVisitorItem privilegeDescListVisitorItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListVisitorItem.f38572a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListVisitorItem.f38573b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListVisitorItem.f38574c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListVisitorItem.f38575d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListVisitorItem.f38576e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListVisitorItem.f38577f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListVisitorItem.f38578g = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
