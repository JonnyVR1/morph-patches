package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class amd0 {
    /* JADX INFO: renamed from: a */
    public static void m97533a(zld0 zld0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zld0Var.f203619a = (VImage) viewGroup.getChildAt(0);
        zld0Var.f203620b = (VText) viewGroup.getChildAt(1);
        zld0Var.f203621c = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        zld0Var.f203622d = (TextView) viewGroup.getChildAt(4);
        zld0Var.f203623e = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m97534b(zld0 zld0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121308J1, viewGroup, false);
        m97533a(zld0Var, viewInflate);
        return viewInflate;
    }
}
