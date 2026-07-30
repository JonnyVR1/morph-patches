package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemFeedback;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n3q {
    /* JADX INFO: renamed from: a */
    public static void m157771a(ItemFeedback itemFeedback, View view) {
        itemFeedback.f30953a = (ItemFeedback) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedback.f30954b = (ItemText) viewGroup.getChildAt(1);
        itemFeedback.f30955c = (ItemText) viewGroup.getChildAt(1);
        itemFeedback.f30956d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemFeedback.f30957e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
