package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class ipk0 {
    /* JADX INFO: renamed from: a */
    public static void m137559a(hpk0 hpk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hpk0Var.f108938i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hpk0Var.f108939j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hpk0Var.f108940k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m137560b(hpk0 hpk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95535Qc, viewGroup, false);
        m137559a(hpk0Var, viewInflate);
        return viewInflate;
    }
}
