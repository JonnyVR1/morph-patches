package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gyh {
    /* JADX INFO: renamed from: a */
    public static void m10504a(FeedSelectTopicItem feedSelectTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectTopicItem.f1472a = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f1473b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f1474c = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10505b(FeedSelectTopicItem feedSelectTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11224h3, viewGroup, false);
        m10504a(feedSelectTopicItem, viewInflate);
        return viewInflate;
    }
}
