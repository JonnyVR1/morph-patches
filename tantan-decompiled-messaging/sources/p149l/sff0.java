package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.intloperation.interesting.SimilarInterestsItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class sff0 {
    /* JADX INFO: renamed from: a */
    public static void m183923a(SimilarInterestsItemView similarInterestsItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsItemView._setting_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        similarInterestsItemView._setting_content_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        similarInterestsItemView._setting_content_desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
