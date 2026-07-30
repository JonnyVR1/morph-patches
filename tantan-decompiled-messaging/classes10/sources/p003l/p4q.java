package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemIceBreakStateLeft;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class p4q {
    /* JADX INFO: renamed from: a */
    public static void m8702a(ItemIceBreakStateLeft itemIceBreakStateLeft, View view) {
        itemIceBreakStateLeft.c = (ItemIceBreakStateLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemIceBreakStateLeft.d = viewGroup.getChildAt(0);
        itemIceBreakStateLeft.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemIceBreakStateLeft.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
