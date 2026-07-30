package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationTitleSwitcher;

/* JADX INFO: loaded from: classes10.dex */
public class nm6 {
    /* JADX INFO: renamed from: a */
    public static void m163802a(ConversationTitleSwitcher conversationTitleSwitcher, View view) {
        conversationTitleSwitcher._tabs = (TabLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m163803b(ConversationTitleSwitcher conversationTitleSwitcher, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125354C4, viewGroup, false);
        m163802a(conversationTitleSwitcher, viewInflate);
        return viewInflate;
    }
}
