package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.HomeEmptyCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l6l {
    /* JADX INFO: renamed from: a */
    public static void m7700a(HomeEmptyCardView homeEmptyCardView, View view) {
        homeEmptyCardView.a = (HomeEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeEmptyCardView.b = viewGroup.getChildAt(0);
        homeEmptyCardView.c = viewGroup.getChildAt(1);
        homeEmptyCardView.d = viewGroup.getChildAt(2);
        homeEmptyCardView.e = viewGroup.getChildAt(3);
        homeEmptyCardView.f = viewGroup.getChildAt(4);
        homeEmptyCardView.g = viewGroup.getChildAt(5);
    }
}
