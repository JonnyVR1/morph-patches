package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.boost.view.OverlapCircleView;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xm3 {
    /* JADX INFO: renamed from: a */
    public static void m211714a(wm3 wm3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wm3Var.f189767e = (BounceButton) viewGroup.getChildAt(0);
        wm3Var.f189768f = (FrameLayout) viewGroup.getChildAt(1);
        wm3Var.f189769g = (OverlapCircleView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wm3Var.f189770h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m211715b(wm3 wm3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151965a, viewGroup, true);
        m211714a(wm3Var, viewInflate);
        return viewInflate;
    }
}
