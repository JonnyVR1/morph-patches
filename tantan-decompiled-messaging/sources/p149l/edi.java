package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVipCreditScoreIntroView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class edi {
    /* JADX INFO: renamed from: a */
    public static void m115809a(FemaleVipCreditScoreIntroView femaleVipCreditScoreIntroView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        femaleVipCreditScoreIntroView._score_title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        femaleVipCreditScoreIntroView._score_lock_ic = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        femaleVipCreditScoreIntroView._score_num = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        femaleVipCreditScoreIntroView._title = (VText) viewGroup.getChildAt(3);
        femaleVipCreditScoreIntroView._subtitle = (VText) viewGroup.getChildAt(4);
    }
}
