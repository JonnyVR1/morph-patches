package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemChatUnlockLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c2q {
    /* JADX INFO: renamed from: a */
    public static void m5835a(ItemChatUnlockLayout itemChatUnlockLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatUnlockLayout.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemChatUnlockLayout.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemChatUnlockLayout.c = (TextView) viewGroup.getChildAt(1);
        itemChatUnlockLayout.d = viewGroup.getChildAt(2);
    }
}
