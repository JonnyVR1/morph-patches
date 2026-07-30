package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t96 {
    /* JADX INFO: renamed from: a */
    public static void m189736a(ConversationItemGoogleAdView conversationItemGoogleAdView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGoogleAdView.f25558a = (VImage) viewGroup.getChildAt(0);
        conversationItemGoogleAdView.f25559b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemGoogleAdView.f25560c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemGoogleAdView.f25561d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemGoogleAdView.f25562e = (TextView) viewGroup.getChildAt(2);
    }
}
