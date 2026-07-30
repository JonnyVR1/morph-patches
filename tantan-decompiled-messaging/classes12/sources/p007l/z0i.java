package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z0i {
    /* JADX INFO: renamed from: a */
    public static void m17204a(FeedStateHeaderSelectItem feedStateHeaderSelectItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderSelectItem.f4399d = viewGroup.getChildAt(0);
        feedStateHeaderSelectItem.f4400e = viewGroup.getChildAt(1);
        feedStateHeaderSelectItem.f4401f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m17205b(FeedStateHeaderSelectItem feedStateHeaderSelectItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11294r3, viewGroup, false);
        m17204a(feedStateHeaderSelectItem, viewInflate);
        return viewInflate;
    }
}
