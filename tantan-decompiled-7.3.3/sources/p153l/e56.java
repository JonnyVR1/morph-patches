package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupView;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e56 {
    /* JADX INFO: renamed from: a */
    public static void m119506a(ConversationAddressBookGroupView conversationAddressBookGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationAddressBookGroupView.f26049a = (VFrame) viewGroup.getChildAt(0);
        conversationAddressBookGroupView.f26050b = (MultipleChatIconView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.f26051c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.f26052d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.f26053e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.f26054f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
