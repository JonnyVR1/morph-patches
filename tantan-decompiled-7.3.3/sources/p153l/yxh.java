package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;

/* JADX INFO: loaded from: classes13.dex */
public class yxh {
    /* JADX INFO: renamed from: a */
    public static void m217716a(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTwoOptionTopicItem.f43924a = (ImageView) viewGroup.getChildAt(0);
        feedQaTwoOptionTopicItem.f43925b = (TextView) viewGroup.getChildAt(1);
        feedQaTwoOptionTopicItem.f43926c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m217717b(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173576S2, viewGroup, false);
        m217716a(feedQaTwoOptionTopicItem, viewInflate);
        return viewInflate;
    }
}
