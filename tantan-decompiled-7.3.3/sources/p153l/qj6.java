package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationNewMatchItem;
import com.p051p1.mobile.putong.core.newui.messages.RoundedCornerView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qj6 {
    /* JADX INFO: renamed from: a */
    public static void m176827a(ConversationNewMatchItem conversationNewMatchItem, View view) {
        conversationNewMatchItem.f25752a = (ConversationNewMatchItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationNewMatchItem.f25753b = (VDraweeView) viewGroup.getChildAt(0);
        conversationNewMatchItem.f25754c = (CommonLabelView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationNewMatchItem.f25755d = (CommonLabelView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationNewMatchItem.f25756e = (FrameLayout) viewGroup.getChildAt(2);
        conversationNewMatchItem.f25757f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        conversationNewMatchItem.f25758g = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.f25759h = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        conversationNewMatchItem.f25760i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        conversationNewMatchItem.f25761j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        conversationNewMatchItem.f25762k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        conversationNewMatchItem.f25763l = (RoundedCornerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        conversationNewMatchItem.f25764m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        conversationNewMatchItem.f25765n = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
    }
}
