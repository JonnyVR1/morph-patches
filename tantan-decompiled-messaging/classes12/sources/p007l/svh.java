package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class svh {
    /* JADX INFO: renamed from: a */
    public static void m14332a(FeedPostTopicItemView feedPostTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostTopicItemView.f1501a = viewGroup.getChildAt(0);
        feedPostTopicItemView.f1502b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f1503c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f1504d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f1505e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostTopicItemView.f1506f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f1507g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f1508h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f1509i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostTopicItemView.f1510j = viewGroup.getChildAt(2);
    }
}
