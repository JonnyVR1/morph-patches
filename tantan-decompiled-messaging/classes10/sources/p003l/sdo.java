package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.rdo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sdo {
    /* JADX INFO: renamed from: a */
    public static void m9335a(rdo rdoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rdoVar.b = viewGroup.getChildAt(0);
        rdoVar.c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9336b(rdo rdoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5601v, viewGroup, false);
        m9335a(rdoVar, viewInflate);
        return viewInflate;
    }
}
