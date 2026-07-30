package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveMultiCallView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class esg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m9957a(FeedCenterLiveMultiCallView feedCenterLiveMultiCallView, View view) {
        feedCenterLiveMultiCallView.f3283B = (FeedCenterLiveMultiCallView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveMultiCallView.f3284C = viewGroup.getChildAt(0);
        feedCenterLiveMultiCallView.f3285D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveMultiCallView.f3286E = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveMultiCallView.f3287F = viewGroup.getChildAt(1);
        feedCenterLiveMultiCallView.f3288G = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f3289H = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f3290I = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveMultiCallView.f3291J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        feedCenterLiveMultiCallView.f3292K = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        feedCenterLiveMultiCallView.f3293L = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
