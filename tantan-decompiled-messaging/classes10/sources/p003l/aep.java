package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.zdp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aep {
    /* JADX INFO: renamed from: a */
    public static void m5373a(zdp zdpVar, View view) {
        zdpVar.g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zdpVar.h = viewGroup.getChildAt(0);
        zdpVar.i = viewGroup.getChildAt(1);
        zdpVar.j = viewGroup.getChildAt(2);
        zdpVar.k = viewGroup.getChildAt(3);
        zdpVar.l = viewGroup.getChildAt(4);
        zdpVar.m = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m5374b(zdp zdpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5493R, viewGroup, false);
        m5373a(zdpVar, viewInflate);
        return viewInflate;
    }
}
