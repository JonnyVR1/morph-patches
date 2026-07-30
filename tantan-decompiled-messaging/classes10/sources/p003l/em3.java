package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.BuzzActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class em3 {
    /* JADX INFO: renamed from: a */
    public static void m6305a(BuzzActiveCard buzzActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzActiveCard.d = viewGroup.getChildAt(0);
        buzzActiveCard.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        buzzActiveCard.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        buzzActiveCard.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        buzzActiveCard.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        buzzActiveCard.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        buzzActiveCard.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
