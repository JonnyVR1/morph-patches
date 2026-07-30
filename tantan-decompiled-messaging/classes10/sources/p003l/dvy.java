package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.cvy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dvy {
    /* JADX INFO: renamed from: a */
    public static void m6212a(cvy cvyVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cvyVar.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cvyVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cvyVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cvyVar.d = (FrameLayout) viewGroup.getChildAt(1);
        cvyVar.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cvyVar.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cvyVar.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6213b(cvy cvyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6040o1, viewGroup, false);
        m6212a(cvyVar, viewInflate);
        return viewInflate;
    }
}
