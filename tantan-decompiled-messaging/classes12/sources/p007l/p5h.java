package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p5h {
    /* JADX INFO: renamed from: a */
    public static void m12909a(FeedGroupFriendItem feedGroupFriendItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupFriendItem.f1552a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f1553b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupFriendItem.f1554c = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGroupFriendItem.f1555d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f1556e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGroupFriendItem.f1557f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12910b(FeedGroupFriendItem feedGroupFriendItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11052G0, viewGroup, false);
        m12909a(feedGroupFriendItem, viewInflate);
        return viewInflate;
    }
}
