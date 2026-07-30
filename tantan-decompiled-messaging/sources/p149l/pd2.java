package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pd2 {
    /* JADX INFO: renamed from: a */
    public static void m168378a(od2 od2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        od2Var.f143160a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        od2Var.f143161b = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m168379b(od2 od2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.f111709d, viewGroup, false);
        m168378a(od2Var, viewInflate);
        return viewInflate;
    }
}
