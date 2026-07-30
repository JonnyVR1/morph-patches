package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemFeedbackReason;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m3q {
    /* JADX INFO: renamed from: a */
    public static void m7952a(ItemFeedbackReason itemFeedbackReason, View view) {
        itemFeedbackReason.a = (ItemFeedbackReason) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedbackReason.b = viewGroup.getChildAt(1);
        itemFeedbackReason.c = viewGroup.getChildAt(1);
        itemFeedbackReason.d = viewGroup.getChildAt(2);
    }
}
