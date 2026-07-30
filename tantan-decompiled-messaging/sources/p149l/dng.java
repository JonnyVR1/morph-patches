package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedAttitudeTipsView;
import p147v.VFrame;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class dng {
    /* JADX INFO: renamed from: a */
    public static void m112618a(FeedAttitudeTipsView feedAttitudeTipsView, View view) {
        feedAttitudeTipsView.f41769a = (VFrame) view;
        feedAttitudeTipsView.f41770b = (VLinear) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m112619b(FeedAttitudeTipsView feedAttitudeTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142044I, viewGroup, false);
        m112618a(feedAttitudeTipsView, viewInflate);
        return viewInflate;
    }
}
