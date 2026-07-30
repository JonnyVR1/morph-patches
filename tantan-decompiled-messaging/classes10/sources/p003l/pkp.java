package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.letter.IntlVipLetterGuideViewForProfile;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pkp {
    /* JADX INFO: renamed from: a */
    public static void m8758a(IntlVipLetterGuideViewForProfile intlVipLetterGuideViewForProfile, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.c = (Space) viewGroup.getChildAt(0);
        intlVipLetterGuideViewForProfile.d = viewGroup.getChildAt(1);
        intlVipLetterGuideViewForProfile.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVipLetterGuideViewForProfile.f = view.findViewById(u4c0.L5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlVipLetterGuideViewForProfile.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(4);
        intlVipLetterGuideViewForProfile.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(5);
        intlVipLetterGuideViewForProfile.j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6);
        intlVipLetterGuideViewForProfile.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        intlVipLetterGuideViewForProfile.l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        intlVipLetterGuideViewForProfile.m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(7);
        intlVipLetterGuideViewForProfile.n = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        intlVipLetterGuideViewForProfile.o = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        intlVipLetterGuideViewForProfile.p = ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
    }
}
