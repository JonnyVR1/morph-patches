package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kva0 {
    /* JADX INFO: renamed from: a */
    public static void m151660a(jva0 jva0Var, View view) {
        jva0Var.f122779u = (VText) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m151661b(jva0 jva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125933la, viewGroup, false);
        m151660a(jva0Var, viewInflate);
        return viewInflate;
    }
}
