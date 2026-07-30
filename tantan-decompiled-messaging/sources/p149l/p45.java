package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.CityCoverMiddleCardView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p45 {
    /* JADX INFO: renamed from: a */
    public static void m167363a(o45 o45Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o45Var.f141738j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o45Var.f141739k = (CityCoverMiddleCardView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        o45Var.f141740l = (SVGAnimationView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m167364b(o45 o45Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95955q1, viewGroup, false);
        m167363a(o45Var, viewInflate);
        return viewInflate;
    }
}
