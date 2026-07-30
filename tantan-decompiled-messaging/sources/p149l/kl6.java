package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationTitleSwitcher;

/* JADX INFO: loaded from: classes10.dex */
public class kl6 {
    /* JADX INFO: renamed from: a */
    public static void m146382a(ConversationTitleSwitcher conversationTitleSwitcher, View view) {
        conversationTitleSwitcher._tabs = (TabLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m146383b(ConversationTitleSwitcher conversationTitleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95303C4, viewGroup, false);
        m146382a(conversationTitleSwitcher, viewInflate);
        return viewInflate;
    }
}
