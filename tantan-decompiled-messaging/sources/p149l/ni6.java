package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;
import com.p046p1.mobile.putong.core.newui.messages.RoundedCornerView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ni6 {
    /* JADX INFO: renamed from: a */
    public static void m159494a(ConversationNewMatchItem conversationNewMatchItem, View view) {
        conversationNewMatchItem.f25010a = (ConversationNewMatchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationNewMatchItem.f25011b = (VDraweeView) viewGroup.getChildAt(0);
        conversationNewMatchItem.f25012c = (CommonLabelView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationNewMatchItem.f25013d = (CommonLabelView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationNewMatchItem.f25014e = (FrameLayout) viewGroup.getChildAt(2);
        conversationNewMatchItem.f25015f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationNewMatchItem.f25016g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.f25017h = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        conversationNewMatchItem.f25018i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        conversationNewMatchItem.f25019j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        conversationNewMatchItem.f25020k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.f25021l = (RoundedCornerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        conversationNewMatchItem.f25022m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        conversationNewMatchItem.f25023n = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }
}
