package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ov80 {
    /* JADX INFO: renamed from: a */
    public static void m8597a(PrivilegeDescListNoSVipItem privilegeDescListNoSVipItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListNoSVipItem.a = viewGroup.getChildAt(0);
        privilegeDescListNoSVipItem.b = (FrameLayout) viewGroup.getChildAt(1);
        privilegeDescListNoSVipItem.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListNoSVipItem.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeDescListNoSVipItem.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
    }
}
