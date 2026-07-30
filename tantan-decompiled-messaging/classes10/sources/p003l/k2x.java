package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.j2x;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k2x {
    /* JADX INFO: renamed from: a */
    public static void m7490a(j2x j2xVar, View view) {
        j2xVar.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        j2xVar.g = viewGroup.getChildAt(0);
        j2xVar.h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m7491b(j2x j2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.b7, viewGroup, false);
        m7490a(j2xVar, viewInflate);
        return viewInflate;
    }
}
