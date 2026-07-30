package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.f6c0;
import l.wvi0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xvi0 {
    /* JADX INFO: renamed from: a */
    public static void m10961a(wvi0 wvi0Var, View view) {
        wvi0Var.a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wvi0Var.b = (RelativeLayout) viewGroup.getChildAt(0);
        wvi0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        wvi0Var.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10962b(wvi0 wvi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Fc, viewGroup, false);
        m10961a(wvi0Var, viewInflate);
        return viewInflate;
    }
}
