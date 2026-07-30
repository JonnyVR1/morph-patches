package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class m490 {
    /* JADX INFO: renamed from: a */
    public static void m156994a(PrivilegeDescListPrivateCustomExtraItem privilegeDescListPrivateCustomExtraItem, View view) {
        privilegeDescListPrivateCustomExtraItem.f38497d = (PrivilegeDescListPrivateCustomExtraItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListPrivateCustomExtraItem.f38498e = (TextView) viewGroup.getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.f38499f = (ImageView) viewGroup.getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.f38500g = (ConstraintLayout) viewGroup.getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.f38501h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.f38502i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.f38503j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.f38504k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.f38505l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        privilegeDescListPrivateCustomExtraItem.f38506m = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        privilegeDescListPrivateCustomExtraItem.f38507n = viewGroup.getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.f38508o = (ImageView) viewGroup.getChildAt(4);
    }
}
