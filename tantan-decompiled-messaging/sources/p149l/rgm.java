package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class rgm {
    /* JADX INFO: renamed from: a */
    public static void m179171a(qgm qgmVar, View view) {
        qgmVar.f154350a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qgmVar.f154351b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qgmVar.f154352c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qgmVar.f154353d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        qgmVar.f154354e = (PictureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qgmVar.f154355f = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
