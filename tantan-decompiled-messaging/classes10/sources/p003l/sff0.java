package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.intloperation.interesting.SimilarInterestsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sff0 {
    /* JADX INFO: renamed from: a */
    public static void m9340a(SimilarInterestsItemView similarInterestsItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        similarInterestsItemView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        similarInterestsItemView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        similarInterestsItemView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
