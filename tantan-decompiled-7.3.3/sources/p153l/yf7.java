package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.CoreChatAiSendMomentItem;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yf7 {
    /* JADX INFO: renamed from: a */
    public static void m215525a(CoreChatAiSendMomentItem coreChatAiSendMomentItem, View view) {
        coreChatAiSendMomentItem.f31552a = (CoreChatAiSendMomentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreChatAiSendMomentItem.f31553b = (VLinear) viewGroup.getChildAt(0);
        coreChatAiSendMomentItem.f31554c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreChatAiSendMomentItem.f31555d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
