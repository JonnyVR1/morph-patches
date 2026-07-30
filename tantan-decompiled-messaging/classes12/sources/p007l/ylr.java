package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ylr {
    /* JADX INFO: renamed from: a */
    public static void m17169a(xlr xlrVar, View view) {
        xlrVar.f15038c = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m17170b(xlr xlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11038D4, viewGroup, false);
        m17169a(xlrVar, viewInflate);
        return viewInflate;
    }
}
