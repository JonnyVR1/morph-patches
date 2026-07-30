package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.boost.view.OverlapCircleView;
import com.p000p1.mobile.putong.core.p001ui.home.BounceButton;
import l.wl3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xl3 {
    /* JADX INFO: renamed from: a */
    public static void m10873a(wl3 wl3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wl3Var.e = (BounceButton) viewGroup.getChildAt(0);
        wl3Var.f = (FrameLayout) viewGroup.getChildAt(1);
        wl3Var.g = (OverlapCircleView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wl3Var.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10874b(wl3 wl3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5520a, viewGroup, true);
        m10873a(wl3Var, viewInflate);
        return viewInflate;
    }
}
