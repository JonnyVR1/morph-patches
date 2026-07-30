package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class ehe0 {
    /* JADX INFO: renamed from: a */
    public static void m120850a(dhe0 dhe0Var, View view) {
        dhe0Var.f88485a = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m120851b(dhe0 dhe0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125387E3, viewGroup, false);
        m120850a(dhe0Var, viewInflate);
        return viewInflate;
    }
}
