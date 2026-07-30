package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cy4 {
    /* JADX INFO: renamed from: a */
    public static void m11406a(by4 by4Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        by4Var.f8406a = viewGroup.getChildAt(0);
        by4Var.f8407b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        by4Var.f8408c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        by4Var.f8409d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        by4Var.f8410e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        by4Var.f8411f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(0);
        by4Var.f8412g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6)).getChildAt(1);
        by4Var.f8413h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m11407b(by4 by4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19768a0, viewGroup, false);
        m11406a(by4Var, viewInflate);
        return viewInflate;
    }
}
