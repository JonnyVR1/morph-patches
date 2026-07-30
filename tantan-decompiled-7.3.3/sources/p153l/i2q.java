package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemAiChatGuideMessage;

/* JADX INFO: loaded from: classes10.dex */
public class i2q {
    /* JADX INFO: renamed from: a */
    public static void m138233a(ItemAiChatGuideMessage itemAiChatGuideMessage, View view) {
        itemAiChatGuideMessage.f31601a = (ItemAiChatGuideMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiChatGuideMessage.f31602b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiChatGuideMessage.f31603c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiChatGuideMessage.f31604d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAiChatGuideMessage.f31605e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAiChatGuideMessage.f31606f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
