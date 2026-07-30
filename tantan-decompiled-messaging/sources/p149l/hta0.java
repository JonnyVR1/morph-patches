package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hta0 {
    /* JADX INFO: renamed from: a */
    public static void m132862a(gta0 gta0Var, View view) {
        gta0Var.f104265u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gta0Var.f104266v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gta0Var.f104267w = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m132863b(gta0 gta0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95862ka, viewGroup, false);
        m132862a(gta0Var, viewInflate);
        return viewInflate;
    }
}
