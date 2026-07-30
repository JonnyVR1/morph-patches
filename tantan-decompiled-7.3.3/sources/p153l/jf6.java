package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationLeftToolBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jf6 {
    /* JADX INFO: renamed from: a */
    public static void m144665a(ConversationLeftToolBar conversationLeftToolBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationLeftToolBar.f25697a = (FrameLayout) viewGroup.getChildAt(0);
        conversationLeftToolBar.f25698b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationLeftToolBar.f25699c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationLeftToolBar.f25700d = (LinearLayout) viewGroup.getChildAt(1);
        conversationLeftToolBar.f25701e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationLeftToolBar.f25702f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationLeftToolBar.f25703g = (FrameLayout) viewGroup.getChildAt(2);
        conversationLeftToolBar.f25704h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationLeftToolBar.f25705i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
