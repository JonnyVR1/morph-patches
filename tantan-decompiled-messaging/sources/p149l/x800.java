package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VList;

/* JADX INFO: loaded from: classes12.dex */
public class x800 {
    /* JADX INFO: renamed from: a */
    public static void m207358a(w800 w800Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w800Var.f185126c = (VList) viewGroup.getChildAt(0);
        w800Var.f185127d = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m207359b(w800 w800Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142199g4, viewGroup, false);
        m207358a(w800Var, viewInflate);
        return viewInflate;
    }
}
