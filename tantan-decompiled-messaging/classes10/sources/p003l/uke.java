package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.tke;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uke {
    /* JADX INFO: renamed from: a */
    public static void m9743a(tke tkeVar, View view) {
        tkeVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tkeVar.v = viewGroup.getChildAt(0);
        tkeVar.w = (LinearLayout) viewGroup.getChildAt(1);
        tkeVar.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        tkeVar.y = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9744b(tke tkeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.x9, viewGroup, false);
        m9743a(tkeVar, viewInflate);
        return viewInflate;
    }
}
