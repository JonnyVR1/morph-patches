package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class apc0 {
    /* JADX INFO: renamed from: a */
    public static void m99301a(RecentBookMoviesDramas recentBookMoviesDramas, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        recentBookMoviesDramas.f24732a = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        recentBookMoviesDramas.f24733b = (VLinear) viewGroup.getChildAt(1);
        recentBookMoviesDramas.f24734c = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f24735d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.f24736e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f24737f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        recentBookMoviesDramas.f24738g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        recentBookMoviesDramas.f24739h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        recentBookMoviesDramas.f24740i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f24741j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.f24742k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
