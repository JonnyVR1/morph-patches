package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.vmm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wmm0 {
    /* JADX INFO: renamed from: a */
    public static void m24692a(vmm0 vmm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vmm0Var.a = (RelativeLayout) viewGroup.getChildAt(0);
        vmm0Var.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vmm0Var.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vmm0Var.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vmm0Var.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        vmm0Var.f = (LinearLayout) viewGroup.getChildAt(1);
        vmm0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vmm0Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vmm0Var.i = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m24693b(vmm0 vmm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19679S7, viewGroup, false);
        m24692a(vmm0Var, viewInflate);
        return viewInflate;
    }
}
