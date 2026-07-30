package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class yq90 {
    /* JADX INFO: renamed from: a */
    public static void m217074a(xq90 xq90Var, View view) {
        xq90Var.f195790f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xq90Var.f195791g = (VText_Medium) viewGroup.getChildAt(0);
        xq90Var.f195792h = (LinearLayout) viewGroup.getChildAt(1);
        xq90Var.f195793i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        xq90Var.f195794j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
