package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VLinear;

/* JADX INFO: renamed from: l.xk */
/* JADX INFO: loaded from: classes10.dex */
public class C21163xk {
    /* JADX INFO: renamed from: a */
    public static void m209762a(C20883wk c20883wk, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c20883wk.f186694a = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c20883wk.f186695b = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m209763b(C20883wk c20883wk, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137314O0, viewGroup, false);
        m209762a(c20883wk, viewInflate);
        return viewInflate;
    }
}
