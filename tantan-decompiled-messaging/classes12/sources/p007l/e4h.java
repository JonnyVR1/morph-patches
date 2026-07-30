package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e4h {
    /* JADX INFO: renamed from: a */
    public static void m9610a(FeedGlobalPlayerView feedGlobalPlayerView, View view) {
        feedGlobalPlayerView.f4839a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGlobalPlayerView.f4840b = (FrameLayout) viewGroup.getChildAt(0);
        feedGlobalPlayerView.f4841c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGlobalPlayerView.f4842d = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGlobalPlayerView.f4843e = (FeedProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedGlobalPlayerView.f4844f = viewGroup.getChildAt(1);
        feedGlobalPlayerView.f4845g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGlobalPlayerView.f4846h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGlobalPlayerView.f4847i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9611b(FeedGlobalPlayerView feedGlobalPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11014A0, viewGroup, false);
        m9610a(feedGlobalPlayerView, viewInflate);
        return viewInflate;
    }
}
