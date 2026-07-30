package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wzw {
    /* JADX INFO: renamed from: a */
    public static void m206315a(vzw vzwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vzwVar.f183678c = (VText) viewGroup.getChildAt(0);
        vzwVar.f183679d = (VList) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m206316b(vzw vzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137355h0, viewGroup, false);
        m206315a(vzwVar, viewInflate);
        return viewInflate;
    }
}
