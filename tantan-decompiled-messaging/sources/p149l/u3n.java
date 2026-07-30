package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.IntlCampingAnswerItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class u3n {
    /* JADX INFO: renamed from: a */
    public static void m191608a(IntlCampingAnswerItem intlCampingAnswerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlCampingAnswerItem._answer_normal_img = (VDraweeView) viewGroup.getChildAt(0);
        intlCampingAnswerItem._answer_selected_img = (VDraweeView) viewGroup.getChildAt(1);
        intlCampingAnswerItem._answer_content = (TextView) viewGroup.getChildAt(2);
        intlCampingAnswerItem._answer_selected_tag_icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m191609b(IntlCampingAnswerItem intlCampingAnswerItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96009t4, viewGroup, false);
        m191608a(intlCampingAnswerItem, viewInflate);
        return viewInflate;
    }
}
