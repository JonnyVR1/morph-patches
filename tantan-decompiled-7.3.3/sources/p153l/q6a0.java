package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import p151v.VFrame;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class q6a0 {
    /* JADX INFO: renamed from: a */
    public static void m175543a(p6a0 p6a0Var, View view) {
        p6a0Var.f150754a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p6a0Var.f150755b = (VFrame) viewGroup.getChildAt(0);
        p6a0Var.f150756c = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        p6a0Var.f150757d = (ProfileCustomBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        p6a0Var.f150758e = (UserProfileExpandedCard) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        p6a0Var.f150759f = (SuperLikeComboAnimView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        p6a0Var.f150760g = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m175544b(p6a0 p6a0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125747aa, viewGroup, false);
        m175543a(p6a0Var, viewInflate);
        return viewInflate;
    }
}
