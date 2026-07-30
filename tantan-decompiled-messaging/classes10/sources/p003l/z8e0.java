package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.y8e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z8e0 {
    /* JADX INFO: renamed from: a */
    public static void m11359a(y8e0 y8e0Var, View view) {
        y8e0Var.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11360b(y8e0 y8e0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.E3, viewGroup, false);
        m11359a(y8e0Var, viewInflate);
        return viewInflate;
    }
}
