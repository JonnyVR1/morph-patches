package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.messages.ItemMessageCallToBuy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n7q {
    /* JADX INFO: renamed from: a */
    public static void m8320a(ItemMessageCallToBuy itemMessageCallToBuy, View view) {
        itemMessageCallToBuy.a = (ItemMessageCallToBuy) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageCallToBuy.b = (FrameLayout) viewGroup.getChildAt(0);
        itemMessageCallToBuy.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageCallToBuy.d = viewGroup.getChildAt(1);
        itemMessageCallToBuy.e = viewGroup.getChildAt(2);
    }
}
