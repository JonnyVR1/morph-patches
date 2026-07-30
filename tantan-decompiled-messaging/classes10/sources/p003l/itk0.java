package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.htk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class itk0 {
    /* JADX INFO: renamed from: a */
    public static void m7295a(htk0 htk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        htk0Var.a = viewGroup.getChildAt(0);
        htk0Var.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7296b(htk0 htk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Gc, viewGroup, false);
        m7295a(htk0Var, viewInflate);
        return viewInflate;
    }
}
