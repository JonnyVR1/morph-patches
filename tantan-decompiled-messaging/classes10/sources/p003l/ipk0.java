package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.f6c0;
import l.hpk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ipk0 {
    /* JADX INFO: renamed from: a */
    public static void m7283a(hpk0 hpk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hpk0Var.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        hpk0Var.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        hpk0Var.k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7284b(hpk0 hpk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Qc, viewGroup, false);
        m7283a(hpk0Var, viewInflate);
        return viewInflate;
    }
}
