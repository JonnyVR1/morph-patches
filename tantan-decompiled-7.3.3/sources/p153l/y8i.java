package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class y8i {
    /* JADX INFO: renamed from: a */
    public static void m214751a(FeedTopicBannerItemItemView feedTopicBannerItemItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicBannerItemItemView.f44265a = (VFrame) viewGroup.getChildAt(0);
        feedTopicBannerItemItemView.f44266b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedTopicBannerItemItemView.f44267c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedTopicBannerItemItemView.f44268d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedTopicBannerItemItemView.f44269e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedTopicBannerItemItemView.f44270f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
