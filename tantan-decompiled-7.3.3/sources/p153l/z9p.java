package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.quiz.IntlQuizAnswerItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class z9p {
    /* JADX INFO: renamed from: a */
    public static void m219085a(IntlQuizAnswerItem intlQuizAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlQuizAnswerItem._answer_normal_img = (VDraweeView) viewGroup.getChildAt(0);
        intlQuizAnswerItem._answer_selected_img = (VDraweeView) viewGroup.getChildAt(1);
        intlQuizAnswerItem._answer_content = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219086b(IntlQuizAnswerItem intlQuizAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125406F5, viewGroup, false);
        m219085a(intlQuizAnswerItem, viewInflate);
        return viewInflate;
    }
}
