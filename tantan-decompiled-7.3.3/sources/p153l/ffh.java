package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ffh {
    /* JADX INFO: renamed from: a */
    public static void m125373a(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, View view) {
        feedMineTabSendMomentEnterView.f43265c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineTabSendMomentEnterView.f43266d = (VText) viewGroup.getChildAt(0);
        feedMineTabSendMomentEnterView.f43267e = (VLinear) viewGroup.getChildAt(1);
        feedMineTabSendMomentEnterView.f43268f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m125374b(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173721o1, viewGroup, false);
        m125373a(feedMineTabSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
