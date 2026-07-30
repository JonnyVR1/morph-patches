package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ihe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jhe {
    /* JADX INFO: renamed from: a */
    public static void m7418a(ihe iheVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        iheVar.e = viewGroup.getChildAt(0);
        iheVar.f = viewGroup.getChildAt(1);
        iheVar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        iheVar.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        iheVar.i = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7419b(ihe iheVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5799F, viewGroup, false);
        m7418a(iheVar, viewInflate);
        return viewInflate;
    }
}
