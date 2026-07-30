package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xvi0 {
    /* JADX INFO: renamed from: a */
    public static void m211293a(wvi0 wvi0Var, View view) {
        wvi0Var.f188254a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wvi0Var.f188255b = (RelativeLayout) viewGroup.getChildAt(0);
        wvi0Var.f188256c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wvi0Var.f188257d = (MKWebView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m211294b(wvi0 wvi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95359Fc, viewGroup, false);
        m211293a(wvi0Var, viewInflate);
        return viewInflate;
    }
}
