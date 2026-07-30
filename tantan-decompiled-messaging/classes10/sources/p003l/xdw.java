package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.wdw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xdw {
    /* JADX INFO: renamed from: a */
    public static void m10788a(wdw wdwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wdwVar.a = viewGroup.getChildAt(0);
        wdwVar.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wdwVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        wdwVar.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10789b(wdw wdwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.F6, viewGroup, false);
        m10788a(wdwVar, viewInflate);
        return viewInflate;
    }
}
