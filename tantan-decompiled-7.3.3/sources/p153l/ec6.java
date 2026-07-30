package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemSurpriseBoxEntrance;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ec6 {
    /* JADX INFO: renamed from: a */
    public static void m120296a(ConversationItemSurpriseBoxEntrance conversationItemSurpriseBoxEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSurpriseBoxEntrance.f25628a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.f25629b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.f25630c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemSurpriseBoxEntrance.f25631d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemSurpriseBoxEntrance.f25632e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemSurpriseBoxEntrance.f25633f = (TextView) viewGroup.getChildAt(2);
    }
}
