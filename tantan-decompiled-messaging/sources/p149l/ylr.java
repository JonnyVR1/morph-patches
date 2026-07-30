package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VList;

/* JADX INFO: loaded from: classes12.dex */
public class ylr {
    /* JADX INFO: renamed from: a */
    public static void m215307a(xlr xlrVar, View view) {
        xlrVar.f193488c = (VList) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m215308b(xlr xlrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142019D4, viewGroup, false);
        m215307a(xlrVar, viewInflate);
        return viewInflate;
    }
}
