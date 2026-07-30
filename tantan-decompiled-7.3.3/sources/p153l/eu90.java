package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eu90 {
    /* JADX INFO: renamed from: a */
    public static void m122553a(du90 du90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        du90Var.f90778v = (VRelative) viewGroup.getChildAt(0);
        du90Var.f90779w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m122554b(du90 du90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125781ca, viewGroup, false);
        m122553a(du90Var, viewInflate);
        return viewInflate;
    }
}
