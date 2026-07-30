package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.i6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pd2 {
    /* JADX INFO: renamed from: a */
    public static void m8732a(od2 od2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        od2Var.f6645a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        od2Var.f6646b = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8733b(od2 od2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(i6c0.d, viewGroup, false);
        m8732a(od2Var, viewInflate);
        return viewInflate;
    }
}
