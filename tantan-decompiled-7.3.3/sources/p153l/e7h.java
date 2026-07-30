package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class e7h {
    /* JADX INFO: renamed from: a */
    public static void m119708a(FeedGroupFriendItem feedGroupFriendItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupFriendItem.f40939a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f40940b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedGroupFriendItem.f40941c = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedGroupFriendItem.f40942d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedGroupFriendItem.f40943e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedGroupFriendItem.f40944f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m119709b(FeedGroupFriendItem feedGroupFriendItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173502G0, viewGroup, false);
        m119708a(feedGroupFriendItem, viewInflate);
        return viewInflate;
    }
}
