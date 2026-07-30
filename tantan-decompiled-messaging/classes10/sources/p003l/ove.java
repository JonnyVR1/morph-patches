package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.nve;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ove {
    /* JADX INFO: renamed from: a */
    public static void m8598a(nve nveVar, View view) {
        nveVar.a = ((ViewGroup) view).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m8599b(nve nveVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.id, viewGroup, false);
        m8598a(nveVar, viewInflate);
        return viewInflate;
    }
}
