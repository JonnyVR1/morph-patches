package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class ove {
    /* JADX INFO: renamed from: a */
    public static void m166170a(nve nveVar, View view) {
        nveVar.f140708a = (VButton) ((ViewGroup) view).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m166171b(nve nveVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95832id, viewGroup, false);
        m166170a(nveVar, viewInflate);
        return viewInflate;
    }
}
