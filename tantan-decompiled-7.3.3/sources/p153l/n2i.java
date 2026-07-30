package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedStateHeaderItem;
import com.p051p1.mobile.putong.feed.newui.status.entrance.followheader.FeedVDraweeView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class n2i {
    /* JADX INFO: renamed from: a */
    public static void m161232a(FeedStateHeaderItem feedStateHeaderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateHeaderItem.f43781a = (FeedVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateHeaderItem.f43782b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateHeaderItem.f43783c = (VDraweeView) viewGroup.getChildAt(1);
        feedStateHeaderItem.f43784d = (VDraweeView) viewGroup.getChildAt(2);
        feedStateHeaderItem.f43785e = (VDraweeView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m161233b(FeedStateHeaderItem feedStateHeaderItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173737q3, viewGroup, false);
        m161232a(feedStateHeaderItem, viewInflate);
        return viewInflate;
    }
}
