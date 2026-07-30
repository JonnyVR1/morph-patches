package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemSubTitleView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class za6 {
    /* JADX INFO: renamed from: a */
    public static void m217722a(ConversationItemSubTitleView conversationItemSubTitleView, View view) {
        conversationItemSubTitleView.f25846a = (ConversationItemSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSubTitleView.f25847b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSubTitleView.f25848c = (VText) viewGroup.getChildAt(1);
        conversationItemSubTitleView.f25849d = viewGroup.getChildAt(2);
        conversationItemSubTitleView.f25850e = (VText) viewGroup.getChildAt(3);
        conversationItemSubTitleView.f25851f = (FrameLayout) viewGroup.getChildAt(4);
        conversationItemSubTitleView.f25852g = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        conversationItemSubTitleView.f25853h = (VText) viewGroup.getChildAt(6);
    }
}
