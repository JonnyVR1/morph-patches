package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wtw {
    /* JADX INFO: renamed from: a */
    public static void m205581a(ttw ttwVar, View view) {
        ttwVar.f172070b = (VText) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m205582b(ttw ttwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95456Ld, viewGroup, false);
        m205581a(ttwVar, viewInflate);
        return viewInflate;
    }
}
