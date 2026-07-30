package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class hp4 {
    /* JADX INFO: renamed from: a */
    public static void m136467a(gp4 gp4Var, View view) {
        gp4Var.f105409g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gp4Var.f105410h = (VText_NoTopPadding) viewGroup.getChildAt(0);
        gp4Var.f105411i = (VText_NoTopPadding) viewGroup.getChildAt(1);
        gp4Var.f105412j = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        gp4Var.f105413k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        gp4Var.f105414l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        gp4Var.f105415m = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(3);
        gp4Var.f105416n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        gp4Var.f105417o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        gp4Var.f105418p = (VText_NoTopPadding) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(2);
        gp4Var.f105419q = (VText_NoTopPadding) viewGroup.getChildAt(3);
        gp4Var.f105420r = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m136468b(gp4 gp4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167546X0, viewGroup, false);
        m136467a(gp4Var, viewInflate);
        return viewInflate;
    }
}
