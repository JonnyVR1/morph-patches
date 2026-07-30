package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class oyk0 {
    /* JADX INFO: renamed from: a */
    public static void m169875a(nyk0 nyk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nyk0Var.f144325i = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nyk0Var.f144326j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nyk0Var.f144327k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m169876b(nyk0 nyk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125701Xc, viewGroup, false);
        m169875a(nyk0Var, viewInflate);
        return viewInflate;
    }
}
