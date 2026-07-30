package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterAudioView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class zsg {
    /* JADX INFO: renamed from: a */
    public static void m221343a(FeedCenterAudioView feedCenterAudioView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterAudioView.f42648B = (VLinear) viewGroup.getChildAt(0);
        feedCenterAudioView.f42649C = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterAudioView.f42650D = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterAudioView.f42651E = (LinearLayout) viewGroup.getChildAt(1);
        feedCenterAudioView.f42652F = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterAudioView.f42653G = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterAudioView.f42654H = (FeedAudioPlayerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedCenterAudioView.f42655I = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedCenterAudioView.f42656J = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
