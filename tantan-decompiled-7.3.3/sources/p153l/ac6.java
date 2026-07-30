package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ac6 {
    /* JADX INFO: renamed from: a */
    public static void m96804a(ConversationItemRightBtnView conversationItemRightBtnView, View view) {
        conversationItemRightBtnView.f26582a = (ConversationItemRightBtnView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemRightBtnView.f26583b = (VText) viewGroup.getChildAt(0);
        conversationItemRightBtnView.f26584c = (VText) viewGroup.getChildAt(1);
        conversationItemRightBtnView.f26585d = (VImage) viewGroup.getChildAt(2);
    }
}
