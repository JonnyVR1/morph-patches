package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tgc0 {
    /* JADX INFO: renamed from: a */
    public static void m9576a(RecentBookMoviesDramas recentBookMoviesDramas, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        recentBookMoviesDramas.a = viewGroup.getChildAt(0);
        recentBookMoviesDramas.b = viewGroup.getChildAt(1);
        recentBookMoviesDramas.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        recentBookMoviesDramas.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        recentBookMoviesDramas.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        recentBookMoviesDramas.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
