package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.gta0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hta0 {
    /* JADX INFO: renamed from: a */
    public static void m7073a(gta0 gta0Var, View view) {
        gta0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gta0Var.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gta0Var.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7074b(gta0 gta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ka, viewGroup, false);
        m7073a(gta0Var, viewInflate);
        return viewInflate;
    }
}
