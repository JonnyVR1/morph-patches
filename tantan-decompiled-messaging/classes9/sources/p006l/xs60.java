package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xs60 {
    /* JADX INFO: renamed from: a */
    public static void m27602a(ws60 ws60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ws60Var.f25352c = viewGroup.getChildAt(0);
        ws60Var.f25353d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ws60Var.f25354e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ws60Var.f25355f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ws60Var.f25356g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        ws60Var.f25357h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        ws60Var.f25358i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
        ws60Var.f25359j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ws60Var.f25360k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ws60Var.f25361l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        ws60Var.f25362m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        ws60Var.f25363n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        ws60Var.f25364o = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        ws60Var.f25365p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        ws60Var.f25366q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        ws60Var.f25367r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6);
        ws60Var.f25368s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        ws60Var.f25369t = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(0);
        ws60Var.f25370u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(7)).getChildAt(1);
        ws60Var.f25371v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(8);
        ws60Var.f25372w = viewGroup.getChildAt(1);
        ws60Var.f25373x = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ws60Var.f25374y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ws60Var.f25375z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ws60Var.f25342A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m27603b(ws60 ws60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9404N, viewGroup, false);
        m27602a(ws60Var, viewInflate);
        return viewInflate;
    }
}
