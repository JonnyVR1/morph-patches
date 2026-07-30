package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dq50 {
    /* JADX INFO: renamed from: a */
    public static void m112994a(cq50 cq50Var, View view) {
        cq50Var.f82030a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cq50Var.f82031b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cq50Var.f82032c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cq50Var.f82033d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cq50Var.f82034e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        cq50Var.f82035f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        cq50Var.f82036g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        cq50Var.f82037h = (VText) viewGroup.getChildAt(1);
        cq50Var.f82038i = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m112995b(cq50 cq50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95917ne, viewGroup, false);
        m112994a(cq50Var, viewInflate);
        return viewInflate;
    }
}
