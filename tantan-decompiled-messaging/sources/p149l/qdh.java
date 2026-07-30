package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMineTabSendMomentEnterView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class qdh {
    /* JADX INFO: renamed from: a */
    public static void m174043a(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, View view) {
        feedMineTabSendMomentEnterView.f42417c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMineTabSendMomentEnterView.f42418d = (VText) viewGroup.getChildAt(0);
        feedMineTabSendMomentEnterView.f42419e = (VLinear) viewGroup.getChildAt(1);
        feedMineTabSendMomentEnterView.f42420f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174044b(FeedMineTabSendMomentEnterView feedMineTabSendMomentEnterView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142252o1, viewGroup, false);
        m174043a(feedMineTabSendMomentEnterView, viewInflate);
        return viewInflate;
    }
}
