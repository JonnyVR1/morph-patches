package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.p002gp.GpRateGuideDialog;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t4k {
    /* JADX INFO: renamed from: a */
    public static void m9538a(GpRateGuideDialog gpRateGuideDialog, View view) {
        gpRateGuideDialog.f1683a = view.findViewById(u4c0.a5);
        gpRateGuideDialog.f1684b = view.findViewById(u4c0.ge);
        gpRateGuideDialog.f1685c = view.findViewById(u4c0.P1);
        gpRateGuideDialog.f1686d = view.findViewById(u4c0.h1);
        gpRateGuideDialog.f1687e = view.findViewById(u4c0.f1);
        gpRateGuideDialog.f1688f = view.findViewById(u4c0.i1);
        gpRateGuideDialog.f1689g = view.findViewById(u4c0.wa);
        gpRateGuideDialog.f1690h = view.findViewById(u4c0.N8);
    }

    /* JADX INFO: renamed from: b */
    public static View m9539b(GpRateGuideDialog gpRateGuideDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ed, viewGroup, false);
        m9538a(gpRateGuideDialog, viewInflate);
        return viewInflate;
    }
}
