package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ChatTipsItem;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemText;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class h35 {
    /* JADX INFO: renamed from: a */
    public static void m133410a(ChatTipsItem chatTipsItem, View view) {
        chatTipsItem.f31547a = (ChatTipsItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        chatTipsItem.f31548b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        chatTipsItem.f31549c = (ItemText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        chatTipsItem.f31550d = (ItemText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
