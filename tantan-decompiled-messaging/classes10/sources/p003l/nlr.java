package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.mlr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nlr {
    /* JADX INFO: renamed from: a */
    public static void m8343a(mlr mlrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.a = viewGroup.getChildAt(0);
        mlrVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mlrVar.c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8344b(mlr mlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5512X0, viewGroup, false);
        m8343a(mlrVar, viewInflate);
        return viewInflate;
    }
}
