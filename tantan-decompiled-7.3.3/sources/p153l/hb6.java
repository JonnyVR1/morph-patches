package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemProfileLikeEntrance;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hb6 {
    /* JADX INFO: renamed from: a */
    public static void m134348a(ConversationItemProfileLikeEntrance conversationItemProfileLikeEntrance, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemProfileLikeEntrance.f25600a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.f25601b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.f25602c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.f25603d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationItemProfileLikeEntrance.f25604e = (VLinear) viewGroup.getChildAt(1);
        conversationItemProfileLikeEntrance.f25605f = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationItemProfileLikeEntrance.f25606g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationItemProfileLikeEntrance.f25607h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationItemProfileLikeEntrance.f25608i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
