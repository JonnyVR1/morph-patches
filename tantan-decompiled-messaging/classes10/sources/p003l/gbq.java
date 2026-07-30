package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.messages.ItemPendingPayment;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gbq {
    /* JADX INFO: renamed from: a */
    public static void m6623a(ItemPendingPayment itemPendingPayment, View view) {
        itemPendingPayment.a = (ItemPendingPayment) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPendingPayment.b = (RelativeLayout) viewGroup.getChildAt(0);
        itemPendingPayment.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPendingPayment.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPendingPayment.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPendingPayment.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemPendingPayment.g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        itemPendingPayment.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        itemPendingPayment.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        itemPendingPayment.j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        itemPendingPayment.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        itemPendingPayment.l = viewGroup.getChildAt(1);
        itemPendingPayment.m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPendingPayment.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
