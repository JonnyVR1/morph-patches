package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nm90 {
    /* JADX INFO: renamed from: a */
    public static void m163806a(mm90 mm90Var, View view) {
        mm90Var.f137539u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mm90Var.f137540v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mm90Var.f137541w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mm90Var.f137542x = (FlowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        mm90Var.f137543y = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mm90Var.f137544z = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        mm90Var.f137522A = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m163807b(mm90 mm90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125699Xa, viewGroup, false);
        m163806a(mm90Var, viewInflate);
        return viewInflate;
    }
}
