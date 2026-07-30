package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.boost.view.OverlapCircleView;
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xl3 {
    /* JADX INFO: renamed from: a */
    public static void m209840a(wl3 wl3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wl3Var.f186866e = (BounceButton) viewGroup.getChildAt(0);
        wl3Var.f186867f = (FrameLayout) viewGroup.getChildAt(1);
        wl3Var.f186868g = (OverlapCircleView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wl3Var.f186869h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m209841b(wl3 wl3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121357a, viewGroup, true);
        m209840a(wl3Var, viewInflate);
        return viewInflate;
    }
}
