package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.sdw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tdw {
    /* JADX INFO: renamed from: a */
    public static void m9568a(sdw sdwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sdwVar.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sdwVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        sdwVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        sdwVar.d = viewGroup.getChildAt(1);
        sdwVar.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9569b(sdw sdwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.E6, viewGroup, false);
        m9568a(sdwVar, viewInflate);
        return viewInflate;
    }
}
