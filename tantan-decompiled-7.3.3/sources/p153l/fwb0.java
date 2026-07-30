package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class fwb0 {
    /* JADX INFO: renamed from: a */
    public static void m127756a(ewb0 ewb0Var, View view) {
        ewb0Var.f96139a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ewb0Var.f96140b = (VNavigationBar) viewGroup.getChildAt(0);
        ewb0Var.f96141c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ewb0Var.f96142d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        ewb0Var.f96143e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m127757b(ewb0 ewb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126174zd, viewGroup, false);
        m127756a(ewb0Var, viewInflate);
        return viewInflate;
    }
}
