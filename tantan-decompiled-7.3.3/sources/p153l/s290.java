package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescChatListItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s290 {
    /* JADX INFO: renamed from: a */
    public static void m184115a(PrivilegeDescChatListItem privilegeDescChatListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescChatListItem.f38420a = (VDraweeView) viewGroup.getChildAt(0);
        privilegeDescChatListItem.f38421b = (VText) viewGroup.getChildAt(1);
        privilegeDescChatListItem.f38422c = (VText) viewGroup.getChildAt(2);
        privilegeDescChatListItem.f38423d = (VText) viewGroup.getChildAt(3);
    }
}
