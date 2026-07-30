package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupView;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z36 {
    /* JADX INFO: renamed from: a */
    public static void m217019a(ConversationAddressBookGroupView conversationAddressBookGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationAddressBookGroupView.f25307a = (VFrame) viewGroup.getChildAt(0);
        conversationAddressBookGroupView.f25308b = (MultipleChatIconView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.f25309c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.f25310d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.f25311e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.f25312f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
