package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.boost.BoostGuideCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y73 {
    /* JADX INFO: renamed from: a */
    public static void m11156a(BoostGuideCardView boostGuideCardView, View view) {
        boostGuideCardView.a = (BoostGuideCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostGuideCardView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostGuideCardView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostGuideCardView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        boostGuideCardView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        boostGuideCardView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
