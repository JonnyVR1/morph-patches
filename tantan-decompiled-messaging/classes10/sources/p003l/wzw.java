package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.vzw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wzw {
    /* JADX INFO: renamed from: a */
    public static void m10610a(vzw vzwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vzwVar.c = viewGroup.getChildAt(0);
        vzwVar.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10611b(vzw vzwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.h0, viewGroup, false);
        m10610a(vzwVar, viewInflate);
        return viewInflate;
    }
}
