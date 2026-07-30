package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w490 {
    /* JADX INFO: renamed from: a */
    public static void m204825a(PrivilegeDescListSeeItem privilegeDescListSeeItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeItem.f38523a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListSeeItem.f38524b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListSeeItem.f38525c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListSeeItem.f38526d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListSeeItem.f38527e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListSeeItem.f38528f = (VText) viewGroup.getChildAt(1);
        privilegeDescListSeeItem.f38529g = (FrameLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeItem.f38530h = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeItem.f38531i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
