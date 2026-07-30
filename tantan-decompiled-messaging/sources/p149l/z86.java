package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemGroupSubTitleView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z86 {
    /* JADX INFO: renamed from: a */
    public static void m217579a(ConversationItemGroupSubTitleView conversationItemGroupSubTitleView, View view) {
        conversationItemGroupSubTitleView.f25815a = (ConversationItemGroupSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGroupSubTitleView.f25816b = (VText) viewGroup.getChildAt(0);
        conversationItemGroupSubTitleView.f25817c = (VImage) viewGroup.getChildAt(1);
        conversationItemGroupSubTitleView.f25818d = viewGroup.getChildAt(2);
        conversationItemGroupSubTitleView.f25819e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
