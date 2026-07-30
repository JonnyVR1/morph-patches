package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class c0i {
    /* JADX INFO: renamed from: a */
    public static void m107425a(FeedSendMomentEnterView feedSendMomentEnterView, View view) {
        feedSendMomentEnterView.f43341c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSendMomentEnterView.f43342d = (VText) viewGroup.getChildAt(0);
        feedSendMomentEnterView.f43343e = (VImage) viewGroup.getChildAt(1);
        feedSendMomentEnterView.f43344f = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m107426b(FeedSendMomentEnterView feedSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173569R1, viewGroup, false);
        m107425a(feedSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
