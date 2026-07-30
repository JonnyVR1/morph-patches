package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.CityCoverMiddleCardView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q55 {
    /* JADX INFO: renamed from: a */
    public static void m175291a(p55 p55Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p55Var.f150600j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p55Var.f150601k = (CityCoverMiddleCardView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        p55Var.f150602l = (SVGAnimationView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m175292b(p55 p55Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126009q1, viewGroup, false);
        m175291a(p55Var, viewInflate);
        return viewInflate;
    }
}
