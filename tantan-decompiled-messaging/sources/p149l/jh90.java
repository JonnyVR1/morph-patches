package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jh90 {
    /* JADX INFO: renamed from: a */
    public static void m141490a(ih90 ih90Var, View view) {
        ih90Var.f113216a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ih90Var.f113217b = (VFrame_Shadow) viewGroup.getChildAt(0);
        ih90Var.f113218c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ih90Var.f113219d = (VText) viewGroup.getChildAt(1);
        ih90Var.f113220e = (VFrame_Shadow) viewGroup.getChildAt(2);
        ih90Var.f113221f = (VFrame_FlipContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ih90Var.f113222g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ih90Var.f113223h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ih90Var.f113224i = (VFrame_Shadow) viewGroup.getChildAt(3);
        ih90Var.f113225j = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
