package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;

/* JADX INFO: loaded from: classes12.dex */
public class jwh {
    /* JADX INFO: renamed from: a */
    public static void m143659a(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTwoOptionTopicItem.f43076a = (ImageView) viewGroup.getChildAt(0);
        feedQaTwoOptionTopicItem.f43077b = (TextView) viewGroup.getChildAt(1);
        feedQaTwoOptionTopicItem.f43078c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143660b(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142107S2, viewGroup, false);
        m143659a(feedQaTwoOptionTopicItem, viewInflate);
        return viewInflate;
    }
}
