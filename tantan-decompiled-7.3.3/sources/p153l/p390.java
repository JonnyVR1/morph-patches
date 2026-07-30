package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p390 {
    /* JADX INFO: renamed from: a */
    public static void m170485a(PrivilegeDescListNearbyItem privilegeDescListNearbyItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNearbyItem.f38456a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListNearbyItem.f38457b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListNearbyItem.f38458c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListNearbyItem.f38459d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListNearbyItem.f38460e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListNearbyItem.f38461f = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNearbyItem.f38462g = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListNearbyItem.f38463h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
