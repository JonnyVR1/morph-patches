package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class uoc0 {
    /* JADX INFO: renamed from: a */
    public static void m194548a(toc0 toc0Var, View view) {
        toc0Var.f171339f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        toc0Var.f171340g = (LinearLayout) viewGroup.getChildAt(0);
        toc0Var.f171341h = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        toc0Var.f171342i = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        toc0Var.f171343j = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        toc0Var.f171344k = (LinearLayout) viewGroup.getChildAt(1);
        toc0Var.f171345l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        toc0Var.f171346m = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
