package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.l0g;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s0g {
    /* JADX INFO: renamed from: a */
    public static void m9200a(l0g l0gVar, View view) {
        l0gVar.a = (VFrame) view;
        l0gVar.b = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9201b(l0g l0gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5509W0, viewGroup, false);
        m9200a(l0gVar, viewInflate);
        return viewInflate;
    }
}
