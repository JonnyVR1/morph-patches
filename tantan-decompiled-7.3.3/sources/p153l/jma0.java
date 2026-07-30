package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p151v.VFrame;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class jma0 {
    /* JADX INFO: renamed from: a */
    public static void m146144a(ima0 ima0Var, View view) {
        ima0Var.f115720a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ima0Var.f115721b = (VFrame) viewGroup.getChildAt(0);
        ima0Var.f115722c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ima0Var.f115723d = (ParallaxView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ima0Var.f115724e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ima0Var.f115725f = (SuperLikeComboAnimView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ima0Var.f115726g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        ima0Var.f115727h = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        ima0Var.f115728i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146145b(ima0 ima0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125899ja, viewGroup, false);
        m146144a(ima0Var, viewInflate);
        return viewInflate;
    }
}
