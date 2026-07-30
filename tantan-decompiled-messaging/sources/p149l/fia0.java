package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class fia0 {
    /* JADX INFO: renamed from: a */
    public static void m121503a(eia0 eia0Var, View view) {
        eia0Var.f91574a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eia0Var.f91575b = (TextView) viewGroup.getChildAt(0);
        eia0Var.f91576c = (TextView) viewGroup.getChildAt(1);
        eia0Var.f91577d = (VFrame) viewGroup.getChildAt(2);
        eia0Var.f91578e = (VButton) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m121504b(eia0 eia0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137292D0, viewGroup, false);
        m121503a(eia0Var, viewInflate);
        return viewInflate;
    }
}
