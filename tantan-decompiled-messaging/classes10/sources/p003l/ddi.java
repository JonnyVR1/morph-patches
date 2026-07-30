package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ddi {
    /* JADX INFO: renamed from: a */
    public static void m6107a(FemaleVerificationGuideCardView femaleVerificationGuideCardView, View view) {
        femaleVerificationGuideCardView.a = (FemaleVerificationGuideCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        femaleVerificationGuideCardView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        femaleVerificationGuideCardView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        femaleVerificationGuideCardView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        femaleVerificationGuideCardView.e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        femaleVerificationGuideCardView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        femaleVerificationGuideCardView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        femaleVerificationGuideCardView.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
    }
}
