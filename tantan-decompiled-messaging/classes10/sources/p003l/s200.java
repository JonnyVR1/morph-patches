package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.MinBoostActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s200 {
    /* JADX INFO: renamed from: a */
    public static void m9211a(MinBoostActiveCard minBoostActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        minBoostActiveCard.a = viewGroup.getChildAt(0);
        minBoostActiveCard.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        minBoostActiveCard.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        minBoostActiveCard.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        minBoostActiveCard.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        minBoostActiveCard.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        minBoostActiveCard.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        minBoostActiveCard.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        minBoostActiveCard.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
