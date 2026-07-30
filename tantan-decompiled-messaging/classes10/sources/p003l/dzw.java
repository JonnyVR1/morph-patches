package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.czw;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dzw {
    /* JADX INFO: renamed from: a */
    public static void m6224a(czw czwVar, View view) {
        czwVar.a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        czwVar.b = (FrameLayout) viewGroup.getChildAt(0);
        czwVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        czwVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        czwVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        czwVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        czwVar.g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        czwVar.h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        czwVar.i = viewGroup.getChildAt(1);
        czwVar.j = viewGroup.getChildAt(2);
        czwVar.k = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6225b(czw czwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.d0, viewGroup, false);
        m6224a(czwVar, viewInflate);
        return viewInflate;
    }
}
