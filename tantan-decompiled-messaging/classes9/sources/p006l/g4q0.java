package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g4q0 {
    /* JADX INFO: renamed from: a */
    public static void m15577a(f4q0 f4q0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f4q0Var.f11638a = viewGroup.getChildAt(0);
        f4q0Var.f11639b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        f4q0Var.f11640c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        f4q0Var.f11641d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        f4q0Var.f11642e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        f4q0Var.f11643f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        f4q0Var.f11644g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        f4q0Var.f11645h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        f4q0Var.f11646i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        f4q0Var.f11647j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        f4q0Var.f11648k = (LinearLayout) viewGroup.getChildAt(1);
        f4q0Var.f11649l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f4q0Var.f11650m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        f4q0Var.f11651n = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        f4q0Var.f11652o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        f4q0Var.f11653p = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        f4q0Var.f11654q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        f4q0Var.f11655r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        f4q0Var.f11656s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        f4q0Var.f11657t = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        f4q0Var.f11658u = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        f4q0Var.f11659v = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        f4q0Var.f11660w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        f4q0Var.f11661x = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        f4q0Var.f11662y = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3);
        f4q0Var.f11663z = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        f4q0Var.f11613A = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        f4q0Var.f11614B = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(0)).getChildAt(1);
        f4q0Var.f11615C = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        f4q0Var.f11616D = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        f4q0Var.f11617E = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        f4q0Var.f11618F = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        f4q0Var.f11619G = viewGroup.getChildAt(2);
        f4q0Var.f11620H = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        f4q0Var.f11621I = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15578b(f4q0 f4q0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9448p0, viewGroup, false);
        m15577a(f4q0Var, viewInflate);
        return viewInflate;
    }
}
