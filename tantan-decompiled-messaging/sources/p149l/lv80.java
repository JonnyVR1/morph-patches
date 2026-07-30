package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lv80 {
    /* JADX INFO: renamed from: a */
    public static void m151839a(PrivilegeDescListNearbyItem privilegeDescListNearbyItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNearbyItem.f37608a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListNearbyItem.f37609b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListNearbyItem.f37610c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListNearbyItem.f37611d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListNearbyItem.f37612e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListNearbyItem.f37613f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNearbyItem.f37614g = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListNearbyItem.f37615h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
