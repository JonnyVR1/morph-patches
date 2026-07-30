package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.vip.letter.IntlVipLetterGuideViewForProfile;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class pmp {
    /* JADX INFO: renamed from: a */
    public static void m172958a(IntlVipLetterGuideViewForProfile intlVipLetterGuideViewForProfile, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.f38074c = (Space) viewGroup.getChildAt(0);
        intlVipLetterGuideViewForProfile.f38075d = (VLinear) viewGroup.getChildAt(1);
        intlVipLetterGuideViewForProfile.f38076e = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVipLetterGuideViewForProfile.f38077f = (VDraweeView) view.findViewById(adc0.f70031N5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.f38078g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlVipLetterGuideViewForProfile.f38079h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(4);
        intlVipLetterGuideViewForProfile.f38080i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(5);
        intlVipLetterGuideViewForProfile.f38081j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6);
        intlVipLetterGuideViewForProfile.f38082k = (GradientBgButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        intlVipLetterGuideViewForProfile.f38083l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        intlVipLetterGuideViewForProfile.f38084m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(7);
        intlVipLetterGuideViewForProfile.f38085n = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        intlVipLetterGuideViewForProfile.f38086o = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        intlVipLetterGuideViewForProfile.f38087p = (VImage) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
    }
}
