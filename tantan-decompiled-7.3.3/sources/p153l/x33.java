package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class x33 {
    /* JADX INFO: renamed from: a */
    public static void m209188a(w33 w33Var, View view) {
        w33Var.f187053a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w33Var.f187054b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        w33Var.f187055c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        w33Var.f187056d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        w33Var.f187057e = (RoundedRectangleProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        w33Var.f187058f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        w33Var.f187059g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        w33Var.f187060h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        w33Var.f187061i = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        w33Var.f187062j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        w33Var.f187063k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        w33Var.f187064l = (Space) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        w33Var.f187065m = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        w33Var.f187066n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        w33Var.f187067o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        w33Var.f187068p = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0)).getChildAt(2);
        w33Var.f187069q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        w33Var.f187070r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m209189b(w33 w33Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125762b8, viewGroup, false);
        m209188a(w33Var, viewInflate);
        return viewInflate;
    }
}
