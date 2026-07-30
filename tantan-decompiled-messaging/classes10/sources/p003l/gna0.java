package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.fna0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gna0 {
    /* JADX INFO: renamed from: a */
    public static void m6774a(fna0 fna0Var, View view) {
        fna0Var.u = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6775b(fna0 fna0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ea, viewGroup, false);
        m6774a(fna0Var, viewInflate);
        return viewInflate;
    }
}
