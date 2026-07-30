package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z36 {
    /* JADX INFO: renamed from: a */
    public static void m11328a(ConversationAddressBookGroupView conversationAddressBookGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationAddressBookGroupView.a = viewGroup.getChildAt(0);
        conversationAddressBookGroupView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationAddressBookGroupView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationAddressBookGroupView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
