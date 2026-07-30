package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemTitleView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lb6 {
    /* JADX INFO: renamed from: a */
    public static void m149213a(ConversationItemTitleView conversationItemTitleView, View view) {
        conversationItemTitleView.f25855a = (ConversationItemTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemTitleView.f25856b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationItemTitleView.f25857c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        conversationItemTitleView.f25858d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemTitleView.f25859e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemTitleView.f25860f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemTitleView.f25861g = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        conversationItemTitleView.f25862h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        conversationItemTitleView.f25863i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        conversationItemTitleView.f25864j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(5);
        conversationItemTitleView.f25865k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6);
        conversationItemTitleView.f25866l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(7);
        conversationItemTitleView.f25867m = (VText) viewGroup.getChildAt(1);
    }
}
