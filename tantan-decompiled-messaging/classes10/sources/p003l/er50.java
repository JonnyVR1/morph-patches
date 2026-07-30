package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.dr50;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class er50 {
    /* JADX INFO: renamed from: a */
    public static void m6314a(dr50 dr50Var, View view) {
        dr50Var.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6315b(dr50 dr50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.o8, viewGroup, false);
        m6314a(dr50Var, viewInflate);
        return viewInflate;
    }
}
