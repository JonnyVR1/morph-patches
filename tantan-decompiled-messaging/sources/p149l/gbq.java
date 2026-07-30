package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPendingPayment;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gbq {
    /* JADX INFO: renamed from: a */
    public static void m125327a(ItemPendingPayment itemPendingPayment, View view) {
        itemPendingPayment.f31336a = (ItemPendingPayment) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPendingPayment.f31337b = (RelativeLayout) viewGroup.getChildAt(0);
        itemPendingPayment.f31338c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPendingPayment.f31339d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPendingPayment.f31340e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPendingPayment.f31341f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemPendingPayment.f31342g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        itemPendingPayment.f31343h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        itemPendingPayment.f31344i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        itemPendingPayment.f31345j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        itemPendingPayment.f31346k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        itemPendingPayment.f31347l = (VLinear) viewGroup.getChildAt(1);
        itemPendingPayment.f31348m = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPendingPayment.f31349n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
