package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedPoiLocationView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class nqh {
    /* JADX INFO: renamed from: a */
    public static void m164306a(FeedPoiLocationView feedPoiLocationView, View view) {
        feedPoiLocationView.f43294a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiLocationView.f43295b = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiLocationView.f43296c = (TextView) viewGroup.getChildAt(1);
        feedPoiLocationView.f43297d = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m164307b(FeedPoiLocationView feedPoiLocationView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173729p2, viewGroup, false);
        m164306a(feedPoiLocationView, viewInflate);
        return viewInflate;
    }
}
