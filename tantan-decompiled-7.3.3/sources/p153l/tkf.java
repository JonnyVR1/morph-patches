package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class tkf {
    /* JADX INFO: renamed from: a */
    public static void m191549a(skf skfVar, View view) {
        skfVar.f169268a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        skfVar.f169269b = (VLinear) viewGroup.getChildAt(0);
        skfVar.f169270c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        skfVar.f169271d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        skfVar.f169272e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        skfVar.f169273f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191550b(skf skfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125595R2, viewGroup, false);
        m191549a(skfVar, viewInflate);
        return viewInflate;
    }
}
