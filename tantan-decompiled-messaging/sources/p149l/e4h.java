package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class e4h {
    /* JADX INFO: renamed from: a */
    public static void m114683a(FeedGlobalPlayerView feedGlobalPlayerView, View view) {
        feedGlobalPlayerView.f43378a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGlobalPlayerView.f43379b = (FrameLayout) viewGroup.getChildAt(0);
        feedGlobalPlayerView.f43380c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGlobalPlayerView.f43381d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGlobalPlayerView.f43382e = (FeedProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGlobalPlayerView.f43383f = (ConstraintLayout) viewGroup.getChildAt(1);
        feedGlobalPlayerView.f43384g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGlobalPlayerView.f43385h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGlobalPlayerView.f43386i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m114684b(FeedGlobalPlayerView feedGlobalPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f141995A0, viewGroup, false);
        m114683a(feedGlobalPlayerView, viewInflate);
        return viewInflate;
    }
}
