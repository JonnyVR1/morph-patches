package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.tq */
/* JADX INFO: loaded from: classes10.dex */
public class C20241tq {
    /* JADX INFO: renamed from: a */
    public static void m190066a(C20009sq c20009sq, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c20009sq.f165895a = (VNavigationBar) viewGroup.getChildAt(0);
        c20009sq.f165896b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c20009sq.f165897c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c20009sq.f165898d = (VText) viewGroup.getChildAt(2);
        c20009sq.f165899e = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m190067b(C20009sq c20009sq, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137350f, viewGroup, false);
        m190066a(c20009sq, viewInflate);
        return viewInflate;
    }
}
