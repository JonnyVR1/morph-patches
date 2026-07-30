package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.view.FeedTopicBannerItemItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class j7i {
    /* JADX INFO: renamed from: a */
    public static void m140094a(FeedTopicBannerItemItemView feedTopicBannerItemItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicBannerItemItemView.f43417a = (VFrame) viewGroup.getChildAt(0);
        feedTopicBannerItemItemView.f43418b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedTopicBannerItemItemView.f43419c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedTopicBannerItemItemView.f43420d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedTopicBannerItemItemView.f43421e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedTopicBannerItemItemView.f43422f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
