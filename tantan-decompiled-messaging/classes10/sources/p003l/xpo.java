package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.active.IntlPartnerActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xpo {
    /* JADX INFO: renamed from: a */
    public static void m10942a(IntlPartnerActiveCard intlPartnerActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPartnerActiveCard.b = viewGroup.getChildAt(0);
        intlPartnerActiveCard.c = viewGroup.getChildAt(1);
        intlPartnerActiveCard.d = viewGroup.getChildAt(2);
        intlPartnerActiveCard.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        intlPartnerActiveCard.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        intlPartnerActiveCard.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        intlPartnerActiveCard.h = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        intlPartnerActiveCard.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        intlPartnerActiveCard.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        intlPartnerActiveCard.k = viewGroup.getChildAt(4);
        intlPartnerActiveCard.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        intlPartnerActiveCard.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
