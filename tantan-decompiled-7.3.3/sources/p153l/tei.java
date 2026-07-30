package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVipCreditScoreIntroView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tei {
    /* JADX INFO: renamed from: a */
    public static void m190706a(FemaleVipCreditScoreIntroView femaleVipCreditScoreIntroView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        femaleVipCreditScoreIntroView._score_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        femaleVipCreditScoreIntroView._score_lock_ic = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        femaleVipCreditScoreIntroView._score_num = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        femaleVipCreditScoreIntroView._title = (VText) viewGroup.getChildAt(3);
        femaleVipCreditScoreIntroView._subtitle = (VText) viewGroup.getChildAt(4);
    }
}
