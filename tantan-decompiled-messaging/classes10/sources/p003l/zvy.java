package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.MessageChatPrologueLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zvy {
    /* JADX INFO: renamed from: a */
    public static void m11458a(MessageChatPrologueLayout messageChatPrologueLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageChatPrologueLayout.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageChatPrologueLayout.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageChatPrologueLayout.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageChatPrologueLayout.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageChatPrologueLayout.g = viewGroup.getChildAt(2);
    }
}
