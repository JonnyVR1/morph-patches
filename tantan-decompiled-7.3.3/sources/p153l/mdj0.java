package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class mdj0 {
    /* JADX INFO: renamed from: a */
    public static void m157977a(ldj0 ldj0Var, View view) {
        ldj0Var.f131636a = (VRecyclerView) view.findViewById(hdc0.f108977y);
        ViewGroup viewGroup = (ViewGroup) view;
        ldj0Var.f131637b = (LinearLayout) viewGroup.getChildAt(1);
        ldj0Var.f131638c = (LinearLayout) viewGroup.getChildAt(1);
        ldj0Var.f131639d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ldj0Var.f131640e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ldj0Var.f131641f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ldj0Var.f131642g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ldj0Var.f131643h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m157978b(ldj0 ldj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173476B5, viewGroup, false);
        m157977a(ldj0Var, viewInflate);
        return viewInflate;
    }
}
