package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f4n;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h4n {
    /* JADX INFO: renamed from: a */
    public static void m6913a(f4n f4nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f4nVar.c = viewGroup.getChildAt(0);
        f4nVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f4nVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        f4nVar.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        f4nVar.g = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        f4nVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        f4nVar.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        f4nVar.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        f4nVar.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6914b(f4n f4nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.s4, viewGroup, false);
        m6913a(f4nVar, viewInflate);
        return viewInflate;
    }
}
