package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qdh {
    /* JADX INFO: renamed from: a */
    public static void m13504a(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, View view) {
        feedMineTabSendMomentEnterView.f3878c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineTabSendMomentEnterView.f3879d = viewGroup.getChildAt(0);
        feedMineTabSendMomentEnterView.f3880e = viewGroup.getChildAt(1);
        feedMineTabSendMomentEnterView.f3881f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13505b(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11271o1, viewGroup, false);
        m13504a(feedMineTabSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
