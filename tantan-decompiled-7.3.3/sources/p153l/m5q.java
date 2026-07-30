package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemFeedbackReason;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemText;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class m5q {
    /* JADX INFO: renamed from: a */
    public static void m157114a(ItemFeedbackReason itemFeedbackReason, View view) {
        itemFeedbackReason.f31811a = (ItemFeedbackReason) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedbackReason.f31812b = (ItemText) viewGroup.getChildAt(1);
        itemFeedbackReason.f31813c = (ItemText) viewGroup.getChildAt(1);
        itemFeedbackReason.f31814d = (VLinear) viewGroup.getChildAt(2);
    }
}
