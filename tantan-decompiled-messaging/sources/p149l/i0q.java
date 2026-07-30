package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemAiChatGuideMessage;

/* JADX INFO: loaded from: classes10.dex */
public class i0q {
    /* JADX INFO: renamed from: a */
    public static void m133902a(ItemAiChatGuideMessage itemAiChatGuideMessage, View view) {
        itemAiChatGuideMessage.f30753a = (ItemAiChatGuideMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAiChatGuideMessage.f30754b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAiChatGuideMessage.f30755c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAiChatGuideMessage.f30756d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAiChatGuideMessage.f30757e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAiChatGuideMessage.f30758f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
