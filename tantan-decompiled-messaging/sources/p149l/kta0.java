package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kta0 {
    /* JADX INFO: renamed from: a */
    public static void m147206a(jta0 jta0Var, View view) {
        jta0Var.f119581u = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jta0Var.f119582v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jta0Var.f119583w = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jta0Var.f119584x = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m147207b(jta0 jta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95896ma, viewGroup, false);
        m147206a(jta0Var, viewInflate);
        return viewInflate;
    }
}
