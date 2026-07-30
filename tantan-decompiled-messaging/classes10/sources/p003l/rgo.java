package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.pgo;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rgo {
    /* JADX INFO: renamed from: a */
    public static void m9138a(pgo pgoVar, View view) {
        pgoVar.a = (VFrame) view;
        pgoVar.b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9139b(pgo pgoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5487P, viewGroup, false);
        m9138a(pgoVar, viewInflate);
        return viewInflate;
    }
}
