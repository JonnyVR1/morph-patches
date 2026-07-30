package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.ConversationTitleSwitcher;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kl6 {
    /* JADX INFO: renamed from: a */
    public static void m7607a(ConversationTitleSwitcher conversationTitleSwitcher, View view) {
        conversationTitleSwitcher.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7608b(ConversationTitleSwitcher conversationTitleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.C4, viewGroup, false);
        m7607a(conversationTitleSwitcher, viewInflate);
        return viewInflate;
    }
}
