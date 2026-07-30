package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.StepProgressView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ajf0 {
    /* JADX INFO: renamed from: a */
    public static void m98379a(zif0 zif0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zif0Var.f204529c = viewGroup.getChildAt(0);
        zif0Var.f204530d = (VDraweeView) viewGroup.getChildAt(1);
        zif0Var.f204531e = (VFrame) viewGroup.getChildAt(2);
        zif0Var.f204532f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        zif0Var.f204533g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        zif0Var.f204534h = (VLinear) viewGroup.getChildAt(3);
        zif0Var.f204535i = (VRelative) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        zif0Var.f204536j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        zif0Var.f204537k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        zif0Var.f204538l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        zif0Var.f204539m = (StepProgressView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        zif0Var.f204540n = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        zif0Var.f204541o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        zif0Var.f204542p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        zif0Var.f204543q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        zif0Var.f204544r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(3);
        zif0Var.f204545s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(4);
        zif0Var.f204546t = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5);
        zif0Var.f204547u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(0);
        zif0Var.f204548v = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(1);
        zif0Var.f204549w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(2);
        zif0Var.f204550x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(3);
        zif0Var.f204551y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(6);
        zif0Var.f204552z = (VScroll) viewGroup.getChildAt(4);
        zif0Var.f204510A = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m98380b(zif0 zif0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109093U, viewGroup, false);
        m98379a(zif0Var, viewInflate);
        return viewInflate;
    }
}
