package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemSubTitleView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cc6 {
    /* JADX INFO: renamed from: a */
    public static void m108702a(ConversationItemSubTitleView conversationItemSubTitleView, View view) {
        conversationItemSubTitleView.f26588a = (ConversationItemSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemSubTitleView.f26589b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemSubTitleView.f26590c = (VText) viewGroup.getChildAt(1);
        conversationItemSubTitleView.f26591d = viewGroup.getChildAt(2);
        conversationItemSubTitleView.f26592e = (VText) viewGroup.getChildAt(3);
        conversationItemSubTitleView.f26593f = (FrameLayout) viewGroup.getChildAt(4);
        conversationItemSubTitleView.f26594g = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        conversationItemSubTitleView.f26595h = (VText) viewGroup.getChildAt(6);
    }
}
