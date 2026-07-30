package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tye0 {
    /* JADX INFO: renamed from: a */
    public static void m24843a(sye0 sye0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sye0Var.f21751c = viewGroup.getChildAt(0);
        sye0Var.f21752d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sye0Var.f21753e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sye0Var.f21754f = (LinearLayout) viewGroup.getChildAt(2);
        sye0Var.f21755g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sye0Var.f21756h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m24844b(sye0 sye0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9440l0, viewGroup, false);
        m24843a(sye0Var, viewInflate);
        return viewInflate;
    }
}
