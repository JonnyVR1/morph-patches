package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iw80 {
    /* JADX INFO: renamed from: a */
    public static void m7302a(PrivilegeDescListPrivateCustomExtraItem privilegeDescListPrivateCustomExtraItem, View view) {
        privilegeDescListPrivateCustomExtraItem.d = (PrivilegeDescListPrivateCustomExtraItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListPrivateCustomExtraItem.e = (TextView) viewGroup.getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.f = (ImageView) viewGroup.getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.g = viewGroup.getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListPrivateCustomExtraItem.i = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListPrivateCustomExtraItem.j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        privilegeDescListPrivateCustomExtraItem.k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        privilegeDescListPrivateCustomExtraItem.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        privilegeDescListPrivateCustomExtraItem.n = viewGroup.getChildAt(3);
        privilegeDescListPrivateCustomExtraItem.o = (ImageView) viewGroup.getChildAt(4);
    }
}
