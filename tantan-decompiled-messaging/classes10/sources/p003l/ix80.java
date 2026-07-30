package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ix80 {
    /* JADX INFO: renamed from: a */
    public static void m7304a(PrivilegeDescListTopChatItem privilegeDescListTopChatItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListTopChatItem.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListTopChatItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListTopChatItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListTopChatItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListTopChatItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListTopChatItem.f = viewGroup.getChildAt(1);
        privilegeDescListTopChatItem.g = viewGroup.getChildAt(2);
    }
}
