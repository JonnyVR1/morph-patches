package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class krg {
    /* JADX INFO: renamed from: a */
    public static void m146977a(FeedCenterAudioView feedCenterAudioView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterAudioView.f41800B = (VLinear) viewGroup.getChildAt(0);
        feedCenterAudioView.f41801C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterAudioView.f41802D = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterAudioView.f41803E = (LinearLayout) viewGroup.getChildAt(1);
        feedCenterAudioView.f41804F = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterAudioView.f41805G = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterAudioView.f41806H = (FeedAudioPlayerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedCenterAudioView.f41807I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedCenterAudioView.f41808J = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
