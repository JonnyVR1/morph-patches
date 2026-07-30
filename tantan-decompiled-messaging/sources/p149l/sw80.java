package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sw80 {
    /* JADX INFO: renamed from: a */
    public static void m186128a(PrivilegeDescListSeeItem privilegeDescListSeeItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeItem.f37675a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSeeItem.f37676b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSeeItem.f37677c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSeeItem.f37678d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSeeItem.f37679e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSeeItem.f37680f = (VText) viewGroup.getChildAt(1);
        privilegeDescListSeeItem.f37681g = (FrameLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeItem.f37682h = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeItem.f37683i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
