package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ylf {
    /* JADX INFO: renamed from: a */
    public static void m216570a(xlf xlfVar, View view) {
        xlfVar.f194953a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xlfVar.f194954b = (VLinear) viewGroup.getChildAt(0);
        xlfVar.f194955c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        xlfVar.f194956d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        xlfVar.f194957e = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        xlfVar.f194958f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m216571b(xlf xlfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125659V2, viewGroup, false);
        m216570a(xlfVar, viewInflate);
        return viewInflate;
    }
}
