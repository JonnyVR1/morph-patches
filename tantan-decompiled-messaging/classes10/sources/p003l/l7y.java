package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.k7y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l7y {
    /* JADX INFO: renamed from: a */
    public static void m7702a(k7y k7yVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k7yVar.b = viewGroup.getChildAt(0);
        k7yVar.c = viewGroup.getChildAt(1);
        k7yVar.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7703b(k7y k7yVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5545g0, viewGroup, false);
        m7702a(k7yVar, viewInflate);
        return viewInflate;
    }
}
