package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class fog {
    /* JADX INFO: renamed from: a */
    public static void m122451a(FeedAudioPlayerView feedAudioPlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioPlayerView.f43330d = (VFrame) viewGroup.getChildAt(0);
        feedAudioPlayerView.f43331e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAudioPlayerView.f43332f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAudioPlayerView.f43333g = (TextView) viewGroup.getChildAt(1);
        feedAudioPlayerView.f43334h = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m122452b(FeedAudioPlayerView feedAudioPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142050J, viewGroup, false);
        m122451a(feedAudioPlayerView, viewInflate);
        return viewInflate;
    }
}
