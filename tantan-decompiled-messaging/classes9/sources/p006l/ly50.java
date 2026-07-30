package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ly50 {
    /* JADX INFO: renamed from: a */
    public static void m19080a(ky50 ky50Var, View view) {
        ky50Var.f16074a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ky50Var.f16075b = viewGroup.getChildAt(0);
        ky50Var.f16076c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        ky50Var.f16077d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        ky50Var.f16078e = viewGroup.getChildAt(2);
        ky50Var.f16079f = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m19081b(ky50 ky50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9400J, viewGroup, false);
        m19080a(ky50Var, viewInflate);
        return viewInflate;
    }
}
