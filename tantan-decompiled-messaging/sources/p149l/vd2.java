package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vd2 {
    /* JADX INFO: renamed from: a */
    public static void m197916a(ud2 ud2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ud2Var.f175884l = (VDraweeView) viewGroup.getChildAt(0);
        ud2Var.f175885m = (VText) viewGroup.getChildAt(1);
        ud2Var.f175886n = (VText) viewGroup.getChildAt(2);
        ud2Var.f175887o = (VText) viewGroup.getChildAt(3);
        ud2Var.f175888p = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m197917b(ud2 ud2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95570T, viewGroup, false);
        m197916a(ud2Var, viewInflate);
        return viewInflate;
    }
}
