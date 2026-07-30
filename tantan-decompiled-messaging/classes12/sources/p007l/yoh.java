package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedPoiLocationView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class yoh {
    /* JADX INFO: renamed from: a */
    public static void m17190a(FeedPoiLocationView feedPoiLocationView, View view) {
        feedPoiLocationView.f3907a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiLocationView.f3908b = viewGroup.getChildAt(0);
        feedPoiLocationView.f3909c = (TextView) viewGroup.getChildAt(1);
        feedPoiLocationView.f3910d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m17191b(FeedPoiLocationView feedPoiLocationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11279p2, viewGroup, false);
        m17190a(feedPoiLocationView, viewInflate);
        return viewInflate;
    }
}
