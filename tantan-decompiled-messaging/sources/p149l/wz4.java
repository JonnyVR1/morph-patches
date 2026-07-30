package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wz4 {
    /* JADX INFO: renamed from: a */
    public static void m206243a(uz4 uz4Var, View view) {
        uz4Var.f178938f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uz4Var.f178939g = (VImage) viewGroup.getChildAt(0);
        uz4Var.f178940h = (VDraweeView) viewGroup.getChildAt(1);
        uz4Var.f178941i = (VText_Bold) viewGroup.getChildAt(2);
        uz4Var.f178942j = (VText) viewGroup.getChildAt(3);
        uz4Var.f178943k = (VLinear) viewGroup.getChildAt(4);
        uz4Var.f178944l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        uz4Var.f178945m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        uz4Var.f178946n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        uz4Var.f178947o = (VText_Bold) viewGroup.getChildAt(5);
        uz4Var.f178948p = (VRecyclerView) viewGroup.getChildAt(6);
        uz4Var.f178949q = viewGroup.getChildAt(7);
        uz4Var.f178950r = (VText_Bold) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m206244b(uz4 uz4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95786g1, viewGroup, false);
        m206243a(uz4Var, viewInflate);
        return viewInflate;
    }
}
