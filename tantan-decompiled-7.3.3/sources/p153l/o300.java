package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VCheckBox;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class o300 {
    /* JADX INFO: renamed from: a */
    public static void m165834a(n300 n300Var, View view) {
        n300Var.f139927a = (VRelative) view;
        n300Var.f139928b = (VCheckBox) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m165835b(n300 n300Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157123t2, viewGroup, false);
        m165834a(n300Var, viewInflate);
        return viewInflate;
    }
}
