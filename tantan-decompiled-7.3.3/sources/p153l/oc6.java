package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemTitleView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oc6 {
    /* JADX INFO: renamed from: a */
    public static void m167140a(ConversationItemTitleView conversationItemTitleView, View view) {
        conversationItemTitleView.f26597a = (ConversationItemTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemTitleView.f26598b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationItemTitleView.f26599c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        conversationItemTitleView.f26600d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemTitleView.f26601e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemTitleView.f26602f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemTitleView.f26603g = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        conversationItemTitleView.f26604h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        conversationItemTitleView.f26605i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        conversationItemTitleView.f26606j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(5);
        conversationItemTitleView.f26607k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6);
        conversationItemTitleView.f26608l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(7);
        conversationItemTitleView.f26609m = (VText) viewGroup.getChildAt(1);
    }
}
