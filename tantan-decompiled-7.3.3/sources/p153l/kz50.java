package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class kz50 {
    /* JADX INFO: renamed from: a */
    public static void m152160a(jz50 jz50Var, View view) {
        jz50Var.f123227a = (VRecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m152161b(jz50 jz50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126101v8, viewGroup, false);
        m152160a(jz50Var, viewInflate);
        return viewInflate;
    }
}
