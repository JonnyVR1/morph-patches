package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.f6c0;
import l.ffp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gfp {
    /* JADX INFO: renamed from: a */
    public static void m6629a(ffp ffpVar, View view) {
        ffpVar.g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ffpVar.h = viewGroup.getChildAt(0);
        ffpVar.i = viewGroup.getChildAt(1);
        ffpVar.j = viewGroup.getChildAt(2);
        ffpVar.k = viewGroup.getChildAt(3);
        ffpVar.l = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m6630b(ffp ffpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.W5, viewGroup, false);
        m6629a(ffpVar, viewInflate);
        return viewInflate;
    }
}
