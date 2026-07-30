package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.secretcrush.ScrollIndexView;
import p151v.VFrame;
import p151v.VList;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class cme0 {
    /* JADX INFO: renamed from: a */
    public static void m111167a(bme0 bme0Var, View view) {
        bme0Var.f77288a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bme0Var.f77289b = (VProgressBar) viewGroup.getChildAt(0);
        bme0Var.f77290c = (FrameLayout) viewGroup.getChildAt(1);
        bme0Var.f77291d = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bme0Var.f77292e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bme0Var.f77293f = (ScrollIndexView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m111168b(bme0 bme0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125607Re, viewGroup, false);
        m111167a(bme0Var, viewInflate);
        return viewInflate;
    }
}
