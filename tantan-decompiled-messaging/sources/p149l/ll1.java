package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.view.SimpleUpdateAvatarView;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ll1 {
    /* JADX INFO: renamed from: a */
    public static void m150401a(kl1 kl1Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kl1Var.f123618a = (VNavigationBar) viewGroup.getChildAt(0);
        kl1Var.f123619b = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        kl1Var.f123620c = (SimpleUpdateAvatarView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        kl1Var.f123621d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        kl1Var.f123622e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        kl1Var.f123623f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4)).getChildAt(2);
        kl1Var.f123624g = (VText_Medium) viewGroup.getChildAt(2);
        kl1Var.f123625h = (VText_Medium) viewGroup.getChildAt(3);
        kl1Var.f123626i = (VLinear) viewGroup.getChildAt(4);
        kl1Var.f123627j = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        kl1Var.f123628k = (VText_NoTopPadding) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m150402b(kl1 kl1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95474N, viewGroup, false);
        m150401a(kl1Var, viewInflate);
        return viewInflate;
    }
}
