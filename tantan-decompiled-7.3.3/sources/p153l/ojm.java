package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ojm {
    /* JADX INFO: renamed from: a */
    public static void m167867a(njm njmVar, View view) {
        njmVar.f142309a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        njmVar.f142310b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        njmVar.f142311c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        njmVar.f142312d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        njmVar.f142313e = (PictureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        njmVar.f142314f = (NewPictureContainerIndicator) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
