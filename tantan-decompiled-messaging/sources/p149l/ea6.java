package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ea6 {
    /* JADX INFO: renamed from: a */
    public static void m115414a(ConversationItemProfileLikeEntrance conversationItemProfileLikeEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemProfileLikeEntrance.f24858a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.f24859b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.f24860c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.f24861d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemProfileLikeEntrance.f24862e = (VLinear) viewGroup.getChildAt(1);
        conversationItemProfileLikeEntrance.f24863f = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.f24864g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.f24865h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.f24866i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
