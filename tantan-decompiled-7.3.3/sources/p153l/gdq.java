package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPendingPayment;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gdq {
    /* JADX INFO: renamed from: a */
    public static void m129937a(ItemPendingPayment itemPendingPayment, View view) {
        itemPendingPayment.f32184a = (ItemPendingPayment) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPendingPayment.f32185b = (RelativeLayout) viewGroup.getChildAt(0);
        itemPendingPayment.f32186c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPendingPayment.f32187d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPendingPayment.f32188e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPendingPayment.f32189f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemPendingPayment.f32190g = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        itemPendingPayment.f32191h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        itemPendingPayment.f32192i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        itemPendingPayment.f32193j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
        itemPendingPayment.f32194k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        itemPendingPayment.f32195l = (VLinear) viewGroup.getChildAt(1);
        itemPendingPayment.f32196m = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemPendingPayment.f32197n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
