package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class skf {
    /* JADX INFO: renamed from: a */
    public static void m184595a(rkf rkfVar, View view) {
        rkfVar.f159828a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rkfVar.f159829b = (VLinear) viewGroup.getChildAt(0);
        rkfVar.f159830c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rkfVar.f159831d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        rkfVar.f159832e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        rkfVar.f159833f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m184596b(rkf rkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95605V2, viewGroup, false);
        m184595a(rkfVar, viewInflate);
        return viewInflate;
    }
}
