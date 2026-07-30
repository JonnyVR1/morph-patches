package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatConversationsEntryView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lzb0 {
    /* JADX INFO: renamed from: a */
    public static void m7930a(QuickchatConversationsEntryView quickchatConversationsEntryView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickchatConversationsEntryView.a = viewGroup.getChildAt(0);
        quickchatConversationsEntryView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickchatConversationsEntryView.g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickchatConversationsEntryView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        quickchatConversationsEntryView.i = (FrameLayout) viewGroup.getChildAt(1);
        quickchatConversationsEntryView.j = (RelativeLayout) viewGroup.getChildAt(2);
        quickchatConversationsEntryView.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.l = (RelativeLayout) viewGroup.getChildAt(3);
        quickchatConversationsEntryView.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        quickchatConversationsEntryView.n = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickchatConversationsEntryView.o = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        quickchatConversationsEntryView.p = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        quickchatConversationsEntryView.q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }
}
