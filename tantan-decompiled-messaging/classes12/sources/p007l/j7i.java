package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j7i {
    /* JADX INFO: renamed from: a */
    public static void m11073a(FeedTopicBannerItemItemView feedTopicBannerItemItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicBannerItemItemView.f4878a = viewGroup.getChildAt(0);
        feedTopicBannerItemItemView.f4879b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedTopicBannerItemItemView.f4880c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedTopicBannerItemItemView.f4881d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedTopicBannerItemItemView.f4882e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedTopicBannerItemItemView.f4883f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
