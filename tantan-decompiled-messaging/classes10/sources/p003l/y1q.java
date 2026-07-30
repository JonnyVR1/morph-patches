package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.ItemChatInterceptRight;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y1q {
    /* JADX INFO: renamed from: a */
    public static void m11128a(ItemChatInterceptRight itemChatInterceptRight, View view) {
        itemChatInterceptRight.a = (ItemChatInterceptRight) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemChatInterceptRight.b = (LinearLayout) viewGroup.getChildAt(0);
        itemChatInterceptRight.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
