package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.match.view.FemaleMatchSuccessLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qdi {
    /* JADX INFO: renamed from: a */
    public static void m176166a(pdi pdiVar, View view) {
        pdiVar.f151764a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pdiVar.f151765b = (FemaleMatchSuccessLayout) viewGroup.getChildAt(0);
        pdiVar.f151766c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pdiVar.f151767d = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pdiVar.f151768e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        pdiVar.f151769f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        pdiVar.f151770g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        pdiVar.f151771h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        pdiVar.f151772i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        pdiVar.f151773j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pdiVar.f151774k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        pdiVar.f151775l = (SVGAnimationView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m176167b(pdi pdiVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125926l3, viewGroup, false);
        m176166a(pdiVar, viewInflate);
        return viewInflate;
    }
}
