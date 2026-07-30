package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class e9f {
    /* JADX INFO: renamed from: a */
    public static void m115348a(d9f d9fVar, View view) {
        d9fVar.f85115u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d9fVar.f85116v = (VRecyclerView) viewGroup.getChildAt(0);
        d9fVar.f85117w = (VText_NoTopPadding) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115349b(d9f d9fVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95973r2, viewGroup, false);
        m115348a(d9fVar, viewInflate);
        return viewInflate;
    }
}
