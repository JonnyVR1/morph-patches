package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bob0 {
    /* JADX INFO: renamed from: a */
    public static void m5767a(aob0 aob0Var, View view) {
        aob0Var.f2825a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aob0Var.f2826b = viewGroup.getChildAt(0);
        aob0Var.f2827c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aob0Var.f2828d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        aob0Var.f2829e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5768b(aob0 aob0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.sd, viewGroup, false);
        m5767a(aob0Var, viewInflate);
        return viewInflate;
    }
}
