package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemAiChatGuideMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i0q {
    /* JADX INFO: renamed from: a */
    public static void m7122a(ItemAiChatGuideMessage itemAiChatGuideMessage, View view) {
        itemAiChatGuideMessage.a = (ItemAiChatGuideMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiChatGuideMessage.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiChatGuideMessage.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiChatGuideMessage.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAiChatGuideMessage.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAiChatGuideMessage.f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
