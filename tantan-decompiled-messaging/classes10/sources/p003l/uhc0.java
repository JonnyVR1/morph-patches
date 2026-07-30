package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.RecommendNormalUserView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uhc0 {
    /* JADX INFO: renamed from: a */
    public static void m9726a(RecommendNormalUserView recommendNormalUserView, View view) {
        recommendNormalUserView.d = (RecommendNormalUserView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        recommendNormalUserView.e = viewGroup.getChildAt(0);
        recommendNormalUserView.f = viewGroup.getChildAt(1);
        recommendNormalUserView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recommendNormalUserView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        recommendNormalUserView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        recommendNormalUserView.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recommendNormalUserView.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        recommendNormalUserView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        recommendNormalUserView.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        recommendNormalUserView.n = viewGroup.getChildAt(2);
    }
}
