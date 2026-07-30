package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemIceBreakStateLeft;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p6q {
    /* JADX INFO: renamed from: a */
    public static void m170920a(ItemIceBreakStateLeft itemIceBreakStateLeft, View view) {
        itemIceBreakStateLeft.f31871c = (ItemIceBreakStateLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemIceBreakStateLeft.f31872d = (VDraweeView) viewGroup.getChildAt(0);
        itemIceBreakStateLeft.f31873e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemIceBreakStateLeft.f31874f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
