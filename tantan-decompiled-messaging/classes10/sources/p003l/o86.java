package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o86 {
    /* JADX INFO: renamed from: a */
    public static void m8431a(ConversationItemGoogleAdView conversationItemGoogleAdView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGoogleAdView.a = viewGroup.getChildAt(0);
        conversationItemGoogleAdView.b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemGoogleAdView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemGoogleAdView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemGoogleAdView.e = (TextView) viewGroup.getChildAt(2);
    }
}
