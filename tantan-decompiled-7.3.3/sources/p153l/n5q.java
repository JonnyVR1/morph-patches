package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemFeedback;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n5q {
    /* JADX INFO: renamed from: a */
    public static void m161731a(ItemFeedback itemFeedback, View view) {
        itemFeedback.f31801a = (ItemFeedback) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedback.f31802b = (ItemText) viewGroup.getChildAt(1);
        itemFeedback.f31803c = (ItemText) viewGroup.getChildAt(1);
        itemFeedback.f31804d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemFeedback.f31805e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
