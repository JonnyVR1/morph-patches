package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.SeeActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c7e0 {
    /* JADX INFO: renamed from: a */
    public static void m5866a(SeeActiveCard seeActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeActiveCard.a = viewGroup.getChildAt(0);
        seeActiveCard.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        seeActiveCard.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        seeActiveCard.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        seeActiveCard.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        seeActiveCard.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        seeActiveCard.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        seeActiveCard.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }
}
