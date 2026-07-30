package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.VipActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dfl0 {
    /* JADX INFO: renamed from: a */
    public static void m6114a(VipActiveCard vipActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipActiveCard.a = viewGroup.getChildAt(0);
        vipActiveCard.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vipActiveCard.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vipActiveCard.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vipActiveCard.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vipActiveCard.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        vipActiveCard.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
