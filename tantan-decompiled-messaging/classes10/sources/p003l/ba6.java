package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemPlatinumPinLike;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ba6 {
    /* JADX INFO: renamed from: a */
    public static void m5703a(ConversationItemPlatinumPinLike conversationItemPlatinumPinLike, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemPlatinumPinLike.a = viewGroup.getChildAt(0);
        conversationItemPlatinumPinLike.b = viewGroup.getChildAt(1);
        conversationItemPlatinumPinLike.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemPlatinumPinLike.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemPlatinumPinLike.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationItemPlatinumPinLike.f = (TextView) viewGroup.getChildAt(2);
    }
}
