package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xqa0 {
    /* JADX INFO: renamed from: a */
    public static void m210562a(wqa0 wqa0Var, View view) {
        wqa0Var.f187673u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wqa0Var.f187674v = (VText) viewGroup.getChildAt(0);
        wqa0Var.f187675w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m210563b(wqa0 wqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95879la, viewGroup, false);
        m210562a(wqa0Var, viewInflate);
        return viewInflate;
    }
}
