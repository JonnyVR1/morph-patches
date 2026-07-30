package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionItemView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ogn {
    /* JADX INFO: renamed from: a */
    public static void m167659a(IntlFeedbackQuestionItemView intlFeedbackQuestionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFeedbackQuestionItemView._question = (VLinear) viewGroup.getChildAt(0);
        intlFeedbackQuestionItemView._question_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlFeedbackQuestionItemView._question_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlFeedbackQuestionItemView._answer = (VText) viewGroup.getChildAt(1);
    }
}
