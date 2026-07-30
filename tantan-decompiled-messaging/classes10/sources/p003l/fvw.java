package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cvw;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fvw {
    /* JADX INFO: renamed from: a */
    public static void m6520a(cvw cvwVar, View view) {
        cvwVar.a = ((ViewGroup) view).getChildAt(0);
        cvwVar.b = view.findViewById(u4c0.b7);
        ViewGroup viewGroup = (ViewGroup) view;
        cvwVar.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cvwVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        cvwVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6521b(cvw cvwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.L6, viewGroup, false);
        m6520a(cvwVar, viewInflate);
        return viewInflate;
    }
}
