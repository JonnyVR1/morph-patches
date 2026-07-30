package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bl2 {
    /* JADX INFO: renamed from: a */
    public static void m102507a(al2 al2Var, View view) {
        al2Var.f70373a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        al2Var.f70374b = viewGroup.getChildAt(0);
        al2Var.f70375c = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        al2Var.f70376d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m102508b(al2 al2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168260Z0, viewGroup, false);
        m102507a(al2Var, viewInflate);
        return viewInflate;
    }
}
