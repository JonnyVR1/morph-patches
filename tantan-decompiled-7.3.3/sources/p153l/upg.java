package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class upg {
    /* JADX INFO: renamed from: a */
    public static void m197090a(FeedAudioPlayerView feedAudioPlayerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAudioPlayerView.f44178d = (VFrame) viewGroup.getChildAt(0);
        feedAudioPlayerView.f44179e = (ProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAudioPlayerView.f44180f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAudioPlayerView.f44181g = (TextView) viewGroup.getChildAt(1);
        feedAudioPlayerView.f44182h = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m197091b(FeedAudioPlayerView feedAudioPlayerView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173519J, viewGroup, false);
        m197090a(feedAudioPlayerView, viewInflate);
        return viewInflate;
    }
}
