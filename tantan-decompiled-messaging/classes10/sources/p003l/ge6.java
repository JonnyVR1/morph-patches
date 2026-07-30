package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.messages.ConversationLeftToolBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ge6 {
    /* JADX INFO: renamed from: a */
    public static void m6627a(ConversationLeftToolBar conversationLeftToolBar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationLeftToolBar.a = (FrameLayout) viewGroup.getChildAt(0);
        conversationLeftToolBar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationLeftToolBar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationLeftToolBar.d = (LinearLayout) viewGroup.getChildAt(1);
        conversationLeftToolBar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationLeftToolBar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationLeftToolBar.g = (FrameLayout) viewGroup.getChildAt(2);
        conversationLeftToolBar.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationLeftToolBar.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
