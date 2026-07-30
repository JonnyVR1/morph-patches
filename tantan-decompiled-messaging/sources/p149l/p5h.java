package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class p5h {
    /* JADX INFO: renamed from: a */
    public static void m167484a(FeedGroupFriendItem feedGroupFriendItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupFriendItem.f40091a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f40092b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupFriendItem.f40093c = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGroupFriendItem.f40094d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f40095e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGroupFriendItem.f40096f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m167485b(FeedGroupFriendItem feedGroupFriendItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142033G0, viewGroup, false);
        m167484a(feedGroupFriendItem, viewInflate);
        return viewInflate;
    }
}
