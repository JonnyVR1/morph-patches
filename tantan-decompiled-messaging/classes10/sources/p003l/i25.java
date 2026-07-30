package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ChatTipsItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i25 {
    /* JADX INFO: renamed from: a */
    public static void m7123a(ChatTipsItem chatTipsItem, View view) {
        chatTipsItem.a = (ChatTipsItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        chatTipsItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatTipsItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatTipsItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
