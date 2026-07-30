package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uto0 {
    /* JADX INFO: renamed from: a */
    public static void m195307a(tto0 tto0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        tto0Var.f172039k = viewGroup.getChildAt(0);
        tto0Var.f172040l = (VImage) viewGroup.getChildAt(2);
        tto0Var.f172041m = (VLinear) viewGroup.getChildAt(3);
        tto0Var.f172042n = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        tto0Var.f172043o = (VText) viewGroup.getChildAt(4);
        tto0Var.f172044p = (VRecyclerView) viewGroup.getChildAt(5);
        tto0Var.f172045q = (VText) viewGroup.getChildAt(6);
    }
}
