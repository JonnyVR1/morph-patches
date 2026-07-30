package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.intloperation.interesting.SimilarInterestsHeaderItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mff0 {
    /* JADX INFO: renamed from: a */
    public static void m8152a(SimilarInterestsHeaderItem similarInterestsHeaderItem, View view) {
        similarInterestsHeaderItem.d = (SimilarInterestsHeaderItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsHeaderItem.e = viewGroup.getChildAt(0);
        similarInterestsHeaderItem.f = viewGroup.getChildAt(1);
        similarInterestsHeaderItem.g = viewGroup.getChildAt(2);
        similarInterestsHeaderItem.h = viewGroup.getChildAt(3);
    }
}
