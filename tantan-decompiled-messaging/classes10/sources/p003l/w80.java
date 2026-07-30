package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.v80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w80 {
    /* JADX INFO: renamed from: a */
    public static void m10453a(v80 v80Var, View view) {
        v80Var.a = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10454b(v80 v80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.xd, viewGroup, false);
        m10453a(v80Var, viewInflate);
        return viewInflate;
    }
}
