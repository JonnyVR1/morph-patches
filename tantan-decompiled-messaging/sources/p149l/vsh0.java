package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class vsh0 {
    /* JADX INFO: renamed from: a */
    public static void m199870a(ush0 ush0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ush0Var.f177972j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ush0Var.f177973k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ush0Var.f177974l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ush0Var.f177975m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m199871b(ush0 ush0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95793g8, viewGroup, false);
        m199870a(ush0Var, viewInflate);
        return viewInflate;
    }
}
