package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gna0 {
    /* JADX INFO: renamed from: a */
    public static void m127119a(fna0 fna0Var, View view) {
        fna0Var.f98411u = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m127120b(fna0 fna0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95761ea, viewGroup, false);
        m127119a(fna0Var, viewInflate);
        return viewInflate;
    }
}
