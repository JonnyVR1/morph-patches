package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nyh {
    /* JADX INFO: renamed from: a */
    public static void m162009a(FeedSendMomentEnterView feedSendMomentEnterView, View view) {
        feedSendMomentEnterView.f42493c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSendMomentEnterView.f42494d = (VText) viewGroup.getChildAt(0);
        feedSendMomentEnterView.f42495e = (VImage) viewGroup.getChildAt(1);
        feedSendMomentEnterView.f42496f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m162010b(FeedSendMomentEnterView feedSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142100R1, viewGroup, false);
        m162009a(feedSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
