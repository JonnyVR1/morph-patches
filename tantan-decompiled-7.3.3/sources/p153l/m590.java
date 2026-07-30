package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m590 {
    /* JADX INFO: renamed from: a */
    public static void m157096a(PrivilegeDescListTopChatItem privilegeDescListTopChatItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListTopChatItem.f38564a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegeDescListTopChatItem.f38565b = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeDescListTopChatItem.f38566c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeDescListTopChatItem.f38567d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeDescListTopChatItem.f38568e = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegeDescListTopChatItem.f38569f = (VLinear) viewGroup.getChildAt(1);
        privilegeDescListTopChatItem.f38570g = viewGroup.getChildAt(2);
    }
}
