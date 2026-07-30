package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.quiz.IntlQuizAnswerItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z7p {
    /* JADX INFO: renamed from: a */
    public static void m11355a(IntlQuizAnswerItem intlQuizAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlQuizAnswerItem.h = viewGroup.getChildAt(0);
        intlQuizAnswerItem.i = viewGroup.getChildAt(1);
        intlQuizAnswerItem.j = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11356b(IntlQuizAnswerItem intlQuizAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.E5, viewGroup, false);
        m11355a(intlQuizAnswerItem, viewInflate);
        return viewInflate;
    }
}
