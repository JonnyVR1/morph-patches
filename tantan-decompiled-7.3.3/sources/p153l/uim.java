package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class uim {
    /* JADX INFO: renamed from: a */
    public static void m196296a(tim timVar, View view) {
        timVar.f174473a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        timVar.f174474b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        timVar.f174475c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        timVar.f174476d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        timVar.f174477e = (PictureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        timVar.f174478f = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
