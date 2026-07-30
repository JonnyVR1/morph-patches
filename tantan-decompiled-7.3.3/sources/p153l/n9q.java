package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageCallToBuy;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n9q {
    /* JADX INFO: renamed from: a */
    public static void m162002a(ItemMessageCallToBuy itemMessageCallToBuy, View view) {
        itemMessageCallToBuy.f31996a = (ItemMessageCallToBuy) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageCallToBuy.f31997b = (FrameLayout) viewGroup.getChildAt(0);
        itemMessageCallToBuy.f31998c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageCallToBuy.f31999d = (VText) viewGroup.getChildAt(1);
        itemMessageCallToBuy.f32000e = (VText) viewGroup.getChildAt(2);
    }
}
