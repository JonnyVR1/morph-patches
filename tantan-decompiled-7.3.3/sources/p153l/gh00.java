package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VList;

/* JADX INFO: loaded from: classes13.dex */
public class gh00 {
    /* JADX INFO: renamed from: a */
    public static void m130240a(fh00 fh00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fh00Var.f98994c = (VList) viewGroup.getChildAt(0);
        fh00Var.f98995d = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m130241b(fh00 fh00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173668g4, viewGroup, false);
        m130240a(fh00Var, viewInflate);
        return viewInflate;
    }
}
