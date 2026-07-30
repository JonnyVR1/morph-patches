package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ui90 {
    /* JADX INFO: renamed from: a */
    public static void m193867a(ti90 ti90Var, View view) {
        ti90Var.f170540f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ti90Var.f170541g = (VText_Medium) viewGroup.getChildAt(0);
        ti90Var.f170542h = (LinearLayout) viewGroup.getChildAt(1);
        ti90Var.f170543i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ti90Var.f170544j = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
