package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class z0i {
    /* JADX INFO: renamed from: a */
    public static void m216749a(FeedStateHeaderSelectItem feedStateHeaderSelectItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderSelectItem.f42938d = viewGroup.getChildAt(0);
        feedStateHeaderSelectItem.f42939e = (VDraweeView) viewGroup.getChildAt(1);
        feedStateHeaderSelectItem.f42940f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m216750b(FeedStateHeaderSelectItem feedStateHeaderSelectItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142275r3, viewGroup, false);
        m216749a(feedStateHeaderSelectItem, viewInflate);
        return viewInflate;
    }
}
