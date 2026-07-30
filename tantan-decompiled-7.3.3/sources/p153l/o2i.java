package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderSelectItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class o2i {
    /* JADX INFO: renamed from: a */
    public static void m165721a(FeedStateHeaderSelectItem feedStateHeaderSelectItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderSelectItem.f43786d = viewGroup.getChildAt(0);
        feedStateHeaderSelectItem.f43787e = (VDraweeView) viewGroup.getChildAt(1);
        feedStateHeaderSelectItem.f43788f = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m165722b(FeedStateHeaderSelectItem feedStateHeaderSelectItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173744r3, viewGroup, false);
        m165721a(feedStateHeaderSelectItem, viewInflate);
        return viewInflate;
    }
}
