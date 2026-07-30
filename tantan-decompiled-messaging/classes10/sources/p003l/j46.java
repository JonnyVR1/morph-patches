package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j46 {
    /* JADX INFO: renamed from: a */
    public static void m7334a(ConversationAddressBookMatchHeadLayout conversationAddressBookMatchHeadLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationAddressBookMatchHeadLayout.a = (FrameLayout) viewGroup.getChildAt(0);
        conversationAddressBookMatchHeadLayout.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationAddressBookMatchHeadLayout.c = (LinearLayout) viewGroup.getChildAt(1);
        conversationAddressBookMatchHeadLayout.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationAddressBookMatchHeadLayout.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationAddressBookMatchHeadLayout.g = (LinearLayout) viewGroup.getChildAt(2);
        conversationAddressBookMatchHeadLayout.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        conversationAddressBookMatchHeadLayout.k = viewGroup.getChildAt(4);
    }
}
