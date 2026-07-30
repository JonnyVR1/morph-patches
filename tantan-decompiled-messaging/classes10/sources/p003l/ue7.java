package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.CoreChatAiSendMomentItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ue7 {
    /* JADX INFO: renamed from: a */
    public static void m9716a(CoreChatAiSendMomentItem coreChatAiSendMomentItem, View view) {
        coreChatAiSendMomentItem.a = (CoreChatAiSendMomentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreChatAiSendMomentItem.b = viewGroup.getChildAt(0);
        coreChatAiSendMomentItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreChatAiSendMomentItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
