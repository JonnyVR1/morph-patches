package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.quiz.IntlQuizAnswerItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class z7p {
    /* JADX INFO: renamed from: a */
    public static void m217490a(IntlQuizAnswerItem intlQuizAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlQuizAnswerItem._answer_normal_img = (VDraweeView) viewGroup.getChildAt(0);
        intlQuizAnswerItem._answer_selected_img = (VDraweeView) viewGroup.getChildAt(1);
        intlQuizAnswerItem._answer_content = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m217491b(IntlQuizAnswerItem intlQuizAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95336E5, viewGroup, false);
        m217490a(intlQuizAnswerItem, viewInflate);
        return viewInflate;
    }
}
