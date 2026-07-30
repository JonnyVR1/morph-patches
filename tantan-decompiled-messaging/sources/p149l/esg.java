package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveMultiCallView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class esg {
    /* JADX INFO: renamed from: a */
    public static void m117907a(FeedCenterLiveMultiCallView feedCenterLiveMultiCallView, View view) {
        feedCenterLiveMultiCallView.f41822B = (FeedCenterLiveMultiCallView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveMultiCallView.f41823C = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveMultiCallView.f41824D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveMultiCallView.f41825E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveMultiCallView.f41826F = (VLinear) viewGroup.getChildAt(1);
        feedCenterLiveMultiCallView.f41827G = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f41828H = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f41829I = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveMultiCallView.f41830J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        feedCenterLiveMultiCallView.f41831K = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        feedCenterLiveMultiCallView.f41832L = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
