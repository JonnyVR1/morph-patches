package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vx80 {
    /* JADX INFO: renamed from: a */
    public static void m200511a(PrivilegeDescListVisitorItem privilegeDescListVisitorItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListVisitorItem.f37724a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListVisitorItem.f37725b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListVisitorItem.f37726c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListVisitorItem.f37727d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListVisitorItem.f37728e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListVisitorItem.f37729f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListVisitorItem.f37730g = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
