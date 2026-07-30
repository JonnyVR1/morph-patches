package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.epi;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fpi {
    /* JADX INFO: renamed from: a */
    public static void m6490a(epi epiVar, View view) {
        epiVar.d = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        epiVar.e = viewGroup.getChildAt(0);
        epiVar.f = viewGroup.getChildAt(1);
        epiVar.g = viewGroup.getChildAt(2);
        epiVar.h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m6491b(epi epiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.F4, viewGroup, false);
        m6490a(epiVar, viewInflate);
        return viewInflate;
    }
}
