package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.svip.opads.BoostIntroCardView;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i93 {
    /* JADX INFO: renamed from: a */
    public static void m139065a(BoostIntroCardView boostIntroCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostIntroCardView.f37357a = (VFrame_FixRatio) viewGroup.getChildAt(0);
        boostIntroCardView.f37358b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostIntroCardView.f37359c = (VText) viewGroup.getChildAt(1);
        boostIntroCardView.f37360d = (VText) viewGroup.getChildAt(2);
        boostIntroCardView.f37361e = (VText) viewGroup.getChildAt(3);
        boostIntroCardView.f37362f = (VText) viewGroup.getChildAt(4);
        boostIntroCardView.f37363g = (VText) viewGroup.getChildAt(5);
    }
}
