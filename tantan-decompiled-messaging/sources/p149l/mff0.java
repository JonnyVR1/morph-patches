package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.intloperation.interesting.SimilarInterestsHeaderItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mff0 {
    /* JADX INFO: renamed from: a */
    public static void m154381a(SimilarInterestsHeaderItem similarInterestsHeaderItem, View view) {
        similarInterestsHeaderItem._root_layout = (SimilarInterestsHeaderItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsHeaderItem._title_img = (VDraweeView) viewGroup.getChildAt(0);
        similarInterestsHeaderItem._avatar = (VDraweeView) viewGroup.getChildAt(1);
        similarInterestsHeaderItem._avatar_desc = (VText) viewGroup.getChildAt(2);
        similarInterestsHeaderItem._desc = (VText) viewGroup.getChildAt(3);
    }
}
