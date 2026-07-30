package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveMultiCallView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ttg {
    /* JADX INFO: renamed from: a */
    public static void m192666a(FeedCenterLiveMultiCallView feedCenterLiveMultiCallView, View view) {
        feedCenterLiveMultiCallView.f42670B = (FeedCenterLiveMultiCallView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveMultiCallView.f42671C = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveMultiCallView.f42672D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveMultiCallView.f42673E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveMultiCallView.f42674F = (VLinear) viewGroup.getChildAt(1);
        feedCenterLiveMultiCallView.f42675G = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f42676H = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveMultiCallView.f42677I = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveMultiCallView.f42678J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        feedCenterLiveMultiCallView.f42679K = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        feedCenterLiveMultiCallView.f42680L = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
