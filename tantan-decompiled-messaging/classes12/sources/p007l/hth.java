package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hth {
    /* JADX INFO: renamed from: a */
    public static void m10730a(FeedPostGuideView feedPostGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideView.f3911d = viewGroup.getChildAt(0);
        feedPostGuideView.f3912e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostGuideView.f3913f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostGuideView.f3914g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostGuideView.f3915h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPostGuideView.f3916i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
