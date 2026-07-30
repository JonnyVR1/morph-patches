package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p000p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y0i {
    /* JADX INFO: renamed from: a */
    public static void m16884a(FeedStateHeaderItem feedStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderItem.f4394a = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateHeaderItem.f4395b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateHeaderItem.f4396c = viewGroup.getChildAt(1);
        feedStateHeaderItem.f4397d = viewGroup.getChildAt(2);
        feedStateHeaderItem.f4398e = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m16885b(FeedStateHeaderItem feedStateHeaderItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11287q3, viewGroup, false);
        m16884a(feedStateHeaderItem, viewInflate);
        return viewInflate;
    }
}
