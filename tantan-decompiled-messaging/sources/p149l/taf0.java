package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.StepProgressView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class taf0 {
    /* JADX INFO: renamed from: a */
    public static void m187720a(saf0 saf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        saf0Var.f163372c = viewGroup.getChildAt(0);
        saf0Var.f163373d = (VDraweeView) viewGroup.getChildAt(1);
        saf0Var.f163374e = (VFrame) viewGroup.getChildAt(2);
        saf0Var.f163375f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        saf0Var.f163376g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        saf0Var.f163377h = (VLinear) viewGroup.getChildAt(3);
        saf0Var.f163378i = (VRelative) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        saf0Var.f163379j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        saf0Var.f163380k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        saf0Var.f163381l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        saf0Var.f163382m = (StepProgressView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        saf0Var.f163383n = (VLinear) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        saf0Var.f163384o = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        saf0Var.f163385p = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        saf0Var.f163386q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(2);
        saf0Var.f163387r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(3);
        saf0Var.f163388s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(4);
        saf0Var.f163389t = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5);
        saf0Var.f163390u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(0);
        saf0Var.f163391v = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(1);
        saf0Var.f163392w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(2);
        saf0Var.f163393x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(5)).getChildAt(3);
        saf0Var.f163394y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(6);
        saf0Var.f163395z = (VScroll) viewGroup.getChildAt(4);
        saf0Var.f163353A = (VLinear) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187721b(saf0 saf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79481U, viewGroup, false);
        m187720a(saf0Var, viewInflate);
        return viewInflate;
    }
}
