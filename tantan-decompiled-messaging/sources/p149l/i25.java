package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ChatTipsItem;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemText;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class i25 {
    /* JADX INFO: renamed from: a */
    public static void m134046a(ChatTipsItem chatTipsItem, View view) {
        chatTipsItem.f30699a = (ChatTipsItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        chatTipsItem.f30700b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatTipsItem.f30701c = (ItemText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatTipsItem.f30702d = (ItemText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
