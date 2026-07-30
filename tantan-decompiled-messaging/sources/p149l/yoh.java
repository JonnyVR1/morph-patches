package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedPoiLocationView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class yoh {
    /* JADX INFO: renamed from: a */
    public static void m215501a(FeedPoiLocationView feedPoiLocationView, View view) {
        feedPoiLocationView.f42446a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiLocationView.f42447b = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiLocationView.f42448c = (TextView) viewGroup.getChildAt(1);
        feedPoiLocationView.f42449d = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m215502b(FeedPoiLocationView feedPoiLocationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142260p2, viewGroup, false);
        m215501a(feedPoiLocationView, viewInflate);
        return viewInflate;
    }
}
