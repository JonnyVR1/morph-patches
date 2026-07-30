package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSendMomentEnterView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nyh {
    /* JADX INFO: renamed from: a */
    public static void m12388a(FeedSendMomentEnterView feedSendMomentEnterView, View view) {
        feedSendMomentEnterView.f3954c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedSendMomentEnterView.f3955d = viewGroup.getChildAt(0);
        feedSendMomentEnterView.f3956e = viewGroup.getChildAt(1);
        feedSendMomentEnterView.f3957f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12389b(FeedSendMomentEnterView feedSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11119R1, viewGroup, false);
        m12388a(feedSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
