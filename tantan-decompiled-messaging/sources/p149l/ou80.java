package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescChatListItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ou80 {
    /* JADX INFO: renamed from: a */
    public static void m165982a(PrivilegeDescChatListItem privilegeDescChatListItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescChatListItem.f37572a = (VDraweeView) viewGroup.getChildAt(0);
        privilegeDescChatListItem.f37573b = (VText) viewGroup.getChildAt(1);
        privilegeDescChatListItem.f37574c = (VText) viewGroup.getChildAt(2);
        privilegeDescChatListItem.f37575d = (VText) viewGroup.getChildAt(3);
    }
}
