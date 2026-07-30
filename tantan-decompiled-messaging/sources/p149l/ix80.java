package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ix80 {
    /* JADX INFO: renamed from: a */
    public static void m138793a(PrivilegeDescListTopChatItem privilegeDescListTopChatItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListTopChatItem.f37716a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListTopChatItem.f37717b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListTopChatItem.f37718c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListTopChatItem.f37719d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListTopChatItem.f37720e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListTopChatItem.f37721f = (VLinear) viewGroup.getChildAt(1);
        privilegeDescListTopChatItem.f37722g = viewGroup.getChildAt(2);
    }
}
