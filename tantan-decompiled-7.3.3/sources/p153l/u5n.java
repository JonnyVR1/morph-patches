package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.IntlCampingAnswerItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class u5n {
    /* JADX INFO: renamed from: a */
    public static void m194612a(IntlCampingAnswerItem intlCampingAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCampingAnswerItem._answer_normal_img = (VDraweeView) viewGroup.getChildAt(0);
        intlCampingAnswerItem._answer_selected_img = (VDraweeView) viewGroup.getChildAt(1);
        intlCampingAnswerItem._answer_content = (TextView) viewGroup.getChildAt(2);
        intlCampingAnswerItem._answer_selected_tag_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m194613b(IntlCampingAnswerItem intlCampingAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126063t4, viewGroup, false);
        m194612a(intlCampingAnswerItem, viewInflate);
        return viewInflate;
    }
}
