package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cdo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ddo {
    /* JADX INFO: renamed from: a */
    public static void m6108a(cdo cdoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cdoVar.b = viewGroup.getChildAt(0);
        cdoVar.c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6109b(cdo cdoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5604w, viewGroup, false);
        m6108a(cdoVar, viewInflate);
        return viewInflate;
    }
}
