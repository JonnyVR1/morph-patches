package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.qzw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rzw {
    /* JADX INFO: renamed from: a */
    public static void m9198a(qzw qzwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qzwVar.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qzwVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        qzwVar.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        qzwVar.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        qzwVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        qzwVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        qzwVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        qzwVar.h = viewGroup.getChildAt(2);
        qzwVar.i = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m9199b(qzw qzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.N6, viewGroup, false);
        m9198a(qzwVar, viewInflate);
        return viewInflate;
    }
}
