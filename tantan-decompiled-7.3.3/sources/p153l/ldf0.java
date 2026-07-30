package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ldf0 {
    /* JADX INFO: renamed from: a */
    public static void m153745a(cdf0 cdf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cdf0Var.f81183a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cdf0Var.f81184b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        cdf0Var.f81185c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        cdf0Var.f81186d = (SignInAnimFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m153746b(cdf0 cdf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198721C5, viewGroup, false);
        m153745a(cdf0Var, viewInflate);
        return viewInflate;
    }
}
