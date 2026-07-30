package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.svip.opads.BoostIntroCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t83 {
    /* JADX INFO: renamed from: a */
    public static void m9549a(BoostIntroCardView boostIntroCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostIntroCardView.a = viewGroup.getChildAt(0);
        boostIntroCardView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostIntroCardView.c = viewGroup.getChildAt(1);
        boostIntroCardView.d = viewGroup.getChildAt(2);
        boostIntroCardView.e = viewGroup.getChildAt(3);
        boostIntroCardView.f = viewGroup.getChildAt(4);
        boostIntroCardView.g = viewGroup.getChildAt(5);
    }
}
