package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemInviteMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e5q {
    /* JADX INFO: renamed from: a */
    public static void m6242a(ItemInviteMessage itemInviteMessage, View view) {
        itemInviteMessage.a = (ItemInviteMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteMessage.b = viewGroup.getChildAt(0);
        itemInviteMessage.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemInviteMessage.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
