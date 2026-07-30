package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class rqi0 {
    /* JADX INFO: renamed from: a */
    public static void m182638a(qqi0 qqi0Var, View view) {
        qqi0Var.f159011a = (FrameLayout) view;
        qqi0Var.f159012b = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m182639b(qqi0 qqi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(oec0.f146980a, viewGroup, false);
        m182638a(qqi0Var, viewInflate);
        return viewInflate;
    }
}
