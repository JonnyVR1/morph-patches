package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class t5h {
    /* JADX INFO: renamed from: a */
    public static void m189400a(FeedGlobalPlayerView feedGlobalPlayerView, View view) {
        feedGlobalPlayerView.f44226a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGlobalPlayerView.f44227b = (FrameLayout) viewGroup.getChildAt(0);
        feedGlobalPlayerView.f44228c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGlobalPlayerView.f44229d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGlobalPlayerView.f44230e = (FeedProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGlobalPlayerView.f44231f = (ConstraintLayout) viewGroup.getChildAt(1);
        feedGlobalPlayerView.f44232g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGlobalPlayerView.f44233h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGlobalPlayerView.f44234i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m189401b(FeedGlobalPlayerView feedGlobalPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173464A0, viewGroup, false);
        m189400a(feedGlobalPlayerView, viewInflate);
        return viewInflate;
    }
}
