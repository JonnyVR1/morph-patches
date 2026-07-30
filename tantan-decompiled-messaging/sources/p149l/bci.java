package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.match.view.FemaleMatchSuccessLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bci {
    /* JADX INFO: renamed from: a */
    public static void m101063a(aci aciVar, View view) {
        aciVar.f68822a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aciVar.f68823b = (FemaleMatchSuccessLayout) viewGroup.getChildAt(0);
        aciVar.f68824c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aciVar.f68825d = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aciVar.f68826e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        aciVar.f68827f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        aciVar.f68828g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        aciVar.f68829h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        aciVar.f68830i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aciVar.f68831j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aciVar.f68832k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        aciVar.f68833l = (SVGAnimationView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m101064b(aci aciVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95872l3, viewGroup, false);
        m101063a(aciVar, viewInflate);
        return viewInflate;
    }
}
