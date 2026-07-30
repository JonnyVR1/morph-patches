package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemUserStatesView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tc6 {
    /* JADX INFO: renamed from: a */
    public static void m190434a(ConversationItemUserStatesView conversationItemUserStatesView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemUserStatesView.f25649a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemUserStatesView.f25650b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemUserStatesView.f25651c = (LinearLayout) viewGroup.getChildAt(1);
        conversationItemUserStatesView.f25652d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationItemUserStatesView.f25653e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationItemUserStatesView.f25654f = (TextView) viewGroup.getChildAt(2);
    }
}
