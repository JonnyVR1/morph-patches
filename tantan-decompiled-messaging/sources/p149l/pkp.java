package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.vip.letter.IntlVipLetterGuideViewForProfile;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class pkp {
    /* JADX INFO: renamed from: a */
    public static void m170053a(IntlVipLetterGuideViewForProfile intlVipLetterGuideViewForProfile, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.f37226c = (Space) viewGroup.getChildAt(0);
        intlVipLetterGuideViewForProfile.f37227d = (VLinear) viewGroup.getChildAt(1);
        intlVipLetterGuideViewForProfile.f37228e = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        intlVipLetterGuideViewForProfile.f37229f = (VDraweeView) view.findViewById(u4c0.f173909L5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        intlVipLetterGuideViewForProfile.f37230g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(2);
        intlVipLetterGuideViewForProfile.f37231h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(4);
        intlVipLetterGuideViewForProfile.f37232i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(5);
        intlVipLetterGuideViewForProfile.f37233j = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6);
        intlVipLetterGuideViewForProfile.f37234k = (GradientBgButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        intlVipLetterGuideViewForProfile.f37235l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        intlVipLetterGuideViewForProfile.f37236m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(7);
        intlVipLetterGuideViewForProfile.f37237n = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        intlVipLetterGuideViewForProfile.f37238o = (TextView) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(2);
        intlVipLetterGuideViewForProfile.f37239p = (VImage) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(3);
    }
}
