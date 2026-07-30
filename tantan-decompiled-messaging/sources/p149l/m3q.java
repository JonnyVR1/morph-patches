package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemFeedbackReason;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemText;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class m3q {
    /* JADX INFO: renamed from: a */
    public static void m152950a(ItemFeedbackReason itemFeedbackReason, View view) {
        itemFeedbackReason.f30963a = (ItemFeedbackReason) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedbackReason.f30964b = (ItemText) viewGroup.getChildAt(1);
        itemFeedbackReason.f30965c = (ItemText) viewGroup.getChildAt(1);
        itemFeedbackReason.f30966d = (VLinear) viewGroup.getChildAt(2);
    }
}
