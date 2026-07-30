package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fog {
    /* JADX INFO: renamed from: a */
    public static void m10255a(FeedAudioPlayerView feedAudioPlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioPlayerView.f4791d = viewGroup.getChildAt(0);
        feedAudioPlayerView.f4792e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAudioPlayerView.f4793f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAudioPlayerView.f4794g = (TextView) viewGroup.getChildAt(1);
        feedAudioPlayerView.f4795h = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10256b(FeedAudioPlayerView feedAudioPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11069J, viewGroup, false);
        m10255a(feedAudioPlayerView, viewInflate);
        return viewInflate;
    }
}
