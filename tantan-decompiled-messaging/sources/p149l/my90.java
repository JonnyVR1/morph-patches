package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p147v.VFrame;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class my90 {
    /* JADX INFO: renamed from: a */
    public static void m156997a(ly90 ly90Var, View view) {
        ly90Var.f130500a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ly90Var.f130501b = (VFrame) viewGroup.getChildAt(0);
        ly90Var.f130502c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ly90Var.f130503d = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        ly90Var.f130504e = (UserProfileExpandedCard) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ly90Var.f130505f = (SuperLikeComboAnimView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ly90Var.f130506g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m156998b(ly90 ly90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95580T9, viewGroup, false);
        m156997a(ly90Var, viewInflate);
        return viewInflate;
    }
}
