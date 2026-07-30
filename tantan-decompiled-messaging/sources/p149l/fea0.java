package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p147v.VFrame;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class fea0 {
    /* JADX INFO: renamed from: a */
    public static void m121027a(eea0 eea0Var, View view) {
        eea0Var.f90698a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eea0Var.f90699b = (VFrame) viewGroup.getChildAt(0);
        eea0Var.f90700c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        eea0Var.f90701d = (ParallaxView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        eea0Var.f90702e = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        eea0Var.f90703f = (SuperLikeComboAnimView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        eea0Var.f90704g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        eea0Var.f90705h = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(0);
        eea0Var.f90706i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m121028b(eea0 eea0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95727ca, viewGroup, false);
        m121027a(eea0Var, viewInflate);
        return viewInflate;
    }
}
