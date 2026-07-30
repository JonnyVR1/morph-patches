package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.intloperation.interesting.SimilarInterestsHeaderItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tnf0 {
    /* JADX INFO: renamed from: a */
    public static void m191884a(SimilarInterestsHeaderItem similarInterestsHeaderItem, View view) {
        similarInterestsHeaderItem._root_layout = (SimilarInterestsHeaderItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsHeaderItem._title_img = (VDraweeView) viewGroup.getChildAt(0);
        similarInterestsHeaderItem._avatar = (VDraweeView) viewGroup.getChildAt(1);
        similarInterestsHeaderItem._avatar_desc = (VText) viewGroup.getChildAt(2);
        similarInterestsHeaderItem._desc = (VText) viewGroup.getChildAt(3);
    }
}
