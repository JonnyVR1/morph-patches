package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.av;
import l.n6c0;
import v.VRelative;

/* JADX INFO: renamed from: l.bv */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3309bv {
    /* JADX INFO: renamed from: a */
    public static void m5821a(av avVar, View view) {
        avVar.a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        avVar.b = viewGroup.getChildAt(0);
        avVar.c = viewGroup.getChildAt(1);
        avVar.d = viewGroup.getChildAt(2);
        avVar.e = viewGroup.getChildAt(3);
        avVar.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        avVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        avVar.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        avVar.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        avVar.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5822b(av avVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.k, viewGroup, false);
        m5821a(avVar, viewInflate);
        return viewInflate;
    }
}
