package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class njf {
    /* JADX INFO: renamed from: a */
    public static void m159648a(mjf mjfVar, View view) {
        mjfVar.f134123a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mjfVar.f134124b = (VLinear) viewGroup.getChildAt(0);
        mjfVar.f134125c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mjfVar.f134126d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mjfVar.f134127e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mjfVar.f134128f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m159649b(mjf mjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95541R2, viewGroup, false);
        m159648a(mjfVar, viewInflate);
        return viewInflate;
    }
}
