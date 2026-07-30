package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemIceBreakStateLeft;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p4q {
    /* JADX INFO: renamed from: a */
    public static void m167401a(ItemIceBreakStateLeft itemIceBreakStateLeft, View view) {
        itemIceBreakStateLeft.f31023c = (ItemIceBreakStateLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemIceBreakStateLeft.f31024d = (VDraweeView) viewGroup.getChildAt(0);
        itemIceBreakStateLeft.f31025e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemIceBreakStateLeft.f31026f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
