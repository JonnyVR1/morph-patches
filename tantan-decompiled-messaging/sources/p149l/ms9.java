package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ms9 {
    /* JADX INFO: renamed from: a */
    public static void m156119a(ls9 ls9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ls9Var.f129815a = (VDraweeView) viewGroup.getChildAt(1);
        ls9Var.f129816b = viewGroup.getChildAt(2);
        ls9Var.f129817c = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m156120b(ls9 ls9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126440b1, viewGroup, false);
        m156119a(ls9Var, viewInflate);
        return viewInflate;
    }
}
