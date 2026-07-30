package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemCountdownLikeSuccess;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q2q {
    /* JADX INFO: renamed from: a */
    public static void m8853a(ItemCountdownLikeSuccess itemCountdownLikeSuccess, View view) {
        itemCountdownLikeSuccess.a = (ItemCountdownLikeSuccess) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCountdownLikeSuccess.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        itemCountdownLikeSuccess.f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemCountdownLikeSuccess.g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
