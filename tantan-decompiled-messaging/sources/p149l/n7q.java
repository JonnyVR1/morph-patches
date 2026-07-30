package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageCallToBuy;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n7q {
    /* JADX INFO: renamed from: a */
    public static void m158154a(ItemMessageCallToBuy itemMessageCallToBuy, View view) {
        itemMessageCallToBuy.f31148a = (ItemMessageCallToBuy) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageCallToBuy.f31149b = (FrameLayout) viewGroup.getChildAt(0);
        itemMessageCallToBuy.f31150c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageCallToBuy.f31151d = (VText) viewGroup.getChildAt(1);
        itemMessageCallToBuy.f31152e = (VText) viewGroup.getChildAt(2);
    }
}
