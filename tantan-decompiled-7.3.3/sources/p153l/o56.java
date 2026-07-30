package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o56 {
    /* JADX INFO: renamed from: a */
    public static void m166091a(ConversationAddressBookMatchHeadLayout conversationAddressBookMatchHeadLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationAddressBookMatchHeadLayout.f26060a = (FrameLayout) viewGroup.getChildAt(0);
        conversationAddressBookMatchHeadLayout.f26061b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationAddressBookMatchHeadLayout.f26062c = (LinearLayout) viewGroup.getChildAt(1);
        conversationAddressBookMatchHeadLayout.f26063d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.f26064e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationAddressBookMatchHeadLayout.f26065f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        conversationAddressBookMatchHeadLayout.f26066g = (LinearLayout) viewGroup.getChildAt(2);
        conversationAddressBookMatchHeadLayout.f26067h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.f26068i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        conversationAddressBookMatchHeadLayout.f26069j = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        conversationAddressBookMatchHeadLayout.f26070k = (VText) viewGroup.getChildAt(4);
    }
}
