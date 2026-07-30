package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jwh {
    /* JADX INFO: renamed from: a */
    public static void m11368a(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTwoOptionTopicItem.f4537a = (ImageView) viewGroup.getChildAt(0);
        feedQaTwoOptionTopicItem.f4538b = (TextView) viewGroup.getChildAt(1);
        feedQaTwoOptionTopicItem.f4539c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m11369b(FeedQaTwoOptionTopicItem feedQaTwoOptionTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11126S2, viewGroup, false);
        m11368a(feedQaTwoOptionTopicItem, viewInflate);
        return viewInflate;
    }
}
