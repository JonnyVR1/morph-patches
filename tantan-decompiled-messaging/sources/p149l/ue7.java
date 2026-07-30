package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.CoreChatAiSendMomentItem;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ue7 {
    /* JADX INFO: renamed from: a */
    public static void m193221a(CoreChatAiSendMomentItem coreChatAiSendMomentItem, View view) {
        coreChatAiSendMomentItem.f30704a = (CoreChatAiSendMomentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreChatAiSendMomentItem.f30705b = (VLinear) viewGroup.getChildAt(0);
        coreChatAiSendMomentItem.f30706c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreChatAiSendMomentItem.f30707d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
