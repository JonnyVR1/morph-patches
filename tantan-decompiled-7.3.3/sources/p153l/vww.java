package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vww {
    /* JADX INFO: renamed from: a */
    public static void m203819a(sww swwVar, View view) {
        swwVar.f171022b = (VText) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m203820b(sww swwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125622Sd, viewGroup, false);
        m203819a(swwVar, viewInflate);
        return viewInflate;
    }
}
