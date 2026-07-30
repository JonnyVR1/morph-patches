package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zj90 {
    /* JADX INFO: renamed from: a */
    public static void m219086a(yj90 yj90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yj90Var.f198610u = (VLinear) viewGroup.getChildAt(0);
        yj90Var.f198611v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        yj90Var.f198612w = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        yj90Var.f198613x = (FlowTagsView) viewGroup.getChildAt(1);
        yj90Var.f198614y = (VLinear) viewGroup.getChildAt(2);
        yj90Var.f198615z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        yj90Var.f198601A = (VLinear) viewGroup.getChildAt(3);
        yj90Var.f198602B = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        yj90Var.f198603C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        yj90Var.f198604D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        yj90Var.f198605E = (ConstraintLayout) viewGroup.getChildAt(4);
        yj90Var.f198606F = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        yj90Var.f198607G = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        yj90Var.f198608H = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219087b(yj90 yj90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96099y9, viewGroup, false);
        m219086a(yj90Var, viewInflate);
        return viewInflate;
    }
}
