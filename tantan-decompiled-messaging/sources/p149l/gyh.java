package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class gyh {
    /* JADX INFO: renamed from: a */
    public static void m128709a(FeedSelectTopicItem feedSelectTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectTopicItem.f40011a = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f40012b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f40013c = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m128710b(FeedSelectTopicItem feedSelectTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142205h3, viewGroup, false);
        m128709a(feedSelectTopicItem, viewInflate);
        return viewInflate;
    }
}
