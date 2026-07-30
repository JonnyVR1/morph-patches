package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.HomeErrorNetView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u6l {
    /* JADX INFO: renamed from: a */
    public static void m9654a(HomeErrorNetView homeErrorNetView, View view) {
        homeErrorNetView.a = (HomeErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeErrorNetView.b = viewGroup.getChildAt(0);
        homeErrorNetView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeErrorNetView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
