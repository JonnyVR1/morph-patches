package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.feedback.item.IntlFeedbackQuestionItemView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class oen {
    /* JADX INFO: renamed from: a */
    public static void m163977a(IntlFeedbackQuestionItemView intlFeedbackQuestionItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFeedbackQuestionItemView._question = (VLinear) viewGroup.getChildAt(0);
        intlFeedbackQuestionItemView._question_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlFeedbackQuestionItemView._question_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlFeedbackQuestionItemView._answer = (VText) viewGroup.getChildAt(1);
    }
}
