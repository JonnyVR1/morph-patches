package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemFeedback;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n3q {
    /* JADX INFO: renamed from: a */
    public static void m8305a(ItemFeedback itemFeedback, View view) {
        itemFeedback.a = (ItemFeedback) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemFeedback.b = viewGroup.getChildAt(1);
        itemFeedback.c = viewGroup.getChildAt(1);
        itemFeedback.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        itemFeedback.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
