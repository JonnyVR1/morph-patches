package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.svip.opads.BoostIntroCardView;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t83 {
    /* JADX INFO: renamed from: a */
    public static void m187518a(BoostIntroCardView boostIntroCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostIntroCardView.f36509a = (VFrame_FixRatio) viewGroup.getChildAt(0);
        boostIntroCardView.f36510b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostIntroCardView.f36511c = (VText) viewGroup.getChildAt(1);
        boostIntroCardView.f36512d = (VText) viewGroup.getChildAt(2);
        boostIntroCardView.f36513e = (VText) viewGroup.getChildAt(3);
        boostIntroCardView.f36514f = (VText) viewGroup.getChildAt(4);
        boostIntroCardView.f36515g = (VText) viewGroup.getChildAt(5);
    }
}
