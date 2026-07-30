package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class tgc0 {
    /* JADX INFO: renamed from: a */
    public static void m188804a(RecentBookMoviesDramas recentBookMoviesDramas, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        recentBookMoviesDramas.f23990a = (CardBottomBaseInfoView) viewGroup.getChildAt(0);
        recentBookMoviesDramas.f23991b = (VLinear) viewGroup.getChildAt(1);
        recentBookMoviesDramas.f23992c = (CardUserContentView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f23993d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.f23994e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f23995f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        recentBookMoviesDramas.f23996g = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        recentBookMoviesDramas.f23997h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        recentBookMoviesDramas.f23998i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        recentBookMoviesDramas.f23999j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        recentBookMoviesDramas.f24000k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
    }
}
