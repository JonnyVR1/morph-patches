package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.interesting.SimilarInterestsItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class znf0 {
    /* JADX INFO: renamed from: a */
    public static void m220596a(SimilarInterestsItemView similarInterestsItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsItemView._setting_img = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        similarInterestsItemView._setting_content_title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        similarInterestsItemView._setting_content_desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
