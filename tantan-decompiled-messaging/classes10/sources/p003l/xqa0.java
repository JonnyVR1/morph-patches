package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.wqa0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xqa0 {
    /* JADX INFO: renamed from: a */
    public static void m10948a(wqa0 wqa0Var, View view) {
        wqa0Var.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wqa0Var.v = viewGroup.getChildAt(0);
        wqa0Var.w = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10949b(wqa0 wqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.la, viewGroup, false);
        m10948a(wqa0Var, viewInflate);
        return viewInflate;
    }
}
