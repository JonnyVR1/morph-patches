package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import p151v.VFrame;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class sog {
    /* JADX INFO: renamed from: a */
    public static void m187220a(FeedAttitudeTipsView feedAttitudeTipsView, View view) {
        feedAttitudeTipsView.f42617a = (VFrame) view;
        feedAttitudeTipsView.f42618b = (VLinear) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187221b(FeedAttitudeTipsView feedAttitudeTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173513I, viewGroup, false);
        m187220a(feedAttitudeTipsView, viewInflate);
        return viewInflate;
    }
}
