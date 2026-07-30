package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class iw80 {
    /* JADX INFO: renamed from: a */
    public static void m138719a(PrivilegeDescListPrivateCustomExtraItem privilegeDescListPrivateCustomExtraItem, View view) {
        privilegeDescListPrivateCustomExtraItem.f37649d = (PrivilegeDescListPrivateCustomExtraItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListPrivateCustomExtraItem.f37650e = (TextView) viewGroup.getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.f37651f = (ImageView) viewGroup.getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.f37652g = (ConstraintLayout) viewGroup.getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.f37653h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.f37654i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.f37655j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.f37656k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.f37657l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        privilegeDescListPrivateCustomExtraItem.f37658m = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        privilegeDescListPrivateCustomExtraItem.f37659n = viewGroup.getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.f37660o = (ImageView) viewGroup.getChildAt(4);
    }
}
