package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.campingactivity.IntlCampingAnswerItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u3n {
    /* JADX INFO: renamed from: a */
    public static void m9643a(IntlCampingAnswerItem intlCampingAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCampingAnswerItem.h = viewGroup.getChildAt(0);
        intlCampingAnswerItem.i = viewGroup.getChildAt(1);
        intlCampingAnswerItem.j = (TextView) viewGroup.getChildAt(2);
        intlCampingAnswerItem.k = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9644b(IntlCampingAnswerItem intlCampingAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.t4, viewGroup, false);
        m9643a(intlCampingAnswerItem, viewInflate);
        return viewInflate;
    }
}
