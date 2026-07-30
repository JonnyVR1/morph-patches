package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o86 {
    /* JADX INFO: renamed from: a */
    public static void m163109a(ConversationItemGoogleAdView conversationItemGoogleAdView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGoogleAdView.f24816a = (VImage) viewGroup.getChildAt(0);
        conversationItemGoogleAdView.f24817b = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemGoogleAdView.f24818c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemGoogleAdView.f24819d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemGoogleAdView.f24820e = (TextView) viewGroup.getChildAt(2);
    }
}
