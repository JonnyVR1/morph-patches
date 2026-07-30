package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class krg {
    /* JADX INFO: renamed from: a */
    public static void m11515a(FeedCenterAudioView feedCenterAudioView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterAudioView.f3261B = viewGroup.getChildAt(0);
        feedCenterAudioView.f3262C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterAudioView.f3263D = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterAudioView.f3264E = (LinearLayout) viewGroup.getChildAt(1);
        feedCenterAudioView.f3265F = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterAudioView.f3266G = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterAudioView.f3267H = (FeedAudioPlayerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedCenterAudioView.f3268I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedCenterAudioView.f3269J = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
