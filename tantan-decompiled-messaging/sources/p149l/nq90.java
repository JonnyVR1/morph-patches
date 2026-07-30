package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class nq90 {
    /* JADX INFO: renamed from: a */
    public static void m160585a(mq90 mq90Var, View view) {
        mq90Var.f135175a = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mq90Var.f135176b = (VText) viewGroup.getChildAt(0);
        mq90Var.f135177c = (VLinear) viewGroup.getChildAt(1);
        mq90Var.f135178d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mq90Var.f135179e = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mq90Var.f135180f = (FlowView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mq90Var.f135181g = (VLinear) viewGroup.getChildAt(2);
        mq90Var.f135182h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        mq90Var.f135183i = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        mq90Var.f135184j = (FlowView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        mq90Var.f135185k = (VLinear) viewGroup.getChildAt(3);
        mq90Var.f135186l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mq90Var.f135187m = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mq90Var.f135188n = (FlowView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mq90Var.f135189o = (VLinear) viewGroup.getChildAt(4);
        mq90Var.f135190p = (ImageView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mq90Var.f135191q = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        mq90Var.f135192r = (FlowView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        mq90Var.f135193s = (VLinear) viewGroup.getChildAt(5);
        mq90Var.f135194t = (ImageView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        mq90Var.f135195u = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        mq90Var.f135196v = (FlowView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        mq90Var.f135197w = (VLinear) viewGroup.getChildAt(6);
        mq90Var.f135198x = (ImageView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        mq90Var.f135199y = (VText_Tags) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        mq90Var.f135200z = (FlowView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m160586b(mq90 mq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95277Aa, viewGroup, false);
        m160585a(mq90Var, viewInflate);
        return viewInflate;
    }
}
