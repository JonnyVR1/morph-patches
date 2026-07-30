package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class je90 {
    /* JADX INFO: renamed from: a */
    public static void m141104a(ie90 ie90Var, View view) {
        ie90Var.f112733u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ie90Var.f112734v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ie90Var.f112735w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ie90Var.f112736x = (FlowView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ie90Var.f112737y = (VRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ie90Var.f112738z = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        ie90Var.f112716A = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m141105b(ie90 ie90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95533Qa, viewGroup, false);
        m141104a(ie90Var, viewInflate);
        return viewInflate;
    }
}
