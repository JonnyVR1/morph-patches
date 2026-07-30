package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ae2 {
    /* JADX INFO: renamed from: a */
    public static void m96017a(zd2 zd2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zd2Var.f202614l = (VText) viewGroup.getChildAt(1);
        zd2Var.f202615m = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m96018b(zd2 zd2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95586U, viewGroup, false);
        m96017a(zd2Var, viewInflate);
        return viewInflate;
    }
}
