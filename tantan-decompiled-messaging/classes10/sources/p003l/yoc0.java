package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.xoc0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yoc0 {
    /* JADX INFO: renamed from: a */
    public static void m11271a(xoc0 xoc0Var, View view) {
        xoc0Var.a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xoc0Var.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xoc0Var.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        xoc0Var.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11272b(xoc0 xoc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Fd, viewGroup, false);
        m11271a(xoc0Var, viewInflate);
        return viewInflate;
    }
}
