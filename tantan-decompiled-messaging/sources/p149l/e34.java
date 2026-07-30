package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VFrame;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes4.dex */
public class e34 {
    /* JADX INFO: renamed from: a */
    public static void m114581a(d34 d34Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d34Var.f83452a = viewGroup.getChildAt(0);
        d34Var.f83453b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        d34Var.f83454c = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        d34Var.f83455d = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        d34Var.f83456e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        d34Var.f83457f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114582b(d34 d34Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168067J, viewGroup, false);
        m114581a(d34Var, viewInflate);
        return viewInflate;
    }
}
